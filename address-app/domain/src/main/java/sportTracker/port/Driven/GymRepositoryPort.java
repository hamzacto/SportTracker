package sportTracker.port.Driven;

import sportTracker.domain.Model.Athlete;
import sportTracker.domain.Model.Gym;

import java.util.Collection;

public interface GymRepositoryPort {
    Gym insert(Gym gym);
    Collection<Gym> selectAll();
}
