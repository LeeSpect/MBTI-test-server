package mbtitest.mbtitestserver.domain.travel.model.dto.request;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class PlanDetailRequest {

    private String mbti;

    private String city;

    private String country;
}
