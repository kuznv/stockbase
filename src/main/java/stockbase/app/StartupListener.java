package stockbase.app;

import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class StartupListener {

    @EventListener
    public void onApplicationEvent(ContextRefreshedEvent event) {

    }
}