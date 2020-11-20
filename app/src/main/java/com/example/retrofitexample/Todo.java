package com.example.retrofitexample;

public class Todo {

    private int userId;
    private int id;
    private String tittle;
    private Boolean completed;

    public Todo(int userId, int id, String tittle, Boolean completed) {
        this.userId = userId;
        this.id = id;
        this.tittle = tittle;
        this.completed = completed;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public Boolean getCompleted() {
        return completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "userId=" + userId +
                ", id=" + id +
                ", tittle='" + tittle + '\'' +
                ", completed=" + completed +
                '}';
    }
}
