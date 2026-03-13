public class Retangulo {
    private double altura;
    private double largura;

    public Retangulo(){
        System.out.println("Dentro do construtor");
    }
    public Retangulo(double pAltura, double pLargura){
        setAltura(pAltura);
        setLargura(pLargura);
    }

    public double getAltura(){
        return altura;
    }
    public void setAltura(double pAltura){
        if(pAltura < 0) return;
        this.altura = pAltura;
    }
    public double getLargura(){
        return largura;
    }
    public void setLargura(double pLargura){
        if(pLargura < 0) return;
        this.largura = pLargura;
    }

    public boolean isSquare(){
        return altura == largura;
    }
    public double getArea(){
        return altura * largura;
    }
    public double getPerimetro(){
        return (altura*2) + (largura*2);
    }
}
