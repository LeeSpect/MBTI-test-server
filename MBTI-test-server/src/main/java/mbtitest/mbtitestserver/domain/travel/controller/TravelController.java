package mbtitest.mbtitestserver.domain.travel.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import mbtitest.mbtitestserver.domain.travel.facade.TravelFacade;
import mbtitest.mbtitestserver.domain.travel.model.dto.request.TravelTestResultRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/travels")
public class TravelController {

    private final TravelFacade travelFacade;

    @PostMapping("/results")
    public void updateMbtiCount(@Valid @RequestBody TravelTestResultRequest request) {
        travelFacade.updateMbtiCount(request);
    }

    // /travels/results?myMbtiType={myMbtiType}
    @GetMapping("/results")
    public ResponseEntity<?> getMbtiDuoRatio(@RequestParam(name = "myMbtiType") String mbti) {
        return ResponseEntity.ok(travelFacade.getMbtiDuoRatio(mbti));
    }

    @GetMapping("/gpt-responses")
    public ResponseEntity<?> getGPTResponse(@RequestParam(name = "mbti") String mbti,
                                            @RequestParam(name = "city") String city,
                                            @RequestParam(name = "country") String country) {
        return ResponseEntity.ok(travelFacade.getGPTResponse(mbti, city, country));
    }

}
