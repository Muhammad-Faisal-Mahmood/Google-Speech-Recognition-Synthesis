/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.StrictMode
 */
import android.os.StrictMode;
import java.lang.constant.Constable;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class gbx
extends gbu
implements aas {
    public static final hei a = hei.m("com/google/apps/tiktok/concurrent/futuresmixin/FuturesMixinImpl");
    private final boolean b;
    private gby c;
    private final jnu d;
    private final aco e;
    private final abb f;
    private final gbw g = new gbw();
    private boolean h = false;
    private boolean i = false;
    private final Set j = new HashSet();

    public gbx(jnu jnu2, aco aco2, abb abb2, boolean bl2) {
        this.d = jnu2;
        this.e = aco2;
        abb2.b(this);
        this.f = abb2;
        this.b = bl2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void e() {
        Object object2222;
        if (!this.b) {
            for (Object object2222 : this.j) {
                this.c.b((gbv)object2222);
            }
            this.j.clear();
        }
        this.i = true;
        fpk.f(this.g);
        this.g.a.clear();
        this.g.b = null;
        this.h = true;
        object2222 = this.c;
        ((gby)object2222).e = true;
        ((gby)object2222).b.f();
        Iterator iterator = ((gby)object2222).c.iterator();
        while (iterator.hasNext()) {
            gca object3 = (gca)iterator.next();
            if (!object3.b) {
                gby.a((gbv)((gby)object2222).b.a(object3.a), object3);
            } else {
                try {
                    ((gby)object2222).b.a(object3.a);
                }
                catch (NullPointerException nullPointerException) {
                    throw new IllegalStateException("future=".concat(String.valueOf(String.valueOf(object3))), nullPointerException);
                }
            }
            object3.c((gby)object2222);
        }
        return;
    }

    @Override
    protected final void a(hpn object, Object object2, gbv gbv2) {
        fpk.c();
        boolean bl2 = ((by)this.d.b()).V();
        boolean bl3 = true;
        fxf.B(bl2 ^ true, "Futures should not be triggered by lifecycle changes, and cannot be listened to while a Fragment is stopped. Consider using SubscriptionMixin instead. See go/tiktok/concurrent/futuresmixin.md. listen() was called while the Fragment's state is saved - work started at this point in the lifecycle can't be persisted, and can lose state.");
        Object object3 = goy.b;
        object3 = gno.b();
        if (object3 != null && ((gom)(object3 = object3.j(goy.b))).b() && ((Boolean)((gom)object3).a()).booleanValue()) {
            StrictMode.noteSlowCall((String)"FuturesMixin called from Lifecycle");
        }
        object3 = this.c;
        fpk.c();
        fxf.av();
        Object object4 = ((gby)object3).b;
        fpk.c();
        Constable constable = gbv2.getClass();
        constable = (Integer)((gbt)object4).c.get(constable);
        Class<?> clazz = gbv2.getClass();
        bl2 = constable != null;
        fxf.E(bl2, "The callback %s has not been registered", clazz);
        object4 = ((gbt)object4).a((Integer)constable);
        clazz = gbv2.getClass();
        bl2 = object4 == gbv2 ? bl3 : false;
        fxf.E(bl2, "The callback class %s was registered using a different instance. The instance registered in onCreate() must be the same instance used to listen. You can use a final member variable to safely hold the callback reference for each lifecycle.", clazz);
        object2 = new gca((Integer)constable, object2, (hpn)object);
        ((gby)object3).c.add(object2);
        if (((gby)object3).e) {
            ((gca)object2).c((gby)object3);
            if (!object.isDone()) {
                gby.a(gbv2, (gca)object2);
            }
        }
        if (!this.h) {
            object = new Throwable();
            ((Throwable)object).fillInStackTrace();
            a.as(a.h(), "listen() called outside listening window", "com/google/apps/tiktok/concurrent/futuresmixin/FuturesMixinImpl", "listen", '\u00e3', "FuturesMixinImpl.java", (Throwable)object);
            this.g.a.add(gbv2);
            this.g.b = gqk.i(new bpw(18));
            object = this.g;
            fpk.f((Runnable)object);
            fpk.e((Runnable)object);
        }
    }

    @Override
    public final void b(gbv gbv2) {
        fpk.c();
        fxf.B(this.i ^ true, "FuturesMixin.registerCallback() was called after creation. FuturesMixin.registerCallback() must be called exactly once for each callback, in the peer's constructor or onCreate().");
        fxf.B(this.f.a().a(aba.d) ^ true, "FuturesMixin.registerCallback() was called after creation. FuturesMixin.registerCallback() must be called exactly once for each callback, in the peer's constructor or onCreate().");
        fxf.B(this.h ^ true, "FuturesMixin.registerCallback() was called after creation. FuturesMixin.registerCallback() must be called exactly once for each callback, in the peer's constructor or onCreate().");
        if (this.b) {
            gby gby2 = this.c;
            if (gby2 != null) {
                gby2.b(gbv2);
                return;
            }
            this.j.add(gbv2);
            return;
        }
        this.j.add(gbv2);
    }

    @Override
    public final void onCreate(abe object) {
        this.c = (gby)new acn(this.e).a(gby.class);
        if (this.b) {
            for (gbv gbv2 : this.j) {
                this.c.b(gbv2);
            }
            this.j.clear();
        }
    }

    @Override
    public final void onDestroy(abe object) {
        object = this.c;
        fxf.B(((gby)object).e ^ true, "FuturesMixinViewModel.stopCallbacks() must be called before it becomes detached from its parent.");
        ((gby)object).b.b();
    }

    @Override
    public final /* synthetic */ void onPause(abe abe2) {
        wc.f(abe2);
    }

    @Override
    public final void onResume(abe abe2) {
        if (!this.h) {
            this.e();
        }
    }

    @Override
    public final void onStart(abe abe2) {
        fxf.B(this.h ^ true, "FuturesMixin.onStart() was manually invoked, and is now re-running.");
        this.e();
    }

    @Override
    public final void onStop(abe iterator) {
        if (this.h) {
            iterator = this.c;
            ((gby)((Object)iterator)).e = false;
            iterator = ((gby)((Object)iterator)).c.iterator();
            while (iterator.hasNext()) {
                ((gca)iterator.next()).c(null);
            }
            this.h = false;
        }
    }
}

