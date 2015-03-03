package nerdschool.bar;

public class ProperCider extends Drink {

    public ProperCider() {
        setHighAlcoholContent(false);
    }

    @Override
    public int price() {
        return 110;
    }
}
