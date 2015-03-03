package nerdschool.bar;

public class GinTonic extends Drink {

    public GinTonic() {
        setHighAlcoholContent(true);
    }

    @Override
    public int price() {
        return Gin.price() + TonicWater.price() + GreenStuff.price();
    }
}
