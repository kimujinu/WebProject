package kr.ac.dit;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller //url과 jsp페이지를 연결시켜주는 역할

public class SampleController1 {
	@RequestMapping("urlA")
	public void urlA() {
		
	}
	@RequestMapping("urlB")
	public void urlB() {
		
	}

}
