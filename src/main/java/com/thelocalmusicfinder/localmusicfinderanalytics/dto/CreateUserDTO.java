package com.thelocalmusicfinder.localmusicfinderanalytics.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CreateUserDTO {
    private String location;
    private String browser;
    private String referrer;
    private String operatingSystem;
}
