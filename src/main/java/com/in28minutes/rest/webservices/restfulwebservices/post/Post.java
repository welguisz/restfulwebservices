package com.in28minutes.rest.webservices.restfulwebservices.post;

public class Post {
    private Integer id;
    private Integer userId;
    private String comment;

    protected Post() {

    }

    public Post(Integer id, Integer userId, String comment) {
        super();
        this.id = id;
        this.userId = userId;
        this.comment = comment;
    }

    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", userId=" + userId +
                ", comment='" + comment + '\'' +
                '}';
    }
}
