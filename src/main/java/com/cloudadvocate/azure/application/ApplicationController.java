package com.cloudadvocate.azure.application;

import io.swagger.annotations.Api;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
/**
 * Created by MRomeh on 08/08/2017.
 */
@RestController
@RequestMapping("/application")
@Api(value = "Applciation demo")
public class ApplicationController {

    private static final Logger log = LoggerFactory.getLogger(ApplicationController.class);

    
    @RequestMapping(method={RequestMethod.GET},value={"/version"})
    public String getVersion() {
        return "1.0";
    }



}
