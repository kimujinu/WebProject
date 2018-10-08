package kr.ac.dit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

public class TestSetterSpringDI {
	 @Autowired
	 ClassB classB;
	 @RequestMapping("testDI")
	 public void testDI() {
	  classB.methodB();
	 }
}
