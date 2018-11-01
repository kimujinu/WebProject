package kr.ac.dit.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.ac.dit.domain.MemberVO;
import kr.ac.dit.service.MemberService;
@Controller
public class MemberController {

	@Autowired
	private MemberService memberService;
	@RequestMapping(value="create", method=RequestMethod.GET)
	public String createGET() throws Exception {
		return "createMember";
		
	}
	
	@RequestMapping(value="create", method=RequestMethod.POST)
	public String createPOST(MemberVO memberVO, Model model) throws Exception {
		memberService.createMember(memberVO);
		return "createMember";
		
	
	}
	@RequestMapping("read")
	public String readList(Model model) throws Exception {
		model.addAttribute("items", memberService.readMemberList());
		return "readMember";
	}
	
	
	
	
}