class Programa{
    public static void main(String args[]){
        //isntanciando a classe Hipopótamo
        System.out.println("============Hipopotamo==============");
        Hipopotamo h1 = new Hipopotamo("Jorge ");
        h1.comer();
        h1.fazerBarulho();
        h1.vaguear();
        //isntanciando a classe Cachorro
        System.out.println("============Cachorro==============");
        Cachorro c1 = new Cachorro("Flash");
        c1.comer();
        c1.fazerBarulho();
        c1.vaguear();
        //isntanciando a classe Lobo
        System.out.println("============Lobo==============");
        Lobo l1 = new Lobo("Scot");
        l1.comer();
        l1.fazerBarulho();
        l1.vaguear();
        //isntanciando a classe Gato
        System.out.println("============Gato==============");
        Gato g1 = new Gato("Missinho");
        g1.comer();
        g1.fazerBarulho();
        g1.vaguear();
        //isntanciando a classe Leão
        System.out.println("============Leão==============");
        Leao l2 = new Leao("Leo");
        l2.comer();
        l2.fazerBarulho();
        l2.vaguear();
    }
}