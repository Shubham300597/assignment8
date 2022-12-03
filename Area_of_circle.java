package assignment8;

public class Area_of_circle {
	{
    double pi=3.14;
	int r;
	double Area_of_circle;

	public Area_of_circle(int r) 
	{
		super();
		this.r = r;
	}
	public double Area()
	{
		return area=pi*r*r;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Area_of_circle c1=new Area_of_circle(4);
		   System.out.println("Area Of First Circle:- "+c1.Area());
		   Area_of_circle c2=new Area_of_circle(20);
		   System.out.println("Area Of Second Circle:- "+c2.Area());
		    }
	}

	}

}
