package nerdschool.bar;

public class BacardiSpecial extends Drink{

    public BacardiSpecial() {
        setHighAlcoholContent(true);
    }

    @Override
    public int price() {
        return Gin.price()/2 + Rum.price() + Grenadine.price() + LimeJuice.price();
    }
}
