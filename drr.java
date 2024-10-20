/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  hom
 */
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Locale;
import java.util.concurrent.Executor;

public final class drr
extends dro
implements dmw,
dri {
    static final hav a = hav.s("Cold startup", "Cold startup interactive", "Cold startup interactive before onDraw", "Warm startup", "Warm startup interactive", "Warm startup interactive before onDraw", "Warm startup activity onStart", "Cold startup class loading", "Cold startup from process creation", "Cold startup interactive before onDraw from process creation", "Cold startup interactive from process creation");
    public static final int f = 0;
    public final dmt b;
    public final iku c;
    public final iku d;
    public final gui e;
    private final Executor g;

    public drr(dmu dmu2, Executor executor, iku iku2, iku iku3, jnu jnu2, dml dml2) {
        new ConcurrentHashMap();
        this.b = dmu2.a((Executor)hom.a, iku2, jnu2);
        this.g = executor;
        this.c = iku2;
        this.d = iku3;
        this.e = fvd.ap(new drq(dml2, iku2, 0, null));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final hpn d(drn object, String string) {
        synchronized (this) {
            if (drn.b((drn)object)) {
                return hpj.a;
            }
            long l2 = this.b.a(string);
            if (l2 == -1L) {
                return hpj.a;
            }
            ((drn)object).b.b = dmz.b();
            ((drn)object).d = 1;
            if (!drn.b((drn)object) && !fxf.P(string)) {
                if (!a.contains(string)) return this.e(string, l2, (drn)object);
                object = new IllegalArgumentException(String.format(Locale.US, "%s is reserved event. Dropping timer.", string));
                return hhk.J((Throwable)object);
            }
            object = new IllegalArgumentException("Can't record an event that was never started or has been stopped already");
            return hhk.J((Throwable)object);
        }
    }

    private final hpn e(String string, long l2, drn drn2) {
        return hhk.P(new drp(this, string, l2, drn2), this.g);
    }

    @Override
    public final /* synthetic */ void L() {
    }

    @Override
    public final hpn a(djt object, long l2, long l3) {
        drn drn2 = new drn(l2, l3);
        dmt dmt2 = this.b;
        object = ((djt)object).a;
        l2 = dmt2.a((String)object);
        object = l2 == -1L ? hpj.a : this.e((String)object, l2, drn2);
        return object;
    }

    @Override
    public final drn b() {
        if (!this.b.d()) {
            return drn.a;
        }
        return new drn();
    }

    @Override
    public final hpn c(drn drn2, djt djt2) {
        return this.d(drn2, djt2.a);
    }
}

