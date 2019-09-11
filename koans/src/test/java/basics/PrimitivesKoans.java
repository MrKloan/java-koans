package basics;

import com.sandwich.koan.Koan;

import static com.sandwich.koan.constant.KoanConstants.__;
import static com.sandwich.util.Assert.assertThat;

public class PrimitivesKoans {

    @Koan
    void wholeNumbersAreOfTypeInt() {
        assertThat(getType(1)).isEqualTo(__); // hint: int.class
    }

    @Koan
    void primitivesOfTypeIntHaveAnObjectTypeInteger() {
        Object number = 1;
        assertThat(getType(number)).isEqualTo(__);

        // Primitives can be automatically changed into their object type via a process called auto-boxing
        // We will explore this in more detail in intermediate.AboutAutoboxing
    }

    @Koan
    void integersHaveAFairlyLargeRange() {
        assertThat(Integer.MIN_VALUE).isEqualTo(__);
        assertThat(Integer.MAX_VALUE).isEqualTo(__);
    }

    @Koan
    void integerSize() {
        assertThat(Integer.SIZE).isEqualTo(__);  // This is the amount of bits used to store an int
    }

    @Koan
    void wholeNumbersCanAlsoBeOfTypeLong() {
        assertThat(getType(1L)).isEqualTo(__);
    }

    @Koan
    void primitivesOfTypeLongHaveAnObjectTypeLong() {
        Object number = 1L;
        assertThat(getType(number)).isEqualTo(__);
    }

    @Koan
    void longsHaveALargerRangeThanInts() {
        assertThat(Long.MIN_VALUE).isEqualTo(__);
        assertThat(Long.MAX_VALUE).isEqualTo(__);
    }

    @Koan
    void longSize() {
        assertThat(Long.SIZE).isEqualTo(__);
    }

    @Koan
    void wholeNumbersCanAlsoBeOfTypeShort() {
        assertThat(getType((short) 1)).isEqualTo(__); // The '(short)' is called an explicit cast - to type 'short'
    }

    @Koan
    void primitivesOfTypeShortHaveAnObjectTypeShort() {
        Object number = (short) 1;
        assertThat(getType(number)).isEqualTo(__);
    }

    @Koan
    void shortsHaveASmallerRangeThanInts() {
        assertThat(Short.MIN_VALUE).isEqualTo(__);  // hint: You'll need an explicit cast
        assertThat(Short.MAX_VALUE).isEqualTo(__);
    }

    @Koan
    void shortSize() {
        assertThat(Short.SIZE).isEqualTo(__);
    }

    @Koan
    void wholeNumbersCanAlsoBeOfTypeByte() {
        assertThat(getType((byte) 1)).isEqualTo(__);
    }

    @Koan
    void primitivesOfTypeByteHaveAnObjectTypeByte() {
        Object number = (byte) 1;
        assertThat(getType(number)).isEqualTo(__);
    }

    @Koan
    void bytesHaveASmallerRangeThanShorts() {
        assertThat(Byte.MIN_VALUE).isEqualTo(__);
        assertThat(Byte.MAX_VALUE).isEqualTo(__);

        // Why would you use short or byte considering that you need to do explicit casts?
    }

    @Koan
    void byteSize() {
        assertThat(Byte.SIZE).isEqualTo(__);
    }

    @Koan
    void wholeNumbersCanAlsoBeOfTypeChar() {
        assertThat(getType((char) 1)).isEqualTo(__);
    }

    @Koan
    void singleCharactersAreOfTypeChar() {
        assertThat(getType('a')).isEqualTo(__);
    }

    @Koan
    void primitivesOfTypeCharHaveAnObjectTypeCharacter() {
        Object number = (char) 1;
        assertThat(getType(number)).isEqualTo(__);
    }

    @Koan
    void charsCanOnlyBePositive() {
        assertThat((int) Character.MIN_VALUE).isEqualTo(__);
        assertThat((int) Character.MAX_VALUE).isEqualTo(__);

        // Why did we cast MIN_VALUE and MAX_VALUE to int? Try it without the cast.
    }

    @Koan
    void charSize() {
        assertThat(Character.SIZE).isEqualTo(__);
    }

    @Koan
    void decimalNumbersAreOfTypeDouble() {
        assertThat(getType(1.0)).isEqualTo(__);
    }

    @Koan
    void primitivesOfTypeDoubleCanBeDeclaredWithoutTheDecimalPoint() {
        assertThat(getType(1d)).isEqualTo(__);
    }

    @Koan
    void primitivesOfTypeDoubleCanBeDeclaredWithExponents() {
        assertThat(getType(1e3)).isEqualTo(__);
        assertThat(1.0e3).isEqualTo(__);
        assertThat(1E3).isEqualTo(__);
    }

    @Koan
    void primitivesOfTypeDoubleHaveAnObjectTypeDouble() {
        Object number = 1.0;
        assertThat(getType(number)).isEqualTo(__);
    }

    @Koan
    void doublesHaveALargeRange() {
        assertThat(Double.MIN_VALUE).isEqualTo(__);
        assertThat(Double.MAX_VALUE).isEqualTo(__);
    }

    @Koan
    void doubleSize() {
        assertThat(Double.SIZE).isEqualTo(__);
    }

    @Koan
    void decimalNumbersCanAlsoBeOfTypeFloat() {
        assertThat(getType(1f)).isEqualTo(__);
    }

    @Koan
    void primitivesOfTypeFloatCanBeDeclaredWithExponents() {
        assertThat(getType(1e3f)).isEqualTo(__);
        assertThat(1.0e3f).isEqualTo(__);
        assertThat(1E3f).isEqualTo(__);
    }

    @Koan
    void primitivesOfTypeFloatHaveAnObjectTypeFloat() {
        Object number = 1f;
        assertThat(getType(number)).isEqualTo(__);
    }

    @Koan
    void floatsHaveASmallerRangeThanDoubles() {
        assertThat(Float.MIN_VALUE).isEqualTo(__);
        assertThat(Float.MAX_VALUE).isEqualTo(__);
    }

    @Koan
    void floatSize() {
        assertThat(Float.SIZE).isEqualTo(__);
    }

    private Class<?> getType(int value) {
        return int.class;
    }

    private Class<?> getType(long value) {
        return long.class;
    }

    private Class<?> getType(float value) {
        return float.class;
    }

    private Class<?> getType(double value) {
        return double.class;
    }

    private Class<?> getType(byte value) {
        return byte.class;
    }

    private Class<?> getType(char value) {
        return char.class;
    }

    private Class<?> getType(short value) {
        return short.class;
    }

    private Class<?> getType(Object value) {
        return value.getClass();
    }

}
