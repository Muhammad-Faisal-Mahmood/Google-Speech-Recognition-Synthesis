/*
 * Decompiled with CFR 0.152.
 */
package j$.time;

import j$.time.temporal.ChronoUnit;
import j$.time.temporal.a;

abstract class j {
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
            nArray[ChronoUnit.NANOS.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            j.b[ChronoUnit.MICROS.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            j.b[ChronoUnit.MILLIS.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            j.b[ChronoUnit.SECONDS.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            j.b[ChronoUnit.MINUTES.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            j.b[ChronoUnit.HOURS.ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            j.b[ChronoUnit.HALF_DAYS.ordinal()] = 7;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        nArray = new int[j$.time.temporal.a.values().length];
        a = nArray;
        try {
            nArray[j$.time.temporal.a.NANO_OF_SECOND.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            j.a[j$.time.temporal.a.NANO_OF_DAY.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            j.a[j$.time.temporal.a.MICRO_OF_SECOND.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            j.a[j$.time.temporal.a.MICRO_OF_DAY.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            j.a[j$.time.temporal.a.MILLI_OF_SECOND.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            j.a[j$.time.temporal.a.MILLI_OF_DAY.ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            j.a[j$.time.temporal.a.SECOND_OF_MINUTE.ordinal()] = 7;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            j.a[j$.time.temporal.a.SECOND_OF_DAY.ordinal()] = 8;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            j.a[j$.time.temporal.a.MINUTE_OF_HOUR.ordinal()] = 9;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            j.a[j$.time.temporal.a.MINUTE_OF_DAY.ordinal()] = 10;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            j.a[j$.time.temporal.a.HOUR_OF_AMPM.ordinal()] = 11;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            j.a[j$.time.temporal.a.CLOCK_HOUR_OF_AMPM.ordinal()] = 12;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            j.a[j$.time.temporal.a.HOUR_OF_DAY.ordinal()] = 13;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            j.a[j$.time.temporal.a.CLOCK_HOUR_OF_DAY.ordinal()] = 14;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            j.a[j$.time.temporal.a.AMPM_OF_DAY.ordinal()] = 15;
            return;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            return;
        }
    }
}

