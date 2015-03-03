package nerdschool.bar;

public class Pub {


    public static final String ONE_BEER = "hansa";
    public static final String ONE_CIDER = "grans";
    public static final String A_PROPER_CIDER = "strongbow";
    public static final String GT = "gt";
    public static final String BACARDI_SPECIAL = "bacardi_special";

    public int orderDrink(String drink, boolean student, int amount) {

        checkLegalPurchase(drink, amount);
        int price = calculatePrice(drink);
        price = applyDiscount(drink, student, price);
        return price*amount;
    }

    private int calculatePrice(String drink) {
        int price;
        if (drink.equals(ONE_BEER)) {
            price = 74;
        }
        else if (drink.equals(ONE_CIDER)) {
            price = 103;
        }
        else if (drink.equals(A_PROPER_CIDER)) price = 110;
        else if (drink.equals(GT)) {
            price = Gin.price() + TonicWater.price() + GreenStuff.price();
        }
        else if (drink.equals(BACARDI_SPECIAL)) {
            price = Gin.price()/2 + Rum.price() + Grenadine.price() + LimeJuice.price();
        }
        else {
            throw new RuntimeException("No such drink exists");
        }
        return price;
    }

    private void checkLegalPurchase(String drink, int amount) {
        if (amount > 2 && (drink == GT || drink == BACARDI_SPECIAL)) {
            throw new RuntimeException("Too many drinks, max 2.");
        }
    }

    private int applyDiscount(String drink, boolean student, int price) {
        if (student && (drink == ONE_CIDER || drink == ONE_BEER || drink == A_PROPER_CIDER)) {
            price = price - price/10;
        }
        return price;
    }

}

