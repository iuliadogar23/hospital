package lucrare.dizertatie.server.persistence.dao;

import lombok.Data;

import javax.persistence.*;

@Entity(name = "Tratament")
@Table(name="tratament")
@Data
public class TratamentDAO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private Long dataOra;

    @Column
    private String medicament;

    @Column
    private Integer nr;

    @Column
    private String cale;

    @Column
    private Long oraEfect;

    @Column
    private String medic;

    @Column
    private String observatii;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_pacient")
    private PacientDAO pacient;

}
