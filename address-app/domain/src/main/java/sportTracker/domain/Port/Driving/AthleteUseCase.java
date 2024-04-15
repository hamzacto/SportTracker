package SportTracker.domain.Port.Driving;

import SportTracker.domain.Model.Athlete;
import SportTracker.domain.Model.Complement;
import SportTracker.domain.Model.Gym;
import SportTracker.domain.Model.Nutriment;

import java.util.List;
import java.util.UUID;

public interface AthleteUseCase {

    // CRUD
    public void addAthlete(Athlete athlete);
    public List<Athlete> getAthlete(UUID id);
    public void removeAthlete(UUID id);
    public void editAthlete(UUID id);

    // Personnalisé
    public Gym fromWhichGymIsAthlete(UUID id);
    public List<Nutriment> whichNutrimentTakesAhtlete(UUID id);
    public List<Complement> whichComplementTakesAhtlete(UUID id);
    public List<Complement> which
}
