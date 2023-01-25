 

public class InnerEnum {
    public static void main(String[] args)
    {
        Test.Color en=Test.Color.GREEN;
        System.out.println(en.ordinal());
    }
}


  class Test {
    enum Color{ //Color is a static class inside Test class
        RED,
        GREEN,
        BLUE;
    }
    // Driver method
}

