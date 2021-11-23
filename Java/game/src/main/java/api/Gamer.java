
package api;


public class Gamer {
    private String name;
    private int score = 0;

    public Gamer() {
    }
    
     public Gamer(String name, int score) {
        this.name = name;
        this.score = score;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int scorePlus(){
         return this.score = score+1;
    }
    
     public int scoreLess(){
         return this.score = score-1;
    }
     
   

    
}
