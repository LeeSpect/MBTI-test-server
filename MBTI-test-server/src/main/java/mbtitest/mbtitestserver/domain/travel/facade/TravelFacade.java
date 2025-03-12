package mbtitest.mbtitestserver.domain.travel.facade;

import mbtitest.mbtitestserver.domain.travel.model.dto.request.TravelTestResultRequest;
import mbtitest.mbtitestserver.domain.travel.model.dto.response.GPTResponse;
import mbtitest.mbtitestserver.domain.travel.model.dto.response.MbtiDuoRatioResponse;

public interface TravelFacade {

    /**
     * 여행 결과를 업데이트한다.
     * @param request 여행 결과
     */
    void updateMbtiCount(TravelTestResultRequest request);

    /**
     * MBTI 타입에 따른 MBTI Duo 비율을 가져온다.
     * @param mbti MBTI 타입
     * @return 나와 잘 맞는 MBTI 비율
     */
    MbtiDuoRatioResponse getMbtiDuoRatio(String mbti);

    /**
     * MBTI 타입에 따른 GPT 응답을 가져온다.
     * @param mbti MBTI 타입
     * @param city 도시
     * @param country 국가
     * @return GPT 응답
     */
    GPTResponse getGPTResponse(String mbti, String city, String country);
}
