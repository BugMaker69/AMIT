import java.util.ArrayList;
public class Main {
    static double sumArea(GeoShape s1,GeoShape s2,GeoShape s3){
		return s1.area()+s2.area()+s3.area();
	}
	
	public static void main(String[] args) {
		

		ArrayList<GeoShape> as=new ArrayList<GeoShape>();

		Rectangle r=new Rectangle(3,2);
		
		Triangle t=new Triangle(2,3);
		
		Circle c=new Circle(2);
		
		as.add(r);
		as.add(t);
		as.add(c);

		double s=sumArea(r,t,c);
		
		System.out.println(s);
	
		for (GeoShape d : as) {
			d.draw();
		}
	
	}
}
