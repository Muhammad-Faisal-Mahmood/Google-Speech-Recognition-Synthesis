/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import j$.util.function.Consumer$_CC;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;

public final class bnt
implements Consumer {
    public final bnu a;
    public final View[] b;
    public final int c;
    public final AtomicInteger d;

    public /* synthetic */ bnt(bnu bnu2, View[] viewArray, int n2, AtomicInteger atomicInteger) {
        this.a = bnu2;
        this.b = viewArray;
        this.c = n2;
        this.d = atomicInteger;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void accept(Object viewArray) {
        int n2 = this.c;
        bnu bnu2 = this.a;
        AtomicInteger atomicInteger = this.d;
        View view = (View)viewArray;
        synchronized (bnu2) {
            int n3;
            View[] viewArray2 = bnu2.h;
            viewArray = this.b;
            if (viewArray != viewArray2) {
                return;
            }
            viewArray[n2] = view;
            n2 = atomicInteger.addAndGet(1);
            if (n2 == (n3 = viewArray.length)) {
                for (n2 = 0; n2 < n3; ++n2) {
                    atomicInteger = viewArray[n2];
                    bnu2.a.addView((View)atomicInteger);
                }
            }
            return;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$_CC.$default$andThen(this, consumer);
    }
}

