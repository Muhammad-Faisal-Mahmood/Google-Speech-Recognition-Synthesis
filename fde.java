/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import java.util.HashMap;
import java.util.Map;

public final class fde {
    private static volatile ixb a;
    private static volatile ixb b;
    private static volatile iyc c;

    private fde() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static ixb a() {
        Object object;
        Object object2 = object = a;
        if (object != null) return object2;
        synchronized (fde.class) {
            object2 = object = a;
            if (object != null) return object2;
            object2 = ixb.a();
            ((iwy)object2).c = ixa.a;
            ((iwy)object2).d = ixb.c("java.com.google.android.libraries.speech.modelmanager.languagepack.ui.grpc.ActivityStarter", "ShowDownloadDialog");
            ((iwy)object2).b();
            object = fdh.a;
            Object object3 = jmj.a;
            ((iwy)object2).a = object3 = new jmi((hyf)object);
            object3 = fdi.a;
            ((iwy)object2).b = object = new jmi((hyf)object3);
            a = object2 = ((iwy)object2).a();
            return object2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static ixb b() {
        Object object;
        Object object2 = object = b;
        if (object != null) return object2;
        synchronized (fde.class) {
            object2 = object = b;
            if (object != null) return object2;
            object2 = ixb.a();
            ((iwy)object2).c = ixa.a;
            ((iwy)object2).d = ixb.c("java.com.google.android.libraries.speech.modelmanager.languagepack.ui.grpc.ActivityStarter", "UpdateDownloadConfirmation");
            ((iwy)object2).b();
            object = fdj.a;
            Object object3 = jmj.a;
            ((iwy)object2).a = object3 = new jmi((hyf)object);
            object3 = fdk.a;
            ((iwy)object2).b = object = new jmi((hyf)object3);
            b = object2 = ((iwy)object2).a();
            return object2;
        }
    }

    public static String c(int n2) {
        return Integer.toString(a.x(n2));
    }

    public static String d(Context context, fdr fdr2, boolean bl2) {
        int n2 = fdr2.b;
        if (n2 != 0) {
            switch (n2 - 1) {
                default: {
                    return context.getString(2132017487);
                }
                case 13: {
                    return context.getString(2132017487);
                }
                case 11: {
                    if (bl2) {
                        if (fdr2.a == 2) {
                            return context.getString(2132017475);
                        }
                        return context.getString(2132017487);
                    }
                    return context.getString(2132017470);
                }
                case 8: {
                    return context.getString(2132017475);
                }
                case 7: {
                    return context.getString(2132017471);
                }
                case 5: 
                case 12: {
                    return context.getString(2132017470);
                }
                case 3: {
                    if (bl2) {
                        return context.getString(2132017475);
                    }
                    return context.getString(2132017470);
                }
                case 2: {
                    if (fdr2.a == 102) {
                        return context.getString(2132017472);
                    }
                    return context.getString(2132017475);
                }
                case 0: 
                case 1: 
                case 4: 
                case 6: 
                case 9: 
                case 10: 
            }
            return context.getString(2132017475);
        }
        throw null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final ksb e(fdc fdc2) {
        Object object;
        Object object2 = object = c;
        if (object == null) {
            synchronized (fde.class) {
                object2 = object = c;
                if (object == null) {
                    object = new ksb("java.com.google.android.libraries.speech.modelmanager.languagepack.ui.grpc.ActivityStarter");
                    ((ksb)object).l(fde.a());
                    ((ksb)object).l(fde.b());
                    c = object2 = new iyc((ksb)object);
                }
            }
        }
        object = new HashMap();
        ixb ixb2 = fde.a();
        jne jne2 = new jne(new fdd(fdc2, 0, 0), false);
        String string = ((iyc)object2).a;
        kmp.N(ixb2, jne2, string, (iyc)object2, (Map)object);
        kmp.N(fde.b(), new jne(new fdd(fdc2, 1, 0), false), string, (iyc)object2, (Map)object);
        return kmp.T(string, (iyc)object2, (Map)object);
    }

    public static final /* synthetic */ bzo f(hwp hwp2) {
        jse.e(hwp2, "builder");
        return new bzo(hwp2);
    }
}

