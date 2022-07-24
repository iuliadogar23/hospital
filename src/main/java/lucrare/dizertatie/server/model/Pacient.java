package lucrare.dizertatie.server.model;

import lombok.Data;
import lucrare.dizertatie.server.model.enums.GrupaSanguina;
import lucrare.dizertatie.server.model.enums.Sex;

import java.io.Serializable;

@Data
public class Pacient implements Serializable {

    private Integer id;

    private Long ultimaSchimbare;

    private String nume;

    private String prenume;

    private String varsta;

    private Long dataNastere;

    private String cnp;

    private Sex sex;

    private GrupaSanguina sange;

    private String alergic;

    private String judet;

    private String localitate;

    private String strada;

    private String nrBlScEtAp;

    private String telefon;

}