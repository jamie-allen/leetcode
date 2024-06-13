object Solution {
    val romanNumerals = Map(('I', 1), ('V', 5), ('X', 10), ('L', 50), ('C', 100), ('D', 500), ('M', 1000))

    def romanToInt(s: String): Int = {
        println("EVALUATING: " + s)
        var retVal: Int = 0
        var prevChar: Char = 'A'
        for (c <- s) {
            c match {
                case 'M' => {
                    if (prevChar.equals('C')) {
                        println("Found C before M")
                        retVal -= 100
                        retVal += 900
                    }
                    else
                        retVal += 1000
                }
                case 'D' => {
                    if (prevChar.equals('C')) {
                        println("Found C before D")
                        retVal -= 100
                        retVal += 400
                    }
                    else
                        retVal += 500
                }
                case 'C' => {
                    if (prevChar.equals('X')) {
                        println("Found X before C")
                        retVal -= 10
                        retVal += 90
                    }
                    else
                        retVal += 100
                }
                case 'L' => {
                    if (prevChar.equals('X')) {
                        println("Found X before L")
                        retVal -= 10
                        retVal += 40
                    }
                    else
                        retVal += 50
                }
                case 'X' => {
                    if (prevChar.equals('I')) {
                        println("Found I before X")
                        retVal -= 1
                        retVal += 9
                    }
                    else
                        retVal += 10
                }
                case 'V' => {
                    if (prevChar.equals('I')) {
                        println("Found I before V")
                        retVal -= 1
                        retVal += 4
                    }
                    else
                        retVal += 5
                }
                case 'I' => retVal += 1
            }
            prevChar = c
        }
        retVal
    }
}