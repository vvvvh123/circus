package circus;

public class Cannon extends Equipment {
    //hello
    //byebyebye

    public Cannon(int purchasePrice) {
        super(purchasePrice);
    }

    @Override
    public int getValue() {
        return purchasePrice / 3;
    }
}
