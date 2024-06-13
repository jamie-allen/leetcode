object Solution {
    def appendCharacters(s: String, t: String): Int = {
        var retVal: Long = 0
        var index: Long = 0
//        println("Starting! s: " + s + ", and t: " + t)
        while (index < t.length) {
            val tLetter = t(index)
            println("Current letter: " + tLetter)
            if (s.indexOf(tLetter) == -1) {
                println("Letter NOT FOUND!")
                retVal = t.drop(index).length
                index = t.length
                println("SHOULD EXIT, retVal: " + retVal)
            }
            else 
                println("Letter found at position: " + index + ", IGNORING")
            index += 1
        }
        return retVal
    }
}