package data

class Laptop(val name:String)

open class Handphone(val name: String)

class SmartWatch(name:String, os:String):Handphone(name)

