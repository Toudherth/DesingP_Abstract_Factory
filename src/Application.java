public class Application {

    public static  void main(String [] args){
        // instanciation statique
        AbstractFactory factory = new FactoryImplA();
        AbstractPlugin plugin= factory.getInstance();
        plugin.traitement();

        AbstractFactory factory1 = new FactoryImplB();
        AbstractPlugin plugin1= factory1.getInstance();
        plugin1.traitement();

    }
}
