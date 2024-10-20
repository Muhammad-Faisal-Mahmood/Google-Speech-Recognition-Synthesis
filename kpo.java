/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  hom
 */
import androidx.wear.ambient.AmbientDelegate;
import androidx.wear.ambient.AmbientMode$AmbientController;
import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;

public final class kpo {
    public final int a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public kpo() {
        throw null;
    }

    public kpo(dfu dfu2, hpq hpq2, AmbientMode$AmbientController ambientMode$AmbientController, int n2) {
        this.d = new HashMap();
        this.f = new cxv((Executor)hom.a);
        this.c = dfu2;
        this.b = hpq2;
        this.e = ambientMode$AmbientController;
        this.a = n2;
    }

    public kpo(String string, Collection collection, kpn kpn2, int n2, kpv kpv2, kod kod2) {
        this.b = string;
        this.c = collection;
        this.d = kpn2;
        this.a = n2;
        this.e = kpv2;
        this.f = kod2;
    }

    public kpo(int[] nArray, aob[] aobArray, int[] nArray2, int[][][] nArray3, aob aob2) {
        this.e = nArray;
        this.b = aobArray;
        this.d = nArray3;
        this.c = nArray2;
        this.f = aob2;
        this.a = 1;
    }

    public static final hpn e(den den2) {
        ((hfk)ddd.c.l().j("com/google/android/libraries/micore/superpacks/packs/FetchPipeline", "complete", 736, "FetchPipeline.java")).u("Successfully fetched pack %s", den2.o());
        return hhk.K(null);
    }

    private final hpn l(den den2, File file, ddn ddn2, AmbientDelegate ambientDelegate) {
        Object object = this.c;
        ddn ddn3 = den2.o();
        if (((dfu)object).a(ddn2) > this.a) {
            return hhk.J(new dek(String.format(Locale.US, "Validation for pack %s has failed more times than maximum allowed of %d", ddn3, this.a)));
        }
        return this.k(((dgx)ambientDelegate.b).e().k().k(), den2, file, ddn2, ambientDelegate);
    }

    public final Collection a() {
        List list;
        List list2 = list = this.c;
        if (list == null) {
            list2 = Collections.emptyList();
        }
        return list2;
    }

