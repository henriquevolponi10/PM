package SistemasDeReservasDeSalasDeReuniao;

public class Reserva {
    private Sala sala;
    private String data;
    private String horaInicio;
    private String horaFim;

    public Reserva(Sala sala, String data, String horaInicio, String horaFim) {
        this.sala = sala;
        this.data = data;
        this.horaInicio = horaInicio;
        this.horaFim = horaFim;
    }

    public Sala getSala() {
        return sala;
    }

    public String getData() {
        return data;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public String getHoraFim() {
        return horaFim;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public void setHoraFim(String horaFim) {
        this.horaFim = horaFim;
    }

    public double calcularDuracao() {
        String[] inicio = horaInicio.split(":");
        String[] fim = horaFim.split(":");
        int horaInicio = Integer.parseInt(inicio[0]);
        int minutoInicio = Integer.parseInt(inicio[1]);
        int horaFim = Integer.parseInt(fim[0]);
        int minutoFim = Integer.parseInt(fim[1]);
        return horaFim - horaInicio + (minutoFim - minutoInicio) / 60.0;
    }

    public boolean conflita(Reserva outraReserva) {
        if (this.data.equals(outraReserva.getData())) {
            if (this.horaInicio.equals(outraReserva.getHoraInicio()) || this.horaFim.equals(outraReserva.getHoraFim())) {
                return true;
            }
            if (this.horaInicio.compareTo(outraReserva.getHoraInicio()) < 0) {
                return this.horaFim.compareTo(outraReserva.getHoraInicio()) > 0;
            }
            return this.horaInicio.compareTo(outraReserva.getHoraFim()) < 0;
        }
        return false;
    }

    public boolean excedeCapacidade() {
        return sala.getCapacidade() > 10;
    }
}
