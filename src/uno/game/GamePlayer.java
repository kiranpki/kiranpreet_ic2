package uno.game;
public class GamePlayer 
 {
    public static void main(String[] args){
        
        CardHand ch=new CardHand();
        ch.generate();//Delegation separation of concern
        for(Cards c :ch.deck){
            System.out.println(c.getRanks() + " of " + c.getColor());
        }
    }
}
