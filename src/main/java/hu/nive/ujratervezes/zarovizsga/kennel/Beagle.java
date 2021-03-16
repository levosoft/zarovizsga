package hu.nive.ujratervezes.zarovizsga.kennel;

public class Beagle extends Dog{

    public Beagle(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getHappiness() {
        return super.getHappiness();
    }

    @Override
    public void feed() {
        happiness = happiness + 2;
    }

    @Override
    public void play(int hours) {
        happiness =  happiness + (hours * 2);
    }
}
