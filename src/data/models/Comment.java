package data.models;

import java.time.LocalDateTime;

public class Comment {
    private int id;
    private String userId;
    private String content;
    private String postId;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public static void add(Comment comment) {

    }

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public String getUserId() {
        return userId;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public String getContent() {
        return content;
    }
    public void setPostId(String postId) {
        this.postId = postId;
    }
    public String getPostId() {
        return postId;
    }
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }
}
