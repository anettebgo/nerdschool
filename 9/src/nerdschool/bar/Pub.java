package nerdschool.bar;

public class Pub {


    public static final String ONE_BEER = "hansa";
    public static final String ONE_CIDER = "grans";
    public static final String A_PROPER_CIDER = "strongbow";
    public static final String GT = "gt";
    public static final String BACARDI_SPECIAL = "bacardi_special";

    public int orderDrink(String drink, boolean student, int amount) {

        Drink myDrink = getDrink(drink);
        checkLegalPurchase(myDrink, amount);
        int price = applyDiscount(myDrink, student);
        return price*amount;
    }

    private Drink getDrink(String drinkOrder) {
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
        return drink;
    }

    private void checkLegalPurchase(Drink drink, int amount) {
        if (amount > 2 && (drink instanceof GinTonic || drink instanceof BacardiSpecial)) {
            throw new RuntimeException("Too many drinks, max 2.");
        }
    }

    private int applyDiscount(Drink drink, boolean student) {
        int price = drink.price();
        if (student && (drink instanceof Cider || drink instanceof Beer || drink instanceof ProperCider)) {
            price = drink.price() - drink.price()/10;
        }
        return price;
    }
}

