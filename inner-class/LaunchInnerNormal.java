// class Outer{
     
// class Inner{
//  public void call(){
//     System.out.println("Call to me");
//  }
// }
//     public static void main(String []args){
// Outer.Inner ot= new Outer().new Inner();
// ot.call();
//     }
// }

// class Outer {
//     class Inner {
//         public void call() {
//             System.out.println("Call to me");
//         }
//     }

//     public void listen(){
//         Inner in=new Inner();
//         System.out.println("accessing inner class code form instance area of same class Outer class" );
//         in.call();
//     }
//     public static void main(String []args){
// Outer ot=new Outer();
// ot.listen();
//     }


// }

// class Outer {
//     class Inner {
//         public void call(){
//             System.out.println("Call to me");
//         }
//     }

//     public static void receive(){
//         Outer.Inner in=new Outer().new Inner();
//         System.out.println("acessing inner class code  from static area");
//         in.call();

//     }

//     public static void main(String []args){
//         Outer.receive();
//     }
// }


// class Outer {
//     class Inner{
//         public void call(){
//             System.out.println("Call to me");
//         }
//     }

//     public static void main(String []args){
//         OuterOuter ot=new OuterOuter();
//         ot.receive();
//     }
// }

// class OuterOuter{
//     public void receive(){
//         Outer.Inner in=new Outer().new Inner();
//         System.out.println("accessing inner class code from instance area of outer class");
//         in.call();
//     }
// }

// class Outer {
//     int x=10;
//     class Inner{
//         int x=20;
//         public void call(){
//             int x=30;
//             System.out.println("Call to me");
//             System.out.println("local variable of inner class x= "+x);
//             System.out.println("Instance variable of inner class x= "+this.x);
//             System.out.println("Instance variable of Outer class instacne variable x= "+Outer.this.x);


//         }
//     }

//     public static void main(String []args){
//         Outer ot=new Outer();
//         Outer.Inner in=ot.new Inner();
//         in.call();
//     }
// }


//applicable modifiers for outer classes are:
// 1. public
// 2. default
// 3. final
// 4. abstract
// 5. strictfp

//but for inner classes we can use;
// 1.private
// 2.protected
// 3.static
// 4.public
// 5.abstract 
// 6.final
// 7.strictfp
// 8.default

// class Outer{
//  class Inner{
//     public void call(){
//         System.out.println("Call to me");
//     }
//   }
// }

// class Outer{
//     class Inner{
//         class InnerInner{
//             class InnerInnerInner{
//                 public void call(){
//                    System.out.println("Call to me");
//         }
//             }
//         }
//     }
//     public static void main(String []args){
//         Outer.Inner.InnerInner.InnerInnerInner o=new Outer().new Inner().new InnerInner().new InnerInnerInner();
//         System.out.print("nested inner class");
//         o.call();
//     }
// }    


// class Outer{
//     class Inner{
//        public void call(){
//            System.out.println("Call to me");
//        }
//      }
//    }
   
//    class Outer{
//        class Inner{
//            class InnerInner{
//                class InnerInnerInner{
//                    public void call(){
//                       System.out.println("Call to me");
//                      try{ Thread.sleep(5000);}
//                         catch(Exception e){}
//                         for(int i=0;i<10;i++){
//                             System.out.println("i= "+i);
                           
//                         }

//            }
            
//                }
//            }
//        }
//        public static void main(String []args){
//  Outer o=new Outer();
//  Outer.Inner o1=o.new Inner();
//     Outer.Inner.InnerInner o2=o1.new InnerInner();
//     Outer.Inner.InnerInner.InnerInnerInner o3=o2.new InnerInnerInner();
           
//             o=null;
//             o1=null;
//             o2=null;
//             System.gc();  
//             o3.call();
//        }
//        @Override
//        public void finalize(){
//         System.out.println("object get clear");
//        }    
// }    

// class Outer{
//     int x=40;
//   public void call(){
//     int x=30;
//     class Inner {
//         int x=20;
//         public void help(){
//             int x=10;
//             System.out.println("local variable of inner class x= "+x);
//             System.out.println("Instance variable of inner class x= "+this.x);
//             System.out.println("Instance variable of Outer class instacne variable x= "+Outer.this.x);
//         }
//     }
//     Inner in=new Inner();
//     in.help();
//   }

//   public static void main(String []args){
//     Outer ot=new Outer();
//     ot.call();
//   }
// }


// class Outer{
//     int x=10;
//     static int y=10;
//     public void m1(){
//         class Inner{
//             public void m2(){
//                 System.out.println("Instance variable of outer class x= "+x);
//                 System.out.println("Static variable of outer class y= "+y);
//             }
//         }
//         Inner in=new Inner();
//         in.m2();
//     }

//     public static void main(String []args){
//         Outer ot=new Outer();
//         ot.m1();
//     }
// }

//static nested class
// class Outer
// {
//     static int x=10;
//     static class Inner
//     {
//         public void m1()
//         {
//             System.out.println("Static variable of outer class x= "+x);
//         }
//     }

//     public static void main(String []args)
//     {
//         Inner in=new Inner();
//         in.m1();
//     }
// }

// class Outer
// {
//     static int x=10;
//     static class Inner
//     {
//         public void m1()
//         {
//             System.out.println("Static variable of outer class x= "+x);
//         }
//     }

   
// }

// class Main{
//     public static void main(String []args)
//     {
//      Outer.Inner in =new Outer.Inner();
//         in.m1();
//     }
// }

// class Outer {
//     class Inner{
//         public void call(){
//             Outer.this.help();
//             System.out.println("Call to me");
//         }
//     }

//     public void help(){
//          System.out.println("use of instance method of Outer class in inner class");
//     }

//     public static void main(String []args){
//         Outer.Inner in=new Outer().new Inner();
//         in.call();
//     }
// }

// class Outer{
// public void receive(){
//     System.out.println("receive call");
// }
// class In1{
//     class In2{
//         public void call(){
//            Outer.this.receive(); 
//            In1.this.truth();
//         }
//     }

//     public void truth() {
//         System.out.println("truth call");
//     }
// }

// public static void main(String []args){
//     Outer.In1.In2 in=new Outer().new In1().new In2();
//     in.call();
// }
// }

// class Test {
//     int x=10;
//     static int y=20;
//     static class Nested{
//     public void methodOne(){
//     // System.out.println(x);//C.E:non-static variable x cannot be 
//     // reference from a static context
//     System.out.println(y);
//     }
//     }
// }


// class Test {
//    public static class Nested{
//     public static void main(String[] args){
//     System.out.println("nested class main method");
//     }
//     }
//     public static void main(String[] args){
//     System.out.println("outer class main method");
//     }
// }

// class Main{
//     static class Nested{
//         public static void main(String []args){
//          System.out.println("nested main method");
//         }
//     }
//     public static void main(String []args){
//         System.out.println("outer main method");
//   }
// }

