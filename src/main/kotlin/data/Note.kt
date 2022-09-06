package data

class Note(title:String) {
    var title:String = title
        get() {
            println("Call getter function")
            return field
        }

        set(value) {
            println("Call Setter function")
            if (value.isNotBlank()){
                field = value
            }else{
                println("invalid title")
            }
        }

}

class BigTitle(val title: String){
    val bigTitle : String
        get() = title.toUpperCase()
}