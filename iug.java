/*
 * Decompiled with CFR 0.152.
 */
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public final class iug {
    public static final iug a = new iug(new iud(1), iud.a);
    private final ConcurrentMap b = new ConcurrentHashMap();

    public iug(iuf ... iufArray) {
        for (int i2 = 0; i2 < iufArray.length; ++i2) {
            iuf iuf2 = iufArray[i2];
            this.b.put(iuf2.b(), iuf2);
        }
    }
}

