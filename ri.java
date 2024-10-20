/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

final class ri {
    int[] a = new int[10];
    int[] b = new int[10];
    int c = 0;
    int[] d = new int[10];
    float[] e = new float[10];
    int f = 0;
    int[] g = new int[5];
    String[] h = new String[5];
    int i = 0;
    int[] j = new int[4];
    boolean[] k = new boolean[4];
    int l = 0;

    final void a(int n2, float f2) {
        int n3 = this.f;
        Object[] objectArray = this.d;
        int n4 = objectArray.length;
        if (n3 >= n4) {
            this.d = Arrays.copyOf(objectArray, n4 + n4);
            objectArray = this.e;
            n4 = objectArray.length;
            this.e = Arrays.copyOf((float[])objectArray, n4 + n4);
        }
        objectArray = this.d;
        n4 = this.f;
        objectArray[n4] = n2;
        objectArray = this.e;
        this.f = n4 + 1;
        objectArray[n4] = (int)f2;
    }

    final void b(int n2, int n3) {
        int n4 = this.c;
        int[] nArray = this.a;
        int n5 = nArray.length;
        if (n4 >= n5) {
            this.a = Arrays.copyOf(nArray, n5 + n5);
            nArray = this.b;
            n4 = nArray.length;
            this.b = Arrays.copyOf(nArray, n4 + n4);
        }
        nArray = this.a;
        n4 = this.c;
        nArray[n4] = n2;
        nArray = this.b;
        this.c = n4 + 1;
        nArray[n4] = n3;
    }

    final void c(int n2, String string) {
        int n3 = this.i;
        Object[] objectArray = this.g;
        int n4 = objectArray.length;
        if (n3 >= n4) {
            this.g = Arrays.copyOf(objectArray, n4 + n4);
            objectArray = this.h;
            n4 = objectArray.length;
            this.h = (String[])Arrays.copyOf(objectArray, n4 + n4);
        }
        objectArray = this.g;
        n4 = this.i;
        objectArray[n4] = n2;
        objectArray = this.h;
        this.i = n4 + 1;
        objectArray[n4] = (int)string;
    }

    final void d(int n2, boolean bl2) {
        int n3 = this.l;
        Object[] objectArray = this.j;
        int n4 = objectArray.length;
        if (n3 >= n4) {
            this.j = Arrays.copyOf(objectArray, n4 + n4);
            objectArray = this.k;
            n3 = objectArray.length;
            this.k = Arrays.copyOf((boolean[])objectArray, n3 + n3);
        }
        objectArray = this.j;
        n3 = this.l;
        objectArray[n3] = n2;
        objectArray = this.k;
        this.l = n3 + 1;
        objectArray[n3] = bl2 ? 1 : 0;
    }
}

