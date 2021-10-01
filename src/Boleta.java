import java.util.Date;
public class Boleta {
    private int id_boleta;
    private AsistentePartido asistentes[];
    private Date fecha_compra;
    private int valor_cancelado;
    //Silla silla;



    public Boleta(int id_boleta, AsistentePartido[] asistentes, Date fecha_compra, int valor_cancelado) {
        this.id_boleta = id_boleta;
        this.asistentes = asistentes;
        this.fecha_compra = fecha_compra;
        this.valor_cancelado = valor_cancelado;
    }
    public Boleta() {
    }

    public String estadioDevuelta(int boletaTotal) {
        String mensaje= "";
        int vuelta = valor_cancelado - boletaTotal;
        int numeroSilla = asistentes[((asistentes.length)-1)].getSilla().getNumero();
        if (numeroSilla >= 0 & numeroSilla <= 100) {
            int bMayor = vuelta / 5000;
            int bMenor = (vuelta-(bMayor*5000))/ 1000;
            mensaje = "El cajero de taquilla debe devolverle al hincha "+bMayor+" billetes de 5000 y "+bMenor+" billetes de 1000";
        }
        if (numeroSilla >= 101 & numeroSilla <= 200) {
            int bMayor = vuelta / 10000;
            int bMenor = (vuelta-(bMayor*10000))/ 2000;
            mensaje = "El cajero de taquilla debe devolverle al hincha "+bMayor+" billetes de 10000 y "+bMenor+" billetes de 2000";
        }
        if (numeroSilla >= 201 & numeroSilla <= 300) {
            int bMayor = vuelta / 20000;
            int bMenor = (vuelta-(bMayor*20000))/ 5000;
            mensaje = "El cajero de taquilla debe devolverle al hincha "+bMayor+" billetes de 20000 y "+bMenor+" billetes de 5000";
        }
        return mensaje;
    }


    public double boleteriaTotal(){
        double retorno=0;
        for (AsistentePartido asis : asistentes) {
            double temp = 0;
            temp = ((asis.getSilla().getNumero() >= 0) & (asis.getSilla().getNumero() <= 100)) ? 120000 :
                    (temp = ((asis.getSilla().getNumero() >= 101) & (asis.getSilla().getNumero() <= 200)) ? 150000 :
                        (temp = ((asis.getSilla().getNumero() >= 201) & (asis.getSilla().getNumero() <= 300)) ? 200000:0));
            retorno = retorno+temp;
        }
        return retorno;
    }




    public int getValor_cancelado() {
        return valor_cancelado;
    }

    public void setValor_cancelado(int valor_cancelado) {
        this.valor_cancelado = valor_cancelado;
    }


    public int getId_boleta() {
        return id_boleta;
    }

    public void setId_boleta(int id_boleta) {
        this.id_boleta = id_boleta;
    }

    public AsistentePartido[] getAsistentes() {
        return asistentes;
    }

    public void setAsistentes(AsistentePartido[] asistentes) {
        this.asistentes = asistentes;
    }

    public Date getFecha_compra() {
        return fecha_compra;
    }

    public void setFecha_compra(Date fecha_compra) {
        this.fecha_compra = fecha_compra;
    }
}
