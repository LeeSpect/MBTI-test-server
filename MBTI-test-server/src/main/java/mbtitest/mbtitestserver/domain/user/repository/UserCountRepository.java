package mbtitest.mbtitestserver.domain.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import mbtitest.mbtitestserver.domain.user.model.entity.UserCount;

public interface UserCountRepository extends JpaRepository<UserCount, Long> {
}
