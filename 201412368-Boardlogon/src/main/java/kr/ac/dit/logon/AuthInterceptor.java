package kr.ac.dit.logon;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
public class AuthInterceptor extends HandlerInterceptorAdapter { 
	@Override
	public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse,
			Object handler) throws Exception {
		HttpSession httpSession = httpServletRequest.getSession();
		if (httpSession.getAttribute("login") == null) {
			String uri = httpServletRequest.getRequestURI();
			String query = httpServletRequest.getQueryString();
			if (query == null || query.equals("null")) {
				query = "";
			} else {
				uri += "?" + query;
			}
			if (httpServletRequest.getMethod().equals("GET")) {
				httpSession.setAttribute("saveDirect", uri); //saveDirect 라는 세션변수에 uri값을 저장 
			}
			httpServletResponse.sendRedirect("/member/login");
			return false;
		}
		return true;
	} //url 요청을 받았을때 세션을 만들어서 로그인 변수 값을 읽어와서 체크함
}