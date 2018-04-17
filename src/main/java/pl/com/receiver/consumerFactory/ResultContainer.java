package pl.com.receiver.consumerFactory;

import java.util.ArrayList;
import java.util.List;

public class ResultContainer {

    private List<String> payloadList = new ArrayList<>();

    public void add(String payload) {
        payloadList.add(payload);
    }
    public List<String> getPayloadList() {
        return payloadList;
    }
}
