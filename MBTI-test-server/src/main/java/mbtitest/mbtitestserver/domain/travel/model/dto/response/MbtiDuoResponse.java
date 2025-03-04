package mbtitest.mbtitestserver.domain.travel.model.dto.response;

import lombok.Builder;
import lombok.Getter;
import mbtitest.mbtitestserver.domain.travel.model.entity.MbtiDuo;

@Getter
@Builder
public class MbtiDuoResponse {

    private final String mbti;
    private final String duo;

    public MbtiDuoResponse(MbtiDuo mbtiDuo) {
        this.mbti = mbtiDuo.getMbti();
        this.duo = mbtiDuo.getDuo();
    }
}
