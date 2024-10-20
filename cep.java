/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.accounts.Account
 *  android.content.Context
 *  android.net.Uri
 *  android.os.Handler
 *  android.os.IBinder
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.RemoteException
 *  android.text.TextUtils
 *  android.util.Log
 *  org.json.JSONException
 *  org.json.JSONObject
 */
import android.accounts.Account;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

public final class cep
extends ckj
implements cct,
ccu {
    private static final ki h = ckg.a;
    public final Context a;
    public final Handler b;
    public final Set c;
    public final cfe d;
    public ckm e;
    public cdz f;
    public final ki g;

    public cep(Context context, Handler handler, cfe cfe2) {
        ki ki2 = h;
        this.a = context;
        this.b = handler;
        this.d = cfe2;
        this.c = cfe2.b;
        this.g = ki2;
    }

    @Override
    public final void a(int n2) {
        Object object = this.f;
        object = (cdx)((cdz)object).e.j.get(((cdz)object).b);
        if (object != null) {
            if (((cdx)object).f) {
                ((cdx)object).l(new cbk(17));
                return;
            }
            ((cdx)object).a(n2);
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void b() {
        Object object;
        Object object2;
        Object object3;
        Object object4;
        ckm ckm2;
        block15: {
            block14: {
                HashSet<Object> hashSet;
                long l2;
                JSONObject jSONObject;
                ckm2 = this.e;
                object3 = object4 = ckm2.t.a;
                if (object4 == null) {
                    object3 = new Account("<<default account>>", "com.google");
                }
                if (!"<<default account>>".equals(((Account)object3).name)) break block14;
                object2 = ckm2.b;
                cac.a.lock();
                if (cac.b == null) {
                    object4 = new cac(object2.getApplicationContext());
                    cac.b = object4;
                }
                object2 = cac.b;
                try {
                    cac.a.unlock();
                    object = ((cac)object2).a("defaultGoogleSignInAccount");
                    if (TextUtils.isEmpty((CharSequence)object)) break block14;
                    object4 = new StringBuilder("googleSignInAccount:");
                    ((StringBuilder)object4).append((String)object);
                    object4 = ((cac)object2).a(((StringBuilder)object4).toString());
                    if (object4 == null) break block14;
                    if (TextUtils.isEmpty((CharSequence)object4)) break block14;
                    jSONObject = new JSONObject((String)object4);
                    object4 = !TextUtils.isEmpty((CharSequence)(object4 = jSONObject.optString("photoUrl"))) ? Uri.parse((String)object4) : null;
                    l2 = Long.parseLong(jSONObject.getString("expirationTime"));
                    hashSet = new HashSet<Object>();
                    object2 = jSONObject.getJSONArray("grantedScopes");
                    int n2 = object2.length();
                    for (int i2 = 0; i2 < n2; ++i2) {
                        object = new Scope(object2.getString(i2));
                        hashSet.add(object);
                    }
                }
                catch (RemoteException remoteException) {
                    Log.w((String)"SignInClientImpl", (String)"Remote service probably died when signIn is called");
                    try {
                        object4 = new cbk(8, null);
                        object2 = new cko(1, (cbk)object4, null);
                        ((ckj)this).c((cko)object2);
                        return;
                    }
                    catch (RemoteException remoteException2) {
                        Log.wtf((String)"SignInClientImpl", (String)"ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", (Throwable)remoteException);
                        return;
                    }
                }
                String string = jSONObject.optString("id");
                object2 = jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null;
                object = jSONObject.has("email") ? jSONObject.optString("email") : null;
                String string2 = jSONObject.has("displayName") ? jSONObject.optString("displayName") : null;
                String string3 = jSONObject.has("givenName") ? jSONObject.optString("givenName") : null;
                String string4 = jSONObject.has("familyName") ? jSONObject.optString("familyName") : null;
                String string5 = jSONObject.getString("obfuscatedIdentifier");
                Long.valueOf(l2).getClass();
                kl.ar(string5);
                ArrayList arrayList = new ArrayList(hashSet);
                GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(string, (String)object2, (String)object, string2, (Uri)object4, null, l2, string5, arrayList, string3, string4);
                object4 = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
                googleSignInAccount.f = object4;
                object4 = googleSignInAccount;
                break block15;
                catch (Throwable throwable) {
                    cac.a.unlock();
                    throw throwable;
                }
                catch (JSONException jSONException) {}
            }
            object4 = null;
        }
        object = ckm2.u;
        kl.at(object);
        object2 = new cgd(2, (Account)object3, (Integer)object, (GoogleSignInAccount)object4);
        object3 = (ckk)ckm2.t();
        object4 = new ckn(1, (cgd)object2);
        object2 = ((bov)object3).a();
        box.c((Parcel)object2, (Parcelable)object4);
        object2.writeStrongBinder((IBinder)this);
        ((bov)object3).c(12, (Parcel)object2);
    }

    @Override
    public final void c(cko object) {
        object = new ckr(this, object, 1);
        this.b.post((Runnable)object);
    }

    @Override
    public final void i(cbk cbk2) {
        this.f.b(cbk2);
    }
}

