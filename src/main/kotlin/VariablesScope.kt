val top = "Top-level variable"

fun main() {

    // // Variables in loops are restricted by scope to the loop
    var outer = 5
    while (outer < 10) {
        var inner = 10
        inner *= 2
        print(inner)
        outer++
    }  // prints 2020202020

//    print(inner) // Unresolved reference because the scope is restricted to the while loop

    localScope()
    val identifier = "Variable in the function Main()"
    println(identifier) // prints "Variable the function main()"


// Interaction of Scopes
    var id = 5  // id (outer scope) = 5
    if (true) {
        id = 6  // id (outer scope) = 6
        var id = 10  // id (inner scope) = 10
        println(id)  // prints inner id
    }
    println(id)  // prints outer id

    println(top)  // prints "Top-level variable"
}

// Variables in functions are restricted by scope to the function
fun localScope() {
    val identifier = "Variable in the function localScope()"
    println(identifier)  // prints "Variable in the function localScope()"
    println(top)  // prints "Top-level variable"
}

//If scope B is nested in scope A, then identifiers from scope A can be used in scope B without additional declarations.
//
//If any identifiers are defined in such nested scope B, they are not visible in scope A.
//
//The called identifier is first searched in the current scope and then in scopes up the hierarchy.