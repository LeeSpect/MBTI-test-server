package mbtitest.mbtitestserver.domain.travel.controller;

import lombok.RequiredArgsConstructor;
import mbtitest.mbtitestserver.domain.travel.facade.TravelFacade;
import mbtitest.mbtitestserver.domain.travel.model.dto.request.TravelTestResultRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/travel")
public class TravelController {

    private final TravelFacade travelFacade;

    @PostMapping("/result")
    public void updateMbtiCount(TravelTestResultRequest request) {
        travelFacade.updateMbtiCount(request);
    }
}
