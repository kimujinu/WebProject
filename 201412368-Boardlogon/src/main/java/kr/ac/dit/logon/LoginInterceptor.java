package kr.ac.dit.logon;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class LoginInterceptor extends HandlerInterceptorAdapter { // 로그인 포스트요청을 했을때 가로채는 클래스 
	@Override									
	public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse,
			Object handler) throws Exception {
		HttpSession httpSession = httpServletRequest.getSession();
		if (httpSession.getAttribute("login") != null) {
			httpSession.removeAttribute("login");
		}
		return true;
	}
	@Override
	public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse,
		Object handler, ModelAndView modelAndView) throws Exception {
		HttpSession httpSession = httpServletRequest.getSession();
		ModelMap modelMap = modelAndView.getModelMap();
		Object memberVO = modelMap.get("memberVO");
		if (memberVO != null) {
			httpSession.setAttribute("login", memberVO);
			Object saveDirect = httpSession.getAttribute("saveDirect");
			httpServletResponse.sendRedirect(saveDirect != null ? (String)saveDirect:"/"); //내가 가려고한 주소 = saveDirect
		}
	} //DB에서 읽어온 사용자정보와 비교 
}