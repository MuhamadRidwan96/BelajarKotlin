package collections

fun main() {
    val captains = setOf(1,2,3,4,"Kohli","Smith","Root","Malinga","Rohit","Dhawan")

    println("The element at index 2 is: "+captains.elementAt(2))

    println("The index of element is: "+captains.indexOf("Smith"))

    println("The last index of element is: "+captains.lastIndexOf("Rohit"))

    /*
    * Set first and last element –
    We can get the first and element of a set using first() and last() functions. */
    val capitals = setOf(1,2,3,4,"Kohli","Smith",
        "Root","Malinga","Rohit","Dhawan")

    println("The first element of the set is: "+capitals.first())

    println("The last element of the set is: "+capitals.last())

    /*Set Basics –
    Here we will discuss basics functions like count(), max(), min(), sum(), average(). */
    val num = setOf(1 ,2, 3, 4, 5, 6, 7, 8)

    println("The number of element in the set is: "+num.count())//count all element
    println("The maximum element in the set is: "+ num.maxOrNull())//max of element
    println("The minimum element in the set is: "+ num.minOrNull())//min of element
    println("The sum of the elements in the set is: "+num.sum())//sum each element
    println("The average of elements in the set is: "+num.average())//average of element

    /*contains() and containsAll() functions –
    Both the methods are used to check whether an element is present in the set or not? */

    var name = "Dhawan"
    println("The set contains the element $name or not? " + captains.contains(name))
    var num1 = 5
    println("The set contains the element $num1 or not? " + captains.contains(num1))
    println("The set contains the given elements or not? " + captains.containsAll(setOf(1,"Root","Rohit")))

}
