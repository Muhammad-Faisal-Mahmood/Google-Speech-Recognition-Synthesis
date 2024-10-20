/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;

public final class acb {
    public static final acq a = new aca();
    public static final acq b = new aca();
    public static final acq c = new aca();

    public static final abw a(acr object) {
        Object object2 = (awh)((acr)object).a(a);
        if (object2 != null) {
            Object object3 = (aco)((acr)object).a(b);
            if (object3 != null) {
                Bundle bundle = (Bundle)((acr)object).a(c);
                String string = (String)((acr)object).a(acl.d);
                if (string != null) {
                    object = object2.getSavedStateRegistry().e();
                    object = object instanceof acc ? (acc)object : null;
                    if (object != null) {
                        acd acd2 = acb.b((aco)object3);
                        object3 = object2 = (abw)acd2.a.get(string);
                        if (object2 == null) {
                            object3 = abw.a;
                            ((acc)object).b();
                            object3 = ((acc)object).a;
                            object3 = object3 != null ? object3.getBundle(string) : null;
                            object2 = ((acc)object).a;
                            if (object2 != null) {
                                object2.remove(string);
                            }
                            if ((object2 = ((acc)object).a) != null && object2.isEmpty()) {
                                ((acc)object).a = null;
                            }
                            object3 = abr.b((Bundle)object3, bundle);
                            acd2.a.put(string, object3);
                        }
                        return object3;
                    }
                    throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
                }
                throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
            }
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
    }

    public static final acd b(aco aco2) {
        return (acd)new acn((aco)aco2, (ack)new abz()).b.a(jsd.e(acd.class), "androidx.lifecycle.internal.SavedStateHandlesVM");
    }

    public static final void c(awh awh2) {
        Object object = awh2.getLifecycle().a();
        if (object != aba.b && object != aba.c) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (awh2.getSavedStateRegistry().e() == null) {
            object = new acc(awh2.getSavedStateRegistry(), (aco)((Object)awh2));
            awh2.getSavedStateRegistry().b("androidx.lifecycle.internal.SavedStateHandlesProvider", (awe)object);
            awh2.getLifecycle().b(new abx(object, 0));
        }
    }
}

