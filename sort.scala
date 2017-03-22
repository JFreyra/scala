package examples
/*taken from scala website + edited */
/** Quick sort, imperative style */
object sort {
  def sort(a: Array[Int]) {

    def swap(i: Int, j: Int) {
      val t = a(i); a(i) = a(j); a(j) = t
    }

    def sort1(l: Int, r: Int) {
      val pivot = a((l + r) / 2)
      var i = l
      var j = r
      while (i <= j) {
        while (a(i) < pivot) i += 1 //iterates until it finds the value on the left that is greater than or equal to middle value
        while (a(j) > pivot) j -= 1
        if (i <= j) { //checks bounds
          swap(i, j) //switches values so that they are in the correct half
          i += 1
          j -= 1
        }
      }
      if (l < j) sort1(l, j) //sorts the divided section
      if (j < r) sort1(i, r)
    }

    if (a.length > 0)
      sort1(0, a.length - 1)
  }

  def println(ar: Array[Int]) {
    def print1 = {
      def iter(i: Int): String =
        ar(i) + (if (i < ar.length-1) "," + iter(i+1) else "") //recursive function to print elements in array
      if (ar.length == 0) "" else iter(0)
    }
    Console.println("[" + print1 + "]")
  }

  def main(args: Array[String]) {
    val ar = Array(6, 2, 8, 5, 1)
    println(ar)
    sort(ar)
    println(ar)
  }

}
