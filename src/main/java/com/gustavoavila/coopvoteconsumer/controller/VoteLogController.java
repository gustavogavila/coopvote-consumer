package com.gustavoavila.coopvoteconsumer.controller;

import com.gustavoavila.coopvoteconsumer.domain.model.VoteLog;
import com.gustavoavila.coopvoteconsumer.domain.service.VoteLogService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Tag(name = "Vote Logs")
@RestController
public class VoteLogController {

    private final VoteLogService voteLogService;

    public VoteLogController(VoteLogService voteLogService) {
        this.voteLogService = voteLogService;
    }

    @Operation(summary = "Result of voting an agenda")
    @GetMapping("voting-logs")
    public ResponseEntity<List<VoteLog>> getAll() {
        return ResponseEntity.ok(this.voteLogService.findAll());
    }
}
