package SistemasDeReservasDeSalasDeReuniao;

public class Sistema {
    public static void main(String[] args) {
        Sala sala = new Sala(10, 2.0);
        Reserva reserva = new Reserva(sala, "2021-10-01", "14:00", "16:00");
        System.out.println("Duração da reserva: " + reserva.calcularDuracao());
    }
}
