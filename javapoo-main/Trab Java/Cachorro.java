public class Cachorro extends Canino{
    //contrutor
    Cachorro(String nome){
        super(nome);
    }

    @Override
    public void fazerBarulho() {
        System.out.println("Auau");
    }

    @Override
    public void comer() {
        System.out.println(nome+ " está comendo");
    }
}
