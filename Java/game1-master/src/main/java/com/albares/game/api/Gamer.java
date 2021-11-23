
package com.albares.game.api;

public class Gamer {
    private String name;
    private Integer score = 0;

    public Gamer() {
    }
    
    public void increment() {
        this.score++;
    }

    public void decrement() {
        this.score--;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

}
