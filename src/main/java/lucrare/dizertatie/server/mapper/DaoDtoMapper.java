package lucrare.dizertatie.server.mapper;

import org.mapstruct.Context;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Named;

import java.util.List;
import java.util.Map;

public interface DaoDtoMapper <A, T> {

    @Named("dao2dto")
    default T dao2dto(A dao) {
        return this.dao2dto(dao, new CycleAvoidingMappingContext());
    }

    T dao2dto(A dao, @Context CycleAvoidingMappingContext context);

    /**
     * Maps dto object to dao object
     *
     * @param dto dto
     * @return
     */
    @Named("dto2dao")
    default A dto2dao(T dto) {
        return this.dto2dao(dto, new CycleAvoidingMappingContext());
    }

    @InheritInverseConfiguration
    A dto2dao(T dto, @Context CycleAvoidingMappingContext context);

    /**
     * Maps a list of dao objects to a list of dto objects
     *
     * @param daos - list of dao
     * @return a list of dto
     */
    @Named("daoList2dtoList")
    default List<T> daoList2dtoList(List<A> daos) {
        return this.daoList2dtoList(daos, new CycleAvoidingMappingContext());
    }
    List<T> daoList2dtoList(List<A> daos, @Context CycleAvoidingMappingContext context);

    /**
     * Maps a list of dto objects to list of dao objects
     *
     * @param dtos dto
     * @return a list of dao
     */
    @Named("dtoList2daoList")
    default List<A> dtoList2daoList(List<T> dtos) {
        return this.dtoList2daoList(dtos, new CycleAvoidingMappingContext());
    }

    @InheritInverseConfiguration
    List<A> dtoList2daoList(List<T> dtos, @Context CycleAvoidingMappingContext context);

    @Named("daoMapToDtoMap")
    default Map<Integer, T> daoMapToDtoMap(Map<Integer, A> map){
        return daoMapToDtoMap(map, new CycleAvoidingMappingContext());
    }

    Map<Integer, T> daoMapToDtoMap(Map<Integer, A> ruleDAOMap, @Context CycleAvoidingMappingContext context);


    @Named("daoMapToDtoMap")
    default Map<String, T> daoStringKeyMapToDtoMap(Map<String, A> map){
        return daoStringKeyMapToDtoMap(map, new CycleAvoidingMappingContext());
    }

    Map<String, T> daoStringKeyMapToDtoMap(Map<String, A> ruleDAOMap, @Context CycleAvoidingMappingContext context);
}