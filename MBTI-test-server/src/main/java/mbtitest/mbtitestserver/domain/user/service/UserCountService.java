package mbtitest.mbtitestserver.domain.user.service;

import mbtitest.mbtitestserver.domain.user.model.dto.response.UserCountResponse;

public interface UserCountService {

	UserCountResponse getUserCount();

	UserCountResponse increaseUserCount();
}
