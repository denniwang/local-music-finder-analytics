package com.thelocalmusicfinder.localmusicfinderanalytics.repositories;

import com.thelocalmusicfinder.localmusicfinderanalytics.models.VenueUserEvent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VenueUserRepository extends JpaRepository<VenueUserEvent,Long> {
}
