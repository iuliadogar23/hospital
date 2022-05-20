package lucrare.dizertatie.server.service.impl;

import lombok.RequiredArgsConstructor;
import lucrare.dizertatie.server.mapper.daodto.PacientMapper;
import lucrare.dizertatie.server.model.Pacient;
import lucrare.dizertatie.server.persistence.dao.PacientDAO;
import lucrare.dizertatie.server.persistence.repository.PacientRepository;
import lucrare.dizertatie.server.service.PacientService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PacientServiceImpl implements PacientService {

    private final PacientRepository pacientRepository;

    private final PacientMapper pacientMapper;

    @Override
    public List<Pacient> getAll() {
        return pacientMapper.daoList2dtoList(pacientRepository.findAll());
    }

    @Override
    public Pacient save(Pacient pacient) {

        PacientDAO savedPacient = pacientRepository.save(pacientMapper.dto2dao(pacient));

        return pacientMapper.dao2dto(savedPacient);
    }
}
