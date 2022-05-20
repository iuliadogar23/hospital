package lucrare.dizertatie.server.model;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class InjurySeverityScore implements Serializable {

    private Integer id;

    private List<Leziune> leziuni;

    private Integer total;

}
