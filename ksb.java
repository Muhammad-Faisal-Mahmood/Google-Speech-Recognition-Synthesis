/*
 * Decompiled with CFR 0.152.
 */
import j$.util.DesugarCollections;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class ksb {
    public final Object a;
    public final Object b;

    ksb() {
        this(hcy.a);
    }

    public ksb(hac hac2) {
        this.a = new iyv();
        this.b = hac2;
    }

    public ksb(iwj iwj2) {
        a.s(iwj2, "registry");
        this.b = iwj2;
        this.a = "pick_first";
    }

    public ksb(iyc iyc2, Map map) {
        this.b = iyc2;
        this.a = DesugarCollections.unmodifiableMap(new HashMap(map));
    }

    public ksb(iyh iyh2, Object object) {
        a.s(iyh2, "status");
        this.a = iyh2;
        this.b = object;
    }

    public ksb(iyl iyl2, ScheduledFuture scheduledFuture) {
        this.b = iyl2;
        a.s(scheduledFuture, "future");
        this.a = scheduledFuture;
    }

    public ksb(Object object, Object object2) {
        this.b = object;
        this.a = object2;
    }

    public ksb(Runnable runnable) {
        this.a = new AtomicInteger(1);
        this.b = runnable;
    }

    public ksb(String string) {
        this.a = new ArrayList();
        this.b = string;
    }

    public ksb(URI uRI, ixj ixj2) {
        a.s(uRI, "targetUri");
        this.a = uRI;
        this.b = ixj2;
    }

    public ksb(Map map, bqz bqz2) {
        this.b = map;
        this.a = bqz2;
    }

    public ksb(Level level, Class object) {
        object = Logger.getLogger(((Class)object).getName());
        a.s(level, "level");
        this.b = level;
        a.s(object, "logger");
        this.a = object;
    }

    public ksb(jip jip2, ixy ixy2) {
        this.a = jip2;
        this.b = ixy2;
    }

    private static String p(klm klm2) {
        long l2 = klm2.b;
        if (l2 <= 64L) {
            return klm2.q().d();
        }
        return klm2.r((int)Math.min(l2, 64L)).d().concat("...");
    }

    public final void a() {
        if (((AtomicInteger)this.a).decrementAndGet() == 0) {
            this.b.run();
        }
    }

    public final void b() {
        ((AtomicInteger)this.a).incrementAndGet();
    }

    public final boolean c() {
        Level level = (Level)this.b;
        return ((Logger)this.a).isLoggable(level);
    }

    public final void d(int n2, int n3, klm object, int n4, boolean bl2) {
        if (this.c()) {
            Object object2 = this.a;
            Object object3 = this.b;
            String string = jjj.f(n2);
            String string2 = ksb.p((klm)object);
            object = new StringBuilder();
            ((StringBuilder)object).append(string);
            ((StringBuilder)object).append(" DATA: streamId=");
            ((StringBuilder)object).append(n3);
            ((StringBuilder)object).append(" endStream=");
            ((StringBuilder)object).append(bl2);
            ((StringBuilder)object).append(" length=");
            ((StringBuilder)object).append(n4);
            ((StringBuilder)object).append(" bytes=");
            ((StringBuilder)object).append(string2);
            object = ((StringBuilder)object).toString();
            object3 = (Level)object3;
            ((Logger)object2).logp((Level)object3, "io.grpc.okhttp.OkHttpFrameLogger", "logData", (String)object);
        }
    }

    public final void e(int n2, int n3, jlt object, klp serializable) {
        if (this.c()) {
            Object object2 = this.a;
            Object object3 = this.b;
            String string = jjj.f(n2);
            object = String.valueOf(object);
            n2 = serializable.b();
            Object object4 = new klm();
            ((klm)object4).B((klp)serializable);
            object4 = ksb.p((klm)object4);
            serializable = new StringBuilder();
            ((StringBuilder)serializable).append(string);
            ((StringBuilder)serializable).append(" GO_AWAY: lastStreamId=");
            ((StringBuilder)serializable).append(n3);
            ((StringBuilder)serializable).append(" errorCode=");
            ((StringBuilder)serializable).append((String)object);
            ((StringBuilder)serializable).append(" length=");
            ((StringBuilder)serializable).append(n2);
            ((StringBuilder)serializable).append(" bytes=");
            ((StringBuilder)serializable).append((String)object4);
            object = ((StringBuilder)serializable).toString();
            serializable = (Level)object3;
            ((Logger)object2).logp((Level)serializable, "io.grpc.okhttp.OkHttpFrameLogger", "logGoAway", (String)object);
        }
    }

    public final void f(int n2, long l2) {
        if (this.c()) {
            Object object = this.a;
            Object object2 = this.b;
            String string = jjj.f(n2);
            CharSequence charSequence = new StringBuilder();
            charSequence.append(string);
            charSequence.append(" PING: ack=false bytes=");
            charSequence.append(l2);
            charSequence = charSequence.toString();
            object2 = (Level)object2;
            ((Logger)object).logp((Level)object2, "io.grpc.okhttp.OkHttpFrameLogger", "logPing", (String)charSequence);
        }
    }

    public final void g(int n2, int n3, jlt object) {
        if (this.c()) {
            Object object2 = this.a;
            Object object3 = this.b;
            String string = jjj.f(n2);
            String string2 = String.valueOf(object);
            object = new StringBuilder();
            ((StringBuilder)object).append(string);
            ((StringBuilder)object).append(" RST_STREAM: streamId=");
            ((StringBuilder)object).append(n3);
            ((StringBuilder)object).append(" errorCode=");
            ((StringBuilder)object).append(string2);
            object = ((StringBuilder)object).toString();
            object3 = (Level)object3;
            ((Logger)object2).logp((Level)object3, "io.grpc.okhttp.OkHttpFrameLogger", "logRstStream", (String)object);
        }
    }

    public final void h(int n2, int n3, long l2) {
        if (this.c()) {
            Object object = this.a;
            Object object2 = this.b;
            String string = jjj.f(n2);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string);
            stringBuilder.append(" WINDOW_UPDATE: streamId=");
            stringBuilder.append(n3);
            stringBuilder.append(" windowSizeIncrement=");
            stringBuilder.append(l2);
            string = stringBuilder.toString();
            object2 = (Level)object2;
            ((Logger)object).logp((Level)object2, "io.grpc.okhttp.OkHttpFrameLogger", "logWindowsUpdate", string);
        }
    }

    public final void i(int n2, khv object) {
        if (this.c()) {
            Object object2 = this.a;
            Object object3 = this.b;
            String string = jjj.f(n2);
            EnumMap<jkt, Integer> enumMap = new EnumMap<jkt, Integer>(jkt.class);
            for (jkt jkt2 : jkt.values()) {
                int n3 = jkt2.g;
                if (!((khv)object).e(n3)) continue;
                enumMap.put(jkt2, ((khv)object).c(n3));
            }
            String string2 = enumMap.toString();
            object = new StringBuilder();
            ((StringBuilder)object).append(string);
            ((StringBuilder)object).append(" SETTINGS: ack=false settings=");
            ((StringBuilder)object).append(string2);
            object = ((StringBuilder)object).toString();
            object3 = (Level)object3;
            ((Logger)object2).logp((Level)object3, "io.grpc.okhttp.OkHttpFrameLogger", "logSettings", (String)object);
        }
    }

    public final void j() {
        ((iyl)this.b).b = true;
        this.a.cancel(false);
    }

    public final boolean k() {
        iyl iyl2 = (iyl)this.b;
        return !iyl2.c && !iyl2.b;
    }

    public final void l(ixb ixb2) {
        this.a.add(ixb2);
    }

    public final Collection m() {
        return this.a.values();
    }

    public final ack n(ack ack2) {
        fvc.al(ack2);
        bqz bqz2 = (bqz)this.a;
        return new ilb((Map)this.b, ack2, bqz2);
    }

    public final ksb o(ixy ixy2) {
        return new ksb(this.b, (Object)ixy2);
    }
}

