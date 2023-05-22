public class Quadrado implements FiguraGeometrica {
    private double  lado;
    private double pesoEspecifico;
    private double kilo;
    private String material;
    private int id;

    public Quadrado(double lado, double pesoEspecifico, double kilo, String material, int id) {
        this.lado = lado;
        this.pesoEspecifico = pesoEspecifico;
        this.kilo = kilo;
        this.material = material;
        this.id = id;
    }

    @Override
    public String toString() {
        return "QUADRADO: " +
                "\nLADO =" + lado +
                "\nPESO ESPECIFICO =" + pesoEspecifico +
                "\nKILO =" + kilo +
                "\nMATERIAL ='" + material + '\'' +
                "\nAREA = " + getArea() +
                "\nPERIMETRO = " + getPerimetro() +
                "\nVOLUME = " + getVolume() +
                "\nPESO = " + getPeso();
    }

    public void setId(int id) {
        this.id = id;
    }

    public double  getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getPesoEspecifico() {
        return pesoEspecifico;
    }

    public void setPesoEspecifico(double pesoEspecifico) {
        this.pesoEspecifico = pesoEspecifico;
    }

    public double getKilo() {
        return kilo;
    }

    public void setKilo(double kilo) {
        this.kilo = kilo;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public int getID() {
        return this.id;
    }

    @Override
    public double getArea() {

        return Math.pow(lado,2);
    }

    @Override
    public double  getPerimetro() {

        return lado * 4;
    }

    @Override
    public double getVolume() {

        return Math.pow(lado,3);
    }

    @Override
    public double getPeso() {
        return 0;
    }
}
