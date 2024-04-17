package sportTracker.port.Driven;

import sportTracker.domain.Model.Nutriment;

import java.util.Collection;

public interface NutrimentRepositoryPort {
    Nutriment insert(Nutriment nutriment);
    Collection<Nutriment> selectAll();
}
