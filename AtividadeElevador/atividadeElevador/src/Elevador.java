public class Elevador {
    int totalAndares;
    int andarAtual;
    boolean portaAberta;

    public Elevador(int totalAndares) {
        setTotalAndares(totalAndares);
        setAndarAtual(0);
        setPortaAberta(false);
    }

    public int getTotalAndares() {
        return totalAndares;
    }

    public void setTotalAndares(int totalAndares) {
        if (totalAndares < 0) return;
        this.totalAndares = totalAndares;
    }

    public int getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(int andarAtual) {
        if (andarAtual < 0) return;
        this.andarAtual = andarAtual;
    }

    public boolean isPortaAberta() {
        return portaAberta;
    }

    public void setPortaAberta(boolean portaAberta) {
        this.portaAberta = portaAberta;
    }

    void fecharPorta() {
        this.portaAberta = false;
        System.out.println("A porta foi fechada!");
    }

    void abrirPorta() {
        this.portaAberta = true;
        System.out.println("A porta foi aberta!");
    }

    public boolean mostrarStatusPorta() {
        if (isPortaAberta()) {
            System.out.println("A porta do elevador está aberta!");
            return true;
        } else {
            System.out.println("A porta do elevador está fechada!");
            return false;
        }
    }

    void mostrarAndarAtual() {
        System.out.println("Você está no andar: " + getAndarAtual());
        ;
    }

    void subir() {

        if (this.andarAtual < this.totalAndares) {
            // subir um andar
            this.andarAtual += 1;
        } else {
            System.out.println("Você não pode subir, estás no último andar.");
            return;
        };

        if (!isPortaAberta()) {
            System.out.println("A porta está fechada! Abrindo para você...");
            abrirPorta();
        }

        System.out.println("Você subiu um andar.");
        mostrarAndarAtual();
    }

    void descer() {

        if (this.andarAtual > 0) {
            // descer um andar
            this.andarAtual -= 1;
        } else {
            System.out.println("Você não pode descer, estás no andar 0.");
            return;
        };
        if (!isPortaAberta()) {
            System.out.println("A porta está fechada! Abrindo para você...");
            abrirPorta();
        }
        System.out.println("Você desceu um andar.");
        mostrarAndarAtual();
    }
}