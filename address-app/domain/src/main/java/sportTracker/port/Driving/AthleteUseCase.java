package sportTracker.port.Driving;

import sportTracker.domain.Model.Athlete;
import sportTracker.domain.Model.Complement;
import sportTracker.domain.Model.Gym;
import sportTracker.domain.Model.Nutriment;

import java.util.List;
import java.util.UUID;

public interface AthleteUseCase {

    // CRUD
    public Athlete addAthlete(Athlete athlete);
    public List<Athlete> getAthlete(UUID id);
    public void removeAthlete(UUID id);
    public void editAthlete(UUID id);

    // Personnalisé
    public Gym fromWhichGymIsAthlete(UUID id);
    public List<Nutriment> whichNutrimentTakesAhtlete(UUID id);
    public List<Complement> whichComplementTakesAhtlete(UUID id);
}
