/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import java.util.Iterator;

public final class aii {
    public final apb a;
    public final long b;
    public final long c;
    public final long d;
    public final HashMap e;
    public long f;
    private final long g;
    private final long h;

    public aii() {
        this(new apb(), 50000, 50000, 2500, 5000);
    }

    public aii(apb apb2, int n2, int n3, int n4, int n5) {
        aii.b(n4, 0, "bufferForPlaybackMs", "0");
        aii.b(n5, 0, "bufferForPlaybackAfterRebufferMs", "0");
        aii.b(n2, n4, "minBufferMs", "bufferForPlaybackMs");
        aii.b(n2, n5, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        aii.b(n3, n2, "maxBufferMs", "minBufferMs");
        aii.b(0, 0, "backBufferDurationMs", "0");
        this.a = apb2;
        this.g = agf.i(n2);
        this.h = agf.i(n3);
        this.b = agf.i(n4);
        this.c = agf.i(n5);
        this.d = agf.i(0L);
        this.e = new HashMap();
        this.f = -1L;
    }

    public static void b(int n2, int n3, String string, String string2) {
        string = a.ao(string2, string, " cannot be less than ");
        boolean bl2 = n2 >= n3;
        abr.e(bl2, string);
    }

    final int a() {
        Iterator iterator = this.e.values().iterator();
        int n2 = 0;
        while (iterator.hasNext()) {
            n2 += ((aih)iterator.next()).b;
        }
        return n2;
    }

    public final void c(akr akr2) {
        if (this.e.remove(akr2) != null) {
            this.d();
        }
    }

    public final void d() {
        if (this.e.isEmpty()) {
            this.a.b();
            return;
        }
        this.a.c(this.a());
    }

    public final boolean e(ajf ajf2) {
        long l2;
        aih aih2 = (aih)this.e.get(ajf2.a);
        abr.i(aih2);
        float f2 = ajf2.c;
        float f3 = f2 - 1.0f;
        float f4 = f3 == 0.0f ? 0 : (f3 > 0.0f ? 1 : -1);
        int n2 = this.a.a();
        int n3 = this.a();
        long l3 = l2 = this.g;
        if (f4 > 0) {
            int n4 = agf.a;
            if (f4 != false) {
                l2 = Math.round((double)l2 * (double)f2);
            }
            l3 = Math.min(l2, this.h);
        }
        l2 = ajf2.b;
        l3 = Math.max(l3, 500000L);
        boolean bl2 = false;
        if (l2 < l3) {
            if (n2 < n3) {
                bl2 = true;
            }
            aih2.a = bl2;
            if (!bl2 && l2 < 500000L) {
                afx.e("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (l2 >= this.h || n2 >= n3) {
            aih2.a = false;
        }
        return aih2.a;
    }
}

