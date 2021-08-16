package io.jheo.acacia.url.controller;

public class UrlCreationRequest {

    private String url;
    private String group;
    private String userId;
    private String randomPattern;

    public UrlCreationRequest() {
    }

    public UrlCreationRequest(String url, String group, String userId, String randomPattern) {
        this.url = url;
        this.group = group;
        this.userId = userId;
        this.randomPattern = randomPattern;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getRandomPattern() {
        return randomPattern;
    }

    public void setRandomPattern(String randomPattern) {
        this.randomPattern = randomPattern;
    }

    @Override
    public String toString() {
        return "UrlCreationRequest{" +
                "url='" + url + '\'' +
                ", group='" + group + '\'' +
                ", userId='" + userId + '\'' +
                ", randomPattern='" + randomPattern + '\'' +
                '}';
    }
}
