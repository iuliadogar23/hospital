package lucrare.dizertatie.server.persistence.dao;

import lombok.Data;
import lucrare.dizertatie.server.model.enums.Glagow;

import javax.persistence.*;

@Entity(name = "ScorGlagow")
@Table(name="scor_glagow")
@Data
public class ScorGlagowDAO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "nr_fisa")
    private FisaMedicalaDAO fisaMedicala;

    @Enumerated(EnumType.STRING)
    private Glagow deschidereaOchilor;

    @Enumerated(EnumType.STRING)
    private Glagow raspunsMotor;

    @Enumerated(EnumType.STRING)
    private Glagow raspunsVerbal;

    @Column
    private Integer total;

}
