package com.royal.testValidation.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.MediaType;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import javax.servlet.http.HttpServletRequest;


@RestController
public class ValidationController {

    @GetMapping(value = "validation/test" , produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity healthCheck(){
        return new ResponseEntity<>("Service is UP" , HttpStatus.OK);

    }

    //http://localhost:8080/validation/test
    @GetMapping(value = "validation/testHeader" , produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity healthCheckHdrs(
            @RequestHeader(value="X-racf" , required = false) String racfId,
            @RequestParam(value="test" , required = false) boolean test
            //,@PathVariable String token
            ){
        return new ResponseEntity<>("Service is UP" , HttpStatus.OK);

    }

}
