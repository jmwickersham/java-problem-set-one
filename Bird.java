public class Bird extends Animal implements Noisy {
    private String noise;

    public Bird(String name, double weight, String food, String motion) {
        super(name, weight, food, motion);
    }

    @Override
    public String poke() { return getNoise(); };

    public String getNoise() {
        return this.noise;
    }

    public void setNoise(String noise) {
        this.noise = noise;
    }
}