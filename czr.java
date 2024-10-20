/*
 * Decompiled with CFR 0.152.
 */
import java.util.Map;

public final class czr
implements frj {
    public final cyu a;
    private final int b;

    public /* synthetic */ czr(cyu cyu2, int n2) {
        this.b = n2;
        this.a = cyu2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final hyf a(cxt object, hyf hyg2) {
        if (this.b != 0) {
            hyg2 = (cto)hyg2;
            hyg2 = cto.a.l();
            hdx hdx2 = ((cxt)object).G().k().k();
            cyu cyu2 = this.a;
            while (true) {
                block15: {
                    Object object2;
                    if (!hdx2.hasNext()) {
                        return (cto)((hwp)hyg2).o();
                    }
                    object = (Map.Entry)hdx2.next();
                    try {
                        object2 = (String)object.getValue();
                        fxf.K(object2);
                    }
                    catch (ClassCastException classCastException) {
                        break block15;
                    }
                    catch (NullPointerException nullPointerException) {
                        // empty catch block
                        break block15;
                    }
                    try {
                        object2 = (cth)cqq.A((String)object2, (hym)cth.a.C(7));
                        ((hwp)hyg2).B((String)object.getKey(), (cth)object2);
                    }
                    catch (hxn hxn2) {
                        cyr.g("SharedPreferences file groups metadata had unexpected format: %s", hxn2);
                        cyu2.d(1084);
                    }
                    continue;
                }
                cyr.g("SharedPreferences file groups metadata key wasn't a string: %s", object);
                cyu2.d(1083);
            }
        }
        hyg2 = (ctx)hyg2;
        hyg2 = ctx.a.l();
        hdx hdx3 = ((cxt)object).G().k().k();
        cyu cyu3 = this.a;
        while (true) {
            block16: {
                Object object3;
                if (!hdx3.hasNext()) {
                    return (ctx)((hwp)hyg2).o();
                }
                object = (Map.Entry)hdx3.next();
                try {
                    object3 = (String)object.getValue();
                    fxf.K(object3);
                }
                catch (ClassCastException classCastException) {
                    break block16;
                }
                catch (NullPointerException nullPointerException) {
                    // empty catch block
                    break block16;
                }
                try {
                    object3 = (ctv)cqq.A((String)object3, (hym)ctv.a.C(7));
                    ((hwp)hyg2).D((String)object.getKey(), (ctv)object3);
                }
                catch (hxn hxn3) {
                    cyr.g("SharedPreferences shared files metadata had unexpected format: %s", hxn3);
                    cyu3.d(1084);
                }
                continue;
            }
            cyr.g("SharedPreferences shared files metadata key wasn't a string: %s", object);
            cyu3.d(1083);
        }
    }
}

