
fun main() {


    var welcomeMessage = "Hello and welcome to Kotlin"
    when (welcomeMessage.length) {
        0 -> println("Nothing to say?")
        in 1..50 -> println("Perfect")
        else -> print("Too long!")
    }

    /*
        Practice Time
        Create three String variables for trout, haddock, and snapper.
        Use a String template to print whether you do or don't like to eat these kinds of fish.
     */

    val trout : String = "trout"
    var haddock  : String = "haddock"
    var snappper: String = "snappper"
    println("I like to eat $trout and $snappper, but not a big fan of $haddock.")

    /*
    when statements in Kotlin are like case or switch statements in other languages.

    Create a when statement with three comparisons:

    If the length of the fishName is 0, print an error message.
    If the length is in the range of 3...12, print "Good fish name".
    If it's anything else, print "OK fish name".
     */

    var fishName = "Memo"
    when (fishName.length) {
        0 -> println("Error")
        in 3..12 -> println("Good fish name")
        else -> println("OK fish name")
    }


}