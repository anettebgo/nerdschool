package nerdschool.bar;

public class Pub {


    public int orderDrink(Drink drink, boolean student, int amount) {

        checkLegalPurchase(drink, amount);
        int price = applyDiscount(drink, student);
        return price*amount;
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

