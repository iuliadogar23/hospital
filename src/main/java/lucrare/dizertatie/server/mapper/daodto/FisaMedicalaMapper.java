package lucrare.dizertatie.server.mapper.daodto;

import lucrare.dizertatie.server.mapper.DaoDtoMapper;
import lucrare.dizertatie.server.model.FisaMedicala;
import lucrare.dizertatie.server.persistence.dao.FisaMedicalaDAO;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;

@Mapper(componentModel = "spring", nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
public interface FisaMedicalaMapper extends DaoDtoMapper<FisaMedicalaDAO, FisaMedicala> {
}
