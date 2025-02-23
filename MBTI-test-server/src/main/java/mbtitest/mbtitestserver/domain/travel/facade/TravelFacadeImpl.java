package mbtitest.mbtitestserver.domain.travel.facade;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.RequiredArgsConstructor;
import mbtitest.mbtitestserver.domain.travel.model.dto.response.MbtiTravelReommendationResponse;
import mbtitest.mbtitestserver.domain.user.service.UserCountService;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class TravelFacadeImpl implements TravelFacade {

	private final UserCountService userCountService;

	@Override
	public MbtiTravelReommendationResponse getMbtiTravelRecommendation(String mbtiId) {
		MbtiTravelReommendationResponse response = MbtiTravelReommendationResponse.builder().build();
		userCountService.increaseUserCount();
		return response;
	}

}
