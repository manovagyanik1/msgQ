package messageQueue.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by shubhamagrawal on 27/06/17.
 */
@Entity
@Table(name="queue")
public class Queue {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    private long clientId;

    @NotNull
    @Size(min = 2, max = 80)
    private String name;

}