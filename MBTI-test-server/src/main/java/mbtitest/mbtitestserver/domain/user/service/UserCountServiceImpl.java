package mbtitest.mbtitestserver.domain.user.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.RequiredArgsConstructor;
import mbtitest.mbtitestserver.domain.user.model.dto.response.UserCountResponse;
import mbtitest.mbtitestserver.domain.user.model.entity.UserCount;
import mbtitest.mbtitestserver.domain.user.repository.UserCountRepository;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class UserCountServiceImpl implements UserCountService {

	private final UserCountRepository userCountRepository;

	@Override
	public UserCountResponse getUserCount() {
		UserCount userCount = userCountRepository.findById(1L).orElse(UserCount.builder().id(1L).build());
		return UserCountResponse.builder().userCount(userCount).build();
	}

	@Override
	@Transactional
	public UserCountResponse increaseUserCount() {
		UserCount userCount = userCountRepository.findById(1L).orElse(UserCount.builder().id(1L).build());
		userCount.increaseUserCount();
		userCountRepository.save(userCount);
		return UserCountResponse.builder().userCount(userCount).build();
	}
}
