object pairs {
  def isPrime : Boolean = true
  val n = 7
  (1 until n) flatMap (i =>
    (1 until i) map (j => (i, j))) filter(pair => isPrime(pair._1 + pair._2))


}