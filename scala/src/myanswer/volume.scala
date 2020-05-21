package myanswer

object volume {

  def main(args:Array[String])
  {
    var volum = find(3.0)
    println("Volume = "+volum)
  }
  def find(r:Double):Double={
    var x =4.0/3.0 * math.Pi *r * r * r
    return x
  }
 
}