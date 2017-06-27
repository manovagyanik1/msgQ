package messageQueue.controllers;

import messageQueue.utils.Gen;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by shubhamagrawal on 27/06/17.
 */

@RequestMapping("/api/v1/queue")
public class QueueController {


    @RequestMapping(value = "/read", method = RequestMethod.GET)
    @ResponseBody
    public void readData(@RequestParam("queue_id") Long queueId,
                         @RequestParam("client_id") Long clientId,
                         @RequestParam("size") Long size,
                HttpServletRequest request,
                HttpServletResponse response) {
        // puts the data into the queue
        String requestId = Gen.getUUID();
        // to log data on request level
    }

    @RequestMapping("/deq")
    @ResponseBody
    public void deleteData() {
        // deletes the data into the queue
    }

    @RequestMapping("/isempty")
    @ResponseBody
    public void isEmpty() {
        // puts the data into the queue
    }

    @RequestMapping("/enq")
    @ResponseBody
    public void putData() {
        // puts the data into the queue
    }

    @RequestMapping("/create")
    @ResponseBody
    public void createQueue() {
        // puts the data into the queue
    }
}
