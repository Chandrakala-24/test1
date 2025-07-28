package ClassObject;

public class BoxVolume {
	double width;
	double height;
	double depth;
	
	public BoxVolume(double width,double height,double depth) {
		this.width=width;
		this.height=height;
		this.depth=depth;
	}
	public void volume_of_box() {
		double volume=width*depth*height;
		System.out.println(volume);	
	}
	public static void main(String args[]) {
		BoxVolume bv=new BoxVolume(5,6,7);
		bv.volume_of_box();
	}

}
