/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import j$.util.DesugarArrays;
import java.util.function.Function;

public final class boi
implements boj {
    public int[] a;
    private final View b;
    private int[] c;

    public boi(View view) {
        this.b = view;
    }

    @Override
    public final void a(int[] nArray, int[] nArray2) {
        this.c = nArray;
        this.a = nArray2;
        this.b.refreshDrawableState();
    }

    public final int[] b(int n2, Function object) {
        Object object2 = this.c;
        if (object2 == null) {
            object = (int[])ag$$ExternalSyntheticApiModelOutline1.m((Function)object, (Object)n2);
        } else {
            object = (int[])ag$$ExternalSyntheticApiModelOutline1.m((Function)object, (Object)(n2 + ((int[])object2).length));
            object2 = this.c;
            n2 = ((Object)object).length;
            while (--n2 >= 0 && object[n2] == false) {
            }
            System.arraycopy(object2, 0, object, n2 + 1, ((int[])object2).length);
        }
        object2 = object;
        if (this.a != null) {
            object2 = DesugarArrays.stream((int[])object).filter(new bog(this)).toArray();
        }
        return object2;
    }
}

