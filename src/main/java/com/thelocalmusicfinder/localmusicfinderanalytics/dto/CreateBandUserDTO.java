package com.thelocalmusicfinder.localmusicfinderanalytics.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CreateBandUserDTO {
    private Long userId;
    private Long bandId;
}
