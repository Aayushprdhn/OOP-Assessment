package week3wok;

public class qn9 {
	public static void main(String[] args) {
		Box defaultbox = new Box();
		defaultbox.getVolume();
		
		Box cube = new Box(5);
		cube.getVolume();
		
		Box cuboid = new Box(4, 6, 8);
		cuboid.getVolume();
	}
}

class Box{
	int height;
	int width;
	int depth;
	
	public Box() {
		width = 10;
		height = 12;
		depth = 8;
	}
	
	public Box(int length) {
		width = length;
		height = length;
		depth = length;
	}
	
	public Box(int w, int h, int d) {
		width = w;
		height = h;
		depth = d;
	}
	
	void getVolume() {
		int volume = width * height * depth;
		System.out.println("Volume of Box: "+ volume);
	}
}