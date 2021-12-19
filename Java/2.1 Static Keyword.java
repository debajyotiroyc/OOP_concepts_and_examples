class Bank
{
    double rate=5.5; //instance variable belongs to every instance and every instance has its own unique copy
    static int customer=0; //class/static variable belongs to the class and every instance has to share a single copy
    int customer_count()
    {
        customer++;
        return customer;
    }
    double rate_count()
    {
        rate+=1.2;
        return rate;
    }
    
}
public class Main
{
	public static void main(String[] args) {
		Bank ob1 = new Bank();
		Bank ob2 = new Bank();
		Bank ob3 = new Bank();
		//static value gets updated each time since it is being shared, non-static value will not be updated each time
		System.out.println(ob1.rate_count()+" "+ob1.customer_count());
		System.out.println(ob2.rate_count()+" "+ob2.customer_count());
		System.out.println(ob3.rate_count()+" "+ob3.customer_count());
	}
}
