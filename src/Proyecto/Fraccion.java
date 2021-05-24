package Proyecto;

public class Fraccion {
    private int numerador;
    private int denominador;

    public Fraccion(int numerador, int denominador) {
        super();
        this.numerador = numerador;
        this.denominador = denominador;
    }
    public int getNumerador() {
        return numerador;
    }

    public int getDenominador() {
        return denominador;
    }


    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(numerador).append(" / ").append(denominador);
        return sb.toString();
    }

}

