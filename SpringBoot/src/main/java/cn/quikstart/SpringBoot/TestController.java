package cn.quikstart.SpringBoot;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
@EnableAutoConfiguration
@ComponentScan
public class TestController {
	 @RequestMapping("/th")
     public String home() {
       return "Test Hello";
     }
   
     @RequestMapping("/tw")
     public String word() {
       return "Test World";
     }
}
