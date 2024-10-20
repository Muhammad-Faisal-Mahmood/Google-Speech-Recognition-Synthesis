/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 */
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import j$.util.Optional;
import j$.util.function.Consumer$_CC;
import java.util.HashMap;
import java.util.Locale;
import java.util.function.Consumer;

public final class fca
implements Consumer {
    public final String a;
    public final Locale b;
    public final String c;
    public final ezj d;
    public final Optional e;

    public /* synthetic */ fca(String string, Locale locale, String string2, ezj ezj2, Optional optional) {
        this.a = string;
        this.b = locale;
        this.c = string2;
        this.d = ezj2;
        this.e = optional;
    }

    public final void accept(Object object) {
        hth hth2 = (hth)object;
        object = new Intent("com.google.recognition.action.DOWNLOAD_LANGUAGE");
        Object object2 = (hth)hth2.b;
        Object object3 = ((hth)object2).a;
        ComponentName componentName = ComponentName.unflattenFromString((String)"com.google.android.tts/com.google.android.libraries.speech.modelmanager.languagepack.legacy.DownloadActivity");
        Object object4 = (HashMap)object3;
        object3 = this.a;
        ((HashMap)object4).put(object3, this.e);
        object2 = (HashMap)((hth)object2).b;
        object4 = this.d;
        ((HashMap)object2).put(object3, object4);
        object.setComponent(componentName);
        object.setFlags(0x10000000);
        object.putExtra("android.speech.extra.LANGUAGE", this.b.toLanguageTag()).putExtra("FromPublicModelManager", true).putExtra("RequestId", (String)object3).putExtra("com.google.recognition.extra.DISPLAY_NAME", this.c).putExtra("com.google.recognition.extra.DOWNLOAD_SIZE", ((ezj)object4).e);
        gqk.m((Context)hth2.a, (Intent)object);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$_CC.$default$andThen(this, consumer);
    }
}

