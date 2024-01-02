package exercise.domain;

public class Order {

    private String adId;
    private String userId;
    private String title;

    public Order(String adId, String userId, String title) {
        this.adId = adId;
        this.userId = userId;
        this.title = title;
    }

    public String getAdId() {
        return adId;
    }

    public void setAdId(String adId) {
        this.adId = adId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
