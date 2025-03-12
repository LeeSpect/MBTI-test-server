package mbtitest.mbtitestserver.domain.travel.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import mbtitest.mbtitestserver.domain.travel.model.dto.request.TravelTestResultRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@Tag(name = "Travel", description = "Travel과 관련된 API입니다")
public interface TravelControllerSpecification {

    @Operation(summary = "MBTI 결과 업데이트", description = "MBTI 테스트 결과에 따른 MBTI별 Count를 업데이트합니다.")
    void updateMbtiCount(@Valid @RequestBody TravelTestResultRequest request);

    @Operation(summary = "MBTI 타입에 따른 Duo 비율 조회", description = "요청한 MBTI와 잘 맞는 MBTI 사용자의 비율을 조회합니다.")
    ResponseEntity<?> getMbtiDuoRatio(@RequestParam(name = "myMbtiType") String mbti);

    @Operation(summary = "MBTI 타입에 따른 GPT 응답 조회", description = "요청한 MBTI와 도시, 국가에 따른 GPT 여행 추천 응답을 조회합니다.")
    ResponseEntity<?> getGPTResponse(@RequestParam(name = "mbti") String mbti,
                                     @RequestParam(name = "city") String city,
                                     @RequestParam(name = "country") String country);
}
