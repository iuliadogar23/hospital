package lucrare.dizertatie.server.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class Tratament implements Serializable {

    private Integer id;

    private Long dataOra;

    private String medicament;

    private Integer nr;

    private String cale;

    private Long oraEfect;

    private String medic;

    private String observatii;

    private Pacient pacient;
}
