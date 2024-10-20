/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;
import java.util.List;

public final class jqt
extends jot
implements Serializable,
j$.util.List,
List,
jsm {
    private final Enum[] a;

    public jqt(Enum[] enumArray) {
        jse.e(enumArray, "entries");
        this.a = enumArray;
    }

    private final Object writeReplace() {
        return new jqu(this.a);
    }

    @Override
    public final int a() {
        return this.a.length;
    }
}

