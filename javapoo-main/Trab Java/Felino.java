abstract class Felino extends Animal{
    
    String nome;

    public Felino(String nome){
        this.nome = nome;
    }

    @Override
    public void vaguear() {

        System.out.println(nome +" está vaguenado!");
    }
}
