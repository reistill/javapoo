abstract class Canino extends Animal{

    public String nome;

    public Canino(String nome){
        this.nome = nome;
    }

    @Override
    public void vaguear() {
        System.out.println(nome + " está vagueando");
    }
}