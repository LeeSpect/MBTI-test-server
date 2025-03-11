package mbtitest.mbtitestserver.domain.travel.model.dto.response;

import mbtitest.mbtitestserver.domain.travel.model.entity.Message;

import java.util.List;

public class GPTResponse {

    private List<Choice> choices;

    public List<Choice> getChoices() { return choices; }

    public void setChoices(List<Choice> choices) { this.choices = choices; }

    public static class Choice {
        private Message message;

        public Choice(Message message) { this.message = message; }

        public Message getMessage() { return message; }

        public void setMessage(Message message) { this.message = message; }
    }
}
