package sportTracker.infrastructure.Repository;

import org.mines.address.infrastructure.repository.TownRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import sportTracker.domain.Model.Gym;
import sportTracker.port.Driven.GymRepositoryPort;

import java.util.Collection;
import java.util.List;

@Repository
public class GymRepositoryAdapter implements GymRepositoryPort {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public GymRepositoryAdapter(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Gym insert(Gym gym) {
        return null;
    }

    @Override
    public Collection<Gym> selectAll() {
        return jdbcTemplate.query("select id,name, address, pricing from gym", new GymRowMapper());

    }
}
