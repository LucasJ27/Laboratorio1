import java.util.ArrayList;

public class EquipoDeFutbol {
    private ArrayList<String> listaJugadores;

    public EquipoDeFutbol() {
        this.listaJugadores = new ArrayList<>();
    }

    public void agregarJugador(String jugador) {
        listaJugadores.add(jugador);
    }

    public void eliminarJugador(String jugador) {
        listaJugadores.remove(jugador);
    }

    public ArrayList<String> listarPlantilla() {
        return listaJugadores;
    }
}
