package com.example.basicapp;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class AppController {

    @RequestMapping(method = RequestMethod.GET, value = "/hello/v1")
    public ResponseEntity<String> testHello(@RequestParam("text") String text) {
        return ResponseEntity.ok("Hello Client! I'm AULA test service. You text me this: "+text);

    }

    @RequestMapping(method = RequestMethod.GET, value = "/hello")
    public ResponseEntity<String> testHelloBasic() {
        return ResponseEntity.ok("Hello Client! I'm AULA test service.");

    }
}
