import jdk.nashorn.internal.ir.annotations.Ignore
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class BoxTest {
        @Ignore
        @Test fun checkUnsealedBoxReturnsMeow() {
            val box = Box()
            assertEquals("Meow!", box.unsealTheBox())
        }
}
