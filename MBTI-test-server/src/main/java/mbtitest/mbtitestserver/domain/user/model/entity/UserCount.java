package mbtitest.mbtitestserver.domain.user.model.entity;

import static jakarta.persistence.GenerationType.*;
import static lombok.AccessLevel.*;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Builder
@Table(name = "user_count")
@NoArgsConstructor(access = PROTECTED)
@AllArgsConstructor(access = PROTECTED)
public class UserCount {

	@Id
	@Builder.Default
	@Column(name = "user_count_id", columnDefinition = "BIGINT(20)")
	private Long id = 1L;

	@Builder.Default
	@Column(name = "user_count", columnDefinition = "BIGINT(20) default 0")
	private Long userCount = 0L;

	public void increaseUserCount() {
		userCount++;
	}
}
