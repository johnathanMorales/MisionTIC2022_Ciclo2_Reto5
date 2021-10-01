public class Silla {
    private int id_silla;
    private int numero;

    public Silla(int id_silla, int numero) {
        this.id_silla = id_silla;
        this.numero = numero;
    }

    public Silla() {
    }

    public int getId_silla() {
        return id_silla;
    }

    public void setId_silla(int id_silla) {
        this.id_silla = id_silla;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
