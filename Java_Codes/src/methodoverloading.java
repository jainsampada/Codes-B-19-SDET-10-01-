
public class methodoverloading {
	int num1, num2,sum;
	public void add()
	
	{
		num1=100;
		num2=150;
		sum=num1+num2;
		System.out.println(sum);
	}
	public void add(int num1, int num2, int num3)
	{
		System.out.println(sum=num1+num2+num3);
	}
	public void add(double num1, double num2)
	{
		System.out.println(sum=(int)(num1+num2));
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
methodoverloading oo= new methodoverloading();
oo.add();
oo.add(10,20,30);
oo.add(22.5,34.5);
	}


}
