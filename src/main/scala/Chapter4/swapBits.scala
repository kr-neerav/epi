package org.epi.Chapter4

object swapBits {
    def swapBitsInInpt(inpt: Int, idx1: Int, idx2: Int): Int = {
        val maskForIds = 1<<idx1 | 1<<idx2
        if ((inpt>>idx1 &1) == (inpt>>idx2 &1)) inpt
        else inpt ^ maskForIds
    }
}

