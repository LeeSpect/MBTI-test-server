package mbtitest.mbtitestserver.domain.travel.service;

import mbtitest.mbtitestserver.domain.travel.model.dto.response.MbtiCountResponse;

public interface MbtiCountService {

    /**
     * MBTI 타입에 따른 MBTI 카운트 조회
     * @param mbti MBTI 타입
     * @return MBTI 카운트
     */
    MbtiCountResponse getMbtiCount(String mbti);

    /**
     * MBTI 카운트 증가
     * @param mbti MBTI 타입
     */
    void increaseCount(String mbti);
}
