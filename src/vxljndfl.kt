import java.util.*

class Pupil(){
    var name: String = ""
    var lastname : String = ""
    var midlename : String = ""
    var awards: MutableList<String> = mutableListOf()
    var storyaboutstuding: String = ""
    var datebirthday: Date = Date()
}
class Group(){
    var pupils: MutableList<Pupil> = mutableListOf()
    var nameofgroup: String = ""
}
class Kvant(s : String ){
    var groups: MutableList<Group> = mutableListOf()
    var nameofkvant: String = s
    var numberofcabinet: Int = 0
}
class KVANTORIUM(){
    var nameofkvantorium: String = ""
    var adress: String = ""
    var kvants: MutableList<Kvant> = mutableListOf()
}
fun main(){
    var AKvantorium = KVANTORIUM()
    for (i in 0..6)
        AKvantorium.kvants.add(Kvant(readLine()!!))
    for (i in 0..6)
        println(AKvantorium.kvants[i].nameofkvant)
}