package io.code.userauth.Resource;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    @GetMapping
    public String all(){
        return "Hello";
    }

    @GetMapping
    public String securedAll(){
        return "Hello with security";
    }
}
