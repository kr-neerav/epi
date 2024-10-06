import org.scalatest.funsuite.AnyFunSuite
import org.epi.Chapter4.* 


class parityTest extends AnyFunSuite {
    test("parity for 8388608 is 1") {
        assert(parity.parityCheck(8388608) == 1)
    }

    test("parity for 19 is 1") {
        assert(parity.parityCheck(19) ==1)
    }

    test("parity for 255 is 0") {
        assert(parity.parityCheck(255) == 0)
    }
    
}
