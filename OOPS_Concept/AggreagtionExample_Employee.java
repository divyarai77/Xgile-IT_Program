package OOPS_Concept;

/* in this example, employee has an object of address, address object contain its own information such as
     city, state, country */

public class AggreagtionExample_Employee {
    int id;
    String name;
    AggregationExample_Address address;

    public AggreagtionExample_Employee(int id, String name,AggregationExample_Address address){
        this.id=id;
        this.name=name;
        this.address=address;
    }
    void display(){
        System.out.println(id+" "+name);
        System.out.println(address.city+" "+address.state+" "+address.country);
    }

    public static void main(String[] args) {
        AggregationExample_Address add=new AggregationExample_Address("Varanasi","UP","India");
        AggregationExample_Address add1=new AggregationExample_Address("Vododara","Gujrat","India");

        AggreagtionExample_Employee e1=new AggreagtionExample_Employee(101,"John",add);
        AggreagtionExample_Employee e2=new AggreagtionExample_Employee(102,"Sam",add1);

        e1.display();
        e2.display();
    }
}
