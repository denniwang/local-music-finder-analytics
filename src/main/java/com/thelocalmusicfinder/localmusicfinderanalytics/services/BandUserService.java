package com.thelocalmusicfinder.localmusicfinderanalytics.services;

import com.thelocalmusicfinder.localmusicfinderanalytics.dto.CreateBandUserDTO;
import com.thelocalmusicfinder.localmusicfinderanalytics.models.BandUserEvent;
import com.thelocalmusicfinder.localmusicfinderanalytics.repositories.BandUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BandUserService {

    @Autowired
    private final BandUserRepository bandUserRepository;

    //private final BandUserRepository bandUserRepository;
    public BandUserEvent createEvent(CreateBandUserDTO payload) {
        BandUserEvent bandUserEvent = new BandUserEvent();
        bandUserEvent.setUserId(payload.getUserId());
        bandUserEvent.setBandId(payload.getBandId());

        BandUserEvent savedEvent = bandUserRepository.save(bandUserEvent);
        return savedEvent;
    }
}
