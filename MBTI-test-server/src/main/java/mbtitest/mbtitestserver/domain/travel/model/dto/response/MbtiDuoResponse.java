package mbtitest.mbtitestserver.domain.travel.model.dto.response;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class MbtiDuoResponse {

    private final String mbti;
    private final String duo;
}
