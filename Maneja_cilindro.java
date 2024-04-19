package Paquete2;

public class Manejacilindro {

    public static void main(String[] args) {
        Cilindro cilindro = new Cilindro(5, 10);

        System.out.println("Radio del cilindro: " + cilindro.getRadio());
        System.out.println("Diámetro del cilindro: " + cilindro.getDiametro());

        cilindro.setRadio(7);
        cilindro.setDiametro(14);

        System.out.println("Nuevo radio del cilindro: " + cilindro.getRadio());
        System.out.println("Nuevo diámetro del cilindro: " + cilindro.getDiametro());
    }
}

