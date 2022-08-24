package Data

class Address {
    var street: String = ""
    var city: String = ""
    var country: String = "Indonesia"


    constructor(paramsStreet:String, paramCity:String){
        street = paramsStreet
        city = paramCity
    }

    constructor(paramsStreet: String,paramCity: String,paramCountry:String): this(paramsStreet,paramCity){
        country = paramCountry
    }
}