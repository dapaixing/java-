import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CardGame {
    public static void main(String[] args) {
        List<Card> deck = buyDeck();
        System.out.println("刚买回来的牌：");
        System.out.println(deck);
        shuffle(deck);
        System.out.println("洗过的牌:");
        System.out.println(deck);
        List<List<Card>> hands = new ArrayList<>();
        hands.add(new ArrayList<>());
        hands.add(new ArrayList<>());
        hands.add(new ArrayList<>());
        System.out.println("第一个人手里的牌：");
        System.out.println(hands.get(0));
        System.out.println("第一个人手里的牌：");
        System.out.println(hands.get(1));
        System.out.println("第一个人手里的牌：");
        System.out.println(hands.get(2));
        System.out.println("剩余的牌：");
        System.out.println(deck);
    }
    private static final String[] COLORS = {
            "♠","♥","♦","♣"
    };
    private static List<Card> buyDeck(){
        List<Card> deck = new ArrayList<>(52);
        for (int i = 0; i < 4; i++) {
            for (int i1 = 1; i1 < 14; i1++) {
                String color = COLORS[i];
                int value = i1;
                Card card = new Card();
                card.value = value;
                card.color = color;
                deck.add(card);
            }
        }
        return deck;
    }
    private static void shuffle(List<Card> deck){
        Random random = new Random(20190910);
        for (int i = deck.size();i > 0 ;i--) {
            int r = random.nextInt();
            swap(deck,i,r);
        }
    }

    private static void swap(List<Card> deck ,int i ,int j){
        Card t = deck.get(i);
        deck.set(i,deck.get(j));
        deck.set(j,t);
    }
    private static void send(List<List<Card>> hands, List<Card> deck,int numPerson,int numCard){
        for (int i = 0; i < numPerson; i++) {
            hands.add(new ArrayList<>());
        }

        for (int i = 0; i < numCard; i++) {
            for (int i1 = 0; i1 < numPerson; i1++) {
                Card card = deck.remove(0);
                hands.get(i1).add(card);
            }
        }
    }
}
