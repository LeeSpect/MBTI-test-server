package mbtitest.mbtitestserver.domain.travel.service;

import mbtitest.mbtitestserver.domain.travel.model.dto.request.GPTPlanDetailRequest;
import mbtitest.mbtitestserver.domain.travel.model.dto.request.PlanDetailRequest;
import mbtitest.mbtitestserver.domain.travel.model.dto.response.GPTResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

import static org.springframework.http.HttpHeaders.CONTENT_TYPE;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@Component
public class GPTUtilImpl {

    @Value("${openai.api.key}")
    private String apiKey;

    private final WebClient webClient = WebClient.builder()
            .baseUrl("https://api.openai.com/v1/")
            .defaultHeader(CONTENT_TYPE, APPLICATION_JSON_VALUE)
            .build();

    public GPTResponse getGPTResponse(PlanDetailRequest planDetailRequest) {
        return webClient.post()
                .uri("chat/completions")
                .header("Authorization", "Bearer " + apiKey)
                .bodyValue(GPTPlanDetailRequest.from(planDetailRequest))
                .retrieve()
                .bodyToMono(GPTResponse.class)
                .block();
    }


}
