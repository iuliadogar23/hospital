package lucrare.dizertatie.server.persistence.dao;

import lombok.Data;
import lucrare.dizertatie.server.model.enums.*;

import javax.persistence.*;
import java.util.List;

@Entity(name = "FisaMedicala")
@Table(name="fisa_medicala")
@Data
public class FisaMedicalaDAO {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "nr_fisa")
    private Integer nrFisa;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "id_pacient")
    private PacientDAO pacient;

    @OneToOne(fetch=FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "id_primire_pacient")
    private PrimirePacientDAO primirePacient;

    @Column
    private String motivulPrezentarii;

    @OneToMany(mappedBy = "fisaMedicala")
    private List<StarePacientDAO> starePacient;

    @OneToMany(mappedBy = "fisaMedicala")
    private List<ScorGlagowDAO> scorGlagow;

    @Enumerated
    private ScorNaca scorNaca;

    @ElementCollection(targetClass = IstoricPatologic.class)
    @JoinTable(name = "antecedente_patologice", joinColumns = @JoinColumn(name = "nr_fisa"))
    @Enumerated(EnumType.STRING)
    @Column(name = "problema_patologica")
    private List<IstoricPatologic> antecedentePatologice;

    @Column
    private String anamneza;

    @Column
    private String observatiiAnamneza;

    @Column
    private String tratamentDomiciliu;

    @Column
    private String greutate;

    @Column
    private String talie;

    @ElementCollection(targetClass = Triaj.class)
    @JoinTable(name = "triaj", joinColumns = @JoinColumn(name = "nr_fisa"))
    @Enumerated(EnumType.STRING)
    private List<Triaj> triaj;

    @Column
    private String observatiiTriaj;

    @Column
    private String detaliiTriaj;

    @Column
    private String alteAfectiuni;

    @ElementCollection(targetClass = Procedura.class)
    @JoinTable(name = "procedura", joinColumns = @JoinColumn(name = "nr_fisa"))
    @Enumerated(EnumType.STRING)
    @Column(name = "procedura")
    private List<Procedura> proceduri;

    @Column
    private String ekg;

    @Column
    private String radiologie;

    @Column
    private String ecografie;

    @Column
    private String examenUrina;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "nr_fisa", referencedColumnName = "nr_fisa")
    private List<AnalizeDAO> analize;

    @Column
    private String recomandare;

    @Column(name = "cod_dg")
    private String codDG;

    @Enumerated
    private StarePacientEvaluare starePacientEvaluare;

    @Column
    private Long oraEvaluare;

    @Column
    private String decizie;

}
