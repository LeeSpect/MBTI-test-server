package mbtitest.mbtitestserver.domain.travel.facade;

import lombok.RequiredArgsConstructor;
import mbtitest.mbtitestserver.domain.travel.model.dto.request.TravelTestResultRequest;
import mbtitest.mbtitestserver.domain.travel.model.dto.response.MbtiDuoRatioResponse;
import mbtitest.mbtitestserver.domain.travel.service.MbtiCountService;
import mbtitest.mbtitestserver.domain.travel.service.MbtiDuoService;
import mbtitest.mbtitestserver.domain.user.model.dto.response.UserCountResponse;
import mbtitest.mbtitestserver.domain.user.service.UserCountService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class TravelFacadeImpl implements TravelFacade {

    private final MbtiCountService mbtiCountService;
    private final MbtiDuoService mbtiDuoService;
    private final UserCountService userCountService;

    @Override
    @Transactional
    public void updateMbtiCount(TravelTestResultRequest request) {
        mbtiCountService.increaseCount(request.getMbtiId());
        userCountService.increaseUserCount();
    }

    @Override
    public MbtiDuoRatioResponse getMbtiDuoRatio(String mbti) {
        Long totalCount = userCountService.getUserCount().getUserCount();
        String duoMbti = mbtiDuoService.getMbtiDuo(mbti).getDuo();
        Long duoMbtiCount = mbtiCountService.getMbtiCount(duoMbti).getCount();
        return MbtiDuoRatioResponse.builder().duoMbti(duoMbti).duoRate((double) duoMbtiCount / totalCount).build();
    }

}
