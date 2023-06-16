package com.insightAI.web.insightAI;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootTest
@RestController
class InsightAiApplicationTests {

	@GetMapping("/test/hello")
	public String hello() {
		return "<h1>Hello Insight-AI</h1>";
	}

}
