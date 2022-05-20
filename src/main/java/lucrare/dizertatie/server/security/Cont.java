package lucrare.dizertatie.server.security;

import lombok.Data;

import javax.persistence.Transient;
import java.io.Serializable;

@Data
public class Cont implements Serializable {

    private Integer id;

    private String username;

    private String password;

    private String email;

    private String rol;

    @Transient
    private String token;
}
