package messageQueue.models;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by shubhamagrawal on 27/06/17.
 */
public class QueueKeys {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    @Size(min = 2, max = 256000)
    private String value;

    @NotNull
    private long queueId;

    @NotNull
    @Size(min = 2, max = 80)
    private String key;
}
