package lucrare.dizertatie.server.persistence.repository;

import lucrare.dizertatie.server.persistence.dao.StarePacientDAO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StarePacientRepository extends JpaRepository<StarePacientDAO, Integer> {
}
