import com.facebook.presto.spi.eventlistener.EventListener;
import com.facebook.presto.spi.eventlistener.EventListenerFactory;

import java.util.Map;

public class QueryFileLoggerEventListenerFactory implements EventListenerFactory {

    public String getName() {
        return "event-logger";
    }

    public EventListener create(Map<String, String> config) {
        return new QueryFileLoggerEventListener(config);
    }
}
