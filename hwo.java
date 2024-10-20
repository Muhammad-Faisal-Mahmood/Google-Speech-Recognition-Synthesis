/*
 * Decompiled with CFR 0.152.
 */
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class hwo {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static hwj b(Class object) {
        Object object2;
        Object object3 = hwo.class.getClassLoader();
        if (object.equals(hwj.class)) {
            object2 = "hvl";
        } else {
            if (!((Class)object).getPackage().equals(hwo.class.getPackage())) {
                throw new IllegalArgumentException(((Class)object).getName());
            }
            object2 = String.format("%s.BlazeGenerated%sLoader", ((Class)object).getPackage().getName(), ((Class)object).getSimpleName());
        }
        try {
            object2 = Class.forName((String)object2, true, (ClassLoader)object3);
            try {
                object2 = (hwo)((Class)object2).getConstructor(null).newInstance(null);
                return (hwj)((Class)object).cast(((hwo)object2).a());
            }
            catch (InvocationTargetException invocationTargetException) {
                object3 = new IllegalStateException(invocationTargetException);
                throw object3;
            }
            catch (IllegalAccessException illegalAccessException) {
                object3 = new IllegalStateException(illegalAccessException);
                throw object3;
            }
            catch (InstantiationException instantiationException) {
                object3 = new IllegalStateException(instantiationException);
                throw object3;
            }
            catch (NoSuchMethodException noSuchMethodException) {
                object3 = new IllegalStateException(noSuchMethodException);
                throw object3;
            }
        }
        catch (ClassNotFoundException classNotFoundException) {
            Iterator iterator = Collections.singletonList(hzp.class.getDeclaredConstructor(null).newInstance(null)).iterator();
            ArrayList<hwj> arrayList = new ArrayList<hwj>();
            while (iterator.hasNext()) {
                try {
                    arrayList.add((hwj)((Class)object).cast(((hwo)iterator.next()).a()));
                }
                catch (ServiceConfigurationError serviceConfigurationError) {
                    Logger.getLogger(hwd.class.getName()).logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(String.valueOf(((Class)object).getSimpleName())), serviceConfigurationError);
                }
            }
            if (arrayList.size() == 1) {
                return (hwj)arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (hwj)((Class)object).getMethod("combine", Collection.class).invoke(null, arrayList);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw new IllegalStateException(invocationTargetException);
            }
            catch (IllegalAccessException illegalAccessException) {
                throw new IllegalStateException(illegalAccessException);
            }
            catch (NoSuchMethodException noSuchMethodException) {
                throw new IllegalStateException(noSuchMethodException);
            }
        }
    }

    protected abstract hwj a();
}

