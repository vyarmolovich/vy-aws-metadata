package com.vyarmolovich.aws.metadata.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Viktar_Yarmalovich on 4/4/2021.
 */
@RestController
public class MetaController {


    @GetMapping("/meta")
    public Meta greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Meta("eu-west-1", "eu-west-1a");
    }

}
