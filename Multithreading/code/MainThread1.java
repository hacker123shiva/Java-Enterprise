 //create two other thread with main thread first thread will print  2304 to 2319 letters and second thread will print a to j and main thread will print 1 to 10 
  class englishAlphabet extends Thread{
    public void run(){
for(int i='a';i<='j';i++){
    System.out.print((char)i+" ");
}
    }
  }
 
  class hindiAlphabet extends Thread{
    public void run(){
       for(int i=2304;i<=2319;i++){
           System.out.print(i+" ");
       }
    }
  }
 public class MainThread1{
    public static void main(String []args){
        englishAlphabet e=new englishAlphabet();
        hindiAlphabet h=new hindiAlphabet();
        e.start();
        h.start();

        for(int i=1;i<=10;i++){
            System.out.print(i+" ");
        }
    }
 }
 