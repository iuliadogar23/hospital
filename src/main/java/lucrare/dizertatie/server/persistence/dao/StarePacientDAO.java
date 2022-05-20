package lucrare.dizertatie.server.persistence.dao;

import lombok.Data;
import lucrare.dizertatie.server.model.enums.FunctiiVitale;
import lucrare.dizertatie.server.model.enums.Stare;

import javax.persistence.*;

@Entity(name = "StarePacient")
@Table(name="stare_pacient")
@Data
public class StarePacientDAO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "nr_fisa")
    private FisaMedicalaDAO fisaMedicala;

    @Column
    private Long dataOra;

    @Enumerated
    private Stare starePacient;

    @Enumerated
    private FunctiiVitale functiiVitale;

    @Column
    private String frRes;

    @Column
    private String av;

    @Column
    private String puls;

    @Column
    private String ta;

    @Column
    private String sato2;

    @Column
    private String temp;

    @Column
    private String gli;

}
