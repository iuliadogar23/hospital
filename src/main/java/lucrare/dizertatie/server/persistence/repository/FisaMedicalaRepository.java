package lucrare.dizertatie.server.persistence.repository;

import lucrare.dizertatie.server.persistence.dao.FisaMedicalaDAO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FisaMedicalaRepository extends JpaRepository<FisaMedicalaDAO, Integer> {
}
