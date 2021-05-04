package com.vyarmolovich.aws.metadata.rest;

import com.amazonaws.util.EC2MetadataUtils;
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
        return new Meta(EC2MetadataUtils.getEC2InstanceRegion(), EC2MetadataUtils.getAvailabilityZone());
    }

}
