package com.thelocalmusicfinder.localmusicfinderanalytics.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CreateVenueUserDTO {
    private Long userId;
    private Long venueId;
}
