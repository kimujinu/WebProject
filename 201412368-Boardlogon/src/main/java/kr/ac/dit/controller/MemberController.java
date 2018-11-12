package kr.ac.dit.controller;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import kr.ac.dit.domain.BoardVO;
import kr.ac.dit.domain.LogonDTO;
import kr.ac.dit.domain.MemberVO;
import kr.ac.dit.service.BoardService;
import kr.ac.dit.service.MemberService;
@Controller
@RequestMapping("/member")
public class MemberController {
	@Autowired
	MemberService memberService;
 @RequestMapping(value = "/create", method = RequestMethod.GET)
 public void createGET() throws Exception {
 }
 @RequestMapping(value = "/create", method = RequestMethod.POST)
 public String createPOST(MemberVO memberVO) throws Exception {
  memberService.createMember(memberVO);
  return "redirect:/board/list";
 }
 @RequestMapping(value = "/login", method = RequestMethod.GET)
 public void loginGET(@ModelAttribute("logonDTO") LogonDTO logonDTO) throws Exception {
 }
 @RequestMapping(value = "/loginPost", method = RequestMethod.POST)
 public String loginPOST(LogonDTO logonDTO, HttpSession httpSession, Model model) throws Exception {
  MemberVO memberVO = memberService.readMember(logonDTO);
  if (memberVO==null) { return "/member/login"; }
  model.addAttribute("memberVO", memberVO);
  return "redirect:/board/list";
 }
 @RequestMapping(value = "/logout", method = RequestMethod.GET)
	public void logout(HttpSession httpSession) {
		if (httpSession.getAttribute("login") != null) {
			httpSession.removeAttribute("login");
			httpSession.invalidate();
		}
	}
}
	 
