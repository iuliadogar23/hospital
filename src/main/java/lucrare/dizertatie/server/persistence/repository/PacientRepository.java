package lucrare.dizertatie.server.persistence.repository;

import lucrare.dizertatie.server.persistence.dao.PacientDAO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PacientRepository extends JpaRepository<PacientDAO, Integer> {
}
