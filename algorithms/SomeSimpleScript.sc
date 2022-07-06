

def print_a_message(message: String) {
    println(message)
}

def get_power_of_two(num: Double): Double = {
    return scala.math.pow(num, 2)
}

def return_tuple(): (String, Double) = {
    val s: String = "some string"
    val d: Double = 1.2234
    return (s, d)
}

println("This is a simple script")

println("I can write stuff on the global scope of the file")

println("I can run the script with: amm MyScript.sc")

print_a_message("some other message")

for (i <- Range.inclusive(0, 10)) {
    print_a_message("number" + i)
}

val t = (1.0, true, "Third")

println("8 to the power of 2 = " + get_power_of_two(8))

println(return_tuple())