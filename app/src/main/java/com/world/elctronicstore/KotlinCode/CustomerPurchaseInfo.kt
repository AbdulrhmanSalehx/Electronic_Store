package com.world.elctronicstore.KotlinCode
import java.time.*
open class CustomerPurchaseInfo (val cust:Customer, val device:ElectronicDevice, val paymentType: PaymentType,
                                 val purchaseDate:LocalDate, val price:Double, var paidValue:Double, val warranty:Int){
    val isWarrantyIncluded:Boolean
        get() = if(warranty>0) true else false
    val isIndebted:Boolean
        get()= if(price>paidValue) true  else false
    val debt:Double=String.format("%.2f", price-paidValue).toDouble()
    fun getRemainingWarranty() : Pair<String, String> {
        if (isWarrantyIncluded) {
            var purchaseDate2:LocalDate=purchaseDate
            purchaseDate2=purchaseDate2.plusYears(warranty.toLong())
            if (purchaseDate2>LocalDate.now()){
                var age: Period = Period.between( LocalDate.now(), purchaseDate2)
                return Pair("${age.getYears()} years"," ${age.getMonths()} month/s")
            }
            else {
                return Pair("0", "0")
            }
        } else {
            return Pair("0", "0")
        }
    }
}