package lucrare.dizertatie.server.persistence.dao;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity(name = "InjurySeverityScore")
@Table(name="injury_severity_score")
@Data
public class InjurySeverityScoreDAO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_iss", referencedColumnName = "id")
    private List<LeziuneDAO> leziuni;

    @Column
    private Integer total;

}
