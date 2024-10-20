/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Debug$MemoryInfo
 */
import android.content.Context;
import android.os.Debug;
import j$.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class dqi {
    public static final int f = 0;
    public final jnu a;
    public final Context b;
    public final jnu c;
    public final cxu d;
    public final bmu e;

    static {
        fvd.ap(new bpr(12));
    }

    public dqi(jnu jnu2, Context context, jnu jnu3, jnu jnu4, cxu cxu2, bmu bmu2) {
        this.d = cxu2;
        this.e = bmu2;
        Objects.requireNonNull(jnu2);
        this.a = new dqg(jnu4, fvd.ap(new aim(jnu2, 16)), jnu2);
        this.b = context;
        this.c = jnu3;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static /* synthetic */ gto a() {
        void var0_3;
        try {
            return gto.i(Debug.MemoryInfo.class.getDeclaredMethod("getOtherPss", Integer.TYPE));
        }
        catch (Error error) {
        }
        catch (Exception exception) {
            // empty catch block
        }
        catch (NoSuchMethodException noSuchMethodException) {
            a.as(dkc.a.c(), "MemoryInfo.getOtherPss(which) not found", "com/google/android/libraries/performance/primes/metrics/memory/MemoryUsageCapture", "<init>", 'e', "MemoryUsageCapture.java", noSuchMethodException);
            return gsl.a;
        }
        a.as(dkc.a.h(), "MemoryInfo.getOtherPss(which) failure", "com/google/android/libraries/performance/primes/metrics/memory/MemoryUsageCapture", "<init>", 'g', "MemoryUsageCapture.java", (Throwable)var0_3);
        return gsl.a;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static Long b(Pattern object, String string) {
        Matcher matcher = ((Pattern)object).matcher(string);
        string = null;
        object = string;
        try {
            if (!matcher.find()) return object;
            object = matcher.group(1);
            fvd.ao(object);
            return Long.parseLong((String)object);
        }
        catch (NumberFormatException numberFormatException) {
            return string;
        }
    }
}

