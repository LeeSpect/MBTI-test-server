package mbtitest.mbtitestserver.domain.user.model.dto.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Getter;

@Getter
public class UserCountResponse {

	@Schema(description = "유저 수")
	private final Long userCount;

	@Builder
	UserCountResponse(
		Long userCount
	) {
		this.userCount = userCount;
	}
}
