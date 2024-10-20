/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public final class gbt {
    public static final AtomicInteger a = new AtomicInteger(123051698);
    public final ot b = new ot();
    public final ot c = new ot();
    private final String d;

    public gbt(String string) {
        fxf.r(fxf.P(string) ^ true, "mapKey must be a non-empty, non-null static String unique to the class using CallbackIdMap.");
        this.d = string;
    }

    public final Object a(int n2) {
        fpk.c();
        Object object = this.b.get(n2);
        if (object == null) {
            for (Map.Entry entry : this.c.entrySet()) {
                if ((Integer)entry.getValue() != n2) continue;
                throw new NullPointerException("Callback not re-registered for: ".concat(String.valueOf(((Class)entry.getKey()).getName())));
            }
        }
        if (object != null) {
            return object;
        }
        throw new NullPointerException(fvd.aq("No callback existed for %s", n2));
    }

    public final void b() {
        fpk.c();
        this.b.clear();
    }

    public final void c(Object object) {
        fpk.c();
        Object object2 = this.c;
        Class<?> clazz = object.getClass();
        if (((pa)object2).containsKey(clazz)) {
            object2 = (Integer)this.c.get(clazz);
            ((Integer)object2).intValue();
            boolean bl2 = this.b.put(object2, object) == null;
            fxf.E(bl2, "Attempted to register the callback class %s twice for one `Fragment`. A callback class' type is used to uniquely identify the callback and make sure it's reregistered after a configuration change, preventing state loss after a configuration change. See http://go/tiktok-futures#limitations or http://go/tiktok/dev/dataservice/subscriptionmixin#best-practices. This check can also trigger if new callback classes are registered after process death and recreation from save instance state. This most often happens when experiment flags change. See b/224812898.", clazz);
            return;
        }
        int n2 = a.getAndIncrement();
        ot ot2 = this.c;
        object2 = n2;
        ot2.put(clazz, object2);
        this.b.put(object2, object);
    }

    public final void d(Bundle object) {
        fpk.c();
        if (object != null) {
            String[] stringArray = "CallbackIdMap.classes".concat(this.d);
            fxf.B(object.containsKey((String)stringArray), "CallbackIdMap writes its keys unconditionally. It did not find its state on restore, which suggests state loss.");
            Object object2 = this.d;
            stringArray = object.getStringArray((String)stringArray);
            object2 = object.getIntArray("CallbackIdMap.class_ids".concat((String)object2));
            for (int i2 = 0; i2 < stringArray.length; ++i2) {
                try {
                    object = (Integer)this.c.put(Class.forName(stringArray[i2]), (Object)((int)object2[i2]));
                    if (object == null) continue;
                }
                catch (ClassNotFoundException classNotFoundException) {
                    throw new RuntimeException(classNotFoundException);
                }
                int n2 = (Integer)object;
                Object object3 = object2[i2];
                boolean bl2 = n2 == object3;
                fxf.H(bl2, "Callback ID for class %s was restored with ID %s, but had an existing mapping of %s. Always register for FuturesMixin callbacks and subscribe to SubscriptionMixin callbacks in onCreate()! Do *not* subscribe in a Peer's constructor", stringArray[i2], (int)object3, object);
            }
        }
    }

    public final void e(Bundle bundle) {
        fpk.c();
        String string = "CallbackIdMap.classes".concat(this.d);
        fxf.E(bundle.containsKey(string) ^ true, "Bundle already contains key %s. This suggests that two instances of CallbackIdMap were created with the same key in the same Fragment or Activity. This creates state store/restore collisions. Check for bugs where the same mixin is created for a Fragment twice during one lifecycle.", string);
        Object object = this.c;
        int n2 = ((pa)object).f;
        String[] stringArray = new String[n2];
        int[] nArray = new int[n2];
        Iterator iterator = ((ot)object).entrySet().iterator();
        n2 = 0;
        while (iterator.hasNext()) {
            object = (Map.Entry)iterator.next();
            stringArray[n2] = ((Class)object.getKey()).getName();
            nArray[n2] = (Integer)object.getValue();
            ++n2;
        }
        bundle.putStringArray(string, stringArray);
        bundle.putIntArray("CallbackIdMap.class_ids".concat(this.d), nArray);
    }

    public final void f() {
        fpk.c();
        for (Map.Entry entry : this.c.entrySet()) {
            fxf.E(this.b.containsKey((Integer)entry.getValue()), "Did not restore a callback for %s. You must re-register all callbacks you previously had after a configuration change, so that you don't lose user state.", entry.getKey());
        }
    }
}

