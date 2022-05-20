package lucrare.dizertatie.server.model;

import lombok.Data;
import lucrare.dizertatie.server.model.enums.RegiuneAnatomica;

import java.io.Serializable;

@Data
public class Leziune implements Serializable {

    private Integer id;

    private RegiuneAnatomica regiuneAnatomica;

    private String leziune;

    private Integer valoare;

}
