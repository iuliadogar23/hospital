package lucrare.dizertatie.server.mapper.daodto;

import lucrare.dizertatie.server.mapper.DaoDtoMapper;
import lucrare.dizertatie.server.model.Leziune;
import lucrare.dizertatie.server.persistence.dao.LeziuneDAO;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;

@Mapper(componentModel = "spring", nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
public interface LeziuneMapper extends DaoDtoMapper<LeziuneDAO, Leziune> {
}
