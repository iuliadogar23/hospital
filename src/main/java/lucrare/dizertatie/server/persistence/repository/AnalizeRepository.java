package lucrare.dizertatie.server.persistence.repository;

import lucrare.dizertatie.server.persistence.dao.AnalizeDAO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnalizeRepository extends JpaRepository<AnalizeDAO, Integer> {
}
