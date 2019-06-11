/**
 * An abstract class for animals
 *
 * @author Simon Levy
 * @version %I%, %G%
 * @since JDK1.2
 */

public abstract class Animal {
    private String name;       // "Fred", "Tweety", "Fido", etc.
    private boolean asleep;    // not asleep = awake
    private double weight;     // weight in kilograms
    private String food;       // favorite food
    private String motion;     // how this animal moves

    /**
     * Creates an awake animal with a specific name, weight, favorite
     * food, and method of locomotion.
     *
     * @param name   the animal's name ("Fred", "Tweety", "Fido", etc.)
     * @param weight the animal's initial weight, in kilograms
     * @param food   the animal's favorite food
     * @param motion how the animal gets around
     */

    public Animal(String name, double weight, String food, String motion) {
        this.name = name;
        this.weight = weight;
        this.food = food;
        this.motion = motion;
        this.asleep = false;
    }

    /**
     * Makes the animal wake up.
     */

    public void wakeup() {
        this.asleep = false;
    }

    /**
     * Makes the animal go to sleep.
     */

    public void sleep() {
        this.asleep = true;
    }

    /**
     * Feeds the animal.  This causes its weight to increase by 5%.
     */

    public void feed() {
        this.weight += 0.05 * this.weight;
    }

    /**
     * Lets the animal poop.  This causes its weight to decrease by 5%.
     *
     * @return the animal's new weight, in kilos
     */

    public void poop() {
        this.weight -= 0.05 * this.weight;
    }

    /**
     * Gets the animal's name.
     *
     * @return the animal's name
     */

    public String getName() {
        return this.name;
    }

    /**
     * Gets the animal's weight.
     *
     * @return the animal's new weight, in kilos
     */

    public double getWeight() {
        return this.weight;
    }

    /**
     * Pokes the animal, causing it to make noise if it can.
     *
     * @return the noise made by the animal
     */

    public abstract String poke();

    /**
     * Returns a string representation of the animal.  This includes its
     * name, its current weight, what it likes to eat, and any noises it
     * can make.
     *
     * @return a string representation of the animal
     */

    public String toString() {
        return "Hi, my name is " + this.name + ".  I am a(n) " + this.getClass().getName() + ".  I weigh " +
                this.weight + " kilos, I like to eat\n" + this.food + ", and I get around by " + motion +
                ". I am currently " + (this.asleep ? "asleep" : "awake") + ". ";
    }
}
