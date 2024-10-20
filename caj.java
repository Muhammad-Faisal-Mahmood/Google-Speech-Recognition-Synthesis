/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public final class caj
extends caf {
    public static final List l = new CopyOnWriteArrayList();
    public final List m = new CopyOnWriteArrayList();

    public caj(Context context, String string, cat cat2, cak cak2, car car2, gui gui2, cam cam2) {
        super(context, string, cat2, cak2, car2, gui2, cam2);
    }

    public static void f(cah cah2) {
        l.add(0, cah2);
    }

    @Deprecated
    public final cai e(hyf hyf2) {
        kl.at(hyf2);
        return new cai(this, hyf2);
    }

    public final cai g(hyf object, cro cro2) {
        kl.at(object);
        object = new cai(this, (hyf)object);
        ((cai)object).p = cro2;
        return object;
    }
}

