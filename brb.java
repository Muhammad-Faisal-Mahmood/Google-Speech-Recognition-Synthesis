/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
import android.app.Activity;
import java.util.Set;

public final class brb
implements gig,
gio,
gpp,
ikx,
ilm,
ilv {
    public img a;
    public img b;
    public final brg c;
    private final Activity d;
    private img e;
    private img f;
    private img g;
    private img h;
    private img i;
    private img j;
    private img k;
    private img l;
    private img m;
    private img n;
    private img o;
    private img p;
    private img q;
    private img r;
    private img s;
    private img t;
    private img u;
    private img v;
    private img w;
    private final brc x;
    private final brb y;

    public brb() {
        throw null;
    }

    public brb(brg object, brc object2, Activity object3, gib gib2) {
        this.y = this;
        this.c = object;
        this.x = object2;
        this.d = object3;
        this.a = imk.a(new elm(((brg)object).x, 14));
        this.e = object2 = imc.c(object3);
        this.f = new gpn((jnu)object2, 4);
        this.g = object2 = imc.c(gib2);
        this.h = imk.a(new fzt(this.f, (jnu)object2, 19));
        this.i = new dse(this.e, 2);
        object3 = ((brg)object).v;
        object2 = this.i;
        object = this.h;
        object3 = new ghp((jnu)object3, (jnu)object2, (jnu)object);
        this.j = object3;
        this.k = new ghq((jnu)object2, (jnu)object, (jnu)object3);
        this.l = bra.a;
        this.m = ima.d(new flj(imj.a, 5));
        this.n = ima.d(new flj(this.h, 7));
        this.o = bra.a;
        this.p = object = new ilz();
        this.q = ima.d(new btl((jnu)this.h, (jnu)this.m, (jnu)this.n, (jnu)this.o, (jnu)object, 18, null));
        this.r = object = ima.d(new btl((jnu)this.h, (jnu)this.m, (jnu)this.n, (jnu)this.o, (jnu)this.p, 19, null));
        this.s = object = new fyz(this.l, this.q, (jnu)object);
        this.t = object = new fyw((jnu)object);
        this.u = object = new flj((jnu)object, 3);
        new bqw((img)object, 1, null);
        object2 = this.p;
        object = ima.d(new fzt(this.h, this.k, 18, null));
        ilz.a((ilz)object2, (img)object);
        this.v = object = new ils(this.e);
        this.w = ima.d(new fzt((jnu)object, imj.a, 20));
        this.b = imk.a(new gdh(this.h, 12));
    }

    public final Activity a() {
        Activity activity = this.d;
        ils.c(activity);
        return activity;
    }

    @Override
    public final giu b() {
        return (giu)this.w.b();
    }

    @Override
    public final gpm c() {
        return (gpm)this.c.g.b();
    }

    @Override
    public final Set d() {
        return hdc.a;
    }

    @Override
    public final bqv e() {
        return new bqv(this.c, this.x, this.y);
    }

    @Override
    public final ksb f() {
        Boolean bl2 = true;
        return new ksb(new imd(hac.m(bl2, bl2, bl2)), new bqz(this.c));
    }
}

