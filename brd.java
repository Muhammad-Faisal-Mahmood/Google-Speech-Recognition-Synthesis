/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import androidx.wear.ambient.AmbientDelegate;

public final class brd
implements gik,
iky,
ilv {
    public final be a;
    public img b;
    public img c;
    public img d;
    public final brg e;
    public final brb f;
    private img g;
    private img h;
    private final brd i;

    public brd() {
        throw null;
    }

    public brd(brg object, brb object2, be be2) {
        this.i = this;
        this.e = object;
        this.f = object2;
        this.a = be2;
        this.g = object2 = imc.a(be2);
        this.b = ima.d(new fzt((jnu)object2, ((brg)object).h, 12));
        this.h = object = bra.a;
        this.c = ima.d(new fzt(this.g, (jnu)object, 3));
        this.d = imk.a(new gdh(this.g, 13));
    }

    public final Bundle a() {
        Bundle bundle;
        Bundle bundle2 = bundle = this.a.l;
        if (bundle == null) {
            bundle2 = new Bundle();
        }
        return bundle2;
    }

    public final byx b() {
        return new byx((gbu)this.c.b(), (byp)this.e.A.b());
    }

    public final grn c() {
        return new grn(new bzo((gpm)this.e.g.b()));
    }

    @Override
    public final AmbientDelegate d() {
        return new AmbientDelegate(this.e, this.i);
    }

    @Override
    public final ksb e() {
        return this.f.f();
    }
}

