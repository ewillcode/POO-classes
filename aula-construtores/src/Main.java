public class Main {
    public static void main(String[] args) {

        Retangulo retangulo1 = new Retangulo();

        retangulo1.setAltura(100.20);;
        retangulo1.setLargura(100.20);

        System.out.println("Largura: "+ retangulo1.getLargura());
        System.out.println("Altura: "+ retangulo1.getAltura());
        System.out.println(retangulo1.isSquare());
        }
    }