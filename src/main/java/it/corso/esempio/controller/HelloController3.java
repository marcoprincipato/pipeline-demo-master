package it.corso.esempio.controller;

import it.corso.esempio.pojo.HelloResponse;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/hello3")
public class HelloController3 {

	@GetMapping(value = "/status", produces = MediaType.APPLICATION_JSON_VALUE)
	public HelloResponse getStatus() {
		HelloResponse res = new HelloResponse();
		res.setStatus("OK");
		return res;
	}
	
	@GetMapping(value = "/status2", produces = MediaType.APPLICATION_JSON_VALUE)
	public HelloResponse getStatus2() {
		HelloResponse res = new HelloResponse();
		res.setStatus("OK");
		return res;
	}
	
	@GetMapping(value = "/status3", produces = MediaType.APPLICATION_JSON_VALUE)
	public HelloResponse getStatus3() {
		HelloResponse res = new HelloResponse();
		res.setStatus("OK");
		return res;
	}
}
