public class Circulo implements FiguraGeometrica{

    private double raio;
    private double comprimento;
    private double pesoEspecifico;
    private double kilo;
    private String material;
    private int id;


    public Circulo(double raio, double comprimento, double pesoEspecifico, double kilo, String material, int id) {
        this.raio = raio;
        this.comprimento = comprimento;
        this.pesoEspecifico = pesoEspecifico;
        this.kilo = kilo;
        this.material = material;
        this.id = id;
    }

    @Override
    public String toString() {
        return "CIRCULO: " +
                "\nRAIO =" + raio +
                "\nCOMPRIMENTO =" + comprimento +
                "\nPESO ESPECIFICO =" + pesoEspecifico +
                "\nKILO =" + kilo +
                "\nMATERIAL ='" + material + '\''+
                "\nAREA = " + getArea() +
                "\nPERIMETRO = " + getPerimetro() +
                "\nVOLUME = " + getVolume() +
                "\nPESO = " + getPeso();
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public double getPesoEspecifico() {
        return pesoEspecifico;
    }

    public void setPesoEspecifico(double pesoEspecifico) {
        this.pesoEspecifico = pesoEspecifico;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getKilo() {
        return kilo;
    }

    public void setKilo(double kilo) {
        this.kilo = kilo;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int getID() {
        return this.id;
    }

    @Override
    public double  getArea() {
        return Math.PI * Math.pow(raio,2);
    }

    @Override
    public double  getPerimetro() {
        return getRaio() * 2 * Math.PI;
    }

    @Override
    public double getVolume() {
        return getArea() * getComprimento();
    }

    @Override
    public double getPeso() {
        return getVolume() * getPesoEspecifico();
    }
}
