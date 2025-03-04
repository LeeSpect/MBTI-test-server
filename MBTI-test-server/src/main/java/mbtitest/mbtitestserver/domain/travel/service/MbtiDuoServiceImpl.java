package mbtitest.mbtitestserver.domain.travel.service;

import lombok.RequiredArgsConstructor;
import mbtitest.mbtitestserver.domain.travel.model.dto.response.MbtiDuoResponse;
import mbtitest.mbtitestserver.domain.travel.model.entity.MbtiDuo;
import mbtitest.mbtitestserver.domain.travel.repository.MbtiDuoRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class MbtiDuoServiceImpl implements MbtiDuoService {

    private final MbtiDuoRepository mbtiDuoRepository;

    @Override
    public MbtiDuoResponse getMbtiDuo(String mbti) {
        MbtiDuo mbtiDuo = mbtiDuoRepository.findByMbti(mbti);
        return MbtiDuoResponse.builder()
                .mbti(mbtiDuo.getMbti())
                .duo(mbtiDuo.getDuo())
                .build();
    }
}
