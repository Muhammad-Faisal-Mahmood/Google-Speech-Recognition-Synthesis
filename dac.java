/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.ConnectivityManager
 *  hom
 */
import android.content.Context;
import android.net.ConnectivityManager;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;

public final class dac
implements fqm {
    public final ctl a;
    private final Context b;
    private final cys c;
    private final AtomicLong d = new AtomicLong();
    private final AtomicLong e = new AtomicLong();

    public dac(Context context, cys cys2, ctl ctl2) {
        this.b = context;
        this.c = cys2;
        this.a = ctl2;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public final void a(int var1_1) {
        var5_2 /* !! */  = this.b;
        var6_4 = null;
        try {
            var5_2 /* !! */  = (ConnectivityManager)var5_2 /* !! */ .getSystemService("connectivity");
        }
        catch (SecurityException var5_3) {
            cyr.g("%s: Couldn't retrieve ConnectivityManager.", "NetworkUsageMonitor");
            var5_2 /* !! */  = null;
        }
        var5_2 /* !! */  = var5_2 /* !! */  == null ? var6_4 : var5_2 /* !! */ .getActiveNetworkInfo();
        if (var5_2 /* !! */  == null) {
            cyr.g("%s: Fail to get network type ", "NetworkUsageMonitor");
            while (true) {
                var2_5 = false;
                break;
            }
        } else {
            if (var5_2 /* !! */ .getType() == 1 || var5_2 /* !! */ .getType() == 9 || var5_2 /* !! */ .getType() == 17) ** continue;
            var2_5 = true;
        }
        var3_6 = var1_1;
        if (var2_5) {
            this.e.getAndAdd(var3_6);
        } else {
            this.d.getAndAdd(var3_6);
        }
        var5_2 /* !! */  = true != var2_5 ? "wifi" : "cellular";
        var6_4 = var7_7 = this.a.c;
        if (var7_7 == null) {
            var6_4 = ctq.a;
        }
        cyr.l("%s: Received data (%s) for fileGroup = %s, len = %d, wifiCounter = %d, cellularCounter = %d", new Object[]{"NetworkUsageMonitor", var5_2 /* !! */ , var6_4.c, var1_1, this.d.get(), this.e.get()});
    }

    @Override
    public final void b() {
        Object object = this.a;
        hwp hwp2 = (hwp)((hwv)object).C(5);
        hwp2.x((hwv)object);
        long l2 = this.e.getAndSet(0L);
        if (!hwp2.b.B()) {
            hwp2.u();
        }
        object = (ctl)hwp2.b;
        ctl ctl2 = ctl.a;
        ((ctl)object).b |= 0x10;
        ((ctl)object).g = l2;
        l2 = this.d.getAndSet(0L);
        if (!hwp2.b.B()) {
            hwp2.u();
        }
        object = this.c;
        ctl2 = (ctl)hwp2.b;
        ctl2.b |= 0x20;
        ctl2.h = l2;
        fxf.al(object.d((ctl)hwp2.o()), new cmr(this, 3), (Executor)hom.a);
    }
}

