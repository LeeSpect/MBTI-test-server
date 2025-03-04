package mbtitest.mbtitestserver.domain.user.facade;

import lombok.RequiredArgsConstructor;
import mbtitest.mbtitestserver.domain.user.model.dto.response.UserCountResponse;
import mbtitest.mbtitestserver.domain.user.service.UserCountService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class UserFacadeImpl implements UserFacade {

    private final UserCountService userCountService;

    @Override
    public UserCountResponse getUserCount() {
        return userCountService.getUserCount();
    }
}
