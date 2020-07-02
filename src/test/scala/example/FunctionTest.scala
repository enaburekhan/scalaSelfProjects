package example

import org.scalatest.WordSpec
import example.Functions.BankAccount



class FunctionsSpecs extends WordSpec {

  /*test("oddNumber") {
    val odd = Functions.oddNumber(3)
    assert(odd)

  } */

  /*val longest =  Functions.longestWord("the quick browner fox".split(" "))

      "The longestWord function method should return the longest word in the collection" in {
          assert(new browner,2 )
      }
       
   */

   val account = new Functions.BankAccount
   "one should be able to deposit money on the bank account and make withdraws if current balance is greater than amount to be withdraw" in {
   account.deposit(160)
   assert(account.withDraw(80) == true)
   assert(account.withDraw(80) == true)
   }
}
