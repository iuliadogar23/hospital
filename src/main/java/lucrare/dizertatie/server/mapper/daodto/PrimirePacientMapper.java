package lucrare.dizertatie.server.mapper.daodto;

import lucrare.dizertatie.server.mapper.DaoDtoMapper;
import lucrare.dizertatie.server.model.PrimirePacient;
import lucrare.dizertatie.server.persistence.dao.PrimirePacientDAO;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;

@Mapper(componentModel = "spring", nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
public interface PrimirePacientMapper extends DaoDtoMapper<PrimirePacientDAO, PrimirePacient> {
}
