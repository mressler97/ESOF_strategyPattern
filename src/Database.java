public class Database {
    private dbStrategy strategy;

    public void setStoreStrategy(dbStrategy strategy) {
        this.strategy = strategy;
    }

    public void store() {
        strategy.store();
    }
}
