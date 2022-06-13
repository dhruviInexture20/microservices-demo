package com.microservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackController {

    @GetMapping("/customerServiceFallBack")
    public String customerServiceFallBack(){
        return "Customer service is down temporarily";
    }


    @GetMapping("/accountServiceFallBack")
    public String accountServiceFallBack(){
        return "Account service is down temporarily";
    }
}
