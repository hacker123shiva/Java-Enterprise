public class Launch21 {
    public void wish() throws ArithmeticException {// ducking exception by throws keyword // if you are using throws keyword then you have to handle exception in main method or in caller method or in caller caller method
//  System.out.println(2/0);   -- case 1 exception occur automatically
// throw new ArithmeticException(); // -- case 2 exception occur explicitly by programmer 
//throw use to generate exception explicitly by programmer
}
public static void main(String[] args) {
 Launch21 l=new Launch21();
 l.wish();
}
}
