package mbtitest.mbtitestserver.domain.travel.facade;

import mbtitest.mbtitestserver.domain.travel.model.dto.request.TravelTestResultRequest;
import mbtitest.mbtitestserver.domain.travel.service.MbtiCountService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.RequiredArgsConstructor;
import mbtitest.mbtitestserver.domain.travel.model.dto.response.MbtiTravelReommendationResponse;
import mbtitest.mbtitestserver.domain.user.service.UserCountService;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class TravelFacadeImpl implements TravelFacade {

	private final MbtiCountService mbtiCountService;
	private final UserCountService userCountService;

	@Override
	@Transactional
	public void updateMbtiCount(TravelTestResultRequest request) {
		mbtiCountService.increaseCount(request.getMbtiId());
		userCountService.increaseUserCount();
	}

}
