 

 enum UseOrdinalValues {
    ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN;
    public static void main(String[] args) { 
     for(UseOrdinalValues u:UseOrdinalValues.values()) //how many times values() is called in this program?  1 time only 
     {
        System.out.println(u+" : "+u.ordinal());
     }
    }
    
}
