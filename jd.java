/*
 * Decompiled with CFR 0.152.
 */
import android.support.v7.widget.RecyclerView;

final class jd
extends kt {
    final jf a;

    public jd(jf jf2) {
        this.a = jf2;
    }

    @Override
    public final void a(RecyclerView object, int n2, int n3) {
        block9: {
            block8: {
                float f2;
                float f3;
                int n4;
                int n5;
                block7: {
                    int n6;
                    int n7;
                    block6: {
                        n3 = ((RecyclerView)object).computeHorizontalScrollOffset();
                        n2 = ((RecyclerView)object).computeVerticalScrollOffset();
                        object = this.a;
                        n7 = ((jf)object).l.computeVerticalScrollRange();
                        boolean bl2 = n7 - (n6 = ((jf)object).k) > 0 && n6 >= ((jf)object).a;
                        ((jf)object).m = bl2;
                        n5 = ((jf)object).l.computeHorizontalScrollRange();
                        n4 = ((jf)object).j;
                        bl2 = n5 - n4 > 0 && n4 >= ((jf)object).a;
                        ((jf)object).n = bl2;
                        if (((jf)object).m) break block6;
                        if (bl2) break block7;
                        if (((jf)object).o != 0) {
                            ((jf)object).d(0);
                            return;
                        }
                        break block8;
                    }
                    f3 = n2;
                    f2 = n6;
                    ((jf)object).e = (int)(f2 * (f3 + f2 / 2.0f) / (float)n7);
                    ((jf)object).d = Math.min(n6, n6 * n6 / n7);
                }
                if (((jf)object).n) {
                    f2 = n3;
                    f3 = n4;
                    ((jf)object).h = (int)(f3 * (f2 + f3 / 2.0f) / (float)n5);
                    ((jf)object).g = Math.min(n4, n4 * n4 / n5);
                }
                if ((n2 = ((jf)object).o) == 0 || n2 == 1) break block9;
            }
            return;
        }
        ((jf)object).d(1);
    }
}

