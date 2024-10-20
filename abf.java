/*
 * Decompiled with CFR 0.152.
 */
import java.lang.reflect.Constructor;
import java.util.Arrays;
import java.util.List;

public final class abf {
    public Object a;
    public Object b;

    public abf() {
    }

    public abf(abd abd2, aba aba2) {
        jse.e((Object)aba2, "initialState");
        jse.b(abd2);
        jse.e(abd2, "object");
        boolean bl2 = abd2 instanceof abc;
        boolean bl3 = abd2 instanceof aas;
        if (bl2 && bl3) {
            abd2 = new aat((aas)abd2, (abc)abd2);
        } else if (bl3) {
            abd2 = new aat((aas)abd2, null);
        } else if (bl2) {
            abd2 = (abc)abd2;
        } else {
            Class<?> clazz = abd2.getClass();
            if (abj.a.a(clazz) == 2) {
                clazz = abj.b.get(clazz);
                jse.b(clazz);
                clazz = (List)((Object)clazz);
                int n2 = clazz.size();
                if (n2 == 1) {
                    abd2 = new abx(abj.b((Constructor)clazz.get(0), abd2), 2);
                } else {
                    n2 = clazz.size();
                    aau[] aauArray = new aau[n2];
                    for (int i2 = 0; i2 < n2; ++i2) {
                        aauArray[i2] = abj.b((Constructor)clazz.get(i2), abd2);
                    }
                    abd2 = new abx(aauArray, 1);
                }
            } else {
                abd2 = new abq(abd2);
            }
        }
        this.b = abd2;
        this.a = aba2;
    }

    public final void a(abe abe2, aaz aaz2) {
        aba aba2 = aaz2.a();
        this.a = wd.n((aba)((Object)this.a), aba2);
        this.b.a(abe2, aaz2);
        this.a = aba2;
    }

    public final void b() {
        Object object = this.b;
        if (object != null) {
            Arrays.fill((int[])object, -1);
        }
        this.a = null;
    }

    public final void c(int n2) {
        Object object = this.b;
        if (object == null) {
            this.b = object = (Object)new int[Math.max(n2, 10) + 1];
            Arrays.fill((int[])object, -1);
            return;
        }
        int[] nArray = (int[])object;
        int n3 = nArray.length;
        if (n2 >= n3) {
            while (n3 <= n2) {
                n3 += n3;
            }
            int[] nArray2 = new int[n3];
            this.b = nArray2;
            n2 = nArray.length;
            System.arraycopy(object, 0, nArray2, 0, n2);
            object = (int[])this.b;
            Arrays.fill((int[])object, n2, ((Object)object).length, -1);
        }
    }

    public final void d(int n2, int n3) {
        Object object = this.b;
        if (object != null && n2 < ((int[])object).length) {
            int n4 = n2 + n3;
            this.c(n4);
            object = this.b;
            System.arraycopy(object, n2, object, n4, ((int[])object).length - n2 - n3);
            Arrays.fill((int[])this.b, n2, n4, -1);
            object = this.a;
            if (object != null) {
                for (n4 = object.size() - 1; n4 >= 0; --n4) {
                    object = (lp)this.a.get(n4);
                    int n5 = ((lp)object).a;
                    if (n5 < n2) continue;
                    ((lp)object).a = n5 + n3;
                }
            }
        }
    }

    public final void e(int n2, int n3) {
        Object object = this.b;
        if (object != null && n2 < ((int[])object).length) {
            int n4 = n2 + n3;
            this.c(n4);
            object = this.b;
            System.arraycopy(object, n4, object, n2, ((int[])object).length - n2 - n3);
            object = (int[])this.b;
            int n5 = ((Object)object).length;
            Arrays.fill((int[])object, n5 - n3, n5, -1);
            object = this.a;
            if (object != null) {
                for (n5 = object.size() - 1; n5 >= 0; --n5) {
                    object = (lp)this.a.get(n5);
                    int n6 = ((lp)object).a;
                    if (n6 < n2) continue;
                    if (n6 < n4) {
                        this.a.remove(n5);
                        continue;
                    }
                    ((lp)object).a = n6 - n3;
                }
            }
        }
    }
}

