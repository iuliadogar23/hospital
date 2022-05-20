package lucrare.dizertatie.server.persistence.dao;

import lombok.Data;
import lucrare.dizertatie.server.model.enums.RegiuneAnatomica;

import javax.persistence.*;

@Entity(name = "leziune")
@Table(name="leziune")
@Data
public class LeziuneDAO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Enumerated
    private RegiuneAnatomica regiuneAnatomica;

    @Column
    private String leziune;

    @Column
    private Integer valoare;

}
