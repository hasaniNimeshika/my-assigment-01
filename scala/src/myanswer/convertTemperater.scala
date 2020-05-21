package myanswer

object convertTemperater {
  
  def main(args:Array[String])
  {
    var fahrenheit = convert()
    println("fahrenheit = "+fahrenheit)
 
  }
    var celcius:Int = 35
  
  def convert():Double={
      
    var x = celcius * 1.8000 + 32.00
    return x
  }
  
  
  
  
}