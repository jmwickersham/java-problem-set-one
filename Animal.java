public abstract class Animal {
    private String name;       // "Fred", "Tweety", "Fido", etc.
    private boolean asleep;    // not asleep = awake
    private double weight;     // weight in kilograms
    private String food;       // favorite food
    private String motion;     // how this animal moves

    public Animal(String name, double weight, String food, String motion) {
        this.name = name;
        this.weight = weight;
        this.food = food;
        this.motion = motion;
        this.asleep = false;
    }

    public void wakeup() {
        this.asleep = false;
    }

    public void sleep() {
        this.asleep = true;
    }


    public void feed() {
        this.weight += 0.05 * this.weight;
    }


    public void poop() {
        this.weight -= 0.05 * this.weight;
    }

    public String getName() {
        return this.name;
    }

    public double getWeight() {
        return this.weight;
    }

    /**
     * Pokes the animal, causing it to make noise if it can.
     *
     * @return the noise made by the animal
     */

    public abstract String poke();

    public String toString() {
        return "Hi, my name is " + this.name + ".  I am a(n) " + this.getClass().getName() + ".  I weigh " +
                this.weight + " kilos, I like to eat\n" + this.food + ", and I get around by " + motion +
                ". I am currently " + (this.asleep ? "asleep" : "awake") + ". ";
    }
}
