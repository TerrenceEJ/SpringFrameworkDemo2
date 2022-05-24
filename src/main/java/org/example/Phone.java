package org.example;

public class Phone
{
    private String mob;

    public Phone Phone(){
        return new Phone();
    }

    public void setMob(String mob) {
        this.mob = mob;
    }

    public String getMob() {
        return mob;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "mob='" + mob + '\'' +
                '}';
    }
}
