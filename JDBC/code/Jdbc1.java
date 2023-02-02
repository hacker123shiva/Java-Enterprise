import java.sql.*;
public class Jdbc1{
    public static void main(String []args){
        try{
            //load and register driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver is loaded Succesfully...");
            Thread.sleep(1000);
            System.out.println("Driver is registered Succesfully...");
        }
        catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        

        catch(Exception e){
            System.out.println(e.getMessage());
        }


    }
}

/*
 without setting class path 
PS D:\Java-Enterprise\JDBC\code> javac Jdbc1.java
PS D:\Java-Enterprise\JDBC\code> java Jdbc1.java
java.lang.ClassNotFoundException: com.mysql.cj.jdbc.Driver
        at java.base/jdk.internal.loader.BuiltinClassLoader.loadClass(BuiltinClassLoader.java:641)
        at java.base/jdk.internal.loader.ClassLoaders$AppClassLoader.loadClass(ClassLoaders.java:188)
        at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:520)
        at jdk.compiler/com.sun.tools.javac.launcher.Main$MemoryClassLoader.loadClass(Main.java:600)
        at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:520)
        at java.base/java.lang.Class.forName0(Native Method)
        at java.base/java.lang.Class.forName(Class.java:375)
        at Jdbc1.main(Jdbc1.java:5)
        at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
        at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
        at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
        at java.base/java.lang.reflect.Method.invoke(Method.java:568)
        at jdk.compiler/com.sun.tools.javac.launcher.Main.execute(Main.java:419)
        at jdk.compiler/com.sun.tools.javac.launcher.Main.run(Main.java:192)
        at jdk.compiler/com.sun.tools.javac.launcher.Main.main(Main.java:132)
 */