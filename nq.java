/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.content.IntentSender$SendIntentException
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.os.Parcelable
 *  android.util.Log
 */
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

public final class nq {
    public final Map a;
    public final Map b;
    public final Map c;
    public final List d;
    public final transient Map e;
    public final Map f;
    public final Bundle g;
    final mr h;

    public nq() {
        this.a = new LinkedHashMap();
        this.b = new LinkedHashMap();
        this.c = new LinkedHashMap();
        this.d = new ArrayList();
        this.e = new LinkedHashMap();
        this.f = new LinkedHashMap();
        this.g = new Bundle();
    }

    public nq(mr mr2) {
        this.h = mr2;
        this.a = new LinkedHashMap();
        this.b = new LinkedHashMap();
        this.c = new LinkedHashMap();
        this.d = new ArrayList();
        this.e = new LinkedHashMap();
        this.f = new LinkedHashMap();
        this.g = new Bundle();
    }

    public final nm a(String string, nu nu2, nl nl2) {
        this.c(string);
        Object object = new bxt(nl2, nu2);
        this.e.put(string, object);
        if (this.f.containsKey(string)) {
            object = this.f.get(string);
            this.f.remove(string);
            nl2.a(object);
        }
        if ((object = (nk)a.M(this.g, string, nk.class)) != null) {
            this.g.remove(string);
            Intent intent = ((nk)object).b;
            nl2.a(nu2.a(((nk)object).a, intent));
        }
        return new np(this, string, nu2);
    }

    public final void b(int n2, String string) {
        Map map = this.a;
        Integer n3 = n2;
        map.put(n3, string);
        this.b.put(string, n3);
    }

    public final void c(String string) {
        if ((Integer)this.b.get(string) == null) {
            Serializable serializable = aud.a;
            Iterator iterator = jsl.d(new jtk((jqz)((Object)serializable), (jrk)new jto((jqz)((Object)serializable)), 0)).a();
            while (iterator.hasNext()) {
                serializable = (Number)iterator.next();
                int n2 = ((Number)serializable).intValue();
                if (this.a.containsKey(n2)) continue;
                this.b(((Number)serializable).intValue(), string);
                return;
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    }

    public final void d(String string) {
        Object object;
        Object object2;
        if (!this.d.contains(string) && (object2 = (Integer)this.b.remove(string)) != null) {
            this.a.remove(object2);
        }
        this.e.remove(string);
        if (this.f.containsKey(string)) {
            object2 = new StringBuilder("Dropping pending result for request ");
            ((StringBuilder)object2).append(string);
            ((StringBuilder)object2).append(": ");
            ((StringBuilder)object2).append(this.f.get(string));
            Log.w((String)"ActivityResultRegistry", (String)((StringBuilder)object2).toString());
            this.f.remove(string);
        }
        if (this.g.containsKey(string)) {
            object2 = (nk)a.M(this.g, string, nk.class);
            object = new StringBuilder("Dropping pending result for request ");
            ((StringBuilder)object).append(string);
            ((StringBuilder)object).append(": ");
            ((StringBuilder)object).append(object2);
            Log.w((String)"ActivityResultRegistry", (String)((StringBuilder)object).toString());
            this.g.remove(string);
        }
        if ((object2 = (bxt)this.c.get(string)) != null) {
            object = ((bxt)object2).b.iterator();
            while (object.hasNext()) {
                abc abc2 = (abc)object.next();
                ((abb)((bxt)object2).a).c(abc2);
            }
            ((bxt)object2).b.clear();
            this.c.remove(string);
        }
    }

    public final boolean e(int n2, int n3, Intent intent) {
        String string = (String)this.a.get(n2);
        if (string == null) {
            return false;
        }
        bxt bxt2 = (bxt)this.e.get(string);
        Object object = bxt2 != null ? bxt2.a : null;
        if (object != null && this.d.contains(string)) {
            bxt2.a.a(((nu)bxt2.b).a(n3, intent));
            this.d.remove(string);
        } else {
            this.f.remove(string);
            this.g.putParcelable(string, (Parcelable)new nk(n3, intent));
        }
        return true;
    }

    public final void f(int n2, nu stringArray, Object object) {
        mr mr2 = this.h;
        bzb bzb2 = stringArray.c((Context)mr2, object);
        if (bzb2 != null) {
            new Handler(Looper.getMainLooper()).post((Runnable)new mp(this, n2, bzb2, 0));
            return;
        }
        if ((object = stringArray.b(object)).getExtras() != null) {
            stringArray = object.getExtras();
            jse.b(stringArray);
            if (stringArray.getClassLoader() == null) {
                object.setExtrasClassLoader(mr2.getClassLoader());
            }
        }
        if (object.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            stringArray = object.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            object.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
        } else {
            stringArray = null;
        }
        if (jse.i("androidx.activity.result.contract.action.REQUEST_PERMISSIONS", object.getAction())) {
            stringArray = object = object.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            if (object == null) {
                stringArray = new String[]{};
            }
            se.b(mr2, stringArray, n2);
            return;
        }
        if (jse.i("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST", object.getAction())) {
            object = (nt)object.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                jse.b(object);
                mr2.startIntentSenderForResult(object.a, n2, object.b, object.c, object.d, 0, (Bundle)stringArray);
                return;
            }
            catch (IntentSender.SendIntentException sendIntentException) {
                new Handler(Looper.getMainLooper()).post((Runnable)new mp((Object)this, n2, (Object)sendIntentException, 2));
                return;
            }
        }
        mr2.startActivityForResult((Intent)object, n2, (Bundle)stringArray);
    }
}

