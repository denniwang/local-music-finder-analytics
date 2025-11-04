package com.thelocalmusicfinder.localmusicfinderanalytics.repositories;

import com.thelocalmusicfinder.localmusicfinderanalytics.models.BandUserEvent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BandUserRepository extends JpaRepository<BandUserEvent,Long> {
}
