import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.annotation.*;

@interface CricketPlayer{

}
//by default target is class and retention is class 
 
public class CustomAnnotation {
    
}



//---------------------------------------------------------------------------------------------------\\
@interface Player{
    String name() default "Virat Kohli";
    int age() default 30;
}

@Player
class Virat{

}


//---------------------------------------------------------------------------------------------------\\
@interface Winner{
    String name() default "Virat Kohli";
    int age() default 30;
}

@Winner(name="Rohit Sharma", age=30)
class India{

}


//---------------------------------------------------------------------------------------------------\\
@Target(ElementType.TYPE )
@Retention(RetentionPolicy.RUNTIME) 
@interface Fighter{
    String name() default "Virat Kohli";
    int age() default 30;
}

@Fighter(name="shiva srivastava",age=23)
class IndiaArmy{
public void disp(){
    System.out.println("India Army");
    Class c=this.getClass(); // reflection api
   Annotation a=c.getAnnotation(Fighter.class); // Fighter.class --> Fighter
    Fighter f=(Fighter)a;
    System.out.println(f.name());
    System.out.println(f.age()); 
}
public static void main(String []args){
    IndiaArmy ia=new IndiaArmy();
    ia.disp();
}
}
 
