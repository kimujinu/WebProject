<%@ tag language="java" pageEncoding="UTF-8"
	trimDirectiveWhitespaces="true"%>
//paging 기능의 핵심
<%@ tag body-content="empty"%>
//html 바디가 없음
<%@ attribute name="totalPageCount" type="java.lang.Integer"
	required="true"%>
//list.jsp에서 넘겨주는 값
<%@ attribute name="nowPage" type="java.lang.Integer" required="true"%>
//마찬가지
<%
			int totalPageBlock = (int) (Math.ceil(totalPageCount / 10.0));
			int nowPageBlock = (int) Math.ceil(nowPage / 10.0);
			int startPage = (nowPageBlock - 1) * 10 + 1;
			int endPage = 0;
			String contextPath = application.getContextPath();

			if (contextPath == null || contextPath.trim().equals("")) {
				contextPath = "";
			} else {
				//contextPath = "/"+contextPath;
			}
			if (totalPageCount > nowPageBlock * 10) {
				endPage = nowPageBlock * 10;
			} else {
				endPage = totalPageCount;
			}

			out.println("<nav aria-label=\"Page navigation\">");//페이지 네비게이션 
			out.println("<ul class=\"pagination\">");
			if (nowPageBlock > 1) {
				out.print("<li>");
				out.print(
						"<a href=\"" + contextPath + "/board/list/" + (startPage - 1) + "\" aria-label=\"Previous\">");
				out.print("◀</a>");
				out.println("</li>");
			}
			for (int i = startPage; i <= endPage; i++) {
				out.print(" ");
				if (i == nowPage) {
					out.print("<li class=\"active\">");
				} else {
					out.print("<li>");
				}
				out.print("<a href=\"" + contextPath + "/board/list/" + (i) + "\">");
				out.print(i);
				out.print("</a>");
				out.println("</li>");
			}
			if (nowPageBlock < totalPageBlock) {
				out.print("<li>");
				out.print("<a href=\"" + contextPath + "/board/list/" + (endPage + 1) + "\" aria-label=\"Next\">");
				out.print("▶</a>");
				out.println("</li>");
			}
			out.println("</ul>");
			out.println("</nav>");
		%>