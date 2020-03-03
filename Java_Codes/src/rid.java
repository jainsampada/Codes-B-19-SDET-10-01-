
public class rid {
	
		public static void main(String[] args) 
		{
			D oo= new D();
		oo.acc(10.0);
		oo.acc(30.0);

			}
		}
		class C
		{
			public void acc(double i)
			{
				System.out.println(i*2);
			}
		}
			class D extends C
			{
				public void acc(double i)//Method overriding
				{
					System.out.println(i);
				}
				

		}




