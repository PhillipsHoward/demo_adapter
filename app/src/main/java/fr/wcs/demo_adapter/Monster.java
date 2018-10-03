package fr.wcs.demo_adapter;

public class Monster {

    private String name;
    private int life;
    private int power;
    private boolean adult;

    public Monster(String name, int life, int power, boolean adult) {
        this.name = name;
        this.life = life;
        this.power = power;
        this.adult = adult;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public boolean isAdult() {
        return adult;
    }

    public void setAdult(boolean adult) {
        this.adult = adult;
    }
}
