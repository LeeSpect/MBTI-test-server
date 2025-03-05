package mbtitest.mbtitestserver.domain.travel.model.dto.response;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class MbtiDuoRatioResponse {

    private final String duoMbti;
    private final double duoRate;
}
