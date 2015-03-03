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

    private int calculatePrice(String drinkOrder) {
        Drink drink;
        if (drinkOrder.equals(ONE_BEER)) {
            drink = new Beer();
        }
        else if (drinkOrder.equals(ONE_CIDER)) {
           drink = new Cider();
        }
        else if (drinkOrder.equals(A_PROPER_CIDER)) {
            drink = new ProperCider();
        }
        else if (drinkOrder.equals(GT)) {
            drink = new GinTonic();
        }
        else if (drinkOrder.equals(BACARDI_SPECIAL)) {
            drink = new BacardiSpecial();
        }
        else {
            throw new RuntimeException("No such drink exists");
        }
        return drink.price();
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

