package br.com.avf.hexagonal.usuario.exceptions;

import java.io.Serializable;

/**
 * @author angelo.vicente - angelovicentefilho@gmail.com
 * @since 2022-03-08, Tuesday
 */
public class UserCoreException extends  Exception implements Serializable {

    public UserCoreException() {
    }

    public UserCoreException(String message) {
        super(message);
    }

    public UserCoreException(String message, Throwable cause) {
        super(message, cause);
    }

    public UserCoreException(Throwable cause) {
        super(cause);
    }
}
