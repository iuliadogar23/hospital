package lucrare.dizertatie.server.mapper.daodto;

import lucrare.dizertatie.server.mapper.DaoDtoMapper;
import lucrare.dizertatie.server.model.InjurySeverityScore;
import lucrare.dizertatie.server.persistence.dao.InjurySeverityScoreDAO;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;

@Mapper(componentModel = "spring", nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
public interface InjurySeverityScoreMapper extends DaoDtoMapper<InjurySeverityScoreDAO, InjurySeverityScore> {
}
