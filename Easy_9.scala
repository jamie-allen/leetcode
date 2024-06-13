object Solution {
    def isPalindrome(x: Int): Boolean = {
        println("Starting! x: " + x)
        if (x < 0)
            return false

        println("x is not negative! x: " + x)
        if (x >= 0 && x < 10) 
            return true

        println("x is not a single digit! x: " + x)
        val xString: String = x.toString
        if (x < 100) {
            println("Less than 100, checking if same digits")
            if (xString(0).toString.equals(xString(1).toString))
                return true
            else
                return false
        }

        var tempTuple = ("0", "0")
        if (xString.length % 2 == 0) {
            println("x has an even length!")
            tempTuple = xString.splitAt((xString.length / 2))
            println("x has an even length! tempTuple: " + tempTuple)
        }
        else {
            tempTuple = xString.splitAt((xString.length / 2) + 1)
            tempTuple = (tempTuple._1.init, tempTuple._2)
            println("x has an odd length! tempTuple: " + tempTuple)
        }

        println("Have tuple: " + tempTuple)
        if ((tempTuple._1).equals(tempTuple._2.reverse))
            return true
        else
            return false
    }
}