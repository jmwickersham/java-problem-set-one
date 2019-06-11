// test for CS112 PS1, animals project

/*
Robins make noise, Ostriches don't
Most birds fly.  Need 2 constructors, 1 for flying, 1 without
All mammals make noise.
Dogs travel on four legs, humans on two.
 */

public class Test {
    public static void main(String[] args) {
        Robin r = new Robin("Robby");
        System.out.println(r);
        r.feed();
        System.out.println("Just fed " + r.getName() + ", now weighs " + r.getWeight() + " kilos.\n");

        Ostrich o = new Ostrich("Ozzie");
        System.out.println(o);
        o.poop();
        System.out.println(o.getName() + " just pooped, now weighs " + o.getWeight() + " kilos.\n");

        Dog d = new Dog("Fido");
        System.out.println(d);
        System.out.println("I just poked " + d.getName() + ", who went " + d.poke() + ".\n");

        Human h = new Human("Simon");
        h.sleep();
        System.out.println(h);
        System.out.println("I just poked " + h.getName() + ", who went " + h.poke() + ".");
    }
}
