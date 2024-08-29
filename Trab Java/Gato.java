public class Gato extends Felino{
    
    Gato(String nome){
        super(nome); 
    }
    @Override
    public void fazerBarulho() {
        System.out.println("Miau");
    }

    @Override
    public void comer() {
        System.out.println(nome + " está comendo");
    }
}
