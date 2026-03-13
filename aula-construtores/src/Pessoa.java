public class Pessoa {
    private String nome;
    private String sobrenome;
    private int idade;

    public Pessoa(int idade, String sobrenome, String nome) {
        setIdade(idade);
        setSobrenome(sobrenome);
        setNome(nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if(idade < 0) return;
        this.idade = idade;
    }
}
