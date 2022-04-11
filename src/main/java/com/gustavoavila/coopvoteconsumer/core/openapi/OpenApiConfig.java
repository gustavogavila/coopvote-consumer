package com.gustavoavila.coopvoteconsumer.core.openapi;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.tags.Tag;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI coopVoteConsumerOpenAPI() {
        return new OpenAPI()
                .info(new Info().title("CoopVote Consumer API")
                        .description("API to consume voting results")
                        .version("v0.0.1"))
                .addTagsItem(new Tag().name("Vote Logs").description("Voting results logs"));
    }
}
