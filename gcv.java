/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.Context
 *  android.net.Uri
 *  frc
 *  hom
 */
import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import androidx.wear.ambient.AmbientMode$AmbientCallback;
import androidx.wear.ambient.WearableControllerProvider;
import androidx.work.impl.WorkDatabase;
import com.google.apps.tiktok.contrib.work.TikTokListenableWorker;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

public final class gcv {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;

    public gcv(Context context, bam bam2, czh czh2, bfz bfz2, WorkDatabase workDatabase, bhd bhd2, List list) {
        jse.e(context, "context");
        jse.e(bam2, "configuration");
        jse.e(workDatabase, "workDatabase");
        this.d = bam2;
        this.f = czh2;
        this.c = bfz2;
        this.b = workDatabase;
        this.a = bhd2;
        this.g = list;
        context = context.getApplicationContext();
        jse.d(context, "context.applicationContext");
        this.e = context;
        new WearableControllerProvider(null);
    }

    public gcv(Context context, gcp gcp2, Map map, Executor executor, gto gto2, gto gto3, bmu bmu2) {
        this.a = context;
        this.b = gcp2;
        this.c = map;
        this.d = executor;
        this.e = gto2;
        this.f = gto3;
        this.g = bmu2;
    }

    public gcv(Executor executor, bmu bmu2, fru fru2, Map map) {
        this.f = new HashMap();
        this.e = new HashMap();
        fxf.K(executor);
        this.a = executor;
        fxf.K(bmu2);
        this.c = bmu2;
        this.b = fru2;
        this.d = map;
        fxf.q(map.isEmpty() ^ true);
        this.g = new gcx(1);
    }

    public gcv(jnu jnu2, jnu jnu3, jnu jnu4, jnu jnu5, jnu jnu6, jnu jnu7, jnu jnu8) {
        jnu2.getClass();
        this.b = jnu2;
        jnu3.getClass();
        this.f = jnu3;
        jnu4.getClass();
        this.d = jnu4;
        jnu5.getClass();
        this.g = jnu5;
        jnu6.getClass();
        this.a = jnu6;
        jnu7.getClass();
        this.e = jnu7;
        jnu8.getClass();
        this.c = jnu8;
    }

    public gcv(jnu jnu2, jnu jnu3, jnu jnu4, jnu jnu5, jnu jnu6, jnu jnu7, jnu jnu8, jnu jnu9) {
        jnu2.getClass();
        this.d = jnu2;
        jnu3.getClass();
        this.g = jnu3;
        jnu4.getClass();
        this.f = jnu4;
        jnu5.getClass();
        this.e = jnu5;
        jnu6.getClass();
        jnu7.getClass();
        this.a = jnu7;
        jnu8.getClass();
        this.b = jnu8;
        jnu9.getClass();
        this.c = jnu9;
    }

    public gcv(jnu jnu2, jnu jnu3, jnu jnu4, jnu jnu5, jnu jnu6, jnu jnu7, jnu jnu8, byte[] byArray) {
        this.f = jnu2;
        this.d = jnu3;
        this.g = jnu4;
        this.e = jnu5;
        this.b = jnu6;
        this.c = jnu7;
        this.a = jnu8;
    }

    public gcv(kht kht2, gui gui2, gui gui3, Executor executor, iku iku2, dmu dmu2, jnu jnu2) {
        this.f = new AtomicBoolean(true);
        this.d = kht2;
        this.c = gui2;
        this.b = gui3;
        this.a = executor;
        this.e = dmu2.a(executor, iku2, null);
        this.g = jnu2;
    }

    private final void f(gcl object, bby bby2) {
        Object object2;
        Object object3 = ((gcl)object).i.k();
        while (object3.hasNext()) {
            object2 = (String)object3.next();
            jse.e(object2, "tag");
            bby2.c.add(object2);
        }
        if (((gcl)object).e.g() && bby2 instanceof bbs) {
            object3 = (bbs)bby2;
            long l2 = (Long)((gcl)object).e.c();
            if (l2 != Long.MAX_VALUE) {
                object3 = ((bby)object3).b;
                ((bhd)object3).v = l2;
                ((bhd)object3).w = 1;
            } else {
                throw new IllegalArgumentException("Cannot set Long.MAX_VALUE as the schedule override time");
            }
        }
        object3 = new LinkedHashMap();
        AmbientMode$AmbientCallback.b(((gcl)object).f, (Map)object3);
        if (((gcl)object).l.g()) {
            object2 = this.e;
            object = ((gcl)object).l;
            object = (ComponentName)((Map)((gtt)object2).a).get(((gto)object).c());
            AmbientMode$AmbientCallback.d("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_PACKAGE_NAME", object.getPackageName(), (Map)object3);
            AmbientMode$AmbientCallback.d("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_CLASS_NAME", object.getClassName(), (Map)object3);
        }
        bby2.d(AmbientMode$AmbientCallback.a((Map)object3));
    }

