package com.thelocalmusicfinder.localmusicfinderanalytics.services;

import com.thelocalmusicfinder.localmusicfinderanalytics.dto.CreateUserDTO;
import com.thelocalmusicfinder.localmusicfinderanalytics.models.User;
import com.thelocalmusicfinder.localmusicfinderanalytics.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User createUser(CreateUserDTO payload) {
        User u = new User();
        u.setLocation(payload.getLocation());
        u.setOperatingSystem(payload.getOperatingSystem());
        u.setBrowser(payload.getBrowser());
        u.setReferrer(payload.getReferrer());

        return userRepository.save(u);
    }
}
