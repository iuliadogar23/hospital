package lucrare.dizertatie.server.service.impl;

import lombok.RequiredArgsConstructor;
import lucrare.dizertatie.common.exception.RepositoryException;
import lucrare.dizertatie.server.mapper.daodto.FisaMedicalaMapper;
import lucrare.dizertatie.server.model.FisaMedicala;
import lucrare.dizertatie.server.persistence.dao.FisaMedicalaDAO;
import lucrare.dizertatie.server.persistence.repository.FisaMedicalaRepository;
import lucrare.dizertatie.server.service.FisaMedicalaService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FisaMedicalaServiceImpl implements FisaMedicalaService {

    private final FisaMedicalaRepository fisaMedicalaRepository;

    private final FisaMedicalaMapper fisaMedicalaMapper;

    @Override
    public List<FisaMedicala> getAll() {
        return fisaMedicalaMapper.daoList2dtoList(fisaMedicalaRepository.findAll());
    }

    @Override
    public FisaMedicala save(FisaMedicala fisaMedicala) {

        try {
            FisaMedicalaDAO savedFisaMedicala = fisaMedicalaRepository.save(fisaMedicalaMapper.dto2dao(fisaMedicala));

            return fisaMedicalaMapper.dao2dto(savedFisaMedicala);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RepositoryException();
        }
    }
}
