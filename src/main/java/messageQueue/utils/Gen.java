package messageQueue.utils;

import java.util.UUID;

/**
 * Created by shubhamagrawal on 28/06/17.
 */
public class Gen {
    public static String getUUID() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }
}
