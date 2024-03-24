package Prototype;

public class Sensor implements Cloneable {
    private String tipo;
    private Localizacao localizacao;
    private double precisao;

    public Sensor(String tipo, Localizacao localizacao, double precisao) {
        this.tipo = tipo;
        this.localizacao = localizacao;
        this.precisao = precisao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Localizacao getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(Localizacao localizacao) {
        this.localizacao = localizacao;
    }

    public double getPrecisao() {
        return precisao;
    }

    public void setPrecisao(double precisao) {
        this.precisao = precisao;
    }

    @Override
    public Sensor clone() throws CloneNotSupportedException {
        Sensor clone = (Sensor) super.clone();
        clone.localizacao = (Localizacao) this.localizacao.clone();
        return clone;
    }

    @Override
    public String toString() {
        return "Sensor{" +
                "tipo='" + tipo + '\'' +
                ", localizacao=" + localizacao +
                ", precisao=" + precisao +
                '}';
    }
}

