package mbtitest.mbtitestserver.domain.user.model.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Getter;
import mbtitest.mbtitestserver.domain.user.model.entity.UserCount;

@Getter
public class UserCountResponse {

	@Schema(description = "유저 수")
	@JsonProperty("totalCount")
	private final Long userCount;

	@Builder
	UserCountResponse(
		UserCount userCount
	) {
		this.userCount = userCount.getUserCount();
	}
}
