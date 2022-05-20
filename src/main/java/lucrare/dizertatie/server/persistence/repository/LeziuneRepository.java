package lucrare.dizertatie.server.persistence.repository;

import lucrare.dizertatie.server.persistence.dao.LeziuneDAO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LeziuneRepository extends JpaRepository<LeziuneDAO, Integer> {
}
