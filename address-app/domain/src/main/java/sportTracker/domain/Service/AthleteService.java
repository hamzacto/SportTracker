package sportTracker.domain.Service;

import org.springframework.domain.Port.Driven.AthleteRepositoryPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import sportTracker.domain.Model.Athlete;
import sportTracker.domain.Model.Complement;
import sportTracker.domain.Model.Gym;
import sportTracker.domain.Model.Nutriment;
import sportTracker.domain.Port.Driving.AthleteUseCase;

import java.util.List;
import java.util.UUID;

@Component
public class AthleteService implements AthleteUseCase {

    private AthleteRepositoryPort athleteRepositoryPort;

    @Autowired
    public AthleteService(AthleteRepositoryPort athleteRepositoryPort) {
        this.athleteRepositoryPort = athleteRepositoryPort;
    }

    @Override
    public Athlete addAthlete(Athlete athlete) {
        if (athlete.getAge() <= 0){
            throw new IllegalArgumentException("");
        }

        return athleteRepositoryPort.insert(athlete);
    }

    @Override
    public List<Athlete> getAthlete(UUID id) {
        if (id == null) {
            throw new IllegalArgumentException("ID cannot be null");
        }
        return List.of();
    }

    @Override
    public void removeAthlete(UUID id) {

    }

    @Override
    public void editAthlete(UUID id) {

    }

    @Override
    public Gym fromWhichGymIsAthlete(UUID id) {
        return null;
    }

    @Override
    public List<Nutriment> whichNutrimentTakesAhtlete(UUID id) {
        return List.of();
    }

    @Override
    public List<Complement> whichComplementTakesAhtlete(UUID id) {
        return List.of();
    }
}