    public final void b(ddn comparable, ddn object, den object2) {
        Object object3 = (dfu)this.c;
        File file = ((dfu)object3).e((ddn)comparable);
        File file2 = ((dfu)object3).e((ddn)object);
        ((dfu)object3).l((ddn)object, ((dfu)object3).h((ddn)comparable));
        object3 = ((den)object2).e();
        if (object3 != null) {
            ((dfu)this.c).m((ddn)object, (ded)object3);
        }
        if (((den)object2).m()) {
            this.d(file2, ((den)object2).d());
        }
        if (!comparable.equals(object) && file.exists()) {
            object2 = this.c;
            object = ((dco)comparable).a;
            object2 = (dfu)object2;
            comparable = ((dfu)object2).f((ddn)comparable);
            ((dfu)object2).e.b((String)object, (File)comparable, dhu.g);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void c(den object, ddn comparable, ddn object2) {
        Object object3 = (dfu)this.c;
        File file = ((dfu)object3).e((ddn)object2);
        object3 = ((dfu)object3).e((ddn)comparable);
        this.b(dde.a(((den)object).o(), ((den)object).k()), (ddn)comparable, (den)object);
        ((hfk)ddd.c.l().j("com/google/android/libraries/micore/superpacks/packs/FetchPipeline", "unstage", 683, "FetchPipeline.java")).G("Unstaging pack %s from staged file %s to final file %s", ((den)object).o(), dec.e((File)object3), dec.e(file));
        Object object4 = dhu.h;
        ((dfu)this.c).o((ddn)object2, (dhu)object4, false);
        object4 = (dfu)this.c;
        ((dfu)object4).l((ddn)object2, ((dfu)object4).h((ddn)comparable));
        object = ((den)object).e();
        if (object != null) {
            ((dfu)this.c).m((ddn)object2, (ded)object);
        }
        if (((File)object3).renameTo(file)) {
            // MONITORENTER : this
            // MONITOREXIT : this
            return;
        }
        object = object3.toString();
        object2 = ((Object)file).toString();
        comparable = new StringBuilder("Failed to rename staged file ");
        ((StringBuilder)comparable).append((String)object);
        ((StringBuilder)comparable).append(" to ");
        ((StringBuilder)comparable).append((String)object2);
        throw new IOException(((StringBuilder)comparable).toString());
    }

    public final void d(File comparable, long l2) {
        if (((File)comparable).exists()) {
            long l3 = ((dfu)this.c).e.a((File)comparable);
            if (l3 == l2) {
                return;
            }
            String string = comparable.toString();
            comparable = new StringBuilder("File ");
            ((StringBuilder)comparable).append(string);
            ((StringBuilder)comparable).append(" does not have the expected size: ");
            ((StringBuilder)comparable).append(l2);
            ((StringBuilder)comparable).append(", actual: ");
            ((StringBuilder)comparable).append(l3);
            throw new dha(((StringBuilder)comparable).toString());
        }
        throw new dha(a.ar(comparable, "File ", " does not exist"));
    }

    public final int f(int n2) {
        return ((int[])this.e)[n2];
    }

    public final int g(int n2, int n3, int n4) {
        return vy.j(((int[][][])this.d)[n2][n3][n4]);
    }

    public final aob h(int n2) {
        return ((aob[])this.b)[n2];
    }

    public final hpn i(ddn ddn2, ddn ddn3, ddn ddn4, AmbientDelegate ambientDelegate) {
        dgx dgx2 = (dgx)ambientDelegate.b;
        den den2 = dgx2.c().f();
        File file = ((dfu)this.c).e(ddn2);
        if (dgx2.g().b == null) {
            ((hfk)ddd.c.l().j("com/google/android/libraries/micore/superpacks/packs/FetchPipeline", "continueWithFetchedFile", 466, "FetchPipeline.java")).u("Pack %s does not require unpacking", den2.i());
            return hno.g(this.l(den2, file, ddn2, ambientDelegate), new cvq((Object)this, (Object)den2, (Object)ddn2, (Object)ddn4, 17, null), (Executor)this.b);
        }
        return hno.g(this.l(den2, file, ddn2, ambientDelegate), new dca(this, ddn2, ddn3, ambientDelegate, den2, ddn4, 3), (Executor)this.b);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final hpn j(AmbientDelegate ambientDelegate) {
        long l2;
        dgx dgx2 = (dgx)ambientDelegate.b;
        Object object = dgx2.c().f();
        ddn ddn2 = ((den)object).o();
        Object object2 = dgx2.g();
        int n2 = dde.a;
        Comparable<File> comparable = ((dfu)this.c).e(ddn2);
        long l3 = ((den)object).d();
        boolean bl2 = ((den)object).m();
        if (bl2) {
            l2 = ((dfu)this.c).e.a((File)comparable);
            if (l3 == l2) {
                ((hfk)ddd.c.l().j("com/google/android/libraries/micore/superpacks/packs/FetchPipeline", "fetchOnePack", 359, "FetchPipeline.java")).u("Final file %s is already available", ddn2);
                object = kpo.e((den)object);
                return hmv.g((hpn)object, dek.class, new cww(this, ambientDelegate, 18, null), (Executor)this.b);
            }
            if (((File)comparable).exists()) {
                ((hfk)((hfk)ddd.c.h()).j("com/google/android/libraries/micore/superpacks/packs/FetchPipeline", "fetchOnePack", 365, "FetchPipeline.java")).G("Final file %s is found with %d bytes, expected: %d", ddn2.e(), l2, l3);
            }
        } else if (((File)comparable).exists()) {
            ((hfk)ddd.c.l().j("com/google/android/libraries/micore/superpacks/packs/FetchPipeline", "fetchOnePack", 375, "FetchPipeline.java")).u("Final file %s is already available (size verification is off)", ddn2);
            object = kpo.e((den)object);
            return hmv.g((hpn)object, dek.class, new cww(this, ambientDelegate, 18, null), (Executor)this.b);
        }
        comparable = dde.b(ddn2);
        Comparable<File> comparable2 = ((dfu)this.c).e((ddn)comparable);
        if (bl2) {
            l2 = ((dfu)this.c).e.a((File)comparable2);
            if (l2 == l3) {
                ((hfk)ddd.c.l().j("com/google/android/libraries/micore/superpacks/packs/FetchPipeline", "fetchOnePack", 389, "FetchPipeline.java")).u("Staged file %s is already available", comparable);
                this.c((den)object, (ddn)comparable, ddn2);
                object = kpo.e((den)object);
                return hmv.g((hpn)object, dek.class, new cww(this, ambientDelegate, 18, null), (Executor)this.b);
            }
            if (((File)comparable2).exists()) {
                ((hfk)((hfk)ddd.c.f()).j("com/google/android/libraries/micore/superpacks/packs/FetchPipeline", "fetchOnePack", 395, "FetchPipeline.java")).G("Staged file %s is found with %d bytes, expected: %d, will ignore it and re-fetch it.", ((ddn)comparable).e(), l2, l3);
            }
        }
        comparable2 = dde.a(ddn2, (String)((elq)object2).b);
        object2 = ((dfu)this.c).e((ddn)comparable2);
        if (bl2) {
            l3 = ((dfu)this.c).e.a((File)object2);
            if (l3 == (l2 = dly.D((den)object))) {
                ((hfk)ddd.c.l().j("com/google/android/libraries/micore/superpacks/packs/FetchPipeline", "fetchOnePack", 414, "FetchPipeline.java")).u("Fetched file %s is available", comparable2);
                object = this.i((ddn)comparable2, (ddn)comparable, ddn2, ambientDelegate);
                return hmv.g((hpn)object, dek.class, new cww(this, ambientDelegate, 18, null), (Executor)this.b);
            }
            if (((File)object2).exists()) {
                ((hfk)((hfk)ddd.c.f()).j("com/google/android/libraries/micore/superpacks/packs/FetchPipeline", "fetchOnePack", 419, "FetchPipeline.java")).G("Fetched file %s is found with %d bytes, expected: %d, will resume fetching with  partial file.", ((ddn)comparable2).e(), l3, l2);
            }
        }
        dej dej2 = dgx2.b();
        ((hfk)ddd.c.l().j("com/google/android/libraries/micore/superpacks/packs/FetchPipeline", "fetchOnePack", 429, "FetchPipeline.java")).G("Fetching pack %s to file %s with fetcher %s", ((den)object).i(), dec.e((File)object2), crh.n(dej2));
        object = hno.g(hhk.L(dej2.b((den)object, dgx2.f(), (File)object2)), new dgy(this, ambientDelegate, (ddn)comparable2, (den)object, bl2, (File)object2, (ddn)comparable, ddn2, 0), (Executor)this.b);
        return hmv.g((hpn)object, dek.class, new cww(this, ambientDelegate, 18, null), (Executor)this.b);
    }

    public final hpn k(Iterator iterator, den den2, File file, ddn ddn2, AmbientDelegate ambientDelegate) {
        if (!iterator.hasNext()) {
            return hhk.K(null);
        }
        ddn ddn3 = den2.o();
        Object object = (Map.Entry)iterator.next();
        dgh dgh2 = (dgh)object.getValue();
        Object object2 = (String)object.getKey();
        ((hfk)ddd.c.l().j("com/google/android/libraries/micore/superpacks/packs/FetchPipeline", "runValidators", 633, "FetchPipeline.java")).G("Validating fetched file %s with validator %s and scheme %s", dec.e(file), crh.n(dgh2), object2);
        fxf.K(object2);
        ((hfk)ddd.a.l().j("com/google/android/libraries/micore/superpacks/packs/ChecksumValidator", "validate", 114, "ChecksumValidator.java")).C("Validating checksum for pack %s using scheme %s", den2.o().e(), object2);
        object = den2.o();
        object2 = new dgf(den2, (String)object2, file, 2);
        return hhk.L(hno.g(hmv.g(dgh2.a.p(object, (ddz)object2), Throwable.class, new cvq(this, ddn2, ddn3, den2, 18), (Executor)this.b), new dca(this, ambientDelegate, iterator, den2, file, ddn2, 4), (Executor)this.b));
    }
}

