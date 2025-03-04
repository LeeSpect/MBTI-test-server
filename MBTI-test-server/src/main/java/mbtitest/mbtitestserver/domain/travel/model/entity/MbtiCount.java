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
@Table(name = "mbti_count")
@NoArgsConstructor(access = PROTECTED)
@AllArgsConstructor(access = PROTECTED)
public class MbtiCount {

    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "mbti", nullable = false)
    private String mbti;

    @Column(name = "member_count", nullable = false)
    private Long count;

    public void increaseCount() {
        this.count++;
    }
}
