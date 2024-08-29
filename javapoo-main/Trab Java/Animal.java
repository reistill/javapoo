abstract class Animal{
    //atributos da classe Animal
    private double tamanho;
    private double peso;
    private int idade;
    private String nome;
    //Criando métodos da classe animal
    public void fazerBarulho(){
        System.out.println("Animal fazendo barulho");
    }

    public void vaguear(){
        System.out.println("Animal vagueando");
    }

    public void comer(){
        System.out.println("Animal comendo");
    }

    public void dormir(){
        System.out.println("Animal dormindo");
    }

    //gets e sets
    public double getTamanho(){
        return tamanho;
    }

    public void setTamaho(double tamanho){
        this.tamanho = tamanho;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public double getPeso(){
        return peso;
    }

    public void setPeso(double peso){
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}