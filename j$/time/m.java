/*
 * Decompiled with CFR 0.152.
 */
package j$.time;

import j$.time.temporal.a;

abstract class m {
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
            nArray[j$.time.temporal.a.DAY_OF_MONTH.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            m.a[j$.time.temporal.a.MONTH_OF_YEAR.ordinal()] = 2;
            return;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            return;
        }
    }
}

