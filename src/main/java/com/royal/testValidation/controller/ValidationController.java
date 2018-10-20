package com.royal.testValidation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.MediaType;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import javax.servlet.http.HttpServletRequest;

@RestController
public class ValidationController {

    @Autowired
    private HttpServletRequest httpServletRequestNew;

    @GetMapping(value = "validation/test" , produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity healthCheck(){
        return new ResponseEntity<>("Service is UP" , HttpStatus.OK);
    }

    //http://localhost:8080/validation/test
    @GetMapping(value = "validation/testHeader" , produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity healthCheckHdrs(
            @RequestHeader(value="X-racf" , required = false) String racfId,
            @RequestParam(value="test" , required = false) boolean test,
            HttpServletRequest httpServletRequest
            //,@PathVariable String token
            ){

        System.out.println("test = " + test);
        System.out.println("httpServletRequest = " + httpServletRequest.hashCode());
        System.out.println("httpServletRequestNew = " + httpServletRequestNew.hashCode());

        try {
                Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String lstr = httpServletRequestNew.getParameter("name");
        System.out.println("lstr = " + lstr);


        System.out.println("Done in controller");
        return new ResponseEntity<>("Service is UP" , HttpStatus.OK);

    }
}
