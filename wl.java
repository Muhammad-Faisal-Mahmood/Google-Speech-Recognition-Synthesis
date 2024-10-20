/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.Resources
 *  android.view.View
 *  android.view.ViewGroup
 */
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import androidx.wear.ambient.AmbientMode$AmbientController;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;

public final class wl
extends jsf
implements jrk {
    public static final wl a;
    public static final wl b;
    public static final wl c;
    public static final wl d;
    public static final wl e;
    public static final wl f;
    public static final wl g;
    public static final wl h;
    public static final wl i;
    public static final wl j;
    public static final wl k;
    public static final wl l;
    public static final wl m;
    public static final wl n;
    public static final wl o;
    public static final wl p;
    public static final wl q;
    public static final wl r;
    public static final wl s;
    public static final wl t;
    public static final wl u;
    private final int v;

    static {
        u = new wl(20);
        t = new wl(19);
        s = new wl(18);
        r = new wl(17);
        q = new wl(16);
        p = new wl(15);
        o = new wl(14);
        n = new wl(13);
        m = new wl(12);
        l = new wl(11);
        k = new wl(10);
        j = new wl(9);
        i = new wl(8);
        h = new wl(7);
        g = new wl(6);
        f = new wl(5);
        e = new wl(4);
        d = new wl(3);
        c = new wl(2);
        b = new wl(1);
        a = new wl(0);
    }

    public wl(int n2) {
        this.v = n2;
        super(1);
    }

    @Override
    public final /* synthetic */ Object a(Object object) {
        int n2 = this.v;
        boolean bl2 = false;
        switch (n2) {
            default: {
                return fpo.c(object);
            }
            case 19: {
                return fpo.c(object);
            }
            case 18: {
                return fpo.c(object);
            }
            case 17: {
                object = (eah)object;
                jse.e(object, "input");
                return new ekq((eah)object, 0);
            }
            case 16: {
                object = (ecp)object;
                jse.e(object, "input");
                return new ekp((ecp)object, 0);
            }
            case 15: {
                object = (ecp)object;
                jse.e(object, "input");
                return new eko((ecp)object);
            }
            case 14: {
                object = (eas)object;
                jse.e(object, "stopStatus");
                return object;
            }
            case 13: {
                object = (ear)object;
                jse.e(object, "startStatus");
                return object;
            }
            case 12: {
                Object object2;
                ecy ecy2 = (ecy)object;
                jse.e(ecy2, "stopStatus");
                cxt cxt2 = dpf.t(eas.a.l());
                object = object2 = ecy2.c;
                if (object2 == null) {
                    object = ebq.a;
                }
                cxt2.v((ebq)object);
                object = object2 = ebv.b(ecy2.d);
                if (object2 == null) {
                    object = ebv.a;
                }
                cxt2.w((ebv)object);
                return cxt2.u();
            }
            case 11: {
                object = (ecx)object;
                jse.e(object, "startStatus");
                bzo bzo2 = dpf.r(ear.a.l());
                ebt ebt2 = ((ecx)object).c;
                object = ebt2;
                if (ebt2 == null) {
                    object = ebt.a;
                }
                bzo2.q((ebt)object);
                return bzo2.p();
            }
            case 10: {
                ((AmbientMode$AmbientController)object).e();
                return jon.a;
            }
            case 9: {
                object = (dzn)object;
                jse.e(object, "it");
                object = ((dzn)object).c == 1 ? (dzm)((dzn)object).d : dzm.a;
                return ((dzm)object).c.d();
            }
            case 8: {
                object = (bff)object;
                jse.e(object, "it");
                object = object.getClass().getSimpleName();
                jse.d(object, "it.javaClass.simpleName");
                return object;
            }
            case 7: {
                object = (bhd)object;
                jse.e(object, "spec");
                if (!((bhd)object).d()) {
                    return "OneTime";
                }
                return "Periodic";
            }
            case 6: {
                Map.Entry entry = (Map.Entry)object;
                jse.e(entry, "<name for destructuring parameter 0>");
                object = (String)entry.getKey();
                entry = entry.getValue();
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append((String)object);
                stringBuilder.append(" : ");
                object = entry;
                if (entry instanceof Object[]) {
                    object = Arrays.toString((Object[])entry);
                    jse.d(object, "toString(this)");
                }
                stringBuilder.append(object);
                return stringBuilder.toString();
            }
            case 5: {
                awj awj2 = (awj)object;
                jse.e(awj2, "statement");
                object = new jpu();
                while (awj2.h()) {
                    object.add((int)awj2.b(0));
                }
                return jjj.C((Set)object);
            }
            case 4: {
                object = (awj)object;
                jse.e(object, "it");
                return object.h();
            }
            case 3: {
                object = (View)object;
                jse.e(object, "viewParent");
                object = object.getTag(2131428009);
                if (object instanceof abe) {
                    return (abe)object;
                }
                return null;
            }
            case 2: {
                object = (View)object;
                jse.e(object, "currentView");
                object = object.getParent();
                if (object instanceof View) {
                    return (View)object;
                }
                return null;
            }
            case 1: {
                object = (Resources)object;
                jse.e(object, "resources");
                if ((object.getConfiguration().uiMode & 0x30) == 32) {
                    bl2 = true;
                }
                return bl2;
            }
            case 0: 
        }
        object = (View)object;
        object = object instanceof ViewGroup ? (ViewGroup)object : null;
        if (object != null) {
            return new wn(object, 1).a();
        }
        return null;
    }
}

