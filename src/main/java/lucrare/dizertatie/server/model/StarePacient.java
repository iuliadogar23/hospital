package lucrare.dizertatie.server.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lucrare.dizertatie.server.model.enums.FunctiiVitale;
import lucrare.dizertatie.server.model.enums.Stare;

import java.io.Serializable;

@Data
public class StarePacient implements Serializable {

    private Integer id;

    @JsonIgnore
    private FisaMedicala fisaMedicala;

    private Long dataOra;

    private Stare starePacient;

    private FunctiiVitale functiiVitale;

    private String frRes;

    private String av;

    private String puls;

    private String ta;

    private String sato2;

    private String temp;

    private String gli;

}
