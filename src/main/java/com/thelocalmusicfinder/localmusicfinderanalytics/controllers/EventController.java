package com.thelocalmusicfinder.localmusicfinderanalytics.controllers;

import com.thelocalmusicfinder.localmusicfinderanalytics.dto.CreateBandUserDTO;
import com.thelocalmusicfinder.localmusicfinderanalytics.services.BandUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/event")
@RequiredArgsConstructor
public class EventController {
    private final BandUserService bandUserService;
    //private final UserService userService;
    //private final VenueUserService venueUserService;
    //private final VideoUserService videoUserService;

    @PostMapping()
    public void createBandUser(@RequestBody CreateBandUserDTO payload) {
        bandUserService.createEvent(payload);

    }


}
