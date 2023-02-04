//create a file note.txt in typed-notes
class Main {
    public static void main(String [] args){
        java.io.File f=new java.io.File("D://Java-Enterprise//file handling//typed-notes","note.txt");
       try{f.createNewFile();}
       catch(java.io.IOException e){
        e.printStackTrace();
       }
    }
}
