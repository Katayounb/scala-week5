object Homework {
  println("===== Scala - Homework-Week5 - Katayoun B.  =====")
                                                  //> ===== Scala - Homework-Week5 - Katayoun B.  =====
  println("===== Max function  =====")            //> ===== Max function  =====
  def findmax(x: Int, y: Int ): Int = {if (x >= y) x else y }
                                                  //> findmax: (x: Int, y: Int)Int
  println(findmax(2,3))                           //> 3
  
  def callmax(a: Int, b: Int): Int = findmax(a, b)//> callmax: (a: Int, b: Int)Int
 
  println(callmax(6,5))                           //> 6
  
  println("===== Max Fibonacci  =====")           //> ===== Max Fibonacci  =====
   // 1- Write some code that prints out the first 10 values of the Fibonacci sequence.
	// This is the sequence where every number is the sum of the two numbers before it.
  
  
 var a = 0                                        //> a  : Int = 0
 var b = 1                                        //> b  : Int = 1
 var i = 0                                        //> i  : Int = 0

 while(i < 10) {
  println(a)
  val c = a + b
  a = b
  b = c
  i = i + 1
 }                                                //> 0
                                                  //| 1
                                                  //| 1
                                                  //| 2
                                                  //| 3
                                                  //| 5
                                                  //| 8
                                                  //| 13
                                                  //| 21
                                                  //| 34
  
  println("===== Homework part-1 =====")          //> ===== Homework part-1 =====
  def factorial(n: Int): Int = if (n == 0) 1 else n * factorial(n-1)
                                                  //> factorial: (n: Int)Int
  println(factorial(5))                           //> 120
 
  // Functions can take other functions as parameters
  def fact(x: Int, f: Int => Int) : Int = {	f(x) }
                                                  //> fact: (x: Int, f: Int => Int)Int

  println(fact(5, factorial))                     //> 120
  
  println("===== Homework part-2-a =====")        //> ===== Homework part-2-a =====
 
  	def myfanc(factorial: (Int) => Int, intList: List[Int]) = intList.foreach((x: Int) => println(factorial(x)))
                                                  //> myfanc: (factorial: Int => Int, intList: List[Int])Unit
 
  println(myfanc(factorial, List(1,2,3,4,5)))     //> 1
                                                  //| 2
                                                  //| 6
                                                  //| 24
                                                  //| 120
                                                  //| ()
  println("===== Homework part-2-b =====")        //> ===== Homework part-2-b =====
  	
  	var nextlist = List(1,2,3,4,5)            //> nextlist  : List[Int] = List(1, 2, 3, 4, 5)
  	println(factorial(nextlist.reduce((x, y) => x max y)))
                                                  //> 120
  	println("===== Homework part-2-c =====")  //> ===== Homework part-2-c =====
  	println(myfanc(factorial, (1 to 10 ).toList))
                                                  //> 1
                                                  //| 2
                                                  //| 6
                                                  //| 24
                                                  //| 120
                                                  //| 720
                                                  //| 5040
                                                  //| 40320
                                                  //| 362880
                                                  //| 3628800
                                                  //| ()

	println("===== Homework part-3-1 =====")  //> ===== Homework part-3-1 =====
  //var divisible_by_4 = List.range(1,46).filter(_ % 4 == 0)
	println((List.range(1,46).filter(_ % 4 == 0)).sum)
                                                  //> 264
	
 println("===== Homework part-3-2 =====")         //> ===== Homework part-3-2 =====
 var divisible_by_3 = List.range(1,20).filter(_ % 3 == 0)
                                                  //> divisible_by_3  : List[Int] = List(3, 6, 9, 12, 15, 18)
 //println((List.range(1,20).filter(_ % 3 == 0)).sum)
def sqr(x: Int) = x * x                           //> sqr: (x: Int)Int
println(divisible_by_3.map(sqr))                  //> List(9, 36, 81, 144, 225, 324)

println((divisible_by_3.map(sqr)).sum)            //> 819
	
}