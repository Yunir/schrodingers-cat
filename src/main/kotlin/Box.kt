class Box {
    private var sealed = true;

    fun unsealTheBox() : String {
        if (sealed) {
            sealed = false;
            return checkCat()
        } else {
            return "Already unsealed"
        }
    }

    private fun checkCat() = if (Math.random() > 0.5) "Meow!" else "..."
}