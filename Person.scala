package test

// import scala.reflect.BeanProperty

class Person(val firstN: String,
	     val age: Int) extends Comparable[Person]{

  override def compareTo(other: Person) = {
     val ageCompare = this.age compareTo other.age
     if (ageCompare != 0) ageCompare
     else this.firstN compareTo other.firstN
  } 

}

object Person{
  def populateList() = {
    val rand = scala.util.Random
    val people = List("Angela","Julius","MrBrown","Thing1","Thing2")
    for(p <- people) yield {
      val age = rand.nextInt(50)
      new Person(p,age)
    }   
  }

  // def main(args: Array[String]): Unit = {
  //   populateList()
  // }
  

}