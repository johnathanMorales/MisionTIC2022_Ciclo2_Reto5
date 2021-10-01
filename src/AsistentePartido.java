public class AsistentePartido {
    private int id_asistente;
    private String nombre_asistente;
    private int edad;
    private Silla silla;

    public AsistentePartido(int id_asistente, String nombre_asistente, int edad, Silla silla) {
        this.id_asistente = id_asistente;
        this.nombre_asistente = nombre_asistente;
        this.edad = edad;
        this.silla = silla;
    }

    public AsistentePartido() {
    }

    public int getId_asistente() {
        return id_asistente;
    }

    public void setId_asistente(int id_asistente) {
        this.id_asistente = id_asistente;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre_asistente() {
        return nombre_asistente;
    }

    public void setNombre_asistente(String nombre_asistente) {
        this.nombre_asistente = nombre_asistente;
    }

    public Silla getSilla() {
        return silla;
    }

    public void setSilla(Silla silla) {
        this.silla = silla;
    }
}
