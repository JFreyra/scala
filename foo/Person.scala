import scala.beans.BeanProperty
import scala.collection.Seq
import scala.collection.JavaConverters

class Person(@BeanProperty var firstName: String,
             @BeanProperty var lastName: String) {
    override def toString = s"Person: $firstName $lastName"
}