package sportTracker.domain.Service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import sportTracker.domain.Model.Gym;
import sportTracker.port.Driven.GymRepositoryPort;
import sportTracker.port.Driving.GymUseCase;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class GymServiceTest {

    @Mock
    private GymRepositoryPort gymRepositoryPort;

    @InjectMocks
    GymUseCase gymUseCase = new GymService(gymRepositoryPort);

    @Test
    void addGym() {
        // GIVEN
        int generatedId = 100;
        when(gymRepositoryPort.insert(any())).thenReturn(
            Gym.GymBuilder.aGym().withName("KeepCool").withId(generatedId).build()
        );

        // WHEN
        Gym build = Gym.GymBuilder.aGym().withName("KeepCool").build();
        Gym persisted = gymUseCase.addGym(build);

        // THEN
        assertEquals(generatedId, persisted.getId());
    }


    /* ------------------------- */

    @Test
    void getGym() {
    }

    @Test
    void removeGym() {
    }

    @Test
    void editGym() {
    }
}