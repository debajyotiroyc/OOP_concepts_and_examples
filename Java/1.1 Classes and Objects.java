class Bank
{
    int x = 4;
    void show()
    { 
        System.out.println("Demo Function");
    }
}

public class Main
{
	public static void main(String[] args) {
		Bank ob = new Bank();
		ob.show();
		System.out.println(ob.x);
	}
}