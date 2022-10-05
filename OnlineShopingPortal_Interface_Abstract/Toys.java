public class Toys extends ShoppingAbstract implements ShoppingOnline{
    //Create Toy class extends the ShopAbs abstract class and implements the OnlineShop


    @Override
    public void categoryName() {//override method from OnlineShop interface
        System.out.println("The Category name of Toys"); //display the category name of toys
    }

    @Override
    void printCost() {//override method from ShopAbs abstract class
        System.out.println("The price of toys ="+getCost()); //printing the price of toys
    }
}
