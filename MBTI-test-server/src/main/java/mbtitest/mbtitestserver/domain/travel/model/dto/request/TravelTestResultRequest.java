package mbtitest.mbtitestserver.domain.travel.model.dto.request;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;

@Getter
public class TravelTestResultRequest {

    @NotNull(message = "mbtiId는 null일 수 없습니다.")
    private String mbtiId;

}
