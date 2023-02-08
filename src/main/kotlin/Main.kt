/*
    ID      : 30065695
    NAME    : Raihan Khalil Abdillah
    AT1 - Portfolio 1, Activity 4, Task C
    Ascii Art
 */

fun main(args: Array<String>) {

    print("Enter Rectangle width: ")                // start of rectangle
    val widthRect: Int = readln().toInt()
    print("Enter Rectangle height: ")
    val heightRect: Int = readln().toInt()

    for (i in 1..heightRect) {
        when (i) {
            1, heightRect -> repeat(widthRect) {                     // only first and last horizontal line will be printed
                print("#")
            }
            else -> for (j in 1..widthRect) {                      // will process whether the line 2 until height-1 prints sign or not
                when (j) {
                    1, widthRect -> print("#")                         // first and vertical sign prints
                    else -> print(" ")                                 // else, prints space
                }
            }
        }
        println()
    }

    print("Enter triangle height: ")                    // start of triangle
    val heightTri: Int = readln().toInt()

    for (i in 1..heightTri) {
        when (i) {
            heightTri -> repeat(heightTri) {      // final horizontal line of the triangle
                print("$")
            }
            else -> for (j in 1..heightTri) {
                when (j) {
                    1, i -> print("$")                // to print $ at the first iteration and value of i, which ++ every loop
                    else -> print(" ")                // else, print space
                }
            }
        }
        println()
    }
    println()
}





    
