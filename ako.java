/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.media.metrics.PlaybackMetrics$Builder
 *  android.media.metrics.PlaybackSession
 *  android.media.metrics.TrackChangeEvent$Builder
 *  android.os.SystemClock
 *  android.util.Pair
 */
import android.content.Context;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.util.Pair;
import j$.util.Objects;
import java.util.HashMap;

public final class ako {
    public final Context a;
    public final akp b;
    public final PlaybackSession c;
    public final long d;
    public final HashMap e;
    public final HashMap f;
    public String g;
    public PlaybackMetrics.Builder h;
    public int i;
    public int j;
    public int k;
    public aen l;
    public boolean m;
    public boolean n;
    public int o;
    public boolean p;
    public dvy q;
    public dvy r;
    public dvy s;
    private final aev t;
    private final aeu u;
    private adu v;
    private adu w;
    private adu x;

    public ako(Context object, PlaybackSession object2) {
        this.a = object.getApplicationContext();
        this.c = object2;
        this.t = new aev();
        this.u = new aeu();
        this.f = new HashMap();
        this.e = new HashMap();
        this.d = SystemClock.elapsedRealtime();
        this.j = 0;
        this.k = 0;
        object = new akn();
        this.b = object;
        object2 = (akn)object;
        object.c = this;
    }

    public static int a(int n2) {
        switch (agf.e(n2)) {
            default: {
                return 27;
            }
            case 6005: {
                return 26;
            }
            case 6004: {
                return 25;
            }
            case 6003: {
                return 28;
            }
            case 6002: 
        }
        return 24;
    }

    private final void i(int n2, long l2, adu object, int n3) {
        TrackChangeEvent.Builder builder = ut$$ExternalSyntheticApiModelOutline0.m(new TrackChangeEvent.Builder(n2), l2 - this.d);
        if (object != null) {
            ut$$ExternalSyntheticApiModelOutline0.m(builder, 1);
            n2 = n3 != 1 ? 1 : 2;
            ut$$ExternalSyntheticApiModelOutline0.m$1(builder, n2);
            String string = object.o;
            if (string != null) {
                ut$$ExternalSyntheticApiModelOutline0.m(builder, string);
            }
            if ((n2 = object.j) != -1) {
                ut$$ExternalSyntheticApiModelOutline0.m$3(builder, n2);
            }
            if ((n2 = object.D) != -1) {
                ut$$ExternalSyntheticApiModelOutline0.m$4(builder, n2);
            }
            if ((n2 = object.E) != -1) {
                ut$$ExternalSyntheticApiModelOutline0.m$2(builder, n2);
            }
            if ((object = object.d) != null) {
                object = agf.w((String)object, "-");
                string = object[0];
                object = ((String[])object).length >= 2 ? object[1] : null;
                object = Pair.create((Object)string, (Object)object);
                ut$$ExternalSyntheticApiModelOutline0.m$1(builder, (String)object.first);
                if (object.second != null) {
                    ut$$ExternalSyntheticApiModelOutline0.m$2(builder, (String)object.second);
                }
            }
        } else {
            ut$$ExternalSyntheticApiModelOutline0.m(builder, 0);
        }
        this.p = true;
        ut$$ExternalSyntheticApiModelOutline0.m(this.c, ut$$ExternalSyntheticApiModelOutline0.m(builder));
    }

    public final void b() {
        Object object = this.h;
        if (object != null && this.p) {
            ut$$ExternalSyntheticApiModelOutline0.m$3((PlaybackMetrics.Builder)object, this.o);
            ut$$ExternalSyntheticApiModelOutline0.m$4(this.h, 0);
            ut$$ExternalSyntheticApiModelOutline0.m$5(this.h, 0);
            object = (Long)this.e.get(this.g);
            PlaybackMetrics.Builder builder = this.h;
            long l2 = object == null ? 0L : (Long)object;
            ut$$ExternalSyntheticApiModelOutline0.m$1(builder, l2);
            object = (Long)this.f.get(this.g);
            builder = this.h;
            l2 = object == null ? 0L : (Long)object;
            ut$$ExternalSyntheticApiModelOutline0.m$2(builder, l2);
            builder = this.h;
            int n2 = object != null && (Long)object > 0L ? 1 : 0;
            ut$$ExternalSyntheticApiModelOutline0.m$1(builder, n2);
            ut$$ExternalSyntheticApiModelOutline0.m(this.c, ut$$ExternalSyntheticApiModelOutline0.m(this.h));
        }
        this.h = null;
        this.g = null;
        this.o = 0;
        this.v = null;
        this.w = null;
        this.x = null;
        this.p = false;
    }

    /*
     * Unable to fully structure code
     */
    public final void c(aew var1_1, anc var2_2) {
        block17: {
            block16: {
                block19: {
                    block18: {
                        var9_3 = this.h;
                        if (var2_2 == null) break block17;
                        var4_4 = var1_1.a(var2_2.a);
                        var3_5 = -1;
                        if (var4_4 == -1) break block17;
                        var1_1.m(var4_4, this.u);
                        var2_2 = this.u;
                        var10_6 = this.t;
                        var1_1.o(var2_2.c, var10_6);
                        var1_1 = this.t.d.b;
                        var6_7 = 0;
                        var4_4 = 0;
                        var5_8 = 2;
                        if (var1_1 != null) break block18;
                        var3_5 = var6_7;
                        break block16;
                    }
                    var6_7 = agf.a;
                    var1_1 = var1_1.a;
                    var2_2 = var1_1.getScheme();
                    if (var2_2 != null && fxf.V("rtsp", (CharSequence)var2_2) || (var2_2 = var1_1.getLastPathSegment()) == null) lbl-1000:
                    // 2 sources

                    {
                        while (true) {
                            var3_5 = 1;
                            break block16;
                            break;
                        }
                    }
                    var6_7 = var2_2.lastIndexOf(46);
                    if (var6_7 < 0) break block19;
                    var2_2 = fxf.T(var2_2.substring(var6_7 + 1));
                    switch (var2_2.hashCode()) {
                        default: {
                            break;
                        }
                        case 3299913: {
                            if (!var2_2.equals("m3u8")) break;
                            var3_5 = 1;
                            break;
                        }
                        case 3242057: {
                            if (!var2_2.equals("isml")) break;
                            var3_5 = 3;
                            break;
                        }
                        case 108321: {
                            if (!var2_2.equals("mpd")) break;
                            var3_5 = 0;
                            break;
                        }
                        case 104579: {
                            if (!var2_2.equals("ism")) break;
                            var3_5 = 2;
                        }
                    }
                    if (var3_5 != 0) {
                        var4_4 = var3_5 != 1 ? (var3_5 != 2 && var3_5 != 3 ? 4 : 1) : 2;
                    }
                    if (var4_4 == 4) break block19;
                    if (var4_4 == 0) ** GOTO lbl-1000
                    if (var4_4 == 1) ** GOTO lbl-1000
                    ** GOTO lbl-1000
                }
                var2_2 = agf.g;
                var1_1 = var1_1.getPath();
                abr.i(var1_1);
                ** while (!(var1_1 = var2_2.matcher((CharSequence)var1_1)).matches())
lbl59:
                // 1 sources

                if ((var1_1 = var1_1.group(2)) != null) {
                    ** if (!var1_1.contains((CharSequence)"format=mpd-time-csf")) goto lbl-1000
                }
                ** GOTO lbl-1000
lbl-1000:
                // 2 sources

                {
                    var3_5 = 3;
                    ** GOTO lbl68
                }
lbl-1000:
                // 1 sources

                {
                    if (var1_1.contains("format=m3u8-aapl")) lbl-1000:
                    // 2 sources

                    {
                        var3_5 = 4;
                    } else lbl-1000:
                    // 3 sources

                    {
                        var3_5 = 5;
                    }
                }
            }
            ut$$ExternalSyntheticApiModelOutline0.m(var9_3, var3_5);
            var1_1 = this.t;
            var7_9 = var1_1.m;
            if (!(var7_9 == -9223372036854775807L || var1_1.k || var1_1.i || var1_1.b())) {
                ut$$ExternalSyntheticApiModelOutline0.m(var9_3, agf.m(var7_9));
            }
            var3_5 = var5_8;
            if (!this.t.b()) {
                var3_5 = 1;
            }
            ut$$ExternalSyntheticApiModelOutline0.m$2(var9_3, var3_5);
            this.p = true;
        }
    }

    public final void d(long l2, adu adu2) {
        if (Objects.equals(this.w, adu2)) {
            return;
        }
        int n2 = this.w == null ? 1 : 0;
        this.w = adu2;
        this.i(0, l2, adu2, n2);
    }

    public final void e(long l2, adu adu2) {
        if (Objects.equals(this.x, adu2)) {
            return;
        }
        int n2 = this.x == null ? 1 : 0;
        this.x = adu2;
        this.i(2, l2, adu2, n2);
    }

    public final void f(long l2, adu adu2) {
        if (Objects.equals(this.v, adu2)) {
            return;
        }
        int n2 = this.v == null ? 1 : 0;
        this.v = adu2;
        this.i(1, l2, adu2, n2);
    }

    public final void g(akc object, String string) {
        object = ((akc)object).d;
        if ((object == null || !((anc)object).b()) && string.equals(this.g)) {
            this.b();
        }
        this.e.remove(string);
        this.f.remove(string);
    }

    public final boolean h(dvy object) {
        if (object != null) {
            Object object2 = this.b;
            object = ((dvy)object).b;
            if (((String)object).equals(object2 = object2.c())) {
                return true;
            }
        }
        return false;
    }
}

