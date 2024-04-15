package org.mines.address.port.driven;

import sportTracker.domain.Model.Athlete;

import java.util.Collection;

public interface AthleteRepositoryPort {

    Athlete insert(Athlete athlete);

    Collection<Athlete> selectAll();
}
