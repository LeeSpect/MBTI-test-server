package mbtitest.mbtitestserver.domain.travel.repository;

import mbtitest.mbtitestserver.domain.travel.model.entity.MbtiCount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MbtiCountRepository extends JpaRepository<MbtiCount, Long> {

    /**
     * MBTI 타입에 따른 MBTI 카운트 조회
     * @param mbti MBTI 타입
     * @return MBTI 카운트
     */
    MbtiCount findByMbti(String mbti);
}
