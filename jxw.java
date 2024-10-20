/*
 * Decompiled with CFR 0.152.
 */
public final class jxw {
    public static final int a;
    public static final int b;
    public static final kbt c;
    public static final kbt d;
    public static final kbt e;
    public static final kbt f;
    public static final kbt g;
    public static final kbt h;
    public static final kbt i;
    public static final kbt j;
    public static final kbt k;
    public static final kbt l;
    public static final kbt m;
    public static final kbt n;
    public static final kbt o;
    public static final kbt p;
    public static final kbt q;
    public static final kbt r;
    public static final kau s;

    static {
        s = new kau(-1L, null, null, 0);
        a = jse.ap("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12);
        b = jse.ap("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 0, 0, 12);
        c = new kbt("BUFFERED");
        d = new kbt("SHOULD_BUFFER");
        e = new kbt("S_RESUMING_BY_RCV");
        f = new kbt("RESUMING_BY_EB");
        g = new kbt("POISONED");
        h = new kbt("DONE_RCV");
        i = new kbt("INTERRUPTED_SEND");
        j = new kbt("INTERRUPTED_RCV");
        k = new kbt("CHANNEL_CLOSED");
        l = new kbt("SUSPEND");
        m = new kbt("SUSPEND_NO_WAITER");
        n = new kbt("FAILED");
        o = new kbt("NO_RECEIVE_RESULT");
        p = new kbt("CLOSE_HANDLER_CLOSED");
        q = new kbt("CLOSE_HANDLER_INVOKED");
        r = new kbt("NO_CLOSE_CAUSE");
    }

    public static final long a(long l2, boolean bl2) {
        long l3 = true != bl2 ? 0L : 0x4000000000000000L;
        return l3 + l2;
    }

    public static final long b(long l2, int n2) {
        return ((long)n2 << 60) + l2;
    }

    public static final boolean c(jul jul2, Object object) {
        boolean bl2;
        block2: {
            Object object2;
            while ((object2 = jul2.d.a) instanceof jww) {
                Object object3 = jul.D((jww)object2, object, jul2.e);
                if (!jul2.d.d(object2, object3)) continue;
                jul2.p();
                object = jum.a;
                break block2;
            }
            bl2 = object2 instanceof jus;
            object = null;
        }
        if (object != null) {
            bl2 = jve.a;
            jul2.q(jul2.e);
            return true;
        }
        return false;
    }
}

