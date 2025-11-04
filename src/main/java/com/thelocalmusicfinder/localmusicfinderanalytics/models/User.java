package com.thelocalmusicfinder.localmusicfinderanalytics.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.Instant;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="location", nullable=false)
    private String location;

    @CreationTimestamp
    @Column(name="createdAt", nullable=false, updatable=false)
    private Instant createdAt;

    @Column(name="referrer")
    private String referrer;

    @Column(name="operating_system")
    private String operatingSystem;

    @Column(name="browser")
    private String browser;
}

