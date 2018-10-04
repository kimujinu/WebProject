package kr.ac.dit;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SampleController3 {
	@RequestMapping()
	public String urlD(Model model) {
		StudentVO studentVO = new StudentVO();
		studentVO.setNo("201412368");
		studentVO.setName("김지누");
		model.addAttribute(studentVO);
		return "read";
	}
}
