public class Circunferencia {
    private double raio;
    public Circunferencia(double raio) {
        this.raio = raio;
    }

    public double area() {
        double area = Math.PI * Math.pow(this.raio, 2);
        return area;
    }

    public double circunferencia() {
        double circunferencia = 2 * Math.PI * this.raio;
        return circunferencia;
    }
}
