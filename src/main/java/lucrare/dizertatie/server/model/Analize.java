package lucrare.dizertatie.server.model;

import lombok.Data;
import lucrare.dizertatie.server.model.enums.DenumireMedicala;

import java.io.Serializable;

@Data
public class Analize implements Serializable {

    private Integer id;

    private Long ora;

    private DenumireMedicala denumire;

    private String valoare;

}
