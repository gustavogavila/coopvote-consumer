package com.gustavoavila.coopvoteconsumer.infra.consumer;

import com.gustavoavila.coopvoteconsumer.domain.service.VoteLogService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class VoteConsumer {

    private final VoteLogService voteLogService;

    public VoteConsumer(VoteLogService voteLogService) {
        this.voteLogService = voteLogService;
    }

    @RabbitListener(queues = "VOTE")
    private void consumer(String msg) {
        System.out.println(msg);
        System.out.println("---------------------");
        voteLogService.save(msg);
    }
}
