/*
 * Decompiled with CFR 0.152.
 */
import J.N;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Executor;
import org.chromium.net.impl.CronetBidirectionalStream;

final class jay
implements jbf {
    final jba a;

    public jay(jba jba2) {
        this.a = jba2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void a(iyh iyh2) {
        int n2 = jaz.i;
        Object object = this.a.o.a;
        synchronized (object) {
            Object object2 = this.a.o;
            if (((jaz)object2).d) {
                return;
            }
            ((jaz)object2).d = true;
            ((jaz)object2).e = iyh2;
            Object object3 = ((jaz)object2).b.iterator();
            while (object3.hasNext()) {
                ((ByteBuffer)((jax)object3.next()).c).clear();
            }
            ((jaz)object2).b.clear();
            object3 = this.a;
            object2 = ((jba)object3).k;
            if (object2 != null) {
                ((knz)object2).a();
            } else {
                ((jba)object3).i.a((jba)object3, iyh2);
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void b(jjw object, boolean bl2, boolean bl3, int n2) {
        n2 = jaz.i;
        Object object2 = this.a.o.a;
        synchronized (object2) {
            if (this.a.o.d) {
                return;
            }
            if (object != null) {
                object = ((jbd)object).a;
                ((Buffer)object).flip();
            } else {
                object = jba.a;
            }
            this.a.w(((Buffer)object).remaining());
            Object object3 = this.a;
            jaz jaz2 = ((jba)object3).o;
            if (!jaz2.c) {
                object3 = new jax((ByteBuffer)object, bl2, bl3);
                jaz2.b.add(object3);
            } else {
                ((jba)object3).s((ByteBuffer)object, bl2, bl3);
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void c(iwx object) {
        int n2;
        this.a.j.run();
        Object object2 = this.a;
        Object object3 = ((jba)object2).p;
        if (object3 == null) {
            return;
        }
        Object object4 = new jaw((jba)object2);
        object = ((jba)object2).d;
        object2 = ((jba)object2).g;
        object = ((jau)object3).a.b((String)object, (kny)object4, (Executor)object2);
        if (((jau)object3).b) {
            n2 = ((jau)object3).c;
            object4 = (kqh)object;
            ((kqh)object4).i = true;
            ((kqh)object4).j = n2;
        }
        if (((jau)object3).d) {
            n2 = ((jau)object3).e;
            object3 = (kqh)object;
            ((kqh)object3).k = true;
            ((kqh)object3).l = n2;
        }
        object4 = this.a;
        if (((jba)object4).l) {
            ((kqh)object).g = true;
        }
        if ((object3 = ((jba)object4).m) != null || ((jba)object4).n != null) {
            if (object3 != null) {
                ((knx)object).b(object3);
            }
            if ((object3 = this.a.n) != null) {
                object3 = object3.iterator();
                while (object3.hasNext()) {
                    ((knx)object).b(object3.next());
                }
            }
        }
        object3 = this.a;
        ((knx)object).a(jeb.j.a, ((jba)object3).e);
        ((knx)object).a(jeb.h.a, "application/grpc");
        ((knx)object).a("te", "trailers");
        object4 = jju.a(((jba)object3).h);
        for (n2 = 0; n2 < ((Object)object4).length; n2 += 2) {
            object3 = new String((byte[])object4[n2], StandardCharsets.UTF_8);
            if (jeb.h.a.equalsIgnoreCase((String)object3) || jeb.j.a.equalsIgnoreCase((String)object3) || jeb.i.a.equalsIgnoreCase((String)object3)) continue;
            ((knx)object).a((String)object3, new String((byte[])object4[n2 + 1], StandardCharsets.UTF_8));
        }
        object3 = this.a;
        object4 = (kqh)object;
        String string = ((kqh)object4).f;
        boolean bl2 = ((kqh)object4).g;
        Collection collection = ((kqh)object4).h;
        boolean bl3 = ((kqh)object4).i;
        n2 = ((kqh)object4).j;
        boolean bl4 = ((kqh)object4).k;
        int n3 = ((kqh)object4).l;
        object2 = ((kqh)object4).e;
        object = ((kqh)object4).d;
        Object object5 = ((kqh)object4).c;
        String string2 = ((kqh)object4).b;
        ((jba)object3).k = ((kqh)object4).a.g(string2, (kny)object5, (Executor)object, string, (List)object2, bl2, collection, bl3, n2, bl4, n3);
        object3 = this.a.k;
        object = ((CronetBidirectionalStream)object3).s;
        synchronized (object) {
            n2 = ((CronetBidirectionalStream)object3).B;
            if (n2 != 0) {
                object3 = new IllegalStateException("Stream is already started.");
                throw object3;
            }
            try {
                long l2;
                ((CronetBidirectionalStream)object3).A = l2 = N.MqTDYvZd(object3, ((CronetBidirectionalStream)object3).a.i(), ((CronetBidirectionalStream)object3).g ^ true, ((CronetBidirectionalStream)object3).h, ((CronetBidirectionalStream)object3).i, ((CronetBidirectionalStream)object3).j, ((CronetBidirectionalStream)object3).k, ((CronetBidirectionalStream)object3).l);
                object4 = ((CronetBidirectionalStream)object3).c;
                n2 = ((CronetBidirectionalStream)object3).d;
                object2 = ((CronetBidirectionalStream)object3).e;
                n2 = N.McDUim_I(l2, object3, object4, 4, object2, ((CronetBidirectionalStream)object3).f, CronetBidirectionalStream.j((String)object2) ^ true);
                if (n2 == -1) {
                    object4 = ((CronetBidirectionalStream)object3).e;
                    object5 = new StringBuilder();
                    ((StringBuilder)object5).append("Invalid http method ");
                    ((StringBuilder)object5).append((String)object4);
                    object2 = new IllegalArgumentException(((StringBuilder)object5).toString());
                    throw object2;
                }
                if (n2 <= 0) {
                    ((CronetBidirectionalStream)object3).a.l();
                    object2 = new jhz(object3, 11, null);
                    ((CronetBidirectionalStream)object3).n = object4 = new ksb((Runnable)object2);
                    ((CronetBidirectionalStream)object3).n.b();
                    ((CronetBidirectionalStream)object3).C = 1;
                    ((CronetBidirectionalStream)object3).B = 1;
                    return;
                }
                object4 = ((CronetBidirectionalStream)object3).f[n2 - 1];
                object2 = new StringBuilder();
                ((StringBuilder)object2).append("Invalid header with headername: ");
                ((StringBuilder)object2).append((String)object4);
                object5 = new IllegalArgumentException(((StringBuilder)object2).toString());
                throw object5;
            }
            catch (RuntimeException runtimeException) {
                ((CronetBidirectionalStream)object3).d(false);
                throw runtimeException;
            }
        }
    }
}

