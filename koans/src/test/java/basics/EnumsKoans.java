package basics;

import io.fries.koans.Koan;

import static io.fries.koans.KoanAssert.__;
import static io.fries.koans.KoanAssert.assertThat;

@SuppressWarnings("all")
class EnumsKoans {

    @Koan
    void basic_enums() {
        Colors blue = Colors.BLUE;

        assertThat(blue == Colors.BLUE).isEqualTo(__);
        assertThat(blue == Colors.RED).isEqualTo(__);
        assertThat(blue instanceof Colors).isEqualTo(__);
    }

    @Koan
    void basic_enum_access() {
        Colors[] colorArray = Colors.values();

        assertThat(colorArray[2]).isEqualTo(__);
    }

    @Koan
    void enums_with_attributes() {
        assertThat(HexadecimalColors.BLUE.hexadecimalValue > HexadecimalColors.RED.hexadecimalValue).isEqualTo(__);
    }

    @Koan
    void enums_with_methods() {
        assertThat(MixableColors.RED.mix(MixableColors.BLUE)).isEqualTo(__);
    }

    enum Colors {
        RED, GREEN, BLUE
    }

    enum HexadecimalColors {
        RED(0xFF0000), GREEN(0x00FF00), BLUE(0x0000FF);

        private int hexadecimalValue;

        HexadecimalColors(final int hexadecimalValue) {
            this.hexadecimalValue = hexadecimalValue;
        }
    }

    enum MixableColors {
        RED(0xFF0000), GREEN(0x00FF00), BLUE(0x0000FF);

        private int hexadecimalValue;

        MixableColors(final int hexadecimalValue) {
            this.hexadecimalValue = hexadecimalValue;
        }

        int mix(MixableColors color) {
            return hexadecimalValue + color.hexadecimalValue;
        }
    }
}
