package org.itstep;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ApplicationTests {

	@LocalServerPort
	private int port;

	@Autowired
	private TestRestTemplate testRestTemplate;

	@Test
	void contextLoads() {
		Assertions.assertEquals("<p> Good bue </p><a href = '/'> Back </a>",
				testRestTemplate.getForObject("http://localhost:"+port+"/by", String.class));
	}

	@Test
	void contextLoads2(){
		Assertions.assertEquals("Hello World",
		testRestTemplate.getForObject("http://localhost:"+port,String.class));
	}


}
