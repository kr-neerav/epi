import org.scalatest.funsuite.AnyFunSuite
import org.epi.Chapter4.* 
import org.epi.Chapter4.swapBits.swapBitsInInpt

class swapBitsTest extends AnyFunSuite {
    val idx1 = 3
    val idx2 = 14
    val msk = 1<<idx1 | 1<<idx2
    test("returns same number when bits to swap have same value, 1 in this case") {
        val inpt = 346354
        val finalInpt = inpt | msk
        assert(swapBitsInInpt(finalInpt, idx1, idx2) == finalInpt)
    }

    test("returns same number when bits to swap have same value, 0 in this case") {
        val inpt = 346354
        val finalInpt = inpt & ~msk
        assert(swapBitsInInpt(finalInpt, idx1, idx2) == finalInpt)
    }

    test("returns number with swapped bits when bits to swap have different value"){
        val finalInpt = 21479
        assert(swapBitsInInpt(finalInpt, idx1, idx2) == 5103)
    }
}