package id.yortech.api.cdss.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/openapi/v1/test")
public class TestController {
	@GetMapping("/")
	public ResponseEntity<String> test() {
		return ResponseEntity.ok("OK");
	}
}