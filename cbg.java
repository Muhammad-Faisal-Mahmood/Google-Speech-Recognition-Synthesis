/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.Uri
 */
import android.content.Context;
import android.net.Uri;
import j$.util.concurrent.ConcurrentHashMap;
import java.nio.charset.Charset;

public final class cbg
implements car {
    public static final Charset a = Charset.forName("UTF-8");
    public static final duj b;
    public static final ConcurrentHashMap c;
    static Boolean d;
    static Long e;
    public final Context f;

    static {
        Object object = new duj(dtx.a("com.google.android.gms.clearcut.public"));
        if (!((duj)object).b) {
            Object object2 = ((duj)object).d;
            Object object3 = ((duj)object).a;
            boolean bl2 = ((duj)object).c;
            object2 = new duj((Uri)object2, "gms:playlog:service:samplingrules_", (String)object3, false, bl2);
            object = ((duj)object2).d;
            object3 = ((duj)object2).e;
            boolean bl3 = ((duj)object2).b;
            bl2 = ((duj)object2).c;
            object2 = (String)object3;
            b = new duj((Uri)object, (String)object2, "LogSamplingRulesV2__", bl3, bl2);
            c = new ConcurrentHashMap();
            d = null;
            e = null;
            return;
        }
        throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
    }

    public cbg(Context context) {
        this.f = context = context.getApplicationContext();
        if (context != null) {
            dul.f(context);
        }
    }
}

