import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ShoppingCartTest {

    @Test
    void testSingleItemTotal() {
        int result = ShoppingCart.calculateTotal(10, 2, 0);
        assertEquals(20, result);
    }

    @Test
    void testMultipleItemsTotal() {
        int sum = 0;
        sum = ShoppingCart.calculateTotal(5, 3, sum);  // 15
        sum = ShoppingCart.calculateTotal(10, 2, sum); // +20 = 35
        assertEquals(35, sum);
    }

    @Test
    void testZeroQuantity() {
        int result = ShoppingCart.calculateTotal(10, 0, 0);
        assertEquals(0, result);
    }

    @Test
    void testZeroPrice() {
        int result = ShoppingCart.calculateTotal(0, 5, 0);
        assertEquals(0, result);
    }

    @Test
    void testLargeNumbers() {
        int result = ShoppingCart.calculateTotal(1000, 1000, 0);
        assertEquals(1_000_000, result);
    }
}