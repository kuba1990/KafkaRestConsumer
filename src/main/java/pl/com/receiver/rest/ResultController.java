package pl.com.receiver.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pl.com.receiver.consumerFactory.ResultContainer;

import java.util.List;

@RestController
public class ResultController {

    @Autowired
    ResultContainer container;

    @RequestMapping("/getPayload")
    public List<String> getPayload (@RequestParam(value="name", defaultValue="World") String name) {
        return container.getPayloadList();


    }

}

