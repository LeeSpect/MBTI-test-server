package mbtitest.mbtitestserver.domain.travel.facade;

import mbtitest.mbtitestserver.domain.travel.model.dto.request.TravelTestResultRequest;

public interface TravelFacade {

    void updateMbtiCount(TravelTestResultRequest request);
}
