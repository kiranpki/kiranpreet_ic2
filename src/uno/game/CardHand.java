package uno.game;

public class CardHand {

    public int numberofCards = 60;
    public Cards[] deck = new Cards[numberofCards];//array

    //generate 52 cards and stores in array
    public void generate() {
        int count = 0;
        for (Cards.Color s : Cards.Color.values())//read enum suit by using foreach loop
        {

            for (Cards.Ranks v : Cards.Ranks.values()) {
                //Mondaydesign c1=new Mondaydesign(s,v);
                deck[count] = new Cards(s, v);
                count++;
            }
        }
    }
}
