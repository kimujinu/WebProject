package kr.ac.dit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

public class TestConstructorSpringDI {
	 @Autowired //객체생성된것을 주입받기위해  자동으로 찾는것
	 ClassB classB;
	 @RequestMapping("testDI")
	 public void testDI() {
	  classB.methodB();
	 }
}
