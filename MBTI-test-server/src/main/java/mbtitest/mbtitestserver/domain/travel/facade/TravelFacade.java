package mbtitest.mbtitestserver.domain.travel.facade;

import mbtitest.mbtitestserver.domain.travel.model.dto.request.TravelTestResultRequest;
import mbtitest.mbtitestserver.domain.travel.model.dto.response.MbtiDuoRatioResponse;
import mbtitest.mbtitestserver.domain.travel.model.dto.response.MbtiDuoResponse;

public interface TravelFacade {

    void updateMbtiCount(TravelTestResultRequest request);

    MbtiDuoRatioResponse getMbtiDuoRatio(String mbti);
}
