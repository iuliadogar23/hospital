package lucrare.dizertatie.server.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lucrare.dizertatie.server.model.enums.GrupaSanguina;
import lucrare.dizertatie.server.model.enums.Sex;
import lucrare.dizertatie.server.persistence.dao.FisaMedicalaDAO;

import java.io.Serializable;
import java.util.List;

@Data
public class Pacient implements Serializable {

    private Integer id;

    private Long ultimaSchimbare;

    private String nume;

    private String prenume;

    private String varsta;

    private String dataNastere;

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