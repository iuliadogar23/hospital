package lucrare.dizertatie.server.model;

import lombok.Data;
import lucrare.dizertatie.server.model.enums.AdusDe;
import lucrare.dizertatie.server.model.enums.AdusDeLa;

import java.io.Serializable;

@Data
public class PrimirePacient implements Serializable {

    private Integer id;

    private String preluatDe;

    private Long dataOra;

    private Long oraPrimConsult;

    private String motivulPrezentarii;

    private AdusDe adusDe;

    private AdusDeLa adusDeLa;

    private String nrFisaExterna;

}
