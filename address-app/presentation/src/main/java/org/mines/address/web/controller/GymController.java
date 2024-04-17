package org.mines.address.web.controller;

import org.mines.address.api.controller.GymApi;
import org.mines.address.api.model.Gym;
import org.mines.address.domain.model.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sportTracker.port.Driving.GymUseCase;

import java.util.List;
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
    public ResponseEntity<Gym> getGym(String id) {
        gymUseCase.getGymById(UUID.fromString(id));


    }

    // Map from API address to domain Gym
    /*

        private org.mines.address.domain.model.Address map(UUID townId, org.mines.address.api.model.Address address) {
        return Address.AddressBuilder.anAddress()
                .withNumber(address.getNumber().intValue())
                .withStreet(address.getStreet())
                .withTown(org.mines.address.domain.model.Town.TownBuilder.aTown().withId(townId).build())
                .build();
    }

     */
    private Gym map(org.mines.address.api.model.Gym gym) {
        return Gym.GymBuilder.aGym()
            .withId(UUID.fromString(gym.getId()))
            .withName(gym.getName())
            .build()
        ;
    }
}