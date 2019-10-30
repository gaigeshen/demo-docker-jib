package me.gaigeshen.demo.demo.dockerjib;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author gaigeshen
 */
@RestController
@RequestMapping
public class DemoController {
  @GetMapping("/hello")
  public String hello() {
    return "Hello World";
  }
}
