import Ex_08.ShoppingCart;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class ShoppingCartTest {
    private ShoppingCart cart;

    @Before
    public void setUp() {
        cart = new ShoppingCart("123");
    }

    @Test
    public void testAddItem() {
        cart.addItem("Item 1");
        cart.addItem("Item 2");
        Assert.assertEquals(2, cart.getItemCount());
    }

    @Test
    public void testRemoveItem() {
        cart.addItem("Item 1");
        cart.addItem("Item 2");
        cart.removeItem("Item 1");
        Assert.assertEquals(1, cart.getItemCount());
        Assert.assertFalse(cart.containsItem("Item 1"));
    }

    @Test
    public void testContainsItem() {
        cart.addItem("Item 1");
        Assert.assertTrue(cart.containsItem("Item 1"));
        Assert.assertFalse(cart.containsItem("Item 2"));
    }

    @Test
    public void testGetItemCount() {
        cart.addItem("Item 1");
        cart.addItem("Item 2");
        Assert.assertEquals(2, cart.getItemCount());
    }

    @Test
    public void testClearCart() {
        cart.addItem("Item 1");
        cart.addItem("Item 2");
        cart.clearCart();
        Assert.assertEquals(0, cart.getItemCount());
    }
}
