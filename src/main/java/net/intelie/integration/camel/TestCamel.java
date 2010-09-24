package net.intelie.integration.camel;

import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("testCamel")
public class TestCamel {

    public void process(Exchange exchange) {
        Message message = exchange.getIn();
        String data = message.getBody(String.class);

        System.out.println(data);
    }

}
