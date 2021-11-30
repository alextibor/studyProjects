package com.nelio.model;

public class Rent {

    private int id;
    private String name;
    private String email;
    private int room;

    public Rent(int id, String name, String email, int room) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.room = room;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }
}
