//import scala.collection.JavaConversions.asJavaCollection; // deprecated
package test;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class App{

    // java.util.List<Person> convert(scala.collection.Seq<Person> seq) {
    //     return WrapAsJava.seqAsJavaList(seq);
    // }
    
    public static List<Person> populateList(){
	return new ArrayList<Person>(Person.populateList());
    }

    public static void sortPeople(List<Person> people){
	Collections.sort(people);
    }

    public static void display(){
	List<Person> people = populateList();
	for(Person person : people){
	    System.out.println(person.firstN() + ", " + person.age());
	}
	sortPeople(people);
	for(Person person : people){
	    System.out.println(person.firstN() + ", " + person.age());
	}
    }

    public static void main(String[] args){
	display();
    }
    
}
