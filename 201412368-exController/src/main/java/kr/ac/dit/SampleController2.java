package kr.ac.dit;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SampleController2 {
	@RequestMapping("urlC")
	public String test(@ModelAttribute("msg") String msg) {
		return "sample";
	}
}
