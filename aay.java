/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.ViewGroup
 */
import android.view.ViewGroup;

public class aay {
    public aay() {
    }

    public aay(char[] cArray) {
    }

    public static aaz a(aba aba2) {
        jse.e((Object)aba2, "state");
        int n2 = aba2.ordinal();
        if (n2 != 1) {
            if (n2 != 2) {
                if (n2 != 3) {
                    return null;
                }
                return aaz.ON_RESUME;
            }
            return aaz.ON_START;
        }
        return aaz.ON_CREATE;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void b(ach object, awf awf2, abb abb2) {
        void var2_2;
        jse.e(object, "viewModel");
        jse.e(awf2, "registry");
        jse.e(var2_2, "lifecycle");
        Object object2 = ((ach)object).h;
        object = ((acu)object2).d;
        synchronized (object) {
            object2 = (AutoCloseable)((acu)object2).a.get("androidx.lifecycle.savedstate.vm.tag");
        }
        object = (aby)object2;
        if (object != null && !((aby)object).b) {
            ((aby)object).b(awf2, (abb)var2_2);
            aay.c(awf2, (abb)var2_2);
        }
    }

    public static void c(awf awf2, abb abb2) {
        aba aba2 = abb2.a();
        if (aba2 != aba.b && !aba2.a(aba.d)) {
            abb2.b(new aax(abb2, awf2, 0));
            return;
        }
        awf2.c(aaw.class);
    }

    public static aep d(adr adr2) {
        return new aep(adr2.a());
    }

    public static void e(aep object, adr adr2) {
        int n2 = aep.b;
        object = ((aep)object).a;
        for (n2 = 0; n2 < ((ads)object).b(); ++n2) {
            adr2.b(((ads)object).a(n2));
        }
    }

    public static void f(int n2, boolean bl2, adr adr2) {
        if (bl2) {
            adr2.b(n2);
        }
    }

    public static void i(axz axz2, ayc ayc2) {
        axz2.b(ayc2);
    }

    public static void j(axz axz2, ayc ayc2) {
        axz2.e(ayc2);
    }

    public static void k(ViewGroup viewGroup) {
        viewGroup.setTag(2131427987, null);
    }

    public boolean g() {
        return false;
    }

    public boolean h(int[] nArray) {
        return false;
    }
}

