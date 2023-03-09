public class Main {
    static double sumArea(GeoShape s1,GeoShape s2,GeoShape s3){
		return s1.area()+s2.area()+s3.area();
	}
	
	public static void main(String[] args) {
		
		Rectangle r=new Rectangle(2,4);
		
		Triangle t=new Triangle(2,4);
		
		Circle c=new Circle(4);
		
		double s=sumArea(r,t,c);
		
		System.out.println(s);
	}
}
