import java.util.Calendar;
import java.util.Date;
public class Main {
    public static void main(String[] args) {
        Date fechCompra = new Date(2021, Calendar.SEPTEMBER,11);
        AsistentePartido[] asistentes = new AsistentePartido[3];
        //Date fechCompra = new Date();
        //Boleta bolet = new Boleta(10,fechCompra,sill);
        //System.out.println(bolet.verificarBoleta());
        Silla sill1 = new Silla(0,50);
        Silla sill2= new Silla(0,150);
        Silla sill3= new Silla(0,300);
        asistentes[0] = new AsistentePartido(0,"Juan Manuel",18,sill1);
        asistentes[1] = new AsistentePartido(0,"Juan Manuel",18,sill2);
        asistentes[2] = new AsistentePartido(0,"Juan Manuel",18,sill3);
        Boleta b1 = new Boleta(0,asistentes,fechCompra,0);
        System.out.println(b1.boleteriaTotal());

    }
}
