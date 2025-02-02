package productor_alerts.productor_alertas.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {

    @Bean
    public Queue myQueue(){
        return new Queue("myQueue",true);
    }

    @Bean
    public Queue myQueueJSON(){
        return new Queue("myQueueJSON",true);
    }

}
