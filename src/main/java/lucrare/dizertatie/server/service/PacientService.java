package lucrare.dizertatie.server.service;

import lucrare.dizertatie.server.model.Pacient;

import java.util.List;

public interface PacientService {

    List<Pacient> getAll();

    Pacient save(Pacient pacient);

}
