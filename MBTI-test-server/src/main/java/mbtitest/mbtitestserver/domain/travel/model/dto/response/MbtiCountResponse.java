package mbtitest.mbtitestserver.domain.travel.model.dto.response;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class MbtiCountResponse {

    private final Long count;
    private final String mbti;
}
