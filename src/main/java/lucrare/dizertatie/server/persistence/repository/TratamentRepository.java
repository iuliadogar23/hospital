package lucrare.dizertatie.server.persistence.repository;

import lucrare.dizertatie.server.persistence.dao.TratamentDAO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TratamentRepository extends JpaRepository<TratamentDAO, Integer> {
}
