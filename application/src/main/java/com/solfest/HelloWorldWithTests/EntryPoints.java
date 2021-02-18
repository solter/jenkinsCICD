package com.solfest.HelloWorldWithTests;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Trivial class the sets up the requests that sets up Rest endpoints.
 */
@Controller
public class EntryPoints {

  @RequestMapping("/")
  public @ResponseBody String landingPage() {
    return "Hello world!";
  }
}
