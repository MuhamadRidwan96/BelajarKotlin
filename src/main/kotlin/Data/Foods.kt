package Data

open class Foods(val name:String) {

    fun TheFoods(name: String){
        println("Food is $name,but better delicious is ${this.name}")
    }
}

class BestFoods(name: String) : Foods(name)

class BetterFoods(name: String) : Foods(name)