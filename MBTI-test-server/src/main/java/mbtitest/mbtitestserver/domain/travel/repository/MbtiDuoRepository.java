package mbtitest.mbtitestserver.domain.travel.repository;

import mbtitest.mbtitestserver.domain.travel.model.entity.MbtiDuo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MbtiDuoRepository extends JpaRepository<MbtiDuo, Long> {

    /**
     * MBTI 타입에 따른 MBTI 듀오 조회
     * @param mbti MBTI 타입
     * @return MBTI 듀오
     */
    MbtiDuo findByMbti(String mbti);
}
