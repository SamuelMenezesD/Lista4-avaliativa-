package Exercicio2.Domain;

public class Ponto {

    private double X;

    private double Y;

    public double GetDistanciaDoisPontos(Ponto ponto){

        return Math.sqrt((Math.pow(this.X - ponto.getX(),2)) + (Math.pow(this.Y - ponto.getY(),2)));

    }

    public double getX() {
        return X;
    }

    public void setX(double x) {
        X = x;
    }

    public double getY() {
        return Y;
    }

    public void setY(double y) {
        Y = y;
    }

    public Ponto() {

        this.X = 0;
        this.Y = 0;

    }

    public Ponto(double x, double y) {
        X = x;
        Y = y;
    }

}
