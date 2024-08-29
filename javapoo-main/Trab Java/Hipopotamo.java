public class Hipopotamo extends Animal{

    String nome;
    //contrutor
    public Hipopotamo(String nome){
        this.nome = nome;
    }

    @Override
    public void comer() {
        System.out.println( nome + " está comendo");
    }

    @Override
    public void fazerBarulho() {
        System.out.println("Rrrrooouuuu!");
    }

    @Override
    public void vaguear(){
        System.out.println(nome +"está vagueando");
    }
}