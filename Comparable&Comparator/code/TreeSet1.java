import java.util.TreeSet;
class TreeSet1{
    public static void main(String []args){
       TreeSet<String> ts = new TreeSet<String>();
            ts.add("A");
            ts.add("S");//"s".compareTo("A") = 19 -> right side
            ts.add("D");//"D".compareTo("A") = 3  -> right side -> "D".compareTo("S") = -16 -> left side
            ts.add("G");
            ts.add("C");
            ts.add("B");

            System.out.println(ts);

    }
}