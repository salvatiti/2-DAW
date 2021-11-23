package com.albares.game.api;

import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicInteger;


public class Match {
    
    private final TreeMap<Integer, Gamer> gamers = new TreeMap();
    private Integer turn = 1;
    private Integer randomNumber;
    
    
    
    private final AtomicInteger idGamers = new AtomicInteger(0);
    


    public Match() {
    }
    
    
    public int addGamer(Gamer g){
        int id = idGamers.incrementAndGet();
        this.gamers.put(id, g);
        return id;
    }

    public Map<Integer, Gamer> getGamers() {
        return gamers;
    }

    public Integer getTurn() {
        return turn;
    }
    
    public void generateNewNum(){
        this.randomNumber = (int) (Math.random() * 3 + 1);
    }

    public Integer getRandomNumber() {
        return randomNumber;
    }
    
    
    
    public void nextTurn(){
        //SOLUCION 1
        //this.turn++;
        //if(turn > this.gamers.size()) turn = 1;
        
        //SOLUCION 2
        //this.turn = ((turn+1)%this.gamers.size())+1;
        
        //SOLUCION 3  <-- Esta solución permite borrar usuarios sin problema
        this.turn = this.gamers.higherKey(turn);
        if(this.turn==null) this.turn = this.gamers.firstKey();
    }
}
