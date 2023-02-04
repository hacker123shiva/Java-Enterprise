//check number of png file, txt file, zip file in download
class Main {
    public static void main(String [] args){
java.io.File f=new java.io.File("C://Users//ASUS1//Downloads");
String []names=f.list();
int txt=0;
int jpg=0;
int zip=0;
System.out.println(f.length());
for(String name: names){
    // java.io.File f1=new java.io.File(f,name);
  
if(name.endsWith(".txt"))
{
    txt++;
}
else if(name.endsWith(".jpg")){
    jpg++;
}
else if(name.endsWith(".zip")){
    zip++;
}

}

System.out.println("Number of txt file in Downloads:: "+txt);
System.out.println("Number of jpg file in downloads ::  "+jpg);
System.out.println("Number of zip file in Downloads :: "+zip);
    }
}
