
public class constructordemo {
		int num1,num2,sum;
		public constructordemo()
		{
			num1=20;
			num2=30;
		}
		public void display()
		{
			sum=num1+num2;
			System.out.println(sum);
		}
		public constructordemo(int a, int b)
		{
			sum=a+b;
			System.out.println(sum);
		}
		
	public constructordemo(String name)
	{
		System.out.println(name);
	}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	constructordemo oo= new constructordemo();
	oo.display();
	constructordemo obj= new constructordemo(10,20);
	constructordemo ob=new constructordemo("Yakshi");
		}
	}


