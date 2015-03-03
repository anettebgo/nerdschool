package nerdschool.bar;

public class Cider extends Drink {

    public Cider() {
        setHighAlcoholContent(false);
    }

    @Override
    public int price() {
        return 103;
    }
}
