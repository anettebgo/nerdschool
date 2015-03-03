package nerdschool.bar;

import nerdschool.bar.ingredients.Gin;
import nerdschool.bar.ingredients.GreenStuff;
import nerdschool.bar.ingredients.TonicWater;

public class GinTonic extends Drink {

    public GinTonic() {
        setHighAlcoholContent(true);
    }

    @Override
    public int price() {
        return Gin.price() + TonicWater.price() + GreenStuff.price();
    }
}
