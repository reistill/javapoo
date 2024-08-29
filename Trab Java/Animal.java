abstract class Animal{

    private double tamanho;
    private double peso;
    private int idade;

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

    public double getTamanho(){
        return tamanho;
    }

    public double getPeso(){
        return peso;
    }

    public int getIdade(){
        return idade;
    }

    public void setTamaho(double tamanho){
        this.tamanho = tamanho;
    }

    public void setPeso(double peso){
        this.peso = peso;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }
}