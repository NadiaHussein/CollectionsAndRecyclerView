package at.fh.swengb.collectionsandrecyclerview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        work()
    }

    class Student(val name: String, val currentSemester: Int) {
        override fun equals(other: Any?): Boolean {
            if (this === other) return true
            if (javaClass != other?.javaClass) return false

            other as Student

            if (name != other.name) return false
            if (currentSemester != other.currentSemester) return false

            return true
        }

        override fun hashCode(): Int {
            var result = name.hashCode()
            result = 31 * result + currentSemester
            return result
        }
    }

    fun work(){

        val mutableMyStudents = mutableListOf<Student>(Student("Rob", 5),
            Student("George", 2),
            Student( "Marcel", 3),
            Student("Lisa",4),
            Student("Lisa", 1))

        mutableMyStudents[3] = Student("Peter", 27)
        mutableMyStudents.add(Student("Lily", 6))

        Log.i("InfoStudent",mutableMyStudents[0].name)
        Log.i("InfoStudent",mutableMyStudents[1].name)
        Log.i("InfoStudent",mutableMyStudents[2].name)
        Log.i("InfoStudent",mutableMyStudents[3].name)
        Log.i("InfoStudent",mutableMyStudents[4].name)
        Log.i("InfoStudent",mutableMyStudents[5].name)
        Log.i("InfoStudent",mutableMyStudents[6].name)

        val studentSet = setOf<Student>(Student("Rob", 27),
            Student("Rob", 27),
            Student("Lisa", 4),
            Student("Marcel", 5),
            Student("Lily", 2))

     studentSet.forEach {Log.i("InfoStudentSet", it.name)  }



    }




}
