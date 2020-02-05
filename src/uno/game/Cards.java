package uno.game;
public class Cards {
  public enum Color{RED,YELLOW,GREEN,BLUE};
  private final Color color;
  public enum Ranks{ZERO,TWO,THREE,FOUR,FIVE,SIX,SEVEN,EIGHT,NINE,SKIP,REVERSE,DRAWTWO,DRAWFOUR,WILDCARD};
  private final Ranks ranks;
    public Cards(Color s,Ranks v){
        this.color=s;
        this.ranks=v;
    }

    public Color getColor() {
        return this.color;
    }
    public Ranks getRanks() {
        return this.ranks;
    }
  
}

