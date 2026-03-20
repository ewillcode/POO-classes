public class Main {
    public static void main(String[] args) {

        Elevador elevador1 = new Elevador(20);

        elevador1.setAndarAtual(20);

        elevador1.fecharPorta();
        elevador1.abrirPorta();
        elevador1.descer();
        elevador1.subir();
        elevador1.subir();
    }
}