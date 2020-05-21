package myanswer

object bookstore {
  
   def main(args:Array[String]){
     var wholesalCost = bookprice(60) - discount(bookprice(60)) + shippingcost(60)
     println("wholesalCost = "+wholesalCost)
   }
   
   def bookprice(x:Int):Double={
     var price = x * 24.95
     return price
   }
   
   def discount(y:Double):Double={
     var discoun = y * 0.4
     return discoun
   }
   
   def shippingcost(z:Int):Double={
     var cost = 3*z + (z-50)*0.75
     return cost
   }
}