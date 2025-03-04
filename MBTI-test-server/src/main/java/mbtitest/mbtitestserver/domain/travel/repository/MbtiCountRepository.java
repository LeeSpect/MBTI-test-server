package mbtitest.mbtitestserver.domain.travel.repository;

import mbtitest.mbtitestserver.domain.travel.model.entity.MbtiCount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MbtiCountRepository extends JpaRepository<MbtiCount, Long> {
}
