package shop;

public class Smartphone extends Prodotto {
    private final int imei;
    private int memoria;

    public Smartphone(int codice, String nome, String marca, double prezzo, double iva, int imei, int memoria) {
        super(codice, nome, marca, prezzo, iva);
        this.imei = imei;
        this.memoria = memoria;
    }

    public int getImei() {
        return imei;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "codice=" + getCodice() +
                ", nome='" + getNome() + '\'' +
                ", marca='" + getMarca() + '\'' +
                ", prezzo=" + getPrezzo() +
                ", iva=" + getIva() +
                ", imei=" + imei +
                ", memoria=" + memoria +
                '}';
    }
}
