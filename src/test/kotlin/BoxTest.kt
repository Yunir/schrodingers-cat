import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class BoxTest {
        @Test fun checkUnsealedBoxReturnsMeow() {
            val box = Box()
            assertEquals("Meow!", box.unsealTheBox())
        }
}
