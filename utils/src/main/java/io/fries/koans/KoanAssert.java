package io.fries.koans;

import org.assertj.core.api.AbstractAssert;

public final class KoanAssert extends AbstractAssert<KoanAssert, Object> {

    public static final Object __ = null;

    private KoanAssert(final Object actual) {
        super(actual, KoanAssert.class);
    }

    public static KoanAssert assertThat(final Object actual) {
        return new KoanAssert(actual).withFailMessage("Incorrect solution");
    }
}
