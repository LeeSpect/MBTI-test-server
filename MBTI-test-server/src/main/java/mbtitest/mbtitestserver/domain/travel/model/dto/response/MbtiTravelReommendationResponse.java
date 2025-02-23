package mbtitest.mbtitestserver.domain.travel.model.dto.response;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Builder;
import lombok.Getter;

@Getter
public class MbtiTravelReommendationResponse {

	@JsonProperty("id")
	private final String mbtiId;

	@JsonProperty("subhead")
	private final String subHead;

	private final String city;

	private final String country;

	private final String nickname;

	@JsonProperty("img")
	private final String imgUrl;

	@JsonProperty("description")
	private final List<Map<String, String>> descriptionListResponse;

	@JsonProperty("duo")
	private final List<Map<String, String>> duoResponse;

	@JsonProperty("counter")
	private final List<Map<String, String>> counterResponse;

	// @Builder
	// MbtiTravelReommendationResponse(
	// 	String mbtiId,
	// 	String subHead,
	// 	String city,
	// 	String country,
	// 	String nickname,
	// 	String imgUrl,
	// 	List<Map<String, String>> descriptionListResponse,
	// 	List<Map<String, String>> duoListResponse,
	// 	List<Map<String, String>> counterListResponse
	// ) {
	// 	this.mbtiId = mbtiId;
	// 	this.subHead = subHead;
	// 	this.city = city;
	// 	this.country = country;
	// 	this.nickname = nickname;
	// 	this.imgUrl = imgUrl;
	// 	this.descriptionListResponse = descriptionListResponse;
	// 	this.duoListResponse = duoListResponse;
	// 	this.counterListResponse = counterListResponse;
	// }

	@Builder
	MbtiTravelReommendationResponse(
	) {
		this.mbtiId = "ENFP";
		this.subHead = "물 흐르듯 흘러가는 대로 여행하는 자유로운 영혼인 당신";
		this.city = "잠들지 않는 섬 이비자, ";
		this.country = "스페인";
		this.nickname = "스파크형";
		this.imgUrl = "https://i.pinimg.com/564x/e9/7a/73/e97a73cf39c6af24dbe8c96b89fc8251.jpg";
		this.descriptionListResponse = List.of(
			Map.of("des", "새로운 사람을 만나기 좋아해서 어디에서나 친구를 만들어요"),
			Map.of("des", "여행 중 사람을 만나는 것을 좋아하지만, 때론 혼자만의 시간이 필요한 때가 있어요"),
			Map.of("des", "멋 내고 꾸미는 것을 좋아해서 여행지에서도 언제나 패피에요!"),
			Map.of("des", "여행 중에 계획 없이 그때그때 일어나는 일을 즐겨요"),
			Map.of("des", "여행지에서 관심이 끌리지 않는 장소가 있으면 눈길도 주지 않는 편이에요"),
			Map.of("des", "가끔 고집스러운 면이 있지만, 그렇다고 심하게 고집을 부리지는 않아요!")
		);
		this.duoResponse = List.of(
			Map.of("img", "https://i.pinimg.com/564x/25/3b/d8/253bd8da8ee271e1b8b0c7e57f17b96a.jpg"),
			Map.of("subhead", "INFJ"),
			Map.of("des", "알프스의 나라 체르마트, 스위스")
		);
		this.counterResponse = List.of(
			Map.of("img", "https://i.pinimg.com/564x/a3/38/d9/a338d9ee09c35a904f5e03f2452ae028.jpg"),
			Map.of("subhead", "ISTJ"),
			Map.of("des", "낭만의 도시 프라하, 체코")
		);
	}

}
