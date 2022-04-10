package com.gustavoavila.coopvoteconsumer.controller;

import com.gustavoavila.coopvoteconsumer.domain.model.VoteLog;
import com.gustavoavila.coopvoteconsumer.domain.service.VoteLogService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class VoteLogController {

    private final VoteLogService voteLogService;

    public VoteLogController(VoteLogService voteLogService) {
        this.voteLogService = voteLogService;
    }

    @GetMapping("voting-log")
    public ResponseEntity<List<VoteLog>> getAll() {
        return ResponseEntity.ok(this.voteLogService.findAll());
    }
}