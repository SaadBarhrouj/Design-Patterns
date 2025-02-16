import strategy.DefaultStrategyImpl;
import strategy.IStrategy;

public class Context {
    private IStrategy strategy;

    public void process(){
        System.out.println("etape 1 de l'algorithme ");
            strategy.applyStrategy();
        System.out.println("etape finale de l'algorithme ");
    }
    public void setStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }
    public Context(){
        this.strategy = new DefaultStrategyImpl();
    }


}
