abstract class ShoppingAbstract implements Shops{// Create ShopAbs as abstract class and implements Shop interface
    //Declare two variable of int type
    int cost;
    int quantity;

    abstract void printCost(); // Create one method abstract type

    public int getCost(){ // get the cost
        return cost;
    }

    public void setCost(int cost){ // set the cost
        this.cost=cost;
    }

    public int getQuantity(){ // Using this method get the quantity
        return quantity;
    }

    public void setQuantity(int quantity){ // Using this method set the quantity
        this.quantity=quantity;
    }

}
