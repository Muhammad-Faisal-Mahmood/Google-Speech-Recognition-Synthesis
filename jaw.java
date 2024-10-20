/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Log
 */
import android.util.Log;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class jaw
extends kny {
    final jba a;
    private List b;

    public jaw(jba jba2) {
        this.a = jba2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void i(List object, boolean bl2) {
        int n2;
        Object object2 = new ArrayList<String>();
        Object object3 = object.iterator();
        while (object3.hasNext()) {
            object = (Map.Entry)object3.next();
            object2.add((String)object.getKey());
            object2.add((String)object.getValue());
        }
        object = new byte[object2.size()][];
        for (n2 = 0; n2 < object2.size(); n2 += 2) {
            object[n2] = ((String)object2.get(n2)).getBytes(StandardCharsets.UTF_8);
            int n3 = n2 + 1;
            object[n3] = ((String)object2.get(n3)).getBytes(StandardCharsets.UTF_8);
        }
        object = jju.b((byte[][])object);
        object2 = ivp.a;
        object = new iwx((byte[][])object);
        object2 = this.a;
        n2 = jaz.i;
        object2 = ((jba)object2).o.a;
        synchronized (object2) {
            object3 = this.a.o;
            if (bl2) {
                ((jee)object3).p((iwx)object);
            } else {
                ((jee)object3).o((iwx)object);
            }
            return;
        }
    }

    private static final iyh j(kpv kpv2) {
        return jeb.a(kpv2.a);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void a(knz object, kpv kpv2) {
        int n2 = jaz.i;
        Object object2 = this.a.o.a;
        synchronized (object2) {
            object = this.a.o.e;
            if (object == null) {
                object = kpv2 != null ? jaw.j(kpv2) : iyh.c.e("stream cancelled without reason");
            }
        }
        this.a.r((iyh)object);
    }

    @Override
    public final void b(knz object, kpv kpv2, kod kod2) {
        object = iyh.k.d(kod2);
        this.a.r((iyh)object);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @Override
    public final void c(knz object, kpv kpv2, ByteBuffer byteBuffer, boolean bl2) {
        ((Buffer)byteBuffer).flip();
        if (Log.isLoggable((String)"grpc-java-cronet", (int)2)) {
            byteBuffer.remaining();
        }
        object = this.a;
        int n2 = jaz.i;
        object = ((jba)object).o.a;
        // MONITORENTER : object
        this.a.o.f = bl2;
        if (byteBuffer.remaining() != 0) {
            jaz.f(this.a.o, byteBuffer);
        }
        // MONITOREXIT : object
        if (!bl2) return;
        object = this.b;
        if (object == null) return;
        this.i((List)object, true);
    }

    @Override
    public final void d(knz knz2, kpv kpv2) {
        if (Log.isLoggable((String)"grpc-java-cronet", (int)2)) {
            String.valueOf(kpv2.b());
        }
        this.i(kpv2.b(), false);
        knz2.b(ByteBuffer.allocateDirect(4096));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @Override
    public final void e(knz object, kpv object2, kpu kpu2) {
        this.b = object2 = kpu2.a;
        int n2 = jaz.i;
        object = this.a.o.a;
        // MONITORENTER : object
        boolean bl2 = this.a.o.f;
        // MONITOREXIT : object
        if (bl2) {
            this.i((List)object2, true);
        }
        if (!Log.isLoggable((String)"grpc-java-cronet", (int)2)) return;
        object2.toString();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void f(knz object) {
        int n2 = jaz.i;
        object = this.a.o.a;
        synchronized (object) {
            this.a.o.d();
            jaz jaz2 = this.a.o;
            jaz2.c = true;
            Iterator iterator = jaz2.b.iterator();
            while (true) {
                if (!iterator.hasNext()) {
                    jaz2.b.clear();
                    return;
                }
                jax jax2 = (jax)iterator.next();
                jba jba2 = jaz2.h;
                Object object2 = jax2.c;
                boolean bl2 = jax2.a;
                boolean bl3 = jax2.b;
                jba2.s((ByteBuffer)object2, bl2, bl3);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @Override
    public final void g(knz object, kpv kpv2) {
        int n2;
        int n3 = jaz.i;
        object = this.a.o.a;
        // MONITORENTER : object
        List list = this.b;
        n3 = n2 = 0;
        if (list != null) {
            n3 = n2;
            if (this.a.o.f) {
                n3 = 1;
            }
        }
        // MONITOREXIT : object
        if (n3 == 0) {
            object = this.b;
            if (object != null) {
                this.i((List)object, true);
            } else {
                if (kpv2 == null) throw new AssertionError((Object)"No response header or trailer");
                this.i(kpv2.b(), true);
            }
        }
        this.a.r(jaw.j(kpv2));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void h(knz object, kpv object2, ByteBuffer byteBuffer, boolean bl2) {
        int n2 = jaz.i;
        object = this.a.o.a;
        synchronized (object) {
            jba jba2 = this.a;
            object2 = jba2.o;
            if (!((jaz)object2).g) {
                ((jaz)object2).g = true;
                jba2.f.a();
            }
            this.a.o.h(byteBuffer.position());
            return;
        }
    }
}

