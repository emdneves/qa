import EX_08.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class ShoppingCartTest {
    private ShoppingCart cart;

    @BeforeEach
    public void setUp() {
        cart = new ShoppingCart("123");
    }

    @Test
    public void testAddItem() {
        cart.addItem("Item 1");
        cart.addItem("Item 2");
        assertEquals(2, cart.getItemCount());
    }

    @Test
    public void testRemoveItem() {
        cart.addItem("Item 1");
        cart.addItem("Item 2");
        cart.removeItem("Item 1");
        assertEquals(1, cart.getItemCount());
        assertFalse(cart.containsItem("Item 1"));
    }

    @Test
    public void testContainsItem() {
        cart.addItem("Item 1");
        assertTrue(cart.containsItem("Item 1"));
        assertFalse(cart.containsItem("Item 2"));
    }

    @Test
    public void testGetItemCount() {
        cart.addItem("Item 1");
        cart.addItem("Item 2");
        assertEquals(2, cart.getItemCount());
    }

    @Test
    public void testClearCart() {
        cart.addItem("Item 1");
        cart.addItem("Item 2");
        cart.clearCart();
        assertEquals(0, cart.getItemCount());
    }
}
