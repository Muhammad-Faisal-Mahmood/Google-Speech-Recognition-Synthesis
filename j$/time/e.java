/*
 * Decompiled with CFR 0.152.
 */
package j$.time;

import j$.time.temporal.ChronoUnit;
import j$.time.temporal.a;

abstract class e {
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
            e.b[ChronoUnit.MICROS.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            e.b[ChronoUnit.MILLIS.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            e.b[ChronoUnit.SECONDS.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            e.b[ChronoUnit.MINUTES.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            e.b[ChronoUnit.HOURS.ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            e.b[ChronoUnit.HALF_DAYS.ordinal()] = 7;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            e.b[ChronoUnit.DAYS.ordinal()] = 8;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        nArray = new int[j$.time.temporal.a.values().length];
        a = nArray;
        try {
            nArray[j$.time.temporal.a.NANO_OF_SECOND.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            e.a[j$.time.temporal.a.MICRO_OF_SECOND.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            e.a[j$.time.temporal.a.MILLI_OF_SECOND.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            e.a[j$.time.temporal.a.INSTANT_SECONDS.ordinal()] = 4;
            return;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            return;
        }
    }
}

