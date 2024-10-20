/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.apps.speech.tts.googletts.util;

public final class SsmlToLucidParserResult {
    private final boolean parseResult;
    private final ikd text;

    SsmlToLucidParserResult(byte[] object, boolean bl2) {
        hwj hwj2 = hwj.a();
        object = hwv.o(ikd.a, object, 0, ((byte[])object).length, hwj2);
        hwv.D((hwv)object);
        this.text = (ikd)object;
        this.parseResult = bl2;
    }

    public boolean getParseResult() {
        return this.parseResult;
    }

    public ikd getText() {
        return this.text;
    }
}

