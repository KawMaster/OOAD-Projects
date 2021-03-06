package roll.store;

public class SpringRollCommand implements ICommand{

    private Store store;
    private SpringRollFactory factory;
    private Roll result;

    public SpringRollCommand(Store store){
        this.store = store;
        this.factory = new SpringRollFactory();
    }

    @Override
    public void make(){
        store.getIngredients(0);
        Roll newRoll = new Roll(factory);
        result = newRoll;
    }

    @Override
    public void make(Roll roll, String sauce) {

    }

    public Roll getResult()
    {
        return result;
    }
}
