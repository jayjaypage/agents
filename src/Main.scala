

object Main extends App {

class Atom(val m: Double,val r: Double, val ele: String, var pos: Array[Double], var vel: Array[Double]) {
  val mu: Double = 1.660539066e-27 // atomic mass conversion into kg

  val mass: Double = m * mu
  val radius: Double = r
  val element: String = ele
  var position: Array[Double] = pos
  var velocity: Array[Double] = vel

  def computeNextPosition(dt:Double): Unit = {
    for (i <- position.indices){
      position(i) += velocity(i) * dt
    }
  }
}

  val firstAtom: Atom = new Atom(1.008, 53 * 1e-12, "H", Array(0.0,0.0,0.0), Array(1.0,0.0,-1.0))
  val secondAtom: Atom = new Atom(15.999, 48 * 1e-12, "O", Array(0.0,0.0,0.0), Array(0.0,0.0,0.0))
  for (t: Int <- 1 to 10 ){
    firstAtom.computeNextPosition(1.0)
    println(s"${firstAtom.position.mkString("Array(", ", ", ")")}")
  }

}