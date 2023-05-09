package shop;

public class Prodotto {
    private final int codice;
    private String nome;
    private String marca;
    private double prezzo;
    private double iva;

    public Prodotto(int codice, String nome, String marca, double prezzo, double iva) {
        this.codice = codice;
        setNome(nome);
        setMarca(marca);
        setPrezzo(prezzo);
        setIva(iva);
//        this.nome = nome;
//        this.marca = marca;
//        this.prezzo = prezzo;
//        this.iva = iva;
    }

    public int getCodice() {
        return codice;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public double getPrezzoBase() {
        return prezzo;
    }

    public String getPrezzoConIva() {
        double prezzoConIva = prezzo + (prezzo * iva / 100);
        return String.format("%.2f", prezzoConIva);
    }

    @Override
    public String toString() {
        return "Prodotto{" +
                "codice=" + codice +
                ", nome='" + nome + '\'' +
                ", marca='" + marca + '\'' +
                ", prezzo=" + prezzo +
                ", iva=" + iva +
                '}' + ", prezzo base=" + getPrezzoBase() +
                ", prezzo con iva=" + getPrezzoConIva() +
                '}';
    }
}
