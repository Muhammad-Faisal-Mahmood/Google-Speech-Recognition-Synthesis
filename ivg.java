/*
 * Decompiled with CFR 0.152.
 */
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

public final class ivg {
    public Object a;
    public Object b;
    public Object c;
    public Object d;

    public ivg() {
    }

    public ivg(char[] cArray) {
        this.d = null;
        this.a = null;
        this.b = null;
        this.c = null;
    }

    public static String f(String string, Object ... objectArray) {
        return String.format(Locale.ROOT, string, objectArray);
    }

    public static ThreadFactory i(ivg object) {
        Object object2;
        Object object3 = ((ivg)object).d;
        Object object4 = ((ivg)object).a;
        Object object5 = ((ivg)object).b;
        object = object2 = ((ivg)object).c;
        if (object2 == null) {
            object = Executors.defaultThreadFactory();
        }
        object2 = object3 != null ? new AtomicLong(0L) : null;
        object5 = (Integer)object5;
        object4 = (Boolean)object4;
        return new hqb((ThreadFactory)object, (String)object3, (AtomicLong)object2, (Boolean)object4, (Integer)object5);
    }

    public final ivi a() {
        a.s(this.a, "description");
        a.s(this.b, "severity");
        a.s(this.c, "timestampNanos");
        fxf.B(true, "at least one of channelRef and subchannelRef must be null");
        Object object = this.a;
        Object object2 = this.b;
        long l2 = (Long)this.c;
        Object object3 = this.d;
        object2 = (ivh)((Object)object2);
        return new ivi((String)object, (ivh)((Object)object2), l2, (ivs)object3);
    }

    public final void b(long l2) {
        this.c = l2;
    }

    public final ivf c() {
        Object object = this.a;
        Object object2 = this.c;
        Object object3 = this.d;
        String string = (String)this.b;
        object3 = (String)object3;
        object2 = (InetSocketAddress)object2;
        return new ivf((SocketAddress)object, (InetSocketAddress)object2, (String)object3, string);
    }

    public final void d(SocketAddress socketAddress) {
        a.s(socketAddress, "proxyAddress");
        this.a = socketAddress;
    }

    public final void e(InetSocketAddress inetSocketAddress) {
        a.s(inetSocketAddress, "targetAddress");
        this.c = inetSocketAddress;
    }

    public final void g() {
        this.a = true;
    }

    public final void h(String string) {
        ivg.f(string, 0);
        this.d = string;
    }
}

