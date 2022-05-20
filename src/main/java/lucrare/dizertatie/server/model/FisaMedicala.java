package lucrare.dizertatie.server.model;

import lombok.Data;
import lucrare.dizertatie.server.model.enums.*;

import java.io.Serializable;
import java.util.List;

@Data
public class FisaMedicala implements Serializable {

    private Integer nrFisa;

    private Pacient pacient;

    private PrimirePacient primirePacient;

    private String motivulPrezentarii;

    private List<StarePacient> starePacient;

    private ScorNaca scorNaca;

    private List<IstoricPatologic> antecedentePatologice;

    private String anamneza;

    private String observatiiAnamneza;

    private String tratamentDomiciliu;

    private String greutate;

    private String talie;

    private List<Triaj> triaj;

    private String observatiiTriaj;

    private String detaliiTriaj;

    private String alteAfectiuni;

    private List<Procedura> proceduri;

    private String ekg;

    private String radiologie;

    private String ecografie;

    private String examenUrina;

    private List<Analize> analize;

    private String recomandare;

    private String codDG;

    private StarePacientEvaluare starePacientEvaluare;

    private Long oraEvaluare;

    private String decizie;

}
