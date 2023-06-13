import EX_09.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GameStoreTest {
    private GameStore gameStore;

    @BeforeEach
    public void setUp() {
        gameStore = new GameStore();
    }

    @Test
    public void testAddGameToStock() {
        VideoGame game1 = new VideoGame("Skyrim", "Bethesda", 10.0, 50.0);
        gameStore.addGameToStock(game1);
        assertEquals(1, gameStore.getStockSize());

        VideoGame game2 = new VideoGame("GTA V", "Rockstar", 15.0, 70.0);
        gameStore.addGameToStock(game2);
        assertEquals(2, gameStore.getStockSize());
    }

    @Test
    public void testSellGame() {
        VideoGame game1 = new VideoGame("Skyrim", "Bethesda", 10.0, 50.0);
        gameStore.addGameToStock(game1);
        VideoGame game2 = new VideoGame("GTA V", "Rockstar", 15.0, 70.0);
        gameStore.addGameToStock(game2);

        gameStore.sellGame(0);
        assertEquals(1, gameStore.getStockSize());
        assertEquals(1, gameStore.getSalesSize());

        VideoGame soldGame = gameStore.getSales().get(0);
        assertEquals(game1.getName(), soldGame.getName());
        assertEquals(game1.getPublisher(), soldGame.getPublisher());
        assertEquals(game1.getCostPrice(), soldGame.getCostPrice(), 0.0);
        assertEquals(game1.getSellingPrice(), soldGame.getSellingPrice(), 0.0);
    }

    @Test
    public void testCalculateProfit() {
        VideoGame game1 = new VideoGame("Skyrim", "Bethesda", 10.0, 50.0);
        gameStore.addGameToStock(game1);
        VideoGame game2 = new VideoGame("GTA V", "Rockstar", 15.0, 70.0);
        gameStore.addGameToStock(game2);

        gameStore.sellGame(0);
        gameStore.sellGame(0);

        double profit = gameStore.calculateProfit();
        assertEquals(120.0, profit, 0.0);
    }
}

