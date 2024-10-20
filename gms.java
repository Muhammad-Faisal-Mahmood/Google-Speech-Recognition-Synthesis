/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  gqv
 */
import android.content.Context;
import android.content.Intent;
import java.util.Objects;

public final class gms {
    public gpc a;
    public boolean b;
    public gpc c;
    public boolean d;
    public gpf e;
    private final bh f;
    private final Context g;
    private gpc h;
    private boolean i;
    private boolean j;
    private gpf k;
    private gpf l;

    public gms(bh bh2, Context context) {
        this.f = bh2;
        this.g = context;
    }

    private final gop B(gop gop2) {
        gop2 = gop.e(gop2, gop.d(((gps)idi.e(this.g, gps.class)).d()));
        jse.d(gop2, "copyCombine(...)");
        return gop2;
    }

    private final gpf C(String string, gop gop2) {
        if (gno.r()) {
            gop gop3 = gop2;
            if (gop2 == null) {
                gop3 = goo.a;
            }
            jse.b(gop3);
            return fxf.ar(string, this.B(gop3));
        }
        Object object = fxf.i(this.g);
        jse.d(object, "getActivityTraceCreation(...)");
        if (gop2 != null) {
            Object object2 = ((gpm)object).d;
            gop2 = gop.e((gop)((gpm)object).a.b(), gop2);
            object = (gql)((gpm)object).c;
            return ((gqa)object2).e(string, gop2, (gql)object);
        }
        return ((gpm)object).d(string);
    }

    private final String D(String string) {
        String string2 = this.g.getClass().getSimpleName();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append(" ");
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    private final void E(String object, String string, Intent object2) {
        this.c = gno.b();
        long l2 = gqk.a;
        Object object3 = gqv.a;
        jse.e(object2, "intent");
        jse.e(object3, "restricted");
        boolean bl2 = true;
        gpc gpc2 = gqk.n(object2, true);
        object2 = goy.a;
        object3 = gop.b();
        object3.a(goy.c, new gmq(0));
        object3 = ((gop)object3).f();
        if (gpc2 != null) {
            gno.w(gpc2);
            this.a = gpc2;
            jse.b(object2);
            object = this.B((gop)object2);
        } else {
            gpc2 = this.a;
            if (gpc2 != null) {
                gno.w(gpc2);
                jse.b(object2);
                object = this.B((gop)object2);
            } else {
                this.j = gno.s();
                gpc2 = gno.b();
                if (!(gpc2 instanceof grv) || !((grv)((Object)gpc2)).a()) {
                    bl2 = false;
                }
                if (gno.r() && !bl2) {
                    jse.b(object2);
                    object = this.B((gop)object2);
                } else {
                    gpc2 = gno.e();
                    if (gpc2 != null) {
                        this.k = gpc2;
                        gno.w(gpc2);
                        this.l = fxf.at(this.D((String)object), gqv.a, gop.e((gop)object3, goy.a(gox.h)));
                        object = object2;
                    } else {
                        this.k = fxf.i(this.g).c(this.D((String)object), gop.e((gop)object2, goy.a(gox.h)), gqv.a);
                        object = object2;
                    }
                }
                this.a = gno.b();
            }
        }
        this.e = fxf.at(this.D(string), gqv.a, gop.e((gop)object, goy.a(gox.b)));
        fpk.e(new gjf(this, 6));
    }

    private final void F() {
        if (this.i) {
            this.a = null;
            this.i = false;
        }
    }

    private final void G() {
        gpc gpc2 = this.h;
        if (gpc2 != null) {
            this.a = gpc2;
            this.h = null;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void H() {
        gpf gpf2;
        if (this.b) {
            return;
        }
        jse.e(gqv.a, "restricted");
        Object object = gqk.c;
        synchronized (object) {
            gpf2 = gqk.d;
            gqk.d = null;
        }
        if (gpf2 == null) return;
        this.b = true;
        this.a = gpf2;
    }

    private final void I() {
        gpf gpf2 = this.e;
        if (gpf2 == null) {
            return;
        }
        Objects.toString(gpf2);
        throw new IllegalStateException("Expected lifecycleStepSpan to be null but was: ".concat(gpf2.toString()));
    }

    public final gpf a() {
        Object object = gmw.a;
        gpf gpf2 = this.C("finish", gmw.a);
        this.h = object = gno.b();
        jse.b(object);
        Object object2 = gqv.a;
        jse.e(object, "trace");
        jse.e(object2, "restricted");
        object2 = gqk.c;
        synchronized (object2) {
            gqk.d = object;
            return new gmp(gpf2, new gmr((gpf)object, 4), 1, null);
        }
    }

    public final gpf b() {
        this.I();
        gpf gpf2 = this.C("Back pressed", null);
        fxf.K(gqv.a);
        return new gmp(gpf2, gno.i(), 2, null);
    }

    public final gpf c() {
        this.G();
        this.o("onDestroy", goy.a(gox.g));
        return new gmr(this, 0);
    }

    public final gpf d(Intent intent) {
        jse.e(intent, "intent");
        this.E("Reintenting into", "onNewIntent", intent);
        return new gmr(this, 2);
    }

    public final gpf e() {
        this.G();
        this.o("onPause", goy.a(gox.e));
        return new gmr(this, 1);
    }

    public final gpf f() {
        this.c = gno.b();
        gno.w(this.a);
        return new gmp(this.C("onPostResume", null), this, 3);
    }

    public final gpf g() {
        this.F();
        this.H();
        this.o("onResume", goy.a(gox.d));
        return new gmr(this, 2);
    }

    public final gpf h() {
        this.F();
        this.H();
        this.o("onStart", goy.a(gox.c));
        return new gmr(this, 2);
    }

    public final gpf i() {
        this.G();
        this.o("onStop", goy.a(gox.f));
        return new gmr(this, 1);
    }

    public final gpf j() {
        this.I();
        return this.C("onSupportNavigateUp", null);
    }

    public final gpf k() {
        this.I();
        return this.C("onUserInteraction", null);
    }

    public final void l() {
        Context context = this.g;
        this.f.bb().X(fxf.i(context).g(gqv.a));
    }

    public final void m(aaz aaz2) {
        jse.e((Object)aaz2, "event");
        int n2 = aaz2.ordinal();
        if (n2 != 0) {
            if (n2 != 1 && n2 != 2 && n2 != 3 && n2 != 4 && n2 != 5) {
                Objects.toString((Object)aaz2);
                throw new UnsupportedOperationException("Unknown lifecycle: ".concat(String.valueOf((Object)aaz2)));
            }
            this.p();
            return;
        }
        if (this.d) {
            this.p();
            this.d = false;
        }
    }

    public final void n() {
        this.i = true;
        if (!this.f.isChangingConfigurations() && !this.f.isFinishing()) {
            this.a = null;
        }
    }

    public final void o(String string, gop gop2) {
        this.c = gno.b();
        gop2 = gop.e(goy.a, gop2);
        Object object = this.a;
        if (object != null) {
            gno.w((gpc)object);
            jse.b(gop2);
            gop2 = this.B(gop2);
        } else {
            this.j = gno.s();
            if (!gno.r()) {
                object = this.g;
                Object object2 = object.getClass();
                object = fxf.i((Context)object);
                object2 = ((Class)object2).getSimpleName();
                CharSequence charSequence = new StringBuilder();
                charSequence.append((String)object2);
                charSequence.append(": ");
                charSequence.append(string);
                charSequence = charSequence.toString();
                Object object3 = ((gpm)object).d;
                object2 = gop.e((gop)((gpm)object).a.b(), gop2);
                object = (gql)((gpm)object).c;
                this.k = ((gqa)object3).e((String)charSequence, (gop)object2, (gql)object);
            } else {
                jse.b(gop2);
                gop2 = this.B(gop2);
            }
            this.a = gno.b();
        }
        this.e = fxf.at(this.D(string), gqv.a, gop2);
    }

    public final void p() {
        gpf gpf2 = this.e;
        if (gpf2 != null) {
            gpf2.close();
            this.e = null;
            if (this.j) {
                this.j = false;
                gno.l();
            }
            if ((gpf2 = this.l) != null) {
                gpf2.close();
            }
            this.l = null;
            gpf2 = this.k;
            if (gpf2 != null) {
                gpf2.close();
            }
            this.k = null;
            gno.w(this.c);
            this.c = null;
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final gpf q() {
        this.I();
        this.F();
        this.H();
        if (this.a == null) {
            return this.C("onActivityResult", null);
        }
        gpc gpc2 = gno.b();
        gno.w(this.a);
        return new gmp(this.C("onActivityResult", null), gpc2, 0);
    }

    public final gpf r() {
        return this.C("onConfigurationChanged", null);
    }

    public final gpf s() {
        this.H();
        Intent intent = this.f.getIntent();
        jse.d(intent, "getIntent(...)");
        this.E("Intenting into", "onCreate", intent);
        return new gmr(this, 2);
    }

    public final gpf t() {
        gpf gpf2 = gno.h();
        if (gno.r()) {
            return gpf2;
        }
        gpf2 = this.g;
        return new gmr((Object)fxf.i((Context)gpf2).d(String.valueOf(gpf2.getClass().getSimpleName()).concat(": onCreatePanelMenu")), 3);
    }

    public final gpf u() {
        this.I();
        return this.C("onMenuItemSelected", null);
    }

    public final gpf v() {
        this.I();
        return this.C("onOptionsItemSelected", null);
    }

    public final gpf w() {
        this.I();
        return this.C("onPictureInPictureModeChanged", null);
    }

    public final gpf x() {
        this.F();
        gop gop2 = goo.a;
        jse.d(gop2, "empty(...)");
        this.o("onPostCreate", gop2);
        return new gmr(this, 2);
    }

    public final gpf y() {
        return this.C("onRequestPermissionsResult", null);
    }

    public final gpf z() {
        gop gop2 = goo.a;
        jse.d(gop2, "empty(...)");
        this.o("onSaveInstanceState", gop2);
        return new gmr(this, 1);
    }
}

