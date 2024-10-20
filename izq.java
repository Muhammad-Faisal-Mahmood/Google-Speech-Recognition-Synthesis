/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 */
import android.os.Parcel;

final class izq
extends izu {
    public final boolean a;
    private iyh h;
    private iwx i;

    public izq(izi izi2, its its2, int n2, boolean bl2) {
        super(izi2, its2, n2);
        this.a = bl2;
    }

    @Override
    protected final void a(iyh iyh2) {
        ((jcl)this.g).a(iyh2, jck.a, new iwx());
    }

    @Override
    protected final void b() {
        this.f.e();
        this.f.h();
        this.m(izs.f);
        ((jcl)this.g).a(this.h, jck.a, this.i);
        this.o();
    }

    @Override
    public final void c(int n2, Parcel object) {
        object = izy.a(object, this.c);
        this.f.d();
        ((jcl)this.g).c((iwx)object);
    }

    @Override
    public final void d(int n2, Parcel parcel) {
        this.h = jjj.i(n2, parcel);
        this.i = izy.a(parcel, this.c);
    }

    @Override
    public final boolean e() {
        return this.a;
    }
}

