package lucrare.dizertatie.server.service;

import lucrare.dizertatie.server.model.FisaMedicala;

import java.util.List;

public interface FisaMedicalaService {

    List<FisaMedicala> getAll();

    FisaMedicala save(FisaMedicala fisaMedicala);

    FisaMedicala findById(Integer id);

    List<FisaMedicala> getAllActive();

}
