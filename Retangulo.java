public class Retangulo implements FiguraGeometrica {
    private double  base;
    private double altura;
    private double largura;
    private double pesoEspecifico;
    private double kilo;
    private String material;
    private int id;

    public Retangulo(double base, double altura, double largura, double pesoEspecifico, double kilo, String material, int id) {
        this.base = base;
        this.altura = altura;
        this.largura = largura;
        this.pesoEspecifico = pesoEspecifico;
        this.kilo = kilo;
        this.material = material;
        this.id = id;
    }

    @Override
    public String toString() {
        return "RETANGULO: " +
                "\nBASE =" + base +
                "\nALTURA =" + altura +
                "\nLARGURA =" + largura +
                "\nPESO ESPECIFICO =" + pesoEspecifico +
                "\nKILO =" + kilo +
                "\nMATERIAL ='" + material + '\'' +
                "\nAREA = " + getArea() +
                "\nPERIMETRO = " + getPerimetro() +
                "\nVOLUME = " + getVolume() +
                "\nPESO = " + getPeso();
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
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

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int getID() {
        return this.id;
    }

    @Override
    public double  getArea() {
        return getBase() * getAltura();
    }

    @Override
    public double  getPerimetro() {
        return 2 * (getBase() * getAltura());
    }

    @Override
    public double getVolume() {
        return getBase() * getLargura()* getAltura();
    }

    @Override
    public double getPeso() {
        return getVolume() * getPesoEspecifico();
    }
}
