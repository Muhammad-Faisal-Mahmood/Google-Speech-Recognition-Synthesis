/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.accounts.Account
 *  android.accounts.AccountManagerCallback
 *  android.accounts.AccountManagerFuture
 *  android.accounts.AuthenticatorException
 *  android.accounts.OperationCanceledException
 *  android.content.Context
 *  android.content.IntentFilter
 *  android.os.Bundle
 *  android.os.Handler
 *  android.util.Log
 */
import J.N;
import android.accounts.Account;
import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import java.io.IOException;
import java.util.Locale;
import org.chromium.base.ThreadUtils;
import org.chromium.net.HttpNegotiateAuthenticator;

public final class koo
implements AccountManagerCallback {
    public final kop a;
    final HttpNegotiateAuthenticator b;
    private final int c;

    public koo(HttpNegotiateAuthenticator httpNegotiateAuthenticator, kop kop2, int n2) {
        this.c = n2;
        this.b = httpNegotiateAuthenticator;
        this.a = kop2;
    }

    /*
     * Handled duff style switch with additional control
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run(AccountManagerFuture object) {
        void var1_15;
        block26: {
            Bundle bundle;
            int n2 = this.c;
            int n3 = -341;
            if (n2 != 0) {
                void var1_8;
                block25: {
                    Account[] accountArray;
                    try {
                        accountArray = (Account[])object.getResult();
                    }
                    catch (IOException iOException) {
                        break block25;
                    }
                    catch (AuthenticatorException authenticatorException) {
                        break block25;
                    }
                    catch (OperationCanceledException operationCanceledException) {
                        // empty catch block
                        break block25;
                    }
                    n3 = accountArray.length;
                    if (n3 == 0) {
                        Log.w((String)"cr_net_auth", (String)"ERR_MISSING_AUTH_CREDENTIALS: No account provided for the kerberos authentication. Please verify the configuration policies and that the CONTACTS runtime permission is granted. ");
                        kop kop2 = this.a;
                        HttpNegotiateAuthenticator httpNegotiateAuthenticator = this.b;
                        N.M0s8NeYn(kop2.a, httpNegotiateAuthenticator, -341, null);
                        return;
                    }
                    if (n3 > 1) {
                        Log.w((String)"cr_net_auth", (String)String.format(Locale.US, "ERR_MISSING_AUTH_CREDENTIALS: Found %d accounts eligible for the kerberos authentication. Please fix the configuration by providing a single account.", n3));
                        kop kop3 = this.a;
                        HttpNegotiateAuthenticator httpNegotiateAuthenticator = this.b;
                        N.M0s8NeYn(kop3.a, httpNegotiateAuthenticator, -341, null);
                        return;
                    }
                    kop kop4 = this.a;
                    kop4.e = accountArray[0];
                    HttpNegotiateAuthenticator httpNegotiateAuthenticator = this.b;
                    kop4.b.getAuthToken(kop4.e, kop4.d, kop4.c, true, (AccountManagerCallback)new koo(httpNegotiateAuthenticator, kop4, 0), new Handler(ThreadUtils.b()));
                    return;
                }
                Log.w((String)"cr_net_auth", (String)"ERR_UNEXPECTED: Error while attempting to retrieve accounts.", (Throwable)var1_8);
                kop kop5 = this.a;
                HttpNegotiateAuthenticator httpNegotiateAuthenticator = this.b;
                N.M0s8NeYn(kop5.a, httpNegotiateAuthenticator, -9, null);
                return;
            }
            try {
                bundle = (Bundle)object.getResult();
            }
            catch (IOException iOException) {
                break block26;
            }
            catch (AuthenticatorException authenticatorException) {
                break block26;
            }
            catch (OperationCanceledException operationCanceledException) {
                // empty catch block
                break block26;
            }
            if (bundle.containsKey("intent")) {
                Context context = jjj.c;
                jjj.ae(context, new kon(this, context), new IntentFilter("android.accounts.LOGIN_ACCOUNTS_CHANGED"));
                return;
            }
            HttpNegotiateAuthenticator httpNegotiateAuthenticator = this.b;
            kop kop6 = this.a;
            httpNegotiateAuthenticator.a = bundle.getBundle("spnegoContext");
            int n4 = Integer.MIN_VALUE;
            block20: do {
                switch (n4 == Integer.MIN_VALUE ? bundle.getInt("spnegoResult", 1) : n4) {
                    default: {
                        n4 = 1;
                        continue block20;
                    }
                    case 9: {
                        n3 = -329;
                        break;
                    }
                    case 8: {
                        n3 = -344;
                        break;
                    }
                    case 6: {
                        n3 = -339;
                        break;
                    }
                    case 5: {
                        n3 = -338;
                        break;
                    }
                    case 4: {
                        n3 = -320;
                        break;
                    }
                    case 3: {
                        n3 = -342;
                        break;
                    }
                    case 2: {
                        n3 = -3;
                        break;
                    }
                    case 1: {
                        n3 = -9;
                        break;
                    }
                    case 0: {
                        n3 = 0;
                        break;
                    }
                    case 7: 
                }
                break;
            } while (true);
            N.M0s8NeYn(kop6.a, httpNegotiateAuthenticator, n3, bundle.getString("authtoken"));
            return;
        }
        Log.w((String)"cr_net_auth", (String)"ERR_UNEXPECTED: Error while attempting to obtain a token.", (Throwable)var1_15);
        kop kop7 = this.a;
        HttpNegotiateAuthenticator httpNegotiateAuthenticator = this.b;
        N.M0s8NeYn(kop7.a, httpNegotiateAuthenticator, -9, null);
    }
}

