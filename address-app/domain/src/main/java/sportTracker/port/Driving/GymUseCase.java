package sportTracker.port.Driving;

import sportTracker.domain.Model.Gym;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface GymUseCase {
    // CRUD
    public Gym addGym(Gym athlete);
    public List<Gym> getGym(UUID id);
    public Optional<Gym> getGymById(UUID id);
    public void removeGym(UUID id);
    public void editGym(UUID id);
}
