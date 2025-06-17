package org.example.spring_demo_base.controller;

import org.example.spring_demo_base.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloControllerServ {


    private GreetingService greetingService;

    //@Autowired
   // public HelloControllerServ(@Qualifier("greetings") GreetingService greetingService) {
    public HelloControllerServ(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @RequestMapping("/hello-set")
    public String sayHello(){
        System.out.println(greetingService.greet());
        return "hello";
    }
}
