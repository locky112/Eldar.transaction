package Negocio;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


//DECLARACION DE CLASE TARJETA
public class Tarjeta {


    //ATRIBUTOS DE CLASE TARJETA
    private Marca marca;
    private String ndetarjeta;
    private Persona per;
    private String fdevencimiento;

    private double monto;

    public Tarjeta() {

    }

    public Tarjeta(Marca marca, String ndetarjeta, Persona per, String fdevencimiento, double monto) {
        this.marca = marca;
        this.ndetarjeta = ndetarjeta;
        this.per = per;
        this.fdevencimiento = fdevencimiento;
        this.monto = monto;
    }

    public Tarjeta(String valido) {
    }


    public String nombreCompletoDeTitular() {
        return per.nombreCompleto();
    }

    @Override
    public String toString() {
        return "Tarjeta{" + "EntidadBancaria=" + marca + ", NroTarjeta=" + ndetarjeta + ", Saldo=" + monto + ", Vencimiento=" + fdevencimiento + ", titular=" + nombreCompletoDeTitular() + '}';
    }


    public  String Validar(String Valido) {
        Tarjeta validare = null;




        if (datosValidos()) {

            Valido = "Valida";
            validare = new Tarjeta(Valido);
        }
        return validare;
        }

    String fechaF2 = "2022/05";

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-dd");
    LocalDate fecha1 = LocalDate.parse(fdevencimiento, formatter);
    LocalDate fecha2 = LocalDate.parse(fechaF2, formatter);

    private boolean datosValidos (LocalDate fdevencimiento,double monto){
        boolean esMontoValido;
        boolean esTarjetaValida;
        {
            esTarjetaValida = fdevencimiento != null && fecha1.isAfter(fecha2);
            esMontoValido = monto > 0 && monto < 1000;

        }
        return esTarjetaValida && esMontoValido;
    }
    }

