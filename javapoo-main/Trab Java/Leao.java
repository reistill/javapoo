public class Leao extends Felino{
    //construtor
    Leao(String nome){
    super(nome);
    }

    @Override
    public void fazerBarulho() {
        System.out.println("uaahr");
    }

    @Override
    public void comer() {
        System.out.println(nome +" está comendo");
    }
}
