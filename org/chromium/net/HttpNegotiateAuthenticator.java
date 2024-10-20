/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.accounts.AccountManager
 *  android.accounts.AccountManagerCallback
 *  android.content.Context
 *  android.os.Bundle
 *  android.os.Handler
 */
package org.chromium.net;

import android.accounts.AccountManager;
import android.accounts.AccountManagerCallback;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import org.chromium.base.ApplicationStatus;
import org.chromium.base.ThreadUtils;

public class HttpNegotiateAuthenticator {
    public Bundle a;
    private final String b;

    protected HttpNegotiateAuthenticator(String string) {
        this.b = string;
    }

    static HttpNegotiateAuthenticator create(String string) {
        return new HttpNegotiateAuthenticator(string);
    }

    void getNextAuthToken(long l2, String object, String string, boolean bl2) {
        Context context = jjj.c;
        Object object2 = new kop();
        ((kop)object2).d = "SPNEGO:HOSTBASED:".concat(String.valueOf(object));
        ((kop)object2).b = AccountManager.get((Context)context);
        ((kop)object2).a = l2;
        ((kop)object2).c = new Bundle();
        if (string != null) {
            ((kop)object2).c.putString("incomingAuthToken", string);
        }
        if ((object = this.a) != null) {
            ((kop)object2).c.putBundle("spnegoContext", (Bundle)object);
        }
        ((kop)object2).c.putBoolean("canDelegate", bl2);
        object = ApplicationStatus.a;
        object = ((kop)object2).b;
        string = this.b;
        object2 = new koo(this, (kop)object2, 1);
        context = new Handler(ThreadUtils.b());
        object.getAccountsByTypeAndFeatures(string, new String[]{"SPNEGO"}, (AccountManagerCallback)object2, (Handler)context);
    }
}

