package com.wilber.Spring.Initializr.web.contoller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.HashMap;
import java.util.Map;


public class ResponseHelper {
    public static ResponseEntity<Object> generateResponse(String message, HttpStatus status, Object responseObj,
                                                          int count) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("message", message);
        map.put("status", status.value());
        map.put("data", responseObj);
        map.put("Total Character Count", count);

        return new ResponseEntity<Object>(map, status);
    }
}

