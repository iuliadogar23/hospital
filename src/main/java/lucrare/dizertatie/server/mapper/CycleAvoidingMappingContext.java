package lucrare.dizertatie.server.mapper;

import org.mapstruct.BeforeMapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.TargetType;

import java.util.IdentityHashMap;
import java.util.Map;

public class CycleAvoidingMappingContext {
    private Map<Object, Object> knownInstances = new IdentityHashMap<>();

    @BeforeMapping
    public <T> T getMappedInstance(Object source, @TargetType Class<T> targetType) {
        Object obj = knownInstances.get( source );
        if (targetType.isInstance(obj)){
            return (T) obj;
        }
        return null;
    }

    @BeforeMapping
    public void storeMappedInstance(Object source, @MappingTarget Object target) {
        knownInstances.put( source, target );
    }
}
