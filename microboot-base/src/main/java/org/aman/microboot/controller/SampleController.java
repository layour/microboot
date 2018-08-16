package org.aman.microboot.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
	
	@RequestMapping(value="/echo/{message}", method=RequestMethod.GET)
	public String echo(@PathVariable("message") String msg) {
		return "【ECHO】" + msg;
	}
	
	@RequestMapping("/mul")
	public Object mul(int num) {
		return num * 4;
	}
	
	@RequestMapping("/object")
	public Object object(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("*** IP:" + request.getRemoteAddr());
		System.out.println("*** Code:" + response.getCharacterEncoding());
		System.out.println("*** SessionID:" + request.getSession().getId());
		System.out.println("*** Location:" + request.getServletContext().getRealPath("/upload"));
		return "Aman";
	}

	@RequestMapping("/")
	public String home() {
		return "Hello World!";
	}
}
