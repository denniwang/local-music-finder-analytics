package com.thelocalmusicfinder.localmusicfinderanalytics.services;

import com.thelocalmusicfinder.localmusicfinderanalytics.dto.CreateVenueUserDTO;
import com.thelocalmusicfinder.localmusicfinderanalytics.models.VenueUserEvent;
import com.thelocalmusicfinder.localmusicfinderanalytics.repositories.VenueUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class VenueUserService {
    @Autowired
    private VenueUserRepository venueUserRepository;

    public VenueUserEvent createEvent(CreateVenueUserDTO payload) {
        VenueUserEvent  venueUserEvent = new VenueUserEvent();
        venueUserEvent.setUserId(payload.getUserId());
        venueUserEvent.setVenueId(payload.getVenueId());

        return venueUserRepository.save(venueUserEvent);
    }
}
