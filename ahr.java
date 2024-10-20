/*
 * Decompiled with CFR 0.152.
 */
import java.net.UnknownHostException;
import java.nio.ByteBuffer;

final class ahr
extends kps {
    public volatile boolean a;
    final ahs b;

    public ahr(ahs ahs2) {
        this.b = ahs2;
        this.a = false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void a(kpt object, kpv object2, kod kod2) {
        synchronized (this) {
            boolean bl2 = this.a;
            if (bl2) {
                return;
            }
            if (kod2 instanceof kpc && ((kpc)kod2).a() == 1) {
                object2 = this.b;
                ((ahs)object2).g = object = new UnknownHostException();
            } else {
                this.b.g = kod2;
            }
            this.b.b.e();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void b(kpt kpt2, kpv kpv2, ByteBuffer byteBuffer) {
        synchronized (this) {
            boolean bl2 = this.a;
            if (bl2) {
                return;
            }
            this.b.b.e();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void c(kpt kpt2, kpv kpv2, String string) {
        synchronized (this) {
            boolean bl2 = this.a;
            if (bl2) {
                return;
            }
            abr.i(this.b.c);
            abr.i(this.b.d);
            abr.i(this.b.e);
            kpt2.b();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void d(kpt object, kpv kpv2) {
        synchronized (this) {
            boolean bl2 = this.a;
            if (bl2) {
                return;
            }
            object = this.b;
            ((ahs)object).f = kpv2;
            ((ahs)object).b.e();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void e(kpt object, kpv kpv2) {
        synchronized (this) {
            boolean bl2 = this.a;
            if (bl2) {
                return;
            }
            object = this.b;
            ((ahs)object).h = true;
            ((ahs)object).b.e();
            return;
        }
    }
}

