public class Main{
    public static void main(String[] args) {
        Complex c1=new Complex(2,-9);
		Complex c2=new Complex(2,4);
		Complex r=new Complex();
        r=Complex.add(c1, c2);
		Complex.print(r);
    }
}