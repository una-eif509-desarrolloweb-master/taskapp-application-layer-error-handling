/*
 *
 *
 * Universidad Nacional de Costa Rica  2020
 *
 * mike@guzmanalan.com
 *
 *
 */

package cr.una.taskapp.backend.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Priority Not Found")
public class PriorityNotFoundException extends Exception {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new exception with the specified detail message.  The
     * cause is not initialized, and may subsequently be initialized by
     * a call to {@link #initCause}.
     *
     * @param message the detail message. The detail message is saved for
     *                later retrieval by the {@link #getMessage()} method.
     */
    public PriorityNotFoundException(String message) {
        super(message);
    }
}
