package desktop.core.database.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import desktop.core.database.entities.Sample;

@Repository
public interface SampleRepository extends JpaRepository<Sample, Integer> {

}
