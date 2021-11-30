package com.spectrum.speed.api;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InfoEndpoint {
	@GetMapping(value = "/info.htm", produces = { MediaType.APPLICATION_JSON_VALUE })
	public String info() {
		return "{\"speed instanceId\": \"" + this.hashCode() + "\"}";
	}
}
