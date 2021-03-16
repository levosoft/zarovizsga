package hu.nive.ujratervezes.zarovizsga.kennel;

public class Husky extends Dog{

    public Husky(String name) {
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
        happiness = happiness + 4;
    }

    @Override
    public void play(int hours) {
        happiness =  happiness + (hours * 3);
    }

}
