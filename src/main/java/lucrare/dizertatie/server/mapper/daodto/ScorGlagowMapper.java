package lucrare.dizertatie.server.mapper.daodto;

import lucrare.dizertatie.server.mapper.DaoDtoMapper;
import lucrare.dizertatie.server.model.ScorGlagow;
import lucrare.dizertatie.server.persistence.dao.ScorGlagowDAO;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;

@Mapper(componentModel = "spring", nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
public interface ScorGlagowMapper extends DaoDtoMapper<ScorGlagowDAO, ScorGlagow> {
}
