public class Cloths extends ShoppingAbstract implements ShoppingOnline{// Create Cloth class


    @Override
    public void categoryName() {// override method from OnlineShop interface
        System.out.println("Category name of cloth");
    }

    @Override
    void printCost() {// override method from ShopAbs abstract class
        System.out.println("Price of cloths = "+getCost());
    }
}
