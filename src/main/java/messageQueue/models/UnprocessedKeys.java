package messageQueue.models;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.sql.Timestamp;

/**
 * Created by shubhamagrawal on 27/06/17.
 */
public class UnprocessedKeys {

    @NotNull
    private long queueId;

    @NotNull
    private long keyId;

    @NotNull
    private boolean visibility;

    @NotNull
    private int size;

    @CreationTimestamp
    private Timestamp creationTimeStamp;

    @UpdateTimestamp
    private Timestamp updateTimeStamp;
}
