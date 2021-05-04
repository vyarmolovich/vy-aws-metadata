package com.vyarmolovich.aws.metadata.rest;

/**
 * Created by Viktar_Yarmalovich on 4/4/2021.
 */
public class Meta {

    private String region;
    private String availabilityZone;

    public Meta(String region, String availabilityZone) {
        this.region = region;
        this.availabilityZone = availabilityZone;
    }

    public String getRegion() {
        return region;
    }

    public String getAvailabilityZone() {
        return availabilityZone;
    }
}
