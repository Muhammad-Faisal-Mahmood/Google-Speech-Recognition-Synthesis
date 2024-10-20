/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public final class dpg {
    public /* synthetic */ dpg() {
    }

    public dpg(jnu jnu2) {
        jnu2.getClass();
    }

    public dpg(jnu jnu2, byte[] byArray) {
        jnu2.getClass();
    }

    public static int a(int n2) {
        if (n2 != 1) {
            return n2 - 2;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static final /* synthetic */ dlm b(hwp hwp2) {
        jse.e(hwp2, "builder");
        return new dlm((Object)hwp2, null);
    }

    public static final /* synthetic */ dlm c(hwp hwp2) {
        jse.e(hwp2, "builder");
        return new dlm((Object)hwp2, null);
    }

    public static final /* synthetic */ dml d(hwp hwp2) {
        jse.e(hwp2, "builder");
        return new dml(hwp2);
    }

    public static final /* synthetic */ dml e(hwp hwp2) {
        jse.e(hwp2, "builder");
        return new dml(hwp2);
    }

    public static final eeu f(gto gto2, int n2, eae eae2) {
        jse.e(gto2, "<this>");
        jse.e(eae2, "params");
        if (n2 == 0) {
            return (eeu)gto2.e(eev.e);
        }
        return new eey(gto2, n2, eae2);
    }

    public static final eeu g(gto gto2) {
        jse.e(gto2, "<this>");
        return (eeu)gto2.e(eev.e);
    }

    public static final gto h(Object object, Class clazz) {
        if ((object = object instanceof eem ? (eem)object : null) != null) {
            Object object2 = object.d();
            object = new ArrayList();
            object2 = object2.iterator();
            while (object2.hasNext()) {
                Object e2 = object2.next();
                if (!clazz.isInstance(e2)) continue;
                object.add(e2);
            }
            return gto.h(jns.l(object));
        }
        return gsl.a;
    }

    public static final List i(Iterable object) {
        ArrayList<eep> arrayList = new ArrayList<eep>(jns.B((Iterable)object));
        object = object.iterator();
        while (object.hasNext()) {
            arrayList.add(((eeq)object.next()).a());
        }
        return arrayList;
    }

    public static dzk j(eef eef2, dzj dzj2) {
        return eef2.i(dzj2, Integer.MAX_VALUE);
    }

    public static final gto k(eeb eeb2, int n2) {
        if (eeb2 != null && n2 != 0) {
            return gto.h(new eed(eeb2, n2));
        }
        return gto.h(eeb2);
    }

    public static final dzi l(edx edx2, int n2) {
        if (n2 == 0) {
            return edx2;
        }
        return new edy(edx2, n2);
    }

    public static int m(edx edx2, byte[] byArray, int n2, int n3, int n4) {
        jse.e(byArray, "dest");
        return edx2.c(byArray, n2, n3, n4, Integer.MAX_VALUE);
    }
}