    private final bmu g(gcl object, gcj object2) {
        fxf.A(((gcl)object).g.g());
        object2 = new bbs(TikTokListenableWorker.class, ((gcj)object2).a, ((gcj)object2).b);
        this.f((gcl)object, (bby)object2);
        ((bby)object2).b(((gcl)object).b);
        object = ((gcl)object).d;
        ((bby)object2).c(((gcj)object).a, ((gcj)object).b);
        return ((bby)object2).e();
    }

    private final bmu h(gcl gcl2) {
        fxf.A(gcl2.g.g() ^ true);
        bbl bbl2 = new bbl(TikTokListenableWorker.class);
        bbl2.b(gcl2.b);
        gcj gcj2 = gcl2.d;
        bbl2.c(gcj2.a, gcj2.b);
        bbl2.d(gcl2.f);
        this.f(gcl2, bbl2);
        return bbl2.e();
    }

    public final hpn a(UUID object) {
        object = this.b.b((UUID)object);
        gcx gcx2 = new gcx(3);
        return ((bmu)this.g).R((hpn)object, gcx2);
    }

    public final hpn b(gcl object) {
        Object object2;
        int n2 = gcz.c;
        Object object3 = ((gcl)object).i.k();
        while (object3.hasNext()) {
            object2 = (String)object3.next();
            if (!gcz.a.matcher((CharSequence)object2).matches()) continue;
            object = new StringBuilder("Tag ");
            ((StringBuilder)object).append((String)object2);
            ((StringBuilder)object).append(" is reserved by AccountWorkManager.");
            throw new gct(((StringBuilder)object).toString());
        }
        object3 = ((gcl)object).i.k();
        while (object3.hasNext()) {
            object2 = (String)object3.next();
            if (!gcz.b.matcher((CharSequence)object2).matches()) continue;
            object = new StringBuilder("Tag ");
            ((StringBuilder)object).append((String)object2);
            ((StringBuilder)object).append(" is reserved by TikTokWorkManager.");
            throw new gct(((StringBuilder)object).toString());
        }
        boolean bl2 = ((gcl)object).l.g();
        n2 = 1;
        if (bl2) {
            object3 = ((gcl)object).l;
            object2 = this.a;
            object3 = ((gto)object3).c();
            object2 = ((Context)object2).getPackageName();
            fxf.B(((String)object3).equals(object2) ^ true, "Default process must be targeted using shorthand '' empty string, not the package name.");
            fxf.B(((gto)this.f).g(), "You must depend upon //java/com/google/apps/tiktok/contrib/work/impl:multiprocess_module in order to use .setTargetProcess");
            object3 = this.e;
            object2 = ((gcl)object).l;
            fxf.E(((Map)((gtt)object3).a).containsKey(((gto)object2).c()), "You must generate remote worker services using java/com/google/apps/tiktok/contrib/work/codegen/generated_remote_worker_service.bzl before targeting them by process name and include the service target in every scheduling process's dagger deps. Could not find [%s]", ((gcl)object).l.c());
            fxf.r(Collections.disjoint(((gcl)object).f.c().keySet(), hav.q("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_PACKAGE_NAME", "androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_CLASS_NAME", "androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME")), "You may not specify RemoteListenableWorker arguments at the same time as TikTok's targetProcess feature.");
        }
        object3 = ((gcl)object).a;
        object2 = (String)this.c.get(object3);
        fxf.L(object2, "The input Worker wasn't annotated with @GenerateWorker. If it or any of its chained work is annotated with @GenerateAccountWorker, its work must be started with TikTokAccountWorkManager, instead. Worker class: %s", ((Class)object3).toString());
        object2 = new hdq(gcz.b((String)object2));
        object3 = new gch((gcl)object);
        object = ((gcl)object).i;
        a.s(object, "set1");
        ((gch)object3).d(new hdh((Set)object, (Set)object2));
        object = ((gch)object3).a();
        object2 = this.g;
        object3 = (String)fvd.Q(gcz.a(((gcl)object).i));
        if (((gcl)object).g.g()) {
            fxf.A(((gcl)object).g.g());
            if (((gcl)object).h.g()) {
                fxf.A(((gcl)object).g.g());
                fxf.A(((gcl)object).h.g());
                object3 = ((gci)((gcl)object).g.c()).a;
                ((gcl)object).g.c();
                object3 = this.g((gcl)object, (gcj)object3);
                object = hno.f(this.b.e(((gck)((gcl)object).h.c()).a, ((gck)((gcl)object).h.c()).b, (bmu)object3), new fmi(object3, 8), (Executor)hom.a);
            } else {
                fxf.A(((gcl)object).g.g());
                fxf.A(true ^ ((gcl)object).h.g());
                object3 = ((gci)((gcl)object).g.c()).a;
                ((gcl)object).g.c();
                object = this.g((gcl)object, (gcj)object3);
                object = hno.f(this.b.d((bmu)object), new fmi(object, 9), (Executor)hom.a);
            }
        } else {
            fxf.A(((gcl)object).g.g() ^ true);
            if (((gcl)object).h.g()) {
                fxf.A(((gcl)object).g.g() ^ true);
                fxf.A(((gcl)object).h.g());
                bmu bmu2 = this.h((gcl)object);
                Object object4 = this.b;
                object3 = ((gck)((gcl)object).h.c()).a;
                int n3 = ((gck)((gcl)object).h.c()).b - 1;
                if (n3 != 0) {
                    if (n3 == 1) {
                        n2 = 2;
                    } else {
                        throw new IllegalArgumentException("One-time unique work does not support ExistingPeriodicWorkPolicy UPDATE. Use CANCEL_AND_REENQUEUE or KEEP instead");
                    }
                }
                object = hno.f(object4.f((String)object3, n2, bmu2), new fmi(bmu2, 6), (Executor)hom.a);
            } else {
                fxf.A(((gcl)object).g.g() ^ true);
                fxf.A(true ^ ((gcl)object).h.g());
                object = this.h((gcl)object);
                object = hno.f(this.b.d((bmu)object), new fmi(object, 7), (Executor)hom.a);
            }
        }
        object3 = new gcx(2);
        return ((bmu)object2).R((hpn)object, (hny)object3);
    }

