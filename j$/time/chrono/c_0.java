/*
 * Decompiled with CFR 0.152.
 */
package j$.time.chrono;

import j$.time.temporal.ChronoUnit;

/*
 * Renamed from j$.time.chrono.c
 */
abstract class c_0 {
    static final int[] a;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int[] nArray = new int[ChronoUnit.values().length];
        a = nArray;
        try {
            nArray[ChronoUnit.DAYS.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            c_0.a[ChronoUnit.WEEKS.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            c_0.a[ChronoUnit.MONTHS.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            c_0.a[ChronoUnit.YEARS.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            c_0.a[ChronoUnit.DECADES.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            c_0.a[ChronoUnit.CENTURIES.ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            c_0.a[ChronoUnit.MILLENNIA.ordinal()] = 7;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            c_0.a[ChronoUnit.ERAS.ordinal()] = 8;
            return;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            return;
        }
    }
}

