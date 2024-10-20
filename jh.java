/*
 * Decompiled with CFR 0.152.
 */
import android.support.v7.widget.RecyclerView;
import java.util.Arrays;

public final class jh {
    int a;
    int b;
    int[] c;
    int d;

    public final void a(int n2, int n3) {
        if (n2 >= 0) {
            if (n3 >= 0) {
                int n4 = this.d;
                n4 += n4;
                int[] nArray = this.c;
                if (nArray == null) {
                    this.c = nArray = new int[4];
                    Arrays.fill(nArray, -1);
                } else {
                    int n5 = nArray.length;
                    if (n4 >= n5) {
                        int[] nArray2 = new int[n4 + n4];
                        this.c = nArray2;
                        System.arraycopy(nArray, 0, nArray2, 0, n5);
                    }
                }
                nArray = this.c;
                nArray[n4] = n2;
                nArray[n4 + 1] = n3;
                ++this.d;
                return;
            }
            throw new IllegalArgumentException("Pixel distance must be non-negative");
        }
        throw new IllegalArgumentException("Layout positions must be non-negative");
    }

    final void b() {
        int[] nArray = this.c;
        if (nArray != null) {
            Arrays.fill(nArray, -1);
        }
        this.d = 0;
    }

    final void c(RecyclerView recyclerView, boolean bl2) {
        this.d = 0;
        Object object = this.c;
        if (object != null) {
            Arrays.fill(object, -1);
        }
        object = recyclerView.n;
        if (recyclerView.m != null && object != null && object.y) {
            int n2;
            if (bl2) {
                if (!recyclerView.g.l()) {
                    object.ag(recyclerView.m.getItemCount(), this);
                }
            } else if (!recyclerView.an()) {
                object.af(this.a, this.b, recyclerView.O, this);
            }
            if ((n2 = this.d) > object.z) {
                object.z = n2;
                object.A = bl2;
                recyclerView.e.n();
            }
        }
    }

    final boolean d(int n2) {
        if (this.c != null) {
            int n3 = this.d;
            for (int i2 = 0; i2 < n3 + n3; i2 += 2) {
                if (this.c[i2] != n2) continue;
                return true;
            }
        }
        return false;
    }
}

