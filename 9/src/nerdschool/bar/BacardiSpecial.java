package nerdschool.bar;

import nerdschool.bar.ingredients.Gin;
import nerdschool.bar.ingredients.Grenadine;
import nerdschool.bar.ingredients.LimeJuice;
import nerdschool.bar.ingredients.Rum;

public class BacardiSpecial extends Drink{

    public BacardiSpecial() {
        setHighAlcoholContent(true);
    }

    @Override
    public int price() {
        return Gin.price()/2 + Rum.price() + Grenadine.price() + LimeJuice.price();
    }
}
