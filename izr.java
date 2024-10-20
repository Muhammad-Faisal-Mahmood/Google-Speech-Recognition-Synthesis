/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 */
import android.os.Parcel;

final class izr
extends izu {
    private final izh a;

    public izr(izh izh2, its its2, int n2) {
        super(izh2, its2, n2);
        this.a = izh2;
    }

    @Override
    protected final void a(iyh iyh2) {
        ((jjf)this.g).a(iyh2);
    }

    @Override
    protected final void b() {
        ((jjf)this.g).b();
    }

    @Override
    public final void c(int n2, Parcel object) {
        Object object2 = this.c;
        String string = object.readString();
        object2 = izy.a((Parcel)object, (its)object2);
        object = jjo.a;
        object = this.a.a;
        if (object.isEmpty()) {
            object = jjo.a;
        } else {
            int n3 = object.size();
            kmp[] kmpArray = new kmp[n3];
            for (int i2 = 0; i2 < n3; ++i2) {
                kmpArray[i2] = ((iyb)object.get(i2)).a();
            }
            object = new jjo(kmpArray);
        }
        object = new jaf(this.a, this.d, (jjo)object);
        object = (n2 & 0x10) != 0 ? new jaq(this, (jaf)object, this.c) : new jaa(this, (jaf)object, this.c);
        object = this.a.b((jje)object, string, (iwx)object2);
        if (((iyh)object).g()) {
            fxf.K((jjf)this.g);
            if (this.b.v()) {
                ((jjf)this.g).e();
            }
            return;
        }
        this.h((iyh)object);
    }

    @Override
    public final void d(int n2, Parcel parcel) {
    }

    final void f() {
        if (!this.p()) {
            this.m(izs.f);
            this.f.h();
            ((jjf)this.g).a(iyh.b);
        }
    }
}

