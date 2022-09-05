package lucrare.dizertatie.server.persistence.repository;

import lucrare.dizertatie.server.persistence.dao.FisaMedicalaDAO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FisaMedicalaRepository extends JpaRepository<FisaMedicalaDAO, Integer> {

    List<FisaMedicalaDAO> findAllByStarePacientEvaluareIsNull();
}
