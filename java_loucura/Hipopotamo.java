//criação da classe Hipopótamo comherança da superclasse abstrata Animal
public class Hipopotamo extends Animal {
    
    //usando a notação @Override para sobrescrever o método fazerbarulho da classe pai(Animal)
    @Override
    public void fazerbarulho() {
        System.out.println("hipopótamo Rawr");
    }

    @Override
    public void comer() {
        System.out.println("hipopótamo alimentando-se");
    }
}