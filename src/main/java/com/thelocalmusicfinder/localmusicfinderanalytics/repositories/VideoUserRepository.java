package com.thelocalmusicfinder.localmusicfinderanalytics.repositories;

import com.thelocalmusicfinder.localmusicfinderanalytics.models.VideoUserEvent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoUserRepository extends JpaRepository<VideoUserEvent,Long> {
}
