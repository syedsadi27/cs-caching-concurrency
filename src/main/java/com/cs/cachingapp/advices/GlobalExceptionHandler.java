package com.cs.cachingapp.advices;


import com.cs.cachingapp.exception.ResourceNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.StaleObjectStateException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    // Generic
    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<?> handleRuntimeException(RuntimeException ex) {
        log.error(ex.getLocalizedMessage());
        return ResponseEntity.internalServerError().build();
    }

    // Resource Not Found
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<?> handleResourceNotFoundException(ResourceNotFoundException ex) {
        log.error(ex.getLocalizedMessage());
        return ResponseEntity.notFound().build();
    }

//    @ExceptionHandler(StaleObjectStateException.class)
//    public ResponseEntity<?> handleStaleObjectStateException(StaleObjectStateException ex) {
//        log.error(ex.getLocalizedMessage());
//        return ResponseEntity.status(409).body("Conflict: The resource you are trying to update");
//    }

}
