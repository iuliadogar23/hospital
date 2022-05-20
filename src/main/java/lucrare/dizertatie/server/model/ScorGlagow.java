package lucrare.dizertatie.server.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lucrare.dizertatie.server.model.enums.Glagow;
import lucrare.dizertatie.server.persistence.dao.FisaMedicalaDAO;

import java.io.Serializable;

@Data
public class ScorGlagow implements Serializable {

    private Integer id;

    @JsonIgnore
    private FisaMedicalaDAO fisaMedicala;

    private Glagow deschidereaOchilor;

    private Glagow raspunsMotor;

    private Glagow raspunsVerbal;

    private Integer total;

}
