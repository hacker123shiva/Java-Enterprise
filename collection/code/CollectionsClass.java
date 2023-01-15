import java.util.ArrayList;
import java.util.TreeSet;
import java.util.Collections;
 
public class CollectionsClass {
    public static void main(String []args){
        TreeSet ts1=new TreeSet();
        ts1.add(4);
        ts1.add(1);
        ts1.add(3);
        ts1.add(6);
        ts1.add(0);
        ts1.add(0);
        System.out.println(ts1);
        /*[0, 1, 3, 4, 6]  ->Sorted order */

        ArrayList al1=new ArrayList();
        al1.add(2);
        al1.add(4);
        al1.add(1);
        al1.add(5);
        al1.add(9);
        al1.add(3);
        // al1.add("shiva");   //java.lang.ClassCastException: class java.lang.Integer cannot be cast to class java.lang.String (
        System.out.println(al1);

        Collections.sort(al1); //complex data are in arraylist therefore throw exception
        System.out.println(al1);

        Collections.shuffle(al1);
        System.out.println(al1);

        System.out.println(Collections.min(al1));
        System.out.println(Collections.max(al1));
        System.out.println(Collections.frequency(al1,2));
        System.out.println(Collections.binarySearch(al1, 3));
        
        //important util class name 
        //Collections ---- > Collections is a class in java.util
        
        /*
         Collections important methods 
            1. sort()
            2. shuffle()
            3. min()
            4. max()
            5. reverse()
            6. binarySearch()
            7. frequency()
            8. copy()
            9. swap()
            10. fill()
            11. disjoint()
            12. rotate()
            13. replaceAll()
            14. indexOfSubList()
            15. lastIndexOfSubList()
            16. unmodifiableList()
            17. unmodifiableSet()
            18. unmodifiableMap()
            19. unmodifiableCollection()
            20. unmodifiableSortedSet()
            21. unmodifiableSortedMap()
            22. synchronizedList()
            23. synchronizedSet()
            24. synchronizedMap()
            25. synchronizedCollection()
            26. synchronizedSortedSet()
            27. synchronizedSortedMap()
            28. checkedList()
            29. checkedSet()
            30. checkedMap()
            31. checkedCollection()
            32. checkedSortedSet()
            33. checkedSortedMap()
            34. emptyList()
            35. emptySet()
            36. emptyMap()
            37. emptySortedSet()
            38. emptySortedMap()
            39. singletonList()
            40. singletonSet()
            41. singletonMap()
            42. singletonSortedSet()
            43. singletonSortedMap()
            44. nCopies()
            45. reverseOrder()
            46. reverseOrder(Comparator)
            47. enumeration()
            48. list()
            49. frequency()
            50. disjoint()
            51. addAll()
            52. newSetFromMap()
            53. asLifoQueue()
            54. asLifoQueue(Deque)
            
         */
        //Arrays
        /*
         * Arrays important methods used for  array  data type 
            * 1. sort()
            * 2. binarySearch()
            * 3. fill()
            * 4. copyOf()
            * 5. copyOfRange()
            * 6. equals()
            * 7. deepEquals()
            * 8. hashCode()
            * 9. deepHashCode()
            * 10. toString()
            * 11. deepToString()
            * 12. asList()
            * 13. setAll()
            * 14. parallelSetAll()
            * 15. parallelPrefix()
            * 16. parallelSort()


         */
        //Math
        // Math important methods 
        /*
         * 1. abs()
         * 2. acos()
         * 3. asin()
         * 4. atan()
         * 5. atan2()
         * 6. cbrt()
         * 7. ceil()
         * 8. copySign()
         * 9. cos()
         * 10. cosh()
         * 11. exp()
         * 12. expm1()
         * 13. floor()
         * 14. getExponent()
         * 15. hypot()
         * 16. IEEEremainder()
         * 17. incrementExact()
         * 18. log()
         * 19. log10()
         * 20. log1p()
         * 21. max()
         * 22. min()
         *  23. multiplyExact()
         * 24. negateExact()
         * 25. nextAfter()
         * 26. nextDown() 
         *
         */
        //Random
       
        //Scanner
        //StringTokenizer
        //StringBuffer
        //StringBuilder
        //Date
        //Calendar
        //TimeZone
        //Locale
        //ResourceBundle
        //System   ---- > System is a class in java.lang package
        //Runtime
        //Process
        //Thread
        //ThreadGroup
        //ThreadLocal
 
    // System is a class in java.lang package
        
          


        




    }
}
