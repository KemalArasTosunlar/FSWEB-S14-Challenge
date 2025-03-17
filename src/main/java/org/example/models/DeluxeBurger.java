package org.example.models;

public class DeluxeBurger extends Hamburger {
    private String cips;
    private String drink;

    public DeluxeBurger() {
        super("Deluxe Burger", "Double", 19.10, "Double Sandwich");
        this.cips = "CURVY";
        this.drink = "COKE";
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("\nDeluxe Burger için yeni malzeme eklenemez");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("\nDeluxe Burger için yeni malzeme eklenemez");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("\nDeluxe Burger için yeni malzeme eklenemez");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("\nDeluxe Burger için yeni malzeme eklenemez");
    }

    @Override
    public double itemizeHamburger() {
        System.out.println("Name: " + getName());
        System.out.println("Meat: " + getMeat());
        System.out.println("BreadRollType: " + getBreadRollType());
        return getPrice();
    }

    public String getCips() {
        return cips;
    }

    public String getDrink() {
        return drink;
    }
}
