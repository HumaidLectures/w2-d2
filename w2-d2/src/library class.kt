import kotlin.properties.Delegates

fun main() {
    println("please enter your name: ")
    val name = readLine()
    println("please enter your ID: ")
    val ID = readLine()?.toInt()

    var x:Int? = 1

    val library = Library(name,ID)

    while ( x == 1) {
        println("please enter the book name: ")
        val newBookName = readLine()

        println("please enter the book section: ")
        val newBookSection = readLine()

        library.addBook(newBookName, newBookSection)

        println("if you want to add another book please type 1, if not just type any number")
        x = readLine()?.toInt()
    }


    println("type the name of the book that you want to check the availability of: ")
    val isThere = readLine()

    val response = library.availablitiy(isThere)

    if (response){
        println("you already have $isThere ")
        }else {
            println("you don't have $isThere")
    }

    println("type the book name you want to buy: ")
    val buybook = readLine()

    library.buyBook(buybook)

    library.printInfo()


}

class Library (name:String?,ID:Int?){
    val books = mutableMapOf<String?,String?>()
    var bookCount = books.size

    init {
        println("Welcom $name, your ID is $ID")
    }

    fun addBook (bookName:String?,bookSection:String?){

        if (books.containsKey(bookName)){
            println("$bookName already exists")
        }else {
            bookName?.lowercase()
            bookSection?.lowercase()
            books.put(bookName,bookSection)
            bookCount++
//            println("you new library contains: $books")
//            println("the number of your books now is: $bookCount")
        }
    }

    fun availablitiy (bookName: String?):Boolean {

        return books.containsKey(bookName)

    }

    fun printInfo(){
        println("the books are $books")
        println("the library contains $bookCount books")
    }

    fun buyBook(name: String?){
        println("type the name of the book you want to buy: ")

        if (books.containsKey(name)){
            println("$name book exists")
            books.remove(name)
            bookCount--
        } else {
            println("$name book does not exist in the library")
        }


    }


}