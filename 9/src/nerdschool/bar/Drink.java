package nerdschool.bar;

public abstract class Drink {

    private int price;
    private boolean highAlcoholContent;

    public abstract int price();

    public boolean isHighAlcoholContent() {
        return highAlcoholContent;
    }

    public void setHighAlcoholContent(boolean highAlcoholContent) {
        this.highAlcoholContent = highAlcoholContent;
    }
}
