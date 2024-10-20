/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.pm.PackageManager
 *  android.content.res.ColorStateList
 *  android.graphics.Shader
 *  android.util.SparseArray
 */
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.graphics.Shader;
import android.util.SparseArray;
import java.io.ByteArrayOutputStream;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;

public final class htf {
    public final Object a;
    public int b;
    public final Object c;

    public htf() {
        this.a = new ByteArrayOutputStream();
        this.b = 0;
        this.c = new int[8];
    }

    public htf(afo afo2) {
        this.c = new SparseArray();
        this.a = afo2;
        this.b = -1;
    }

    public htf(PackageManager packageManager) {
        this.c = new HashMap();
        this.b = 0;
        this.a = packageManager;
    }

    public htf(Shader shader, ColorStateList colorStateList, int n2) {
        this.a = shader;
        this.c = colorStateList;
        this.b = n2;
    }

    public htf(Object object, int n2) {
        this.c = new LinkedHashMap();
        this.a = object;
        this.b = n2;
    }

    public htf(byte[] objectArray) {
        objectArray = new long[20];
        this.a = objectArray;
        this.c = new float[20];
        this.b = 0;
        Arrays.fill((long[])objectArray, Long.MIN_VALUE);
    }

    public htf(char[] cArray) {
        this.c = new SparseArray();
        this.b = 0;
        this.a = Collections.newSetFromMap(new IdentityHashMap());
    }

    public static final float d(float f2) {
        double d2 = Math.signum(f2);
        f2 = Math.abs(f2);
        return (float)(d2 * Math.sqrt(f2 + f2));
    }

    public static final long m(long l2, long l3) {
        if (l2 == 0L) {
            return l3;
        }
        return l2 / 4L * 3L + l3 / 4L;
    }

    final boolean a() {
        return !((LinkedHashMap)this.c).isEmpty();
    }

    public final void b(long l2, int n2) {
        fxf.q(true);
        for (int i2 = 0; i2 < n2; ++i2) {
            Object object;
            Object object2 = object = BigInteger.valueOf(l2).testBit(n2 - i2 - 1);
            if (object != 0) {
                object2 = 1;
            }
            fxf.q(true);
            Object object3 = this.c;
            object = this.b;
            object3 = (int[])object3;
            object3[object] = object2;
            this.b = object2 = object + 1;
            if (object2 != 8) continue;
            Object object4 = object3[0];
            object2 = object3[1];
            Object object5 = object3[2];
            Object object6 = object3[3];
            Object object7 = object3[4];
            object = object3[5];
            Object object8 = object3[6];
            Object object9 = object3[7];
            ((ByteArrayOutputStream)this.a).write(object4 << 7 | object2 << 6 | object5 << 5 | object6 << 4 | object7 << 3 | object << 2 | object8 + object8 | object9);
            this.b = 0;
        }
    }

    public final void c(long l2, float f2) {
        int n2;
        this.b = n2 = (this.b + 1) % 20;
        ((long[])this.a)[n2] = l2;
        ((float[])this.c)[n2] = f2;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public final Object e(int n2) {
        Object object;
        int n3;
        boolean bl2 = true;
        while (true) {
            block4: {
                block3: {
                    if (!bl2 || (bl2 = false)) break block3;
                    if (this.b != -1) break block4;
                    n3 = 0;
                }
                this.b = n3;
            }
            n3 = this.b;
            if (n3 <= 0 || n2 >= ((SparseArray)this.c).keyAt(n3)) break;
            n3 = this.b - 1;
        }
        while (this.b < ((SparseArray)this.c).size() - 1 && n2 >= ((SparseArray)(object = this.c)).keyAt((n3 = this.b++) + 1)) {
        }
        object = this.c;
        n2 = this.b;
        return ((SparseArray)object).valueAt(n2);
    }

    public final Object f() {
        int n2 = ((SparseArray)this.c).size();
        return ((SparseArray)this.c).valueAt(n2 - 1);
    }

    public final boolean g() {
        return ((SparseArray)this.c).size() == 0;
    }

    public final boolean h() {
        return this.a != null;
    }

    public final boolean i() {
        Object object;
        return this.a == null && (object = this.c) != null && ((ColorStateList)object).isStateful();
    }

    public final boolean j(int[] nArray) {
        ColorStateList colorStateList;
        int n2;
        if (this.i() && (n2 = (colorStateList = (ColorStateList)this.c).getColorForState(nArray, colorStateList.getDefaultColor())) != this.b) {
            this.b = n2;
            return true;
        }
        return false;
    }

    public final boolean k() {
        return this.h() || this.b != 0;
        {
        }
    }

    public final ku l(int n2) {
        ku ku2;
        ku ku3 = ku2 = (ku)((SparseArray)this.c).get(n2);
        if (ku2 == null) {
            ku3 = new ku();
            ((SparseArray)this.c).put(n2, (Object)ku3);
        }
        return ku3;
    }
}

