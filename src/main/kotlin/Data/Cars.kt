package Data

class Cars(paramsType:String,paramsBrand:String, paramsYear:Int = 2020){
    //initializer Block
    init {
        println("Car $paramsBrand make at")
    }

    constructor(paramsType: String,paramsBrand: String):this(paramsType,paramsBrand,2022){
        println("Secondary constructor 1")
    }

    constructor(paramsType: String):this(paramsType,"WULING"){
        println("secondary constructor 2")
    }

    var type: String = paramsType
    var brand: String = paramsBrand
    var year: Int = paramsYear


}