//criação da classe(molde) abstrata Animal
abstract class Animal {
    private double tamanho;
    private double peso;
    private int idade;

    //criação dos métodos da classe animal
    public void fazerbarulho() {
        System.out.println("barulho animal");
    }

    public void comer() {
        System.out.println("animal alimentando-se");
    }

    public void dormir() {
        System.out.println("animal zzz");
    }

    public void vaguear() {
        System.out.println("animal movimentando-se");
    }

    //gets e sets
    public double gettamanho() {
        return tamanho;
    }

    public void settamanho(double tamanho) {
        this.tamanho = tamanho;
    }
    
    public double getpeso() {
        return peso;
    }

    public void setpeso(double peso) {
        this.peso = peso;
    }

    public int idade() {
        return idade;
    }

    public void setidade(int idade) {
        this.idade = idade;
    }
}
