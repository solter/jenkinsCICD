package com.solfest.HelloWorldWithTests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

@SpringBootTest(webEnvironment= WebEnvironment.RANDOM_PORT)
class HelloWorldWithTestsApplicationTests {

  /** The auto-assigned random port set up by spring for this test. */
  @LocalServerPort
  private int port;

  /** Used to send http requests during the test. */
  @Autowired
  private TestRestTemplate restTemplate;

	@Test
	void defaultMessageReturned() {
    String result = restTemplate.getForObject("http://localhost:"+port+"/", String.class);
    assertEquals("Hello world!", result);
	}

}
