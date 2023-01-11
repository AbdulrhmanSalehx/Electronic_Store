package com.world.elctronicstore.KotlinCode
import java.time.*
open class HandHeld (seriaNum:String, type:String, dc:Double, manufacturer:Manufacturer?, manufacturingDate:LocalDate,
val owner:Customer, val weight:Double): ElectronicDevice(seriaNum, type, dc, manufacturer,
manufacturingDate) {
                     var os:OperatingSystem=OperatingSystem.Andoriod
                     var screenSize:String="Not initialized"
    constructor(seriaNum:String, type:String, dc:Double, manufacturer:Manufacturer?, manufacturingDate:LocalDate,
                owner:Customer, weight:Double, OperatingSys:OperatingSystem,
                screenSize:String):this(seriaNum, type, dc, manufacturer, manufacturingDate,
        owner, weight){
        this.os=OperatingSys
        this.screenSize=screenSize
    }
    fun getAge(): Pair<String, String> {
        if (manufacturingDate != null) {
            var age: Period = Period.between(manufacturingDate, LocalDate.now())
            return Pair("${age.getYears()} years"," ${age.getMonths()} month/s")
        } else {
            return Pair("0", "0")
        }
    }
}