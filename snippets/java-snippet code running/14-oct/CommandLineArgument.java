public class CommandLineArgument{
    public static void main(String []args){
        System.out.println("You have entered " + args.length + " arguments");
        // System.out.println("args2 "+args[2]); //case 4: uncomment this line and run the program
        System.out.println("args3 "+args[3]);

    }
}
/*
 * case 1:
PS D:\Java-Enterprise\snippets\java-snippet code running\14-oct> javac CommandLineArgument.java
PS D:\Java-Enterprise\snippets\java-snippet code running\14-oct> java CommandLineArgument shiva
You have entered 1 arguments
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 1
        at CommandLineArgument.main(CommandLineArgument.java:4)

case 2:
PS D:\Java-Enterprise\snippets\java-snippet code running\14-oct> java CommandLineArgument shiva muskan harsh ritika
You have entered 4 arguments
args3 ritika

case3:
PS D:\Java-Enterprise\snippets\java-snippet code running\14-oct> java CommandLineArgument shiva muskan harsh     ritika
You have entered 4 arguments
args3 ritika

case 4:
PS D:\Java-Enterprise\snippets\java-snippet code running\14-oct> javac CommandLineArgument.java
PS D:\Java-Enterprise\snippets\java-snippet code running\14-oct> java CommandLineArgument shiva muskan harsh     ritika
You have entered 4 arguments
args2 harsh
args3 ritika

//note: giving space between arguments is not a problem in java command line argument
 */
