package lucrare.dizertatie.server.persistence.dao;

import lombok.Data;
import lucrare.dizertatie.server.model.enums.DenumireMedicala;

import javax.persistence.*;

@Entity(name = "Analize")
@Table(name="analize")
@Data
public class AnalizeDAO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private Long ora;

    @Enumerated(EnumType.STRING)
    private DenumireMedicala denumire;

    @Column
    private String valoare;

}
