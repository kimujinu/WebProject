package kr.ac.dit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class SampleController4 {
	private static final Logger logger = LoggerFactory.getLogger(SampleController4.class);
	 @RequestMapping("urlE")
	 public String urlE(RedirectAttributes rttr) {
	  logger.info("urlE called but redirected to /urlF.............");
	  rttr.addAttribute("msg", "This is the message with redirected");
	  return "redirect:/urlF";
	 }
	 @RequestMapping("/urlF")
	 public void urlF(String msg) {
	  logger.info("urlF called......" + msg);
	 }
	}