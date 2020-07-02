package example

/**
 * @author enaburekhan
 **/
object Functions {
  //  design of an application that finds the longest word in a collection and also returns it index

    /*def longestWord(words: Array[String]) = {

      var word = words(0)
      var idx = 0
      for ( i <- 1 until words.length)
      if (words(i).length > word.length) {
      word = words(i)
      idx = i
    
      
      }
      (word, idx)

    } */  

    // design of a simple Bank Account application

    class BankAccount {
      private  var bal: Double = 0.0
      def balance: Double = bal

      def deposit(amount: Double) = {
        require(amount > 0.0)
        bal += amount 
      }
      def withDraw(amount: Double): Boolean = 
        if (amount > bal) false
        else {
          bal -= amount
          println(bal)
          true
        }
    }

}
