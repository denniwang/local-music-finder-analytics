package com.thelocalmusicfinder.localmusicfinderanalytics.controllers;

import com.thelocalmusicfinder.localmusicfinderanalytics.dto.CreateBandUserDTO;
import com.thelocalmusicfinder.localmusicfinderanalytics.dto.CreateUserDTO;
import com.thelocalmusicfinder.localmusicfinderanalytics.dto.CreateVenueUserDTO;
import com.thelocalmusicfinder.localmusicfinderanalytics.dto.CreateVideoUserDTO;
import com.thelocalmusicfinder.localmusicfinderanalytics.services.BandUserService;
import com.thelocalmusicfinder.localmusicfinderanalytics.services.UserService;
import com.thelocalmusicfinder.localmusicfinderanalytics.services.VenueUserService;
import com.thelocalmusicfinder.localmusicfinderanalytics.services.VideoUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/event")
@RequiredArgsConstructor
public class EventController {
    private final BandUserService bandUserService;
    private final VenueUserService venueUserService;
    private final VideoUserService videoUserService;
    private final UserService userService;
    //private final UserService userService;
    //private final VenueUserService venueUserService;

    @PostMapping()
    public void createBandUser(@RequestBody CreateBandUserDTO payload) {
        bandUserService.createEvent(payload);
    }

    @PostMapping()
    public void createVenueUser(@RequestBody CreateVenueUserDTO payload) {
        venueUserService.createEvent(payload);
    }

    @PostMapping()
    public void createVideoUser(@RequestBody CreateVideoUserDTO payload) {
        videoUserService.createEvent(payload);
    }

    @PostMapping()
    public void createUser(@RequestBody CreateUserDTO payload) {
        userService.createUser(payload);
    }


}
