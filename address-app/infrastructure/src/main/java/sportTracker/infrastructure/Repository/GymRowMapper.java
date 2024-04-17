package sportTracker.infrastructure.Repository;

import org.mines.address.domain.model.Town;
import org.springframework.jdbc.core.RowMapper;
import sportTracker.domain.Model.Gym;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.UUID;

public class GymRowMapper implements RowMapper<Gym> {
    @Override
    public Gym mapRow(ResultSet rs, int rowNum) throws SQLException {
        return Gym.GymBuilder.aGym()
            .withId(rs.getInt("id"))
            .withName(rs.getString("name"))
            .withAddress(rs.getString("address"))
            .withPricing(rs.getFloat("pricing"))
            .build();
    }
}
