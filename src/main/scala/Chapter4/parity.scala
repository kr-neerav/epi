package org.epi.Chapter4

object parity {
    def getParityFor4Bits(inpt: Int): Int = {
        val oddParitySet = Set(1,2,4,7,8,11,13,14)
        if (oddParitySet.contains(inpt)) 1 else 0
    }
    
    def parityCheck(n: Int): Int = {
        def go(inpt: Int, parityTillNow: Int): Int = {
            //extract last 4 bits from the inputs
            val last4Bits = inpt&15
            val restOfNum = inpt>>4
            //calculate parity for last 4 bits and XOR will parity till now to calculate the parity
            if (inpt == 0) parityTillNow else go(restOfNum, getParityFor4Bits(last4Bits)^parityTillNow)
        }
        go(n,0)
    }
}

