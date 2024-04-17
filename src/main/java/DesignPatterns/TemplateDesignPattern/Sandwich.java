package DesignPatterns.TemplateDesignPattern;

public abstract class Sandwich {
    /**
     * This Method defines sequence of steps to make sandwich
     */
    public final void makeSandwich() {
        takeBread();
        addCheese();
        if (wantMeat()) {
            addMeat();
        }
        if (wantCondiments()) {
            addCondiments();
        }

        if(wantVeggies()) {
            addVeggies();
        }
        wrapSandwich();
    }

    public boolean wantVeggies() {
        return false;
    }

    public abstract void addVeggies();

    public boolean wantCondiments() {
        return false;
    }

    public abstract void addCondiments();

    public final void wrapSandwich() {
        System.out.println("wrapping sandwich");
    }

    public final void addCheese() {
        System.out.println("Adding cheese");
    }

    public final void takeBread() {
        System.out.println("Take 2 slices of bread");
    }

    public abstract void addMeat();

    public boolean wantMeat() {
        return false;
    }
}
