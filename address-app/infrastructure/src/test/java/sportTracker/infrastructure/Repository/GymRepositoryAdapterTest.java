package sportTracker.infrastructure.Repository;

import org.address.infrastructure.config.PersistenceTestConfig;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mines.address.domain.model.Town;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.SqlScriptsTestExecutionListener;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.transaction.TransactionalTestExecutionListener;
import sportTracker.domain.Model.Gym;
import sportTracker.port.Driven.GymRepositoryPort;

import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(SpringExtension.class)
@TestExecutionListeners({SqlScriptsTestExecutionListener.class, TransactionalTestExecutionListener.class, DependencyInjectionTestExecutionListener.class})
@ContextConfiguration(classes = {PersistenceTestConfig.class})
@Sql(scripts = {"/data/clear.sql", "/data/gym.sql", "/data/town.sql"})
class GymRepositoryAdapterTest {

    @Autowired
    private GymRepositoryPort gymRepository;

    @Test
    public void shouldFindAll() {
        Collection<Gym> all = gymRepository.selectAll();

        assertEquals(1, all.size());

        Gym gym = all.stream().findFirst().get();
        assertEquals("Gym", gym.getName());
    }

    @Test
    public void shouldInsert() {
        Gym gym = new Gym();
        gym.setName("Nouveau nom");
        gym.setAddress("Nouvelle adresse");
        gym.setPricing(555.0F);

        Gym insertedGym = gymRepository.insert(gym);
    }

    @Test
    void selectAll() {
    }
}