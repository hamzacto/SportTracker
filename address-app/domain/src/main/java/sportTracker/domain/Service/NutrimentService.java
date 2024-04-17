package sportTracker.domain.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import sportTracker.domain.Model.Nutriment;
import sportTracker.port.Driven.GymRepositoryPort;
import sportTracker.port.Driven.NutrimentRepositoryPort;
import sportTracker.port.Driving.NutrimentUseCase;

import java.util.List;
import java.util.UUID;

@Component
public class NutrimentService implements NutrimentUseCase {
    private NutrimentRepositoryPort nutrimentRepositoryPort;

    @Autowired
    public NutrimentService(NutrimentRepositoryPort nutrimentRepositoryPort) {
        this.nutrimentRepositoryPort = nutrimentRepositoryPort;
    }

    @Override
    public Nutriment addNutriment(Nutriment nutriment) {
        return nutrimentRepositoryPort.insert(nutriment);
    }

    @Override
    public List<Nutriment> getNutriment(UUID id) {
        return List.of();
    }

    @Override
    public void removeNutriment(UUID id) {

    }

    @Override
    public void editNutriment(UUID id) {

    }
}
