package lectures

/**
  * Created by Anurag.Das on 8/20/2021.
  */
object Strings_Practice extends App{

  //Scala String appears to be just a Java String
  //String instances also have access to all the methods of the StringOps class

//  if(false) {
//    //String eqaulity
//    val str1 = "abc"
//    val str2 = "a" + "bc"
//    val str3 = null
//    val str4 = "ABC"
//
//    //Guess the output
//    println(str1 == str2)
//    println(str1 == str3)
//    println(str1 == str4)
//    println(str1.toUpperCase() == str2.toUpperCase)
//    println(str1.equalsIgnoreCase(str2))
//  }
//
//  //Multiline String
//  if(false){
//
//    //Guess the output
//    println("""This is
//      me trying to
//      print something""")
//
//    println("""This is
//      |me trying to
//      |print something""".stripMargin)
//
//    println("""This is
//              %me trying to
//              %print something""".stripMargin('%'))
//
////    println("""This is
////        |me trying to
////        |print something""".stripMargin.replaceAll("\n"," "))
//
//  }
//
//  //Splitting String
//  if(false){
//
//    ("This is my first split").split(" ").foreach(println(_))
//    val x=("This,is my, second , split")
//      x.split(",") //Homogenuos mutable Array
//      x.split(",").toList.map(_.trim).foreach(println(_)) //in function programming we should use immutable collections
//
//  }
//
//  //String interpolation
//  if(false){
//
//    val name = "Tom"
//    val age = 32
//
//    //Guess the output
//    println("My name is $name and my age is $age")
//    println(s"My name is $name and my age is $age")
//    println(f"My name is $name and my age is $age%.2f")
//    println(s"My name is $name \n and my age is $age")
//    println(raw"My name is $name \n and my age is $age")
//
//  }
//
//  //map with String
//  if(true){
//
//    val str = "This is a string"
//
//    //Guess the output
//    str.toUpperCase.foreach(println(_))
//    println(str.toUpperCase())
//    println(str.map(s => s.toUpper))
//    println(str.map(_.toUpper))
//
//    def strUpper(c:Char):Char ={c.toUpper}   //method
//    println(str.map(s => strUpper(s)))
//    println(str.map(strUpper))
//
//    val strUpperFunc = (c:Char) => {c.toUpper} //function
//    println(str.map(x => strUpperFunc))
//    println(str.map(x => strUpperFunc(x)))
//    println(str.map(strUpperFunc))
//
//    println(str.map(s => if(s == 'i') s.toUpper else s))
//    println(str.map(s => if(s != 'i') s.toUpper else s))
//
//    val alpha = "abcdefg"
//    println(alpha.map(_.toByte).map(_.+(1)).map(_.toChar).mkString(""))
//    println(alpha.map(str => (str + 1).toChar))
//
//  }
//
//  //find string pattern
// if(false) {
//   val pattern = "[0-9]+".r
//   val str = "123 comes before 456"
//   pattern.findFirstIn(str).foreach(println(_))
//   pattern.findAllIn(str).foreach(println(_))
// }
//
//  //string substitution
// if(true){
//
//   val str = "123 comes before 456"
//
//   println(str.replace("[0-9]","x"))
//   println(str.replaceAll("[a-z]","x"))
//   println(str.replaceAll("be","x"))
//
////   val pattern1 = "([0-9]) ([a-z][A-Z])".r
////   val pattern1(num,letter)=  str
//
//   println(str(2))
//   println(str.charAt(2))
//   println(str.apply(2))
// }

  val str = "This is a String"
  println(str.charAt(3))

}
