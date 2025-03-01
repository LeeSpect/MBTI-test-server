# Stage 1: Build 단계 (Gradle을 이용해 애플리케이션 빌드)
FROM gradle:7.6-jdk17 AS build
WORKDIR /home/gradle/project
# 실제 프로젝트 소스는 하위 폴더에 있으므로, 해당 폴더의 모든 파일 복사
COPY MBTI-test-server/ .
# Spring Boot의 실행 가능한 jar 파일 생성 (테스트는 스킵)
RUN gradle bootJar --no-daemon -x test

# Stage 2: 실행 단계 (경량화된 JDK 이미지 사용)
FROM openjdk:17-jdk-slim
WORKDIR /app
# 빌드 단계에서 생성된 jar 파일 복사 (일반적으로 build/libs 폴더에 생성됨)
COPY --from=build /home/gradle/project/build/libs/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
