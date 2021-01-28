public interface VendingMachine {
    public boolean selectItem(int boxIndex) throws
            NotEnoughMoneyException,
            BoxEmptyException;
}
