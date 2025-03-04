CREATE TABLE IF NOT EXISTS mbti_duo (
    id INT AUTO_INCREMENT PRIMARY KEY,
    mbti VARCHAR(50) NOT NULL,
    duo VARCHAR(50) NOT NULL,
    UNIQUE KEY (mbti, duo)
);

-- MBTI별 인원수를 저장하는 테이블 생성
CREATE TABLE IF NOT EXISTS mbti_count (
    mbti VARCHAR(4) PRIMARY KEY,
    count INT NOT NULL DEFAULT 0
);
