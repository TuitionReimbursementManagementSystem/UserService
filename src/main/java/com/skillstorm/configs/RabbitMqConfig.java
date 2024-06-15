package com.skillstorm.configs;

import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMqConfig {

    // Create the exchange:
    @Bean
    public Exchange directExchange() {
        return new DirectExchange("direct-exchange");
    }

    // Create the queues:
    @Bean
    public Queue supervisorLookupQueue() {
        return new Queue("supervisor-lookup-queue");
    }

    @Bean
    public Queue departmentHeadLookupQueue() {
        return new Queue("department-head-lookup-queue");
    }

    // Bind the queues to the exchange:
    @Bean
    public Binding supervisorLookupBinding(Queue supervisorLookupQueue, Exchange directExchange) {
        return BindingBuilder.bind(supervisorLookupQueue)
                .to(directExchange)
                .with("supervisor-lookup")
                .noargs();
    }

    @Bean
    public Binding departmentHeadLookupBinding(Queue departmentHeadLookupQueue, Exchange directExchange) {
        return BindingBuilder.bind(departmentHeadLookupQueue)
                .to(directExchange)
                .with("department-head-lookup")
                .noargs();
    }
}

