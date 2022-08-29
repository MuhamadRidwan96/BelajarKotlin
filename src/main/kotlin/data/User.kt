package data

class User(var paramUsername:String, var paramPass: String) {

    override fun toString(): String {
        return "user with username = $paramUsername and password = $paramPass"
    }

}