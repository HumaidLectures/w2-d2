/*
 add function for adding the hobbies for both student and teaching staff
 it can be more than one hobbie but can't be reapeted
 using late init
 first thing to appear "Hello, welcome to our university,\n your ID is  $ID \n
  your name is $name"

 */

fun main() {

    val humaid = Excercise("Humaid",201591730 , 2.06)
    humaid.hobbies("swimming")
    humaid.hobbies("swimming")
    humaid.hobbies("reading")
    println("your hobbies are ${humaid.hobbies}")



}

// in the class below (name:String,ID:Int,GPA:Double) is called a primary constructor

class Excercise (private var name:String, private var ID:Int, private var GPA:Double) {


    val hobbies = mutableListOf<String>()

    var y = "humaid"
        get () {return field.uppercase()  }
        set(value) {field = value.reversed()}

    lateinit var tDegree:String
    lateinit var addedHobbie: String


    fun hobbies (addedHobbies:String) {

        addedHobbie = addedHobbies
        addedHobbie.lowercase()
        if (!hobbies.contains(addedHobbie)) {
           hobbies.add(addedHobbie)
       }
        else {
            println("the hobbie $addedHobbie is already added")
       }
    }

    val courses = mutableListOf<String>()

    constructor(tName: String, tID: Int, tGPA: Double, degree: String) : this(name = tName, ID = tID, GPA = tGPA) {
        tDegree = degree

    }

    init {
        println("Hello, welcome to our university,\n your ID is  $ID \n your name is $name")
    }

    fun addCourse(courseName: String) {
        if (courses.contains(courseName)) {
            println("$courseName is already added ")

        } else {
            courses.add(courseName)
            println("$courseName added successfully")
        }
    }

    fun deleteCourse(courseName: String) {
        if (courses.contains(courseName)) {
            courses.remove(courseName)
            println("$courseName has been successfully removed")
        } else {
            println("you didn't register $courseName")
        }
    }

    fun printInfo() {
        if (!::tDegree.isInitialized) {
            println(
                "hi $name,\n you ID is $ID, \n and your GPA is $GPA, " +
                        "your registered courses are $courses"
            )
        } else {
            println(
                "hi $name,\n you ID is $ID, \n and your GPA is $GPA, \n" +
                        "your registered courses are $courses \n" +
                        "your degree is $tDegree")
        }
    }
    fun changeDegree (newDegree: String){
        tDegree = newDegree
    }
    fun changeName (newName: String){
        name = newName
    }
    fun changeID (newID: Int){
        ID = newID
    }
    fun changeGPA (newGPA: Double){
        GPA = newGPA
    }
}


