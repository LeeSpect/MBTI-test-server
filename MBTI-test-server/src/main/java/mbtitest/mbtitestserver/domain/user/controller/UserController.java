package mbtitest.mbtitestserver.domain.user.controller;

import lombok.RequiredArgsConstructor;
import mbtitest.mbtitestserver.domain.user.facade.UserFacade;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {

    private final UserFacade userFacade;

    @GetMapping("/total-counts")
    public ResponseEntity<?> getUserCount() {
        return ResponseEntity.ok(userFacade.getUserCount());
    }
}
