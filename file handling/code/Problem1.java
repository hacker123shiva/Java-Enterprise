 

class Main{
    //create file in current working directory
    public static void main(String []args){
        java.io.File f=new java.io.File("abc.txt");
        try{f.createNewFile();}
        catch(java.io.IOException e){
        e.printStackTrace();
        }
        // f.delete();
    }
}
