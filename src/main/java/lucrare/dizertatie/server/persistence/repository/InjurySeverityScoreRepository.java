package lucrare.dizertatie.server.persistence.repository;

import lucrare.dizertatie.server.persistence.dao.InjurySeverityScoreDAO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InjurySeverityScoreRepository extends JpaRepository<InjurySeverityScoreDAO, Integer> {
}
