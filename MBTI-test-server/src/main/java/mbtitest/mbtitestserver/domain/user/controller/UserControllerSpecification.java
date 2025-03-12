package mbtitest.mbtitestserver.domain.user.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;

@Tag(name = "User", description = "유저 API")
public interface UserControllerSpecification {

    @Operation(summary = "유저 수 조회", description = "테스트를 진행한 전체 유저 수를 조회합니다.")
    ResponseEntity<?> getUserCount();
}
