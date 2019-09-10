public class Card {
    public int value;
    public String color;

    public Card() {
    }

    public Card(int value, String color) {
        this.value = value;
        this.color = color;
    }

    @Override
    public String toString() {
        return String.format("[%d %s]", value, color);
    }
}
