package com.kbrij.Controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.*;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class  RestApiController 
{
   @RequestMapping(value = "/hello" , method =RequestMethod.GET)
   public String  sayHello()
   {
	   return "say hello sir";  
   }
  
   
   @RequestMapping(value="/hii")
   public  ResponseEntity<String>  sayHii()
   {
	   return  ResponseEntity.ok().body("say hii ");
	   
   }
   
   
}
