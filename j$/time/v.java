/*
 * Decompiled with CFR 0.152.
 */
package j$.time;

import j$.time.temporal.ChronoUnit;
import j$.time.temporal.a;

abstract class v {
    static final int[] a;
    static final int[] b;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int[] nArray = new int[ChronoUnit.values().length];
        b = nArray;
        try {
            nArray[ChronoUnit.MONTHS.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            v.b[ChronoUnit.YEARS.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            v.b[ChronoUnit.DECADES.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            v.b[ChronoUnit.CENTURIES.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            v.b[ChronoUnit.MILLENNIA.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            v.b[ChronoUnit.ERAS.ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        nArray = new int[j$.time.temporal.a.values().length];
        a = nArray;
        try {
            nArray[j$.time.temporal.a.MONTH_OF_YEAR.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            v.a[j$.time.temporal.a.PROLEPTIC_MONTH.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            v.a[j$.time.temporal.a.YEAR_OF_ERA.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            v.a[j$.time.temporal.a.YEAR.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            v.a[j$.time.temporal.a.ERA.ordinal()] = 5;
            return;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            return;
        }
    }
}

