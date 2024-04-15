package com.momentslee.springboot.myfirstwebapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {

    @GetMapping("/say-hello")
    @ResponseBody
    public String sayHello() {
        return "Hello! What are you learning today?";
    }

    @GetMapping("/say-hello-html")
    @ResponseBody
    public String sayHelloHtml() {
        String sb = "<html>" +
                "<head>" +
                "<title>Say Hello</title>" +
                "</head>" +
                "<body>" +
                "<h1>Hello! What are you learning today?</h1>" +
                "</body>" +
                "</html>";
        return sb;
    }
}
