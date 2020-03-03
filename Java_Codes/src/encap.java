
public class encap {

		private int rollno;
		private String name;
		public int getRoll()//Read only method //getter property
		{
			return rollno;
		}
		public void setrollno(int rollno)//Write only method //setter property
		{
			this.rollno=rollno;//this keyword is used as reference to current object whose method is invoked
		}
		public String getName()//Read only method //getter property
		{
			return name;
		}
		public void SetName(String name)//Write only method //setter property
		{
			this.name=name;
		}

		
	}


