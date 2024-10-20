/*
 * Decompiled with CFR 0.152.
 */
package j$.time.format;

import j$.time.format.A;

abstract class c {
    static final int[] a;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int[] nArray = new int[A.values().length];
        a = nArray;
        try {
            nArray[A.EXCEEDS_PAD.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            c.a[A.ALWAYS.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            c.a[A.NORMAL.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            c.a[A.NOT_NEGATIVE.ordinal()] = 4;
            return;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            return;
        }
    }
}

