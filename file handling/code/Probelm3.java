//count number of file in java-enterprise with directory and file
class Main {
    public static void main(String []args){
java.io.File f=new java.io.File("D://Java-Enterprise");
String []names=f.list();
int dir=0;
int fil=0;
int count=0;
for(String name:names){
    java.io.File f1=new java.io.File(f,name);
    count++;
    if(f1.isDirectory())
    {
dir++;
    }

 else if(f1.isFile()){
fil++;
}    
}

System.out.println("Total number of file and folder in Java-Enterprise :: "+count);
System.out.println("Total number of file in Java-Enterprise :: "+fil);
System.out.println("Total directory in Java-Enterpris :: "+dir);

    }
}

