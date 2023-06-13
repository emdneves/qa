package EX_09;

import java.util.ArrayList;

class GameStore {
    private ArrayList<VideoGame> stock;
    private ArrayList<VideoGame> sales;
    public GameStore() {
        stock = new ArrayList<>();
        sales = new ArrayList<>();
    }
    public void addGameToStock(VideoGame game) {
        stock.add(game);
    }

    public void sellGame(int index) {
        VideoGame game = stock.remove(index);
        sales.add(new VideoGame(game.getName(), game.getPublisher(), game.getCostPrice(), game.getSellingPrice()));
    }
    public void displayStock() {
        System.out.println("Stock:");
        for (VideoGame game : stock) {
            System.out.println("Name: " + game.getName());
            System.out.println("Publisher: " + game.getPublisher());
            System.out.println("Cost Price: " + game.getCostPrice());
            System.out.println("Selling Price: " + game.getSellingPrice());
            System.out.println("---------------------------");
        }
    }
    public void displaySales() {
        System.out.println("Sales:");
        for (VideoGame game : sales) {
            System.out.println("Name: " + game.getName());
            System.out.println("Publisher: " + game.getPublisher());
            System.out.println("Cost Price: " + game.getCostPrice());
            System.out.println("Selling Price: " + game.getSellingPrice());
            System.out.println("---------------------------");
        }
    }

    public double calculateProfit() {
        double totalCost = 0.0;
        double totalRevenue = 0.0;

        for (VideoGame game : sales) {
            totalRevenue += game.getSellingPrice();
        }

        for (VideoGame game : stock) {
            totalCost += game.getCostPrice();
        }

        return totalRevenue - totalCost;
    }

}