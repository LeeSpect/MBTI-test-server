package mbtitest.mbtitestserver.domain.travel.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import static lombok.AccessLevel.PROTECTED;

@Entity
@Getter
@Builder
@Table(name = "mbti_duo")
@NoArgsConstructor(access = PROTECTED)
@AllArgsConstructor(access = PROTECTED)
public class MbtiDuo {

    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "mbti", nullable = false)
    private String mbti;

    @Column(name = "duo", nullable = false)
    private String duo;

}
