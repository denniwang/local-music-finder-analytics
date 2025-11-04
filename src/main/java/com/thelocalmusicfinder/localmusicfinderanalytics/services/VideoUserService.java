package com.thelocalmusicfinder.localmusicfinderanalytics.services;

import com.thelocalmusicfinder.localmusicfinderanalytics.dto.CreateVideoUserDTO;
import com.thelocalmusicfinder.localmusicfinderanalytics.models.VideoUserEvent;
import com.thelocalmusicfinder.localmusicfinderanalytics.repositories.VideoUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class VideoUserService {
    @Autowired
    private VideoUserRepository videoUserRepository;

    public VideoUserEvent createEvent(CreateVideoUserDTO payload) {
        VideoUserEvent  videoUserEvent = new VideoUserEvent();
        videoUserEvent.setUserId(payload.getUserId());
        videoUserEvent.setVideoId(payload.getVideoId());

        return videoUserRepository.save(videoUserEvent);
    }
}
