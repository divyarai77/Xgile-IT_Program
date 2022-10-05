public class Test { //creating class test as main class
    public static void main(String[] args) {
        //Using lambda expression define Calculate price
        // lambda expression is used to represent the instance of functional interface Calculate
        Calculation calculation=(int price, int quantity)->price * quantity;

        // Object of Toys class
        Toys toys=new Toys();
        toys.setCost(1000);//set the price of toys
        toys.setQuantity(5);//set the quantity of toys

        //checked if obj toys is instance of marker interface OnlineShop
        if(toys instanceof ShoppingOnline){
            System.out.println("Price of one Toy ="+toys.getCost());
            System.out.println("Total toys Quantity ="+toys.getQuantity());
            //printing total price of toys
            System.out.println("Total price of toys ="+calculation.calculationOfCost(toys.cost,toys.quantity));
        }


        //Object of Cloth class
        Cloths cloths=new Cloths();
        cloths.setCost(2500);//set the price of cloths
        cloths.setQuantity(9);//set the quantity of cloths

        //checked if obj cloth is instance of marker interface OnlineShop
        if(cloths instanceof ShoppingOnline){
            System.out.println("Price of one Cloth ="+cloths.getCost());
            System.out.println("Total cloths Quantity ="+cloths.getQuantity());
            //printing total price of cloths
            System.out.println("Total price of cloths ="+calculation.calculationOfCost(cloths.cost,cloths.quantity));
        }


        //Object of Electronic class
        Electronics electronics=new Electronics();
        electronics.setCost(90);//set price of electronic item
        electronics.setQuantity(10);//set quantity of electronic item

        //checked if obj electronic is instance of marker interface OnlineShop
        if(electronics instanceof ShoppingOnline){
            System.out.println("Price of one electronic item ="+electronics.getCost());
            System.out.println("Total electronic item Quantity ="+electronics.getQuantity());
            //printing total price of electronic items
            System.out.println("Total price of electronic items ="+calculation.calculationOfCost(electronics.cost,electronics.quantity));
        }

        //Object of Western class
        Western western=new Western();
        western.setCost(800);//set price of Western cloths
        western.setQuantity(9);//set quantity of Western cloths

        //checked if obj western is instance of marker interface OnlineShop
        if(western instanceof ShoppingOnline){
            System.out.println("Price of one western cloths ="+western.getCost());
            System.out.println("Total western cloths Quantity ="+western.getQuantity());
            //printing total price of western items
            System.out.println("Total price of western cloths items ="+calculation.calculationOfCost(western.cost,western.quantity));
        }


    }
}
