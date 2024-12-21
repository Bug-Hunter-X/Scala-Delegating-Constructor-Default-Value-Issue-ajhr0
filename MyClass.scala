```scala
class MyClass(val x: Int) {
  def this() = this(0) // Delegating constructor
  def getX = x
}

object Main extends App {
  val myObj = new MyClass()
  val myObj2 = new MyClass(5)
  println(myObj.getX) // Output: 0
  println(myObj2.getX) // Output: 5
}
```