import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class VendingMachineImplTestMockito {
    Box box;
    CashBox cashBox;
    VendingMachine underTest;

    @Before
    public void setUp() {
        box = mock(Box.class);
        cashBox = mock(CashBox.class);
        underTest = new VendingMachineImpl(cashBox,new Box[] {box});
    }

    @Test
    public void testSelectItem() throws BoxEmptyException, NotEnoughMoneyException {
        when(box.isEmpty()).thenReturn(false);
        when(box.getPrice()).thenReturn(1);
        when(cashBox.getCurrentAmount()).thenReturn(2);
        underTest.selectItem(0);

        verify(box, times(1)).releaseItem();
        verify(cashBox, times(1)).withdraw(1);
    }
}