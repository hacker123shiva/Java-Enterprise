 class Main{
    public static void main(String []args){
       try{
        java.io.File f=new java.io.File("abc.txt");
        java.io.FileReader fr=new java.io.FileReader(f);
        char ch[]=new char[(int) f.length()];
        System.out.println("read(char []arr) method");
        fr.read(ch);
        for(char c: ch){
            System.out.print(c);
        }
        System.out.println();
        fr=new java.io.FileReader(f);
        System.out.println("read() method");
        int i=fr.read();
        while(i!=-1){
            System.out.print((char)i);
            i=fr.read();
        }

       }
       catch(java.io.IOException e){
        e.printStackTrace();
       }

       
    }
}
