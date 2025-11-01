package com.thelocalmusicfinder.localmusicfinderanalytics.services;

import com.thelocalmusicfinder.localmusicfinderanalytics.dto.CreateBandUserDTO;
import com.thelocalmusicfinder.localmusicfinderanalytics.models.BandUserEvent;
import com.thelocalmusicfinder.localmusicfinderanalytics.repositories.BandUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BandUserService {
    private final BandUserRepository bandUserRepository;

    //private final BandUserRepository bandUserRepository;
    private void createEvent(CreateBandUserDTO payload) {
        
    }
}
