class Lobo extends Canino{
    //construtor
    Lobo(String nome){
        super(nome);
    }

    @Override
    public void comer() {
        System.out.println( nome +" está comendo");
    }

    @Override
    public void fazerBarulho() {
        System.out.println("auuuuuu");
    }
}