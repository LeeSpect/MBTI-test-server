package mbtitest.mbtitestserver.domain.user.service;

import mbtitest.mbtitestserver.domain.user.model.dto.response.UserCountResponse;

public interface UserCountService {

	/**
	 * 사용자 수 조회
	 * @return 사용자 수 Response Dto
	 */
	UserCountResponse getUserCount();

	/**
	 * 사용자 수 증가
	 * @return 사용자 수 Response Dto
	 */
	UserCountResponse increaseUserCount();
}
