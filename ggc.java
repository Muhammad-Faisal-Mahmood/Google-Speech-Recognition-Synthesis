/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class ggc
implements imb {
    private final jnu a;
    private final jnu b;
    private final jnu c;
    private final jnu d;
    private final jnu e;
    private final int f;

    public ggc(jnu jnu2, jnu jnu3, jnu jnu4, jnu jnu5, jnu jnu6, int n2) {
        this.f = n2;
        this.a = jnu2;
        this.b = jnu3;
        this.c = jnu4;
        this.d = jnu5;
        this.e = jnu6;
    }

    public ggc(jnu jnu2, jnu jnu3, jnu jnu4, jnu jnu5, jnu jnu6, int n2, byte[] byArray) {
        this.f = n2;
        this.c = jnu2;
        this.a = jnu3;
        this.e = jnu4;
        this.b = jnu5;
        this.d = jnu6;
    }

    public ggc(jnu jnu2, jnu jnu3, jnu jnu4, jnu jnu5, jnu jnu6, int n2, char[] cArray) {
        this.f = n2;
        this.a = jnu2;
        this.b = jnu3;
        this.e = jnu4;
        this.d = jnu5;
        this.c = jnu6;
    }

    @Override
    public final /* synthetic */ Object b() {
        int n2 = this.f;
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 != 2) {
                    gpm gpm2 = (gpm)this.c.b();
                    Serializable serializable = (gto)((imc)this.a).a;
                    gto gto2 = (gto)((imc)this.e).a;
                    gto gto3 = (gto)((imc)this.b).a;
                    gto gto4 = (gto)((imc)this.d).a;
                    gzs gzs2 = new gzs();
                    if (gto3.g()) {
                        gzs2.h((ixz)gto3.c());
                    }
                    gzs2.h((ixz)gto2.d(new eyd(gpm2, 12)));
                    if (serializable.g()) {
                        gzs2.h((ixz)serializable.c());
                    }
                    if (gto4.g()) {
                        gzs2.h((ixz)gto4.c());
                    }
                    serializable = gzs2.g();
                    idi.m(serializable);
                    return serializable;
                }
                gto gto5 = (gto)((imc)this.a).a;
                gto gto6 = (gto)((imc)this.b).a;
                gto gto7 = (gto)((imc)this.e).a;
                gto gto8 = (gto)((imc)this.d).a;
                return new god(gto5, gto6, gto7, (Set)((imc)this.c).a, gto8, 0);
            }
            Object object = (Map)((imc)this.c).a;
            Object object2 = (Map)((imc)this.a).a;
            Iterator iterator = ((ime)this.e).a();
            ArrayList<Object> arrayList = (Map)this.b.b();
            Object object3 = (Map)this.d.b();
            jse.e(object, "providedParams");
            jse.e(object2, "asyncProvidedParams");
            jse.e(iterator, "baseToSubpackage");
            jse.e(arrayList, "allPackages");
            jse.e(object3, "legacyProperties");
            Object object4 = new gzy();
            for (Map.Entry entry : object.entrySet()) {
                object = (gfz)entry.getKey();
                jnu jnu2 = (jnu)entry.getValue();
                ((gzy)object4).d(fvc.y((Map)((Object)iterator), (gfz)object), new frn(jnu2, 10));
            }
            for (Map.Entry entry : object2.entrySet()) {
                object2 = (gfz)entry.getKey();
                jnu jnu3 = (jnu)entry.getValue();
                ((gzy)object4).d(fvc.y((Map)((Object)iterator), (gfz)object2), new frn(jnu3, 11));
            }
            object4 = ((gzy)object4).b();
            if (arrayList.keySet().containsAll(((hac)object4).l())) {
                iterator = ((hac)object4).l();
                arrayList = new ArrayList<Object>();
                iterator = iterator.iterator();
                while (iterator.hasNext()) {
                    object = iterator.next();
                    object2 = (String)object;
                    if (!object3.keySet().contains(object2)) continue;
                    arrayList.add(object);
                }
                if (arrayList.isEmpty()) {
                    return object4;
                }
                ((Object)arrayList).toString();
                throw new IllegalStateException("Packages cannot use both @PhenotypeApplicationSpecificProperties and @PhenotypeRuntimeProperties. Conflicting packages: ".concat(((Object)arrayList).toString()));
            }
            object3 = arrayList.keySet();
            arrayList = ((hac)object4).l();
            object4 = new StringBuilder("Parameters provided for mendel package not in use. Known packages: ");
            ((StringBuilder)object4).append(object3);
            ((StringBuilder)object4).append(", params provided: ");
            ((StringBuilder)object4).append(arrayList);
            throw new IllegalStateException(((StringBuilder)object4).toString());
        }
        jnu jnu2 = this.e;
        Context context = ((ilt)this.a).a();
        bzo bzo2 = ((gfn)jnu2).a();
        jnu2 = this.d;
        jnu jnu3 = this.c;
        return new cya(context, this.b, jnu3, jnu2, bzo2);
    }
}

