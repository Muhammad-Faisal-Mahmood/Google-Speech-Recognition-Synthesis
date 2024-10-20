/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  android.util.Log
 *  hom
 */
package com.google.android.libraries.performance.primes.transmitter;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import j$.util.Objects;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.concurrent.Executor;

public final class LifeboatReceiver
extends BroadcastReceiver {
    public final void onReceive(Context object, Intent stringArray) {
        if (stringArray.hasExtra("MetricSnapshot") && stringArray.hasExtra("Transmitters")) {
            Object object2;
            Object object3 = stringArray.getByteArrayExtra("MetricSnapshot");
            fxf.K(object3);
            try {
                object2 = hwj.a();
                object3 = hwv.o(dsy.a, object3, 0, ((byte[])object3).length, (hwj)object2);
                hwv.D((hwv)object3);
                object2 = (dsy)object3;
            }
            catch (hxn hxn2) {
                Log.e((String)"PrimesLifeboatReceiver", (String)"Unable to parse the payload of MetricSnapshot.", (Throwable)hxn2);
            }
            object3 = this.goAsync();
            stringArray = stringArray.getStringArrayExtra("Transmitters");
            fxf.K(stringArray);
            ArrayList<hpn> arrayList = new ArrayList<hpn>(stringArray.length);
            for (int i2 = 0; i2 < stringArray.length; ++i2) {
                String string = stringArray[i2];
                try {
                    Constructor<?> constructor = Class.forName(string).getDeclaredConstructor(null);
                    constructor.setAccessible(true);
                    arrayList.add(((dsz)constructor.newInstance(null)).a((Context)object, (dsy)object2));
                    continue;
                }
                catch (Throwable throwable) {
                    Log.e((String)"PrimesLifeboatReceiver", (String)String.format("Unable to transmit the crash using %s.", string), (Throwable)throwable);
                }
            }
            object = hhk.Q(arrayList);
            Objects.requireNonNull(object3);
            object.c(new dqv(object3, 3), (Executor)hom.a);
            return;
        }
    }
}

