package SistemasDeReservasDeSalasDeReuniao;

public class Sala {
    private int capacidade = 10;
    private double horasReservadas = 2.0;

    public Sala(int capacidade, double horasReservadas) {
        this.capacidade = capacidade;
        this.horasReservadas = horasReservadas;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public double getHorasReservadas() {
        return horasReservadas;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public void setHorasReservadas(double horasReservadas) {
        this.horasReservadas = horasReservadas;
    }
}
