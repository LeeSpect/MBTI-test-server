package mbtitest.mbtitestserver.domain.travel.facade;

import mbtitest.mbtitestserver.domain.travel.model.dto.response.MbtiTravelReommendationResponse;

public interface TravelFacade {

	MbtiTravelReommendationResponse getMbtiTravelRecommendation(String mbtiId);
}
