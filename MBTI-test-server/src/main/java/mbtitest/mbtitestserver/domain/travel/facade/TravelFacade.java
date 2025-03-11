package mbtitest.mbtitestserver.domain.travel.facade;

import mbtitest.mbtitestserver.domain.travel.model.dto.request.TravelTestResultRequest;
import mbtitest.mbtitestserver.domain.travel.model.dto.response.GPTResponse;
import mbtitest.mbtitestserver.domain.travel.model.dto.response.MbtiDuoRatioResponse;

public interface TravelFacade {

    void updateMbtiCount(TravelTestResultRequest request);

    MbtiDuoRatioResponse getMbtiDuoRatio(String mbti);

    GPTResponse getGPTResponse(String mbti, String city, String country);
}
