package com.world.elctronicstore.KotlinCode
import java.time.*
open class Mobile (seriaNum:String, dc:Double, manufacturer:Manufacturer?, manufacturingDate:LocalDate,
owner:Customer, weight:Double, OperatingSys:OperatingSystem,screenSize:String,
val celNumber:String):HandHeld(seriaNum, "Mobile", dc, manufacturer, manufacturingDate,
owner, weight, OperatingSys,screenSize){
}