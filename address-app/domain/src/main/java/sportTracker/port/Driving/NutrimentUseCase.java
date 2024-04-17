package sportTracker.port.Driving;

import sportTracker.domain.Model.Gym;
import sportTracker.domain.Model.Nutriment;

import java.util.List;
import java.util.UUID;

public interface NutrimentUseCase {
    public Nutriment addNutriment(Nutriment nutriment);
    public List<Nutriment> getNutriment(UUID id);
    public void removeNutriment(UUID id);
    public void editNutriment(UUID id);
}
