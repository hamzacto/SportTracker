package org.mines.address.web.controller;

import org.mines.address.api.controller.GymApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sportTracker.domain.Model.Gym;
import sportTracker.port.Driving.GymUseCase;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping
public class GymController implements GymApi {
    private GymUseCase gymUseCase;
//alt insert
    @Autowired
    public GymController(GymUseCase gymUseCase) {
        this.gymUseCase = gymUseCase;
    }

    @Override
    public ResponseEntity<org.mines.address.api.model.Gym> getGym(String id) {
        Optional<Gym> gymById = gymUseCase.getGymById(UUID.fromString(id));


    }

    // Map from gym domain to gym API
    private org.mines.address.api.model.Gym  map(sportTracker.domain.Model.Gym gym){
        org.mines.address.api.model.Gym apiGym = new org.mines.address.api.model.Gym();
        apiGym.setId(gym.getId());
        apiGym.setName(gym.getName());

        return apiGym;
    }

    // Map from API address to domain Gym
    private sportTracker.domain.Model.Gym map(org.mines.address.api.model.Gym gym){
        return sportTracker.domain.Model.Gym.GymBuilder.aGym()
            .withId(gym.getId())
            .withName(gym.getName())
            .build()
        ;
    }

}