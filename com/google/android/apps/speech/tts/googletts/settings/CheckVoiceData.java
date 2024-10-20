/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Intent
 *  android.os.Bundle
 */
package com.google.android.apps.speech.tts.googletts.settings;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

public final class CheckVoiceData
extends Activity {
    protected static void a(buc object, Set set) {
        Object object2 = brz.a((String)((buc)object).d.get(0));
        if (object2 != null) {
            object = ((bsa)object2).b;
            object2 = ((bsa)object2).b;
            object = brz.b((Locale)object);
            object2 = ((Locale)object2).getISO3Country();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append((String)object);
            stringBuilder.append("-");
            stringBuilder.append((String)object2);
            set.add(fxf.T(stringBuilder.toString()));
            return;
        }
        throw new AssertionError();
    }

    protected final void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        this.getCallingPackage();
        Object object2 = ((bxb)fvd.l(this.getApplicationContext(), bxb.class)).k();
        object = new HashSet();
        Iterator iterator = ((btn)object2).c.values().iterator();
        while (iterator.hasNext()) {
            CheckVoiceData.a(((bsw)iterator.next()).a, (Set)object);
        }
        object2 = ((btn)object2).e().a().entrySet().iterator();
        while (object2.hasNext()) {
            CheckVoiceData.a((buc)((Map.Entry)object2.next()).getValue(), (Set)object);
        }
        object2 = new Intent();
        object2.putStringArrayListExtra("availableVoices", new ArrayList(object));
        object = new ArrayList();
        ((ArrayList)object).add("");
        object2.putStringArrayListExtra("unavailableVoices", (ArrayList)object);
        this.setResult(1, (Intent)object2);
        this.finish();
    }
}

