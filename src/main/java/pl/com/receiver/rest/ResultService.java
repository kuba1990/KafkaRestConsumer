package pl.com.receiver.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.com.receiver.consumerFactory.ResultContainer;

import java.util.List;

@Service
public class ResultService {

    @Autowired
    private ResultContainer resultContainer;

    public List<String> getPayload(String payload){
        return resultContainer.getPayloadList();
    }

}
