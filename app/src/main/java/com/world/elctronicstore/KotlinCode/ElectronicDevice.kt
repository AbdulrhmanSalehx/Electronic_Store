package com.world.elctronicstore.KotlinCode
import java.time.LocalDate
open class ElectronicDevice  (val seriaNum:String, val type:String, val dc:Double,
    val manufacturer:Manufacturer?, val manufacturingDate:LocalDate?){}