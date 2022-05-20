package lucrare.dizertatie.server.persistence.repository;

import lucrare.dizertatie.server.persistence.dao.PrimirePacientDAO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrimirePacientRepository extends JpaRepository<PrimirePacientDAO, Integer> {
}
