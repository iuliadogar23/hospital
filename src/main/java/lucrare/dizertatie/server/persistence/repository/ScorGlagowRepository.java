package lucrare.dizertatie.server.persistence.repository;

import lucrare.dizertatie.server.persistence.dao.ScorGlagowDAO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScorGlagowRepository extends JpaRepository<ScorGlagowDAO, Integer> {
}
