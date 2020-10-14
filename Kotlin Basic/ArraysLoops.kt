
import java.util.*
import kotlin.math.pow

fun main() {
    val array = Array(7) {1000.0.pow(it)}
    val sizes = arrayOf("byte", "kilobyte", "megabyte", "gigabyte",
        "terabyte", "petabyte", "exabyte")
    for ((i, value) in array.withIndex()) {
        println("1 ${sizes[i]} = ${value.toLong()} bytes")
    }

    /*
    Which of these options are good reasons to explicitly make a list immutable?
    - It reduces errors in general.
    - Prevents accidental changing of objects that were meant to be unchangeable.
    - In a multi-threaded environment, makes the variable thread safe, because once it has been
     assigned by the initial thread, no thread can change it.
     */

    /*
    Basic example
    Create an integer array of numbers called numbers, from 11 to 15.
    Create an empty mutable list for Strings.
    Write a for loop that loops over the array and adds the string representation of each number to
     the list.
    Challenge example
    How can you use a for loop to create (a list of) the numbers between 0 and 100 that are
    divisible by 7?
     */

    var list3 : MutableList<Int> = mutableListOf()
    for (i in 0..100 step 7) list3.add(i)
    print(list3)
    
}