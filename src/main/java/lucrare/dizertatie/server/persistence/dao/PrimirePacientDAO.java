package lucrare.dizertatie.server.persistence.dao;

import lombok.Data;
import lucrare.dizertatie.server.model.enums.AdusDe;
import lucrare.dizertatie.server.model.enums.AdusDeLa;

import javax.persistence.*;

@Entity(name = "PrimirePacient")
@Table(name="primire_pacient")
@Data
public class PrimirePacientDAO {

    @Id
    @GeneratedValue
    private Integer id;

    @Column
    private String preluatDe;

    @Column
    private Long dataOra;

    @Column
    private Long oraPrimConsult;

    @Column
    private String motivulPrezentarii;

    @Enumerated
    private AdusDe adusDe;

    @Enumerated
    private AdusDeLa adusDeLa;

    @Column(name = "nr_fisa_ext")
    private String nrFisaExterna;

}
