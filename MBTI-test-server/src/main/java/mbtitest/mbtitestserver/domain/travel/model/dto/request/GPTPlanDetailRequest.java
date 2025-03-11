package mbtitest.mbtitestserver.domain.travel.model.dto.request;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import mbtitest.mbtitestserver.domain.travel.model.entity.Message;

import java.util.List;

@Getter
@Setter
@Builder
public class GPTPlanDetailRequest {

    private final String model = "gpt-4o-mini";
    private List<Message> messages;

    public static GPTPlanDetailRequest from(PlanDetailRequest planDetailRequest) {
        StringBuilder promptBuilder = new StringBuilder();
        promptBuilder.append(planDetailRequest.getMbti())
                .append(" 성향의 여행자를 위한 ")
                .append(planDetailRequest.getCountry())
                .append("의 ")
                .append(planDetailRequest.getCity())
                .append(" 여행 가이드:\n\n")
                .append("1. ")
                .append(planDetailRequest.getMbti())
                .append(" 성격 유형에 맞춘 ")
                .append(planDetailRequest.getCity())
                .append("여행지에 대해서 간략히 알려주세요.\n")
                .append("2. 다음 정보를 포함해주세요:\n")
                .append("- 추천 관광지 2-3곳 (각 장소의 특징, ")
                .append(planDetailRequest.getMbti())
                .append(" 유형이 좋아할 만한 이유)\n")
                .append("- 숙소 주변 저녁 활동 추천\n")
                .append("3. ")
                .append(planDetailRequest.getCity())
                .append("의 숨겨진 명소나 ")
                .append(planDetailRequest.getMbti())
                .append(" 유형이 특히 좋아할 만한 장소도 알려주세요.\n")
                .append("4. 여행 시 ")
                .append(planDetailRequest.getMbti())
                .append(" 유형을 위한 팁이나 주의사항도 함께 제공해주세요.\n")
                .append("5. 정보의 출처도 함께 기입해주세요.");
        return GPTPlanDetailRequest.builder()
                .messages(List.of(Message.builder().role("user").content(promptBuilder.toString()).build()))
                .build();
    }




//    const prompt = `${mbti} 성향의 여행자를 위한 ${country}의 ${city} 여행 가이드:
//
//            1. ${mbti} 성격 유형에 맞춘 ${city}여행지에 대해서 간략히 알려주세요.
//            2. 다음 정보를 포함해주세요:
//            - 추천 관광지 2-3곳 (각 장소의 특징, ${mbti} 유형이 좋아할 만한 이유)
//            - 숙소 주변 저녁 활동 추천
//3. ${city}의 숨겨진 명소나 ${mbti} 유형이 특히 좋아할 만한 장소도 알려주세요.
//            4. 여행 시 ${mbti} 유형을 위한 팁이나 주의사항도 함께 제공해주세요.
//            5. 정보의 출처도 함께 기입해주세요.`
}
