package com.example.springbootlogback.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogbackController {


    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @GetMapping("/logback")
    public String log(@RequestParam String message) {


        String log = "logback " + message;

        logger.info(log);
        return log;

    }


}































