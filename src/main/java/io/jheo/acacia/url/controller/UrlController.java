package io.jheo.acacia.url.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
public class UrlController {

    @GetMapping("/urls/{url}")
    public ResponseEntity<Mono> checkUrl(@PathVariable String url) {
        System.out.println("check url:"+url);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/urls")
    public ResponseEntity<Mono> createUrl(@RequestBody UrlCreationRequest urlCreationRequest) {
        System.out.println("creation:"+urlCreationRequest);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/test")
    public String hello() {
        return "hello";
    }

}
