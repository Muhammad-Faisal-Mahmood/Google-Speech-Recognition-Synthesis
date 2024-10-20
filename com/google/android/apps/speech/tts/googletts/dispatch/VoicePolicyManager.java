/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.apps.speech.tts.googletts.dispatch;

import j$.util.Collection$_EL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class VoicePolicyManager {
    public static final hei a = hei.m("com/google/android/apps/speech/tts/googletts/dispatch/VoicePolicyManager");
    public long b;
    public final hac c;
    public final hav d;
    public final Map e;
    private final iil f;
    private final ibc g;
    private final ibh h;
    private final bwp i;
    private final bxt j;

    public VoicePolicyManager(iil object, bxt bxt2, ibc object2, ibh object3, bwp iterator2) {
        this.f = object;
        this.g = object2;
        this.h = object3;
        this.i = iterator2;
        this.j = bxt2;
        object = new gzy();
        for (Iterator iterator2 : bxt2.c()) {
            object3 = hav.n(((btw)((Object)iterator2)).c);
            iterator2 = ((btw)((Object)iterator2)).b.iterator();
            while (iterator2.hasNext()) {
                ((gzy)object).d((String)iterator2.next(), object3);
            }
        }
        this.c = ((gzy)object).b();
        this.d = (hav)Collection$_EL.stream(bxt2.c()).flatMap(new bpf(4)).collect(gye.b);
        this.e = new HashMap();
    }

    private native void nativeManagerDelete(long var1);

    private native long nativeManagerInit(byte[] var1, byte[] var2, byte[] var3);

    public final void b() {
        this.i.a();
        if (this.b == 0L) {
            iil iil2 = this.f;
            ibc ibc2 = this.g;
            ibh ibh2 = this.h;
            this.b = this.nativeManagerInit(iil2.g(), ibc2.g(), ibh2.g());
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void finalize() {
        synchronized (this) {
            long l2 = this.b;
            if (l2 != 0L) {
                this.nativeManagerDelete(l2);
                this.b = 0L;
            }
            return;
        }
    }

    public native byte[] nativeManagerApplyVoicePolicy(long var1, String var3, String var4);

    public native boolean nativeManagerCanClientAccess1PVoices(long var1, String var3, String var4);
}

