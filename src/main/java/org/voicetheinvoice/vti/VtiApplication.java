package org.voicetheinvoice.vti;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class VtiApplication {

    public static void main(String[] args) {
        SpringApplication.run(VtiApplication.class, args);
    }

    @GetMapping("/")
    public String welcome() {
        return "Welcome to Voice the Invoice Application";
    }
    @GetMapping("/error")
    public String error() {
        return "Error";
    }

}