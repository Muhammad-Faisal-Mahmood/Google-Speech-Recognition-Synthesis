/*
 * Decompiled with CFR 0.152.
 */
package j$.time.chrono;

import j$.time.temporal.a;

abstract class p {
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
            p.a[j$.time.temporal.a.DAY_OF_YEAR.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            p.a[j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            p.a[j$.time.temporal.a.YEAR.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            p.a[j$.time.temporal.a.YEAR_OF_ERA.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            p.a[j$.time.temporal.a.ERA.ordinal()] = 6;
            return;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            return;
        }
    }
}

