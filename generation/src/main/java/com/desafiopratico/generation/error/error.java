package com.desafiopratico.generation.error;

import org.springframework.http.HttpStatus;
        import org.springframework.http.ResponseEntity;
        import org.springframework.web.bind.annotation.GetMapping;
        import org.springframework.web.bind.annotation.RestController;

@RestController
public class error {
    @GetMapping("/check")
    public ResponseEntity<String> checkApplication() {
        return new ResponseEntity<>("Aplicação online", HttpStatus.OK);
    }
}