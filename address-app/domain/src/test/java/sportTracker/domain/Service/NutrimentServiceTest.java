package sportTracker.domain.Service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import sportTracker.port.Driven.NutrimentRepositoryPort;
import sportTracker.port.Driving.NutrimentUseCase;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class NutrimentServiceTest {

    @Mock
    private NutrimentRepositoryPort nutrimentRepositoryPort;

    @InjectMocks
    NutrimentUseCase nutrimentUseCase = new NutrimentService(nutrimentRepositoryPort);

    @Test
    void addNutriment() {
    }

    @Test
    void getNutriment() {
    }

    @Test
    void removeNutriment() {
    }

    @Test
    void editNutriment() {
    }
}