/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;

final class fnk
implements fnw {
    final Bundle a;
    private final int b;

    public fnk(Bundle bundle, int n2) {
        this.b = n2;
        this.a = bundle;
    }

    @Override
    public final void a(foo object) {
        int n2 = this.b;
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 != 2) {
                    if (n2 != 3) {
                        if (n2 != 4) {
                            if (n2 != 5) {
                                if (object instanceof fol) {
                                    Bundle bundle = new Bundle();
                                    ((fol)object).a();
                                    object = fnx.H((foo)object);
                                    fph.a(object);
                                    this.a.putBundle((String)object, bundle);
                                }
                                return;
                            }
                            if (object instanceof fob) {
                                fnx.I((foo)object, this.a);
                                ((fob)object).a();
                            }
                            return;
                        }
                        if (object instanceof fnu) {
                            fnv.I((foo)object, this.a);
                            ((fnu)object).a();
                        }
                        return;
                    }
                    if (object instanceof fns) {
                        fnv.I((foo)object, this.a);
                        ((fns)object).a();
                    }
                    return;
                }
                if (object instanceof fnn) {
                    fnv.I((foo)object, this.a);
                    ((fnn)object).a();
                }
                return;
            }
            if (object instanceof fna) {
                fnm.I((foo)object, this.a);
                ((fna)object).a();
            }
            return;
        }
        if (object instanceof fne) {
            fph.a(fnm.I((foo)object, this.a));
            ((fne)object).a();
        }
    }
}

