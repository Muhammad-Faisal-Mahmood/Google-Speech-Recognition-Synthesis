/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Application
 *  android.app.Service
 *  android.content.BroadcastReceiver
 *  android.content.ContentProvider
 *  android.content.Intent
 */
package androidx.core.app;

import android.app.Activity;
import android.app.AppComponentFactory;
import android.app.Application;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Intent;

public class CoreComponentFactory
extends AppComponentFactory {
    static Object a(Object object) {
        Object object2;
        if (object instanceof sh && (object2 = ((sh)object).a()) != null) {
            return object2;
        }
        return object;
    }

    public final Activity instantiateActivity(ClassLoader classLoader, String string, Intent intent) {
        return (Activity)CoreComponentFactory.a(super.instantiateActivity(classLoader, string, intent));
    }

    public final Application instantiateApplication(ClassLoader classLoader, String string) {
        return (Application)CoreComponentFactory.a(super.instantiateApplication(classLoader, string));
    }

    public final ContentProvider instantiateProvider(ClassLoader classLoader, String string) {
        return (ContentProvider)CoreComponentFactory.a(super.instantiateProvider(classLoader, string));
    }

    public final BroadcastReceiver instantiateReceiver(ClassLoader classLoader, String string, Intent intent) {
        return (BroadcastReceiver)CoreComponentFactory.a(super.instantiateReceiver(classLoader, string, intent));
    }

    public final Service instantiateService(ClassLoader classLoader, String string, Intent intent) {
        return (Service)CoreComponentFactory.a(super.instantiateService(classLoader, string, intent));
    }
}

