/*
 * Decompiled with CFR 0.152.
 */
package j$.time;

import j$.time.temporal.a;

abstract class o {
    static final int[] a;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int[] nArray = new int[j$.time.temporal.a.values().length];
        a = nArray;
        try {
            nArray[j$.time.temporal.a.INSTANT_SECONDS.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            o.a[j$.time.temporal.a.OFFSET_SECONDS.ordinal()] = 2;
            return;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            return;
        }
    }
}

