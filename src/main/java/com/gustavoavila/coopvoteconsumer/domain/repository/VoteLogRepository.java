package com.gustavoavila.coopvoteconsumer.domain.repository;

import com.gustavoavila.coopvoteconsumer.domain.model.VoteLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VoteLogRepository extends JpaRepository<VoteLog, Long> {
}
