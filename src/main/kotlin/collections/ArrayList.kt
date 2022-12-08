package collections

fun main() {
    /*add(index:Int, element: E): Boolean*/
    //create ner arraylist
    val arrayList = ArrayList<String>()
    //add element
    arrayList.add("Geeks")
    arrayList.add("Geeks")
    println("Array List -->")
    // iterating the list
    for (i in arrayList) {
        println(i)
    }
    arrayList.add(1, "For")
    println("Array After Insertion -->")
    for (i in arrayList) {
        println(i)
    }
    /*AddAll(index: Int, elements: Collection): Boolean*/
    // creating empty arraylist using constructor
    val arrayList2 = ArrayList<String>()
    //adding an element
    arrayList.add("Geeks")
    arrayList.add("For")
    arrayList.add("Geeks")
    //Creating new arraylist
    val arrayList3 = ArrayList<String>()
    //adding all elements from arraylist2 to arraylist3
    arrayList3.addAll(arrayList2)
    for (x in arrayList3)
        println(x)

    /* get(index: Int): E
       It is used to return the element at specified index in the list.*/
     //creating empty arraylist using constructor
    val arrayList4 = ArrayList<Int>()
    //add element
    arrayList4.add(10)
    arrayList4.add(20)
    arrayList4.add(30)
    arrayList4.add(40)
    arrayList4.add(50)
    //iterating trough arrayList4
    for (z in arrayList4)
        print("$z ")
    println()
    println("Accessing the index 2 of arraylist: "+ arrayList4.get(3))
    //println("Accessing the index 2 of arraylist: " + arrayList4[2])

    /*set(index: Int, element: E):E
    * It is used to replace the element from the specified
    *  position from current list with the specified element passed as arguments*/
    //creating new ArrayList
    val arrayList5 = ArrayList<String>()
    //add some element
    arrayList5.add("Geeks")
    arrayList5.add("For")
    arrayList5.add("Geeks")
    arrayList5.add("Portal")
    //iterating trough element in arraylist
    for (c in arrayList5)
        print("$c ")
    println()
    // set the element at index 3 with new string
    arrayList5.set(3,"A computer Science portal for students")
    //arrayList5[3] = "A computer Science portal for students"
    for (c in arrayList5)
        print("$c ")
    println()

    /*
    * indexOf(element: E): Int
    * It is used to return the index of first
    * occurrence of specified element in the list, and it returns -1 if the specified element
    *  in not present in the list. */
    //creating new ArrayList
    val arrayList6 = ArrayList<String>()
    //add element
    arrayList6.add("Muhamad")
    arrayList6.add("Ridwan")
    arrayList6.add("Ramdani")
    //iterating trough element
    for (v in arrayList6)
        print("$v ")
        println()
        println("The index of the element Ridwan is : "+arrayList6.indexOf("Ridwan"))

    /*remove(element: E): Boolean
    It is used to remove the first occurrence of the specific element from current collection,
    if it is available. Similarly, for removing element at index i we use removeAt(index) */
    // creating empty arraylist using constructor
    val arraylist7=ArrayList<String>()
    // adding elements
    arraylist7.add("Geeks")
    arraylist7.add("for")
    arraylist7.add("Geeks")

    arraylist7.remove("for" )
    // iterating through the elements
    for(b in arraylist7)
        print("$b ")
        println()
    /*clear()
````It is used to remove all the elements from the list. */
    // creating empty arraylist using constructor
    val arraylist8=ArrayList<Int>()
    // adding elements
    arraylist8.add(10)
    arraylist8.add(20)
    arraylist8.add(30)
    arraylist8.add(40)
    arraylist8.add(50)

    // iterating through the elements
    for(n in arraylist8)
        print("$n ")
    arraylist8.clear()
    println()
    println("The size of arraylist after clearing all elements: "+arraylist8.size)
}