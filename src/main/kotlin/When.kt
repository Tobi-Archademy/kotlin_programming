
    fun main(){
        // When is used to perfect different actions depending on the value of a variable

        val (var1, op, var2) = readln().split(" ")

        val a = var1.toInt()
        val b = var2.toInt()

        when (op) {
            "+", "plus" -> println(a + b)
            "-", "minus" -> println(a - b)
            "*", "times" -> println(a * b)
            else -> println("Unknown operator")
        }


        // When as an expression
        val result = when (op) {
            "+" -> a + b
            "-" -> a - b
            "*" -> a * b
            else -> "Unknown operator"
        }
        println(result)


        // Passing the return variable directly to the println function
        println(when(op) {
            "+" -> a + b
            // ...
            else -> "Unknown operator"
        })


        // When as branching condition checker
        val (var_1, var_2, var_3) = readln().split(" ")

        val x = var_1.toInt()
        val y = var_2.toInt()
        val z = var_3.toInt()

        println(when (z) {
            x + y -> "$z equals $x plus $y"
            x - y -> "$z equals $x minus $y"
            x * y -> "$z equals $x times $y"
            else -> "We do not know how to calculate $z"
        })


        // Using When to check range of a variable
        val n = readln().toInt()
        when (n) {
            0 -> println("n is zero")
            in 1..10 -> println("n is between 1 and 10 (inclusive)")
            in 25..30 -> println("n is between 25 and 30 (inclusive)")
            else -> println("n is outside a range")
        }


        // When without arguments
        when {
            n == 0 -> println("n is zero")
            n in 100..200 -> println("n is between 100 and 200")
            n > 300 -> println("n is greater than 300")
            n < 0 -> println("n is negative")
            // else-branch is optional here
        }
    }