package shop;

public class Televisore extends Prodotto {
    private double dimensioni;
    private boolean smart;

    public Televisore(int codice, String nome, String marca, double prezzo, double iva, double dimensioni, boolean smart) {
        super(codice, nome, marca, prezzo, iva);
        this.dimensioni = dimensioni;
        this.smart = smart;
    }

    public double getDimensioni() {
        return dimensioni;
    }

    public void setDimensioni(double dimensioni) {
        this.dimensioni = dimensioni;
    }

    public boolean isSmart() {
        return smart;
    }

    public void setSmart(boolean smart) {
        this.smart = smart;
    }

    @Override
    public String toString() {
        return "Televisore{" +
                "codice=" + getCodice() +
                ", nome='" + getNome() + '\'' +
                ", marca='" + getMarca() + '\'' +
                ", prezzo=" + getPrezzo() +
                ", iva=" + getIva() +
                ", dimensioni=" + dimensioni +
                ", smart=" + smart +
                '}';
    }
}
