package net.intelie.integration.camel;

import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.ProducerTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service("camelRoutes")
public class CamelRoutes {

    private final ProducerTemplate template;

	@Autowired
	public CamelRoutes(ProducerTemplate template) {
		this.template = template;
	}

    /**
     * Test messages reception
     * @param exchange
     */
    public void process(Exchange exchange) {
        Message message = exchange.getIn();
        String data = message.getBody(String.class);

        System.out.println(data);
    }

    /**
     * Test message sending
     */
    public void send(String uri, Object obj) {
        template.sendBody(uri, obj);
    }

}
