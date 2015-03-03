package nerdschool.bar;

public class GinTonic extends Drink {
    @Override
    public int price() {
        return Gin.price() + TonicWater.price() + GreenStuff.price();
    }
}
