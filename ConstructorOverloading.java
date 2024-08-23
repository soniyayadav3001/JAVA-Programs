class Box {
	double width, height, depth;
	Box(double w, double h, double d)
	{
		width = w;
		height = h;
		depth = d;
	}

	Box() { width = height = depth = 0; }

	double volume() {
		return width * height * depth;
		}

}

public class Main {
	public static void main(String args[])
	{
	
		Box mybox1 = new Box(10, 20, 15);
		Box mybox2 = new Box();
		
		double vol;

		vol = mybox1.volume();
		System.out.println("Volume of mybox1 is " + vol);

		vol = mybox2.volume();
		System.out.println("Volume of mybox2 is " + vol);

	}
}
