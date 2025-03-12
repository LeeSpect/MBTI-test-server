package mbtitest.mbtitestserver.domain.travel.service;

import mbtitest.mbtitestserver.domain.travel.model.dto.response.MbtiDuoResponse;

public interface MbtiDuoService {

    /**
     * MBTI 타입에 따른 MBTI Duo를 가져온다.
     * @param mbti MBTI 타입
     * @return MBTI 듀오
     */
    MbtiDuoResponse getMbtiDuo(String mbti);
}
