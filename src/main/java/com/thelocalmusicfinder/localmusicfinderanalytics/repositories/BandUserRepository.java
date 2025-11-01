package com.thelocalmusicfinder.localmusicfinderanalytics.repositories;

import com.thelocalmusicfinder.localmusicfinderanalytics.dto.CreateBandUserDTO;
import com.thelocalmusicfinder.localmusicfinderanalytics.models.BandUserEvent;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface BandUserRepository extends JpaRepository<BandUserEvent,Long> {
    //void createEvent(CreateBandUserDTO payload);
}
