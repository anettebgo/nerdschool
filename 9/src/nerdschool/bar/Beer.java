package nerdschool.bar;

public class Beer extends Drink
{
    public Beer() {
        setHighAlcoholContent(false);
    }

    @Override
    public int price() {
        return 74;
    }
}
