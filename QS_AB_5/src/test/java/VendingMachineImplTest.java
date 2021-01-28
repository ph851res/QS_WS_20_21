import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;



public class VendingMachineImplTest {
    public VendingMachine vendingMachine;
    public CashBox cashBox;

    @Before
    public void setUp() {
        cashBox = new UnlimitedCashBox();
        vendingMachine = new VendingMachineImpl(cashBox, new FullBox[] {new FullBox()});
    }

    @Test
    public void testEnoughAmountAndFullBox() throws BoxEmptyException, NotEnoughMoneyException {
        assertTrue(vendingMachine.selectItem(0));
    }
}