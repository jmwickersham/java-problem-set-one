public class Mammal extends Animal implements Noisy {
  private String noise;

  public Mammal(String name, double weight, String food, String motion) {
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