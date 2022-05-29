package aula02;

public class Caneta {

    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    void status() {
        System.out.print("Uma caneta: " + this.cor + "\n");
        System.out.print("Modelo: " + this.modelo + "\n");
        System.out.print("Ponta: " + this.ponta + "\n");
        System.out.print("Carga: " + this.carga + "\n");
        System.out.print("Esta tampada? " + this.tampada + "\n");
    }

    void rabiscar() {
        if (tampada == true) {
            System.out.println("ERROR! Caneta tampada");
        } else {
            System.out.println("SUCESS");
        }
    }
    void tampar() {
        this.tampada = true;
    }

    void destampar() {

        this.tampada = false;
    }
}
