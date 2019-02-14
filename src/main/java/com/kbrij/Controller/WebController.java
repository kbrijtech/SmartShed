package com.kbrij.Controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Controller
public class WebController
{
  @RequestMapping(value="/" , method=RequestMethod.GET )
  public String home()
  {
	  return "index";
  }
  
}
