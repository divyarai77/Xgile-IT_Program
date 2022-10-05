public class Electronics extends ShoppingAbstract implements ShoppingOnline{
    //Create Electronic class extends the ShopAbs abstract class and implements the OnlineShop


    @Override
    public void categoryName() {//override method from OnlineShop interface
        System.out.println("Category Name of Electronic");
    }

    @Override
    void printCost() { //override method from ShopAbs abstract class
        System.out.println("Price of Electronic ="+getCost());
    }
}
