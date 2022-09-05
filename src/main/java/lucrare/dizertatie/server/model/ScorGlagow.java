package lucrare.dizertatie.server.model;

import lombok.Data;
import lucrare.dizertatie.server.model.enums.Glagow;

import java.io.Serializable;

@Data
public class ScorGlagow implements Serializable {

    private Integer id;

    private Glagow deschidereaOchilor;

    private Glagow raspunsMotor;

    private Glagow raspunsVerbal;

    private Integer total;

}
