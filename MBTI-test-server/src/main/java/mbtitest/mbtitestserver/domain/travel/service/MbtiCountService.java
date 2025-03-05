package mbtitest.mbtitestserver.domain.travel.service;

import mbtitest.mbtitestserver.domain.travel.model.dto.response.MbtiCountResponse;

public interface MbtiCountService {

    MbtiCountResponse getMbtiCount(String mbti);

    void increaseCount(String mbti);
}
