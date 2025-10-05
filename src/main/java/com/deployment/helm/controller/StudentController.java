package com.deployment.helm.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@Slf4j
@RestController
public class StudentController {

    @GetMapping("/students")
    public List<Map<String, String>> getStudents() {
        log.info("request received successfully");
        return List.of(
                Map.of("id", "1", "name", "Anand"),
                Map.of("id", "2", "name", "Ravi"),
                Map.of("id", "3", "name", "Sneha")
        );
    }
}