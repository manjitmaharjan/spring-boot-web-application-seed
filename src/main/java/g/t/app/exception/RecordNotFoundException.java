package g.t.app.exception;

import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
@Data
public class RecordNotFoundException extends RuntimeException {

    public RecordNotFoundException(String description) {
        super(description);
    }

    public RecordNotFoundException(String requestedObjectName, String requestedByField, Object requestedByParam) {
        super(String.format("%s not found with %s = '%s'", requestedObjectName, requestedByField, requestedByParam));
    }
}
