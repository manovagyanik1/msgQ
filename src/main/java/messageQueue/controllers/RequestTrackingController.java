package messageQueue.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by shubhamagrawal on 27/06/17.
 */

@RequestMapping("/request")
public class RequestTrackingController {
    @RequestMapping("/status")
    @ResponseBody
    public void getStatus(long requestId) {
        // puts the data into the queue
    }
}
