package dev.idion.githubactionsdemo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

    @GetMapping("/")
    public ResponseEntity<String> main() {
        return ResponseEntity.ok("hello");
    }
}
