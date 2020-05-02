package com.dalircode.springexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringExampleApplication.class, args);
    }

}

@RestController
@RequestMapping(path = "/")
class TestController {

    @RequestMapping(value = "hello/{name}", method = RequestMethod.GET)
    public String sayHello(@PathVariable(value = "name") String name) {
        return "Hello " + name;
    }
}
