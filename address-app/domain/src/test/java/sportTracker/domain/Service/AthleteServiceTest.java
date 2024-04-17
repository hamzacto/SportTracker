package sportTracker.domain.Service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import sportTracker.domain.Model.Athlete;
import sportTracker.port.Driven.AthleteRepositoryPort;
import sportTracker.port.Driving.AthleteUseCase;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class AthleteServiceTest {

    @Mock
    private AthleteRepositoryPort athleteRepositoryPort;

    @InjectMocks
    AthleteUseCase athleteUseCase = new AthleteService(athleteRepositoryPort);
    UUID id = null;

    @Test
    void shoultNotAddAnAthleteWithInvalidAge(){
        Athlete build = Athlete.AthleteBuilder.anAthlete().withAge(-10).build();
        assertThrows(IllegalArgumentException.class, () -> athleteUseCase.addAthlete(build) );
    }

    @Test
    void getNullAthleteId() {
        Athlete build = Athlete.AthleteBuilder.anAthlete().withId(null).build();
        assertThrows(IllegalArgumentException.class, () -> athleteUseCase.getAthlete(id));
    }

    @Test
    void addAthlete() {
        // GIVEN

        int generatedId = 100;
        when(athleteRepositoryPort.insert(any())).thenReturn(
                Athlete.AthleteBuilder.anAthlete().withAge(10).withId(generatedId).build()
        );

        // WHEN
        Athlete build = Athlete.AthleteBuilder.anAthlete().withAge(10).build();
        Athlete persisted = athleteUseCase.addAthlete(build);

        // THEN
        assertEquals(generatedId, persisted.getId());
    }



    @Test
    void getAthlete() {
    }

    @Test
    void removeAthlete() {
    }

    @Test
    void editAthlete() {
    }

    @Test
    void fromWhichGymIsAthlete() {
    }

    @Test
    void whichNutrimentTakesAhtlete() {
    }

    @Test
    void whichComplementTakesAhtlete() {
    }
}