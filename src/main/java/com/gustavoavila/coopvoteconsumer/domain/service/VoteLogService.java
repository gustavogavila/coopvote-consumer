package com.gustavoavila.coopvoteconsumer.domain.service;

import com.gustavoavila.coopvoteconsumer.domain.model.VoteLog;
import com.gustavoavila.coopvoteconsumer.domain.repository.VoteLogRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VoteLogService {
    private final VoteLogRepository voteLogRepository;

    public VoteLogService(VoteLogRepository voteLogRepository) {
        this.voteLogRepository = voteLogRepository;
    }

    public List<VoteLog> findAll() {
        return voteLogRepository.findAll();
    }

    public void save(String msg) {
        VoteLog voteLog = new VoteLog(msg);
        voteLogRepository.save(voteLog);
    }
}
