import scala.collection.mutable.Seq;//JavaConverters;
//import java.util.Collection;

public class Test {
    public static void main(String[] args) {
        // create instances
        Person p = new Person("Regina", "Goode");
        
        // demonstrate 'getter' methods
        System.out.println(p.getFirstName());
        System.out.println(p.getLastName());
        
    }
}
