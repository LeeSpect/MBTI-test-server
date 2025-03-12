package mbtitest.mbtitestserver.domain.user.facade;

import mbtitest.mbtitestserver.domain.user.model.dto.response.UserCountResponse;

public interface UserFacade {

    /**
     * 사용자 수 조회
     * @return 사용자 수 Response Dto
     */
    UserCountResponse getUserCount();
}
