package net.intelie.integration;

import net.intelie.integration.camel.CamelRoutes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class TestCamelRoutes {

    private static CamelRoutes camelRoutes;

    private String queueUri = "activemq:events";

    @Autowired
    public TestCamelRoutes(CamelRoutes camelRoutes) {
        this.camelRoutes = camelRoutes;

        while (true) {
            send();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {

            }
        }
    }

    public void send() {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("chave", "valor");

        camelRoutes.send(queueUri, map);
    }

}
