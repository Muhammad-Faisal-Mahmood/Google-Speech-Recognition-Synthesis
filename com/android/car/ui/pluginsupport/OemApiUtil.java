/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.Log
 *  com.android.car.ui.plugin.oemapis.PluginVersionProviderOEMV1
 */
package com.android.car.ui.pluginsupport;

import android.content.Context;
import android.util.Log;
import com.android.car.ui.plugin.oemapis.PluginVersionProviderOEMV1;
import com.android.car.ui.pluginsupport.PluginFactoryAdapterV1;
import com.android.car.ui.pluginsupport.PluginFactoryAdapterV2;
import com.android.car.ui.pluginsupport.PluginFactoryAdapterV3;
import com.android.car.ui.pluginsupport.PluginFactoryAdapterV4;
import com.android.car.ui.pluginsupport.PluginFactoryAdapterV5;
import com.android.car.ui.pluginsupport.PluginFactoryAdapterV6;
import com.android.car.ui.pluginsupport.PluginFactoryAdapterV7;
import com.android.car.ui.pluginsupport.PluginFactoryAdapterV8;
import com.android.car.ui.pluginsupport.PluginFactoryAdapterV9;
import com.android.car.ui.pluginsupport.PluginVersionProviderAdapterV1;
import j$.util.Collection$_EL;
import java.util.Collection;
import java.util.SortedSet;
import java.util.TreeSet;

public final class OemApiUtil {
    private static final String TAG = "carui";

    private OemApiUtil() {
    }

    private static SortedSet getAvailableOemApis() {
        TreeSet<bka> treeSet = new TreeSet<bka>();
        treeSet.add(new bka("com.android.car.ui.plugin.oemapis.PluginFactoryOEMV1", PluginFactoryAdapterV1.class, 1));
        treeSet.add(new bka("com.android.car.ui.plugin.oemapis.PluginFactoryOEMV2", PluginFactoryAdapterV2.class, 2));
        treeSet.add(new bka("com.android.car.ui.plugin.oemapis.PluginFactoryOEMV3", PluginFactoryAdapterV3.class, 3));
        treeSet.add(new bka("com.android.car.ui.plugin.oemapis.PluginFactoryOEMV4", PluginFactoryAdapterV4.class, 4));
        treeSet.add(new bka("com.android.car.ui.plugin.oemapis.PluginFactoryOEMV5", PluginFactoryAdapterV5.class, 5));
        treeSet.add(new bka("com.android.car.ui.plugin.oemapis.PluginFactoryOEMV6", PluginFactoryAdapterV6.class, 6));
        treeSet.add(new bka("com.android.car.ui.plugin.oemapis.PluginFactoryOEMV7", PluginFactoryAdapterV7.class, 7));
        treeSet.add(new bka("com.android.car.ui.plugin.oemapis.PluginFactoryOEMV8", PluginFactoryAdapterV8.class, 8));
        treeSet.add(new bka("com.android.car.ui.plugin.oemapis.PluginFactoryOEMV9", PluginFactoryAdapterV9.class, 9));
        return treeSet;
    }

    static bkc getPluginFactory(Context object, String object2) {
        Object object3;
        SortedSet sortedSet;
        block9: {
            sortedSet = null;
            try {
                object3 = Class.forName("com.android.car.ui.plugin.PluginVersionProviderImpl").getDeclaredConstructor(null).newInstance(null);
                break block9;
            }
            catch (ReflectiveOperationException reflectiveOperationException) {
                object3 = reflectiveOperationException;
                if (reflectiveOperationException.getCause() != null) {
                    object3 = reflectiveOperationException.getCause();
                }
                Log.e((String)TAG, (String)"PluginVersionProviderImpl could not be instantiated!", (Throwable)object3);
            }
            catch (ClassNotFoundException classNotFoundException) {
                Log.i((String)TAG, (String)"PluginVersionProviderImpl not found.", (Throwable)classNotFoundException);
            }
            object3 = null;
        }
        if (object3 instanceof PluginVersionProviderOEMV1) {
            object3 = new PluginVersionProviderAdapterV1((PluginVersionProviderOEMV1)object3);
        } else {
            Log.e((String)TAG, (String)"PluginVersionProviderImpl was not instanceof any known versions of PluginVersionProviderOEMV#.");
            object3 = null;
        }
        Object object4 = sortedSet;
        if (object3 != null) {
            block10: {
                object4 = OemApiUtil.getAvailableOemApis();
                object = ((PluginVersionProviderAdapterV1)object3).getPluginFactory(((bka)Collection$_EL.stream((Collection)object4).findFirst().get()).c, (Context)object, (String)object2);
                object4 = object4.iterator();
                while (object4.hasNext()) {
                    object3 = (bka)object4.next();
                    object2 = ((bka)object3).a;
                    if (object2 == null || !((Class)object2).isInstance(object)) continue;
                    object = ((bka)object3).a(object);
                    break block10;
                }
                object = null;
            }
            if (object == null) {
                Log.e((String)TAG, (String)"PluginVersionProvider found, but did not provide a factory implementing any known interfaces!");
                return null;
            }
            object4 = object;
        }
        return object4;
    }
}

