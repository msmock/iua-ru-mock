package org.fnm;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import io.quarkus.runtime.ShutdownEvent;
import io.quarkus.runtime.StartupEvent;
import io.quarkus.scheduler.Scheduled;
import io.quarkus.websockets.next.BasicWebSocketConnector;
import io.quarkus.websockets.next.WebSocketClientConnection;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.event.Observes;
import jakarta.inject.Inject;
import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.jboss.logging.Logger;

import java.util.UUID;

@ApplicationScoped
public class LifecycleBean {

    private static final Logger LOG = Logger.getLogger(LifecycleBean.class);

    /**
     *
     * @param ev the start event
     * @throws JsonProcessingException never happens
     */
    void onStart(@Observes StartupEvent ev) throws JsonProcessingException {
        LOG.info("The application is starting...");
    }

    /**
     * Close the connection to the simulation service
     * @param ev the stop event
     */
    void onStop(@Observes ShutdownEvent ev) {
        LOG.info("The application is stopping...");
    }

    /**
     * Register the simulation service periodically
     *
     * @throws JsonProcessingException never happens
     */
    @Scheduled(every = "10s")
    void run() throws JsonProcessingException {
        LOG.info("RU Mock is up and running ...");
    }

}
