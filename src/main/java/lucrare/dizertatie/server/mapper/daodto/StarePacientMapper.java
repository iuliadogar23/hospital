package lucrare.dizertatie.server.mapper.daodto;

import lucrare.dizertatie.server.mapper.DaoDtoMapper;
import lucrare.dizertatie.server.model.StarePacient;
import lucrare.dizertatie.server.persistence.dao.StarePacientDAO;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;

@Mapper(componentModel = "spring", nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
public interface StarePacientMapper extends DaoDtoMapper<StarePacientDAO, StarePacient> {
}
