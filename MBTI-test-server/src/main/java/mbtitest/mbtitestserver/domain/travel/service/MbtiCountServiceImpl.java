package mbtitest.mbtitestserver.domain.travel.service;

import lombok.RequiredArgsConstructor;
import mbtitest.mbtitestserver.domain.travel.model.entity.MbtiCount;
import mbtitest.mbtitestserver.domain.travel.repository.MbtiCountRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class MbtiCountServiceImpl implements MbtiCountService {

    MbtiCountRepository mbtiCountRepository;

    @Override
    @Transactional
    public void increaseCount(String mbti) {
        MbtiCount mbtiCount = mbtiCountRepository.findByMbti(mbti);
        mbtiCount.increaseCount();
    }
}
