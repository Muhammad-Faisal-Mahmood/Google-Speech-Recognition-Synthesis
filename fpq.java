/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.accounts.Account
 */
import android.accounts.Account;

public final class fpq {
    public static final Account a = new Account("shared", "mobstore");

    public static Account a(String string) {
        if (fpq.d(string)) {
            return a;
        }
        int n2 = string.indexOf(58);
        boolean bl2 = n2 >= 0;
        fvc.H(bl2, "Malformed account", new Object[0]);
        String string2 = string.substring(0, n2);
        return new Account(string.substring(n2 + 1), string2);
    }

    public static String b(Account object) {
        int n2 = ((Account)object).type.indexOf(58);
        boolean bl2 = true;
        boolean bl3 = n2 == -1;
        fvc.H(bl3, "Account type contains ':'.", new Object[0]);
        bl3 = ((Account)object).type.indexOf(47) == -1;
        fvc.H(bl3, "Account type contains '/'.", new Object[0]);
        bl3 = ((Account)object).name.indexOf(47) == -1 ? bl2 : false;
        fvc.H(bl3, "Account name contains '/'.", new Object[0]);
        if (fpq.c((Account)object)) {
            return "shared";
        }
        String string = ((Account)object).type;
        String string2 = ((Account)object).name;
        object = new StringBuilder();
        ((StringBuilder)object).append(string);
        ((StringBuilder)object).append(":");
        ((StringBuilder)object).append(string2);
        return ((StringBuilder)object).toString();
    }

    public static boolean c(Account account) {
        return a.equals((Object)account);
    }

    static boolean d(String string) {
        return "shared".equals(string);
    }
}

