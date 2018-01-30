package no.hiof.olawp.figurarv;

public class Sirkel extends Figur {
    private double radius;

    public Sirkel(double radius) {
        this.radius = radius;
    }

    @Override
    public double areal(){
        return Math.PI * (radius*radius);
    }

    @Override
    public double omkrets(){
        return Math.PI * (radius*2);
    }

    public double beregnDiamater(){
        return radius*2;
    }

}
