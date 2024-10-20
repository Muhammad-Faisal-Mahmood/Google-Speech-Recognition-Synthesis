/*
 * Decompiled with CFR 0.152.
 */
import J.N;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.concurrent.Executor;
import org.chromium.net.impl.CronetBidirectionalStream;

public final class jba
extends jbg {
    public static final ByteBuffer a = ByteBuffer.allocateDirect(0);
    @Deprecated
    static final itv b = new itv("cronet-annotation", null);
    public static final itv c = new itv("cronet-annotations", null);
    public final String d;
    public final String e;
    public final jjo f;
    public final Executor g;
    public final iwx h;
    public final jbc i;
    public final Runnable j;
    public knz k;
    public final boolean l;
    public final Object m;
    public final Collection n;
    public final jaz o;
    public jau p;
    private final jay t;

    public jba(String string, String string2, Executor executor, iwx iwx2, jbc jbc2, Runnable runnable, Object object, int n2, ixb ixb2, jjo jjo2, itw itw2, jjv jjv2) {
        boolean bl2 = true;
        super(new jkz(1), jjo2, jjv2, iwx2, itw2);
        this.t = new jay(this);
        this.d = string;
        this.e = string2;
        this.f = jjo2;
        this.g = executor;
        a.s(iwx2, "headers");
        this.h = iwx2;
        this.i = jbc2;
        this.j = runnable;
        if (ixb2.a != ixa.a) {
            bl2 = false;
        }
        this.l = bl2;
        this.m = itw2.g(b);
        this.n = (Collection)itw2.g(c);
        this.o = new jaz(this, n2, jjo2, object, jjv2);
        this.f();
    }

    @Override
    public final its a() {
        return its.a;
    }

    @Override
    protected final /* synthetic */ jbf p() {
        return this.t;
    }

    @Override
    protected final /* synthetic */ jbi q() {
        return this.o;
    }

    public final void r(iyh iyh2) {
        this.i.a(this, iyh2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void s(ByteBuffer object, boolean bl2, boolean bl3) {
        knz knz2 = this.k;
        if (knz2 == null) {
            return;
        }
        Object object2 = ((CronetBidirectionalStream)knz2).s;
        synchronized (object2) {
            jjj.U((ByteBuffer)object);
            if (!((Buffer)object).hasRemaining() && !bl2) {
                object = new IllegalArgumentException("Empty buffer before end of stream.");
                throw object;
            }
            if (((CronetBidirectionalStream)knz2).v) {
                object = new IllegalArgumentException("Write after writing end of stream.");
                throw object;
            }
            if (((CronetBidirectionalStream)knz2).k()) {
            } else {
                ((CronetBidirectionalStream)knz2).t.add(object);
                if (bl2) {
                    ((CronetBidirectionalStream)knz2).v = true;
                }
            }
        }
        if (!bl3) return;
        object2 = this.k;
        object = ((CronetBidirectionalStream)object2).s;
        synchronized (object) {
            if (((CronetBidirectionalStream)object2).k()) return;
            int n2 = ((CronetBidirectionalStream)object2).C;
            if (n2 != 8 && n2 != 9) {
                return;
            }
            if (((CronetBidirectionalStream)object2).t.isEmpty() && ((CronetBidirectionalStream)object2).u.isEmpty()) {
                if (((CronetBidirectionalStream)object2).w) return;
                ((CronetBidirectionalStream)object2).w = true;
                N.MGLIR7Sc(((CronetBidirectionalStream)object2).A, object2);
                if (CronetBidirectionalStream.j(((CronetBidirectionalStream)object2).e)) return;
                ((CronetBidirectionalStream)object2).C = 10;
                return;
            }
            if (!((CronetBidirectionalStream)object2).t.isEmpty()) {
                ((CronetBidirectionalStream)object2).u.addAll(((CronetBidirectionalStream)object2).t);
                ((CronetBidirectionalStream)object2).t.clear();
            }
            if (((CronetBidirectionalStream)object2).C == 9) {
                return;
            }
            ((CronetBidirectionalStream)object2).i();
            n2 = ((CronetBidirectionalStream)object2).q;
            ((CronetBidirectionalStream)object2).q = n2 + 1;
            return;
        }
    }

    @Override
    protected final /* synthetic */ jbi t() {
        return this.o;
    }
}

