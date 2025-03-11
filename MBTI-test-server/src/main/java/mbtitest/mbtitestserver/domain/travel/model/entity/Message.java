package mbtitest.mbtitestserver.domain.travel.model.entity;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Message {

    private String role;
    private String content;

    public Message(String role, String content) {
        this.role = role;
        this.content = content;
    }
}
