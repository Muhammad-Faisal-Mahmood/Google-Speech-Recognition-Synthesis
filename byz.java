/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import androidx.preference.DialogPreference;
import androidx.preference.PreferenceGroup;
import j$.util.Collection$_EL;

public final class byz {
    public static final hfn a = hfn.o("LpSettingsbHelper");
    private final Context b;
    private final String c;

    public byz(Context context, String string) {
        this.b = context;
        this.c = string;
    }

    public static void b(DialogPreference dialogPreference, byq byq2, Context context) {
        int n2 = byq2.e - 1;
        if (n2 != 1) {
            if (n2 != 2) {
                dialogPreference.setIcon(2131231128);
                return;
            }
            dialogPreference.setIcon(kh.m(context));
            return;
        }
        dialogPreference.setIcon(2131231130);
    }

    public static boolean c(String string) {
        return string.contains("Speech Enhancement");
    }

    public static final void d(gto gto2, gzx gzx2, boolean bl2) {
        ((PreferenceGroup)((gtt)gto2).a).d();
        Collection$_EL.stream(gzx2).forEach(new byy(bl2, gto2));
    }

    public final void a(DialogPreference dialogPreference, byq byq2) {
        long l2 = byq2.a.e;
        String string = byq2.d;
        if (byz.c(string)) {
            dialogPreference.setTitle(kh.n(byq2.a.b));
        } else {
            dialogPreference.setTitle(string);
            if (l2 != 0L) {
                dialogPreference.setSummary(kh.o(this.b, byq2.a));
            }
        }
        dialogPreference.setKey(this.c.concat(string));
    }
}

