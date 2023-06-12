package com.spring.start.Jenkins.Integration;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    public String msg()
    {
        return  "Hello MSG";
    }
}
