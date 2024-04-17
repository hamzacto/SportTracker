package sportTracker.domain.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import sportTracker.domain.Model.Gym;
import sportTracker.port.Driven.AthleteRepositoryPort;
import sportTracker.port.Driven.GymRepositoryPort;
import sportTracker.port.Driving.GymUseCase;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Component
public class GymService implements GymUseCase {
    private GymRepositoryPort gymRepositoryPort;

    @Autowired
    public GymService(GymRepositoryPort gymRepositoryPort) {
        this.gymRepositoryPort = gymRepositoryPort;
    }

    @Override
    public Gym addGym(Gym gym) {
        return gymRepositoryPort.insert(gym);
    }

    /* ------------------------------------ */

    @Override
    public List<Gym> getGym(UUID id) {
        return List.of();
    }

    @Override
    public Optional<Gym> getGymById(UUID id) {
        return Optional.empty();
    }

    @Override
    public void removeGym(UUID id) {

    }

    @Override
    public void editGym(UUID id) {

    }
}
