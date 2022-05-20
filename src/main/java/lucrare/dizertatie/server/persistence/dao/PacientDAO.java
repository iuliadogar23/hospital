package lucrare.dizertatie.server.persistence.dao;

import lombok.Data;
import lucrare.dizertatie.server.model.enums.GrupaSanguina;
import lucrare.dizertatie.server.model.enums.Sex;

import javax.persistence.*;
import java.util.List;

@Entity(name = "Pacient")
@Table(name="pacient")
@Data
public class PacientDAO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private Long ultimaSchimbare;

    @Column
    private String nume;

    @Column
    private String prenume;

    @Column
    private String varsta;

    @Column
    private Long dataNastere;

    @Column
    private String cnp;

    @Enumerated(value = EnumType.STRING)
    private Sex sex;

    @Enumerated
    private GrupaSanguina sange;

    @Column
    private String alergic;

    @Column
    private String judet;

    @Column
    private String localitate;

    @Column
    private String strada;

    @Column
    private String nrBlScEtAp;

    @Column
    private String telefon;

}
