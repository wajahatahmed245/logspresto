
import com.facebook.presto.spi.eventlistener.EventListener;
import com.facebook.presto.spi.eventlistener.QueryCompletedEvent;
import org.apache.log4j.BasicConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;


public class QueryFileLoggerEventListener implements EventListener {
    static final Logger logger = LoggerFactory.getLogger(QueryFileLoggerEventListener.class);

    public QueryFileLoggerEventListener(Map<String, String> config) {
    }


    public void queryCompleted(QueryCompletedEvent queryCompletedEvent) {

        StringBuilder msg = new StringBuilder();
        msg.append("---------------Query Completed----------------------------");
        msg.append("\n");

        logger.info(msg.toString());

    }
}