    public final hpn c(String object) {
        object = new bzb(jns.R(new String[]{object}), 11);
        return hno.f(this.b.g((bzb)object), new fiz(10), (Executor)this.d);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final frr d(frh object) {
        synchronized (this) {
            Object object2 = this.f;
            Uri uri = ((frh)object).a;
            object2 = (frr)object2.get(uri);
            boolean bl2 = true;
            if (object2 == null) {
                Object object3 = ((frh)object).a;
                fxf.v(object3.isHierarchical(), "Uri must be hierarchical: %s", object3);
                object2 = fxf.O(object3.getLastPathSegment());
                int n2 = ((String)object2).lastIndexOf(46);
                object2 = n2 == -1 ? "" : ((String)object2).substring(n2 + 1);
                fxf.v(((String)object2).equals("pb"), "Uri extension must be .pb: %s", object3);
                boolean bl3 = ((frh)object).b != null;
                fxf.r(bl3, "Proto schema cannot be null");
                bl3 = ((frh)object).c != null;
                fxf.r(bl3, "Handler cannot be null");
                Object object4 = (frs)this.d.get("singleproc");
                bl3 = object4 != null ? bl2 : false;
                fxf.v(bl3, "No XDataStoreVariantFactory registered for ID %s", "singleproc");
                object3 = fxf.O(((frh)object).a.getLastPathSegment());
                n2 = ((String)object3).lastIndexOf(46);
                object2 = object3;
                if (n2 != -1) {
                    object2 = ((String)object3).substring(0, n2);
                }
                Object object5 = ((frh)object).a;
                object3 = this.g;
                object3 = hno.g(hhk.K(object5), (hny)object3, (Executor)hom.a);
                Object object6 = this.a;
                object5 = this.c;
                frc frc2 = frc.a;
                object5 = ((frs)object4).b((frh)object, (String)object2, (Executor)object6, (bmu)object5, frc2);
                ((frs)object4).a(frc.a);
                object2 = new frr((frp)object5, (hpn)object3, false);
                object5 = ((frh)object).d;
                if (!object5.isEmpty()) {
                    object3 = this.a;
                    object4 = new frf((List)object5, (Executor)object3);
                    ((frr)object2).c((hny)object4);
                }
                this.f.put(uri, object2);
                this.e.put(uri, object);
                return object2;
            }
            frh frh2 = (frh)this.e.get(uri);
            boolean bl4 = object.equals(frh2);
            if (bl4) {
                return object2;
            }
            object2 = fvd.aq("ProtoDataStoreConfig<%s> doesn't match previous call [uri=%s] [%s]", ((frh)object).b.getClass().getSimpleName(), ((frh)object).a);
            fxf.v(((frh)object).a.equals((Object)frh2.a), (String)object2, "uri");
            fxf.v(((frh)object).b.equals(frh2.b), (String)object2, "schema");
            fxf.v(((frh)object).c.equals(frh2.c), (String)object2, "handler");
            fxf.v(fvd.z(((frh)object).d, frh2.d), (String)object2, "migrations");
            fxf.v(((frh)object).f.equals(frh2.f), (String)object2, "variantConfig");
            bl4 = ((frh)object).e == frh2.e;
            fxf.v(bl4, (String)object2, "useGeneratedExtensionRegistry");
            fxf.v(true, (String)object2, "enableTracing");
            object = new IllegalArgumentException(fvd.aq((String)object2, "unknown"));
            throw object;
        }
    }

    public final dxm e(iku iku2, dxs dxs2) {
        ((cgw)this.d.b()).getClass();
        gto gto2 = ((bqw)this.g).a();
        gto gto3 = ((bqw)this.f).a();
        Set set = (Set)((imc)this.e).a;
        set.getClass();
        Object object = this.a;
        Object object2 = this.c.b();
        object = ((bqw)object).a();
        gto gto4 = (gto)((imc)this.b).a;
        gto4.getClass();
        iku2.getClass();
        return new dxm(gto2, gto3, set, (cya)object2, (gto)object, gto4, iku2, dxs2);
    }
}

