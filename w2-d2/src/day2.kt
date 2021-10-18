fun main() {

    val humaid = Excercise("Humaid",201591730 , 2.06)

//    humaid.addCourse("Math101")
//    humaid.addCourse("math101")
    humaid.printInfo()
//    humaid.deleteCourse("Math101")
//    humaid.printInfo()
//
   // val eid = University("eid",201991730,3.8 , "Phd")
//
//    eid.printInfo()
//
//    eid.changeDegree("Phd")
//
////    println(humaid.y)
//    humaid.y = "abcd"
//    println(humaid.y)



}

// in the class below (name:String,ID:Int,GPA:Double) is called a primary constructor

class University (private var name:String,private var ID:Int,private var GPA:Double) {



    var y = "humaid"
        get () {return field.uppercase()  }
        set(value) {field = value.reversed()}

    lateinit var tDegree:String

    val courses = mutableListOf<String>()

    constructor(tName: String, tID: Int, tGPA: Double, degree: String) : this(name = tName, ID = tID, GPA = tGPA) {
        tDegree = degree

    }

    init {
        println("$name Welcome to our university")
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


