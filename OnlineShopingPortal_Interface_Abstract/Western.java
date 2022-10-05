public class Western extends ShoppingAbstract implements ShoppingOnline{
    //Create Sports class extends the ShopAbs abstract class

    @Override
    public void categoryName() {//override method from OnlineShop interface
        System.out.println("The Category name is Western");// Dispaly the category name Western of cloth
    }

    @Override
    void printCost() {//override method from ShopAbs abstract class
        System.out.println("Price of the Western ="+getCost());// Display the price
    }
}
