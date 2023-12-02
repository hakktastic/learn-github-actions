package nl.hakktastic.learn.github.actions.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequestMapping(path = "/api/v1", produces = MediaType.APPLICATION_JSON_VALUE)
@RestController
public class TestController {

    @GetMapping(value = "/hello")
    public ResponseEntity<String> getHello(){

        return new ResponseEntity<>("Hello World!", HttpStatus.OK);
    }
}
