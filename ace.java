/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.os.Bundle
 */
import android.app.Application;
import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.List;

public final class ace
extends acm
implements ack {
    private Application a;
    private final ack b;
    private Bundle c;
    private abb d;
    private awf e;

    public ace() {
        this.b = new acj();
    }

    public ace(Application object, awh awh2, Bundle bundle) {
        this.e = awh2.getSavedStateRegistry();
        this.d = awh2.getLifecycle();
        this.c = bundle;
        this.a = object;
        if (object != null) {
            if (acj.a == null) {
                acj.a = new acj((Application)object);
            }
            object = acj.a;
            jse.b(object);
        } else {
            object = new acj();
        }
        this.b = object;
    }

    @Override
    public final ach a(Class clazz) {
        jse.e(clazz, "modelClass");
        String string = clazz.getCanonicalName();
        if (string != null) {
            return this.d(string, clazz);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override
    public final ach b(Class object, acr acr2) {
        block4: {
            block7: {
                block6: {
                    Object object2;
                    block5: {
                        jse.e(object, "modelClass");
                        object2 = (String)acr2.a(acl.d);
                        if (object2 == null) break block4;
                        if (acr2.a(acb.a) == null || acr2.a(acb.b) == null) break block5;
                        Application application = (Application)acr2.a(acj.b);
                        boolean bl2 = aao.class.isAssignableFrom((Class<?>)object);
                        object2 = bl2 && application != null ? acf.b((Class)object, acf.a) : acf.b((Class)object, acf.b);
                        if (object2 == null) {
                            return this.b.b((Class)object, acr2);
                        }
                        object = bl2 && application != null ? acf.a((Class)object, (Constructor)object2, application, acb.a(acr2)) : acf.a((Class)object, (Constructor)object2, acb.a(acr2));
                        break block6;
                    }
                    if (this.d == null) break block7;
                    object = this.d((String)object2, (Class)object);
                }
                return object;
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
    }

    @Override
    public final /* synthetic */ ach c(jta jta2, acr acr2) {
        return we.g(this, jta2, acr2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final ach d(String object, Class object2) {
        wg wg2;
        jse.e(wg2, "modelClass");
        abb abb2 = this.d;
        if (abb2 == null) throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        boolean bl2 = aao.class.isAssignableFrom((Class<?>)((Object)wg2));
        Object object3 = bl2 && this.a != null ? acf.b((Class)((Object)wg2), acf.a) : acf.b((Class)((Object)wg2), acf.b);
        if (object3 == null) {
            if (this.a != null) {
                return this.b.a((Class)((Object)wg2));
            }
            if (acl.c == null) {
                acl.c = new acl();
            }
            object = acl.c;
            jse.b(object);
            return ((acl)object).a((Class)((Object)wg2));
        }
        awf awf2 = this.e;
        jse.b(awf2);
        Bundle bundle = this.c;
        jse.e(awf2, "registry");
        Object object4 = awf2.a((String)object);
        List list = abw.a;
        object4 = new aby((String)object, abr.b((Bundle)object4, bundle));
        ((aby)object4).b(awf2, abb2);
        aay.c(awf2, abb2);
        object = bl2 && (object = this.a) != null ? acf.a((Class)((Object)wg2), (Constructor)object3, object, ((aby)object4).a) : acf.a((Class)((Object)wg2), (Constructor)object3, ((aby)object4).a);
        object3 = ((ach)object).h;
        if (((acu)object3).c) {
            acu.a((AutoCloseable)object4);
            return object;
        }
        wg2 = ((acu)object3).d;
        synchronized (wg2) {
            object3 = (AutoCloseable)((acu)object3).a.put("androidx.lifecycle.savedstate.vm.tag", object4);
        }
        acu.a((AutoCloseable)object3);
        return object;
    }

    @Override
    public final void e(ach ach2) {
        jse.e(ach2, "viewModel");
        if (this.d != null) {
            awf awf2 = this.e;
            jse.b(awf2);
            abb abb2 = this.d;
            jse.b(abb2);
            aay.b(ach2, awf2, abb2);
        }
    }
}

