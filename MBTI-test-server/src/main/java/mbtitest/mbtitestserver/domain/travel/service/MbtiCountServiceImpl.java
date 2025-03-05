package mbtitest.mbtitestserver.domain.travel.service;

import lombok.RequiredArgsConstructor;
import mbtitest.mbtitestserver.domain.travel.model.dto.response.MbtiCountResponse;
import mbtitest.mbtitestserver.domain.travel.model.entity.MbtiCount;
import mbtitest.mbtitestserver.domain.travel.repository.MbtiCountRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class MbtiCountServiceImpl implements MbtiCountService {

    private final MbtiCountRepository mbtiCountRepository;

    @Override
    public MbtiCountResponse getMbtiCount(String mbti) {
        MbtiCount mbtiCount = mbtiCountRepository.findByMbti(mbti);
        return MbtiCountResponse.builder().mbti(mbtiCount.getMbti()).count(mbtiCount.getCount()).build();
    }

    @Override
    @Transactional
    public void increaseCount(String mbti) {
        MbtiCount mbtiCount = mbtiCountRepository.findByMbti(mbti);
        mbtiCount.increaseCount();
        mbtiCountRepository.save(mbtiCount);
    }
}
