package com.knoldus

object Reverse{

  //method to reverse a list of elements without using mutable variable
  def reverseList(inputListToReverse: List[Int]): List[Int] = {
    // If the input list is empty, it will return it as it is.
    if(inputListToReverse==List()) {
      inputListToReverse
    }
    else {
      /*
        recursively calling reverseList method on the tail(i.e. elements except the head or first element of the given list)
        of given list and appending the head or first element of the same list at the end of the List returned by reverseList method.
      */
      reverseList(inputListToReverse.tail) :+ inputListToReverse.head
    }
  }

  def main(args: Array[String]): Unit = {
    val givenList= List(3,4,8,7,9,6,2,1,5)
    val reversedList= reverseList(givenList)
    println("Reverse of "+givenList+" is "+reversedList)
  }
}
