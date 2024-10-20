/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.graphics.Typeface
 *  android.os.Parcel
 *  android.text.Layout
 *  android.view.View
 *  android.widget.ScrollView
 *  android.widget.TextView
 */
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Parcel;
import android.text.Layout;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import j$.util.Objects;
import java.io.Serializable;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;

public final class mp
implements Runnable {
    public final int a;
    public final Object b;
    public final Object c;
    private final int d;

    public mp(TextView textView, Typeface typeface, int n2, int n3) {
        this.d = n3;
        this.b = textView;
        this.c = typeface;
        this.a = n2;
    }

    public mp(BottomSheetBehavior bottomSheetBehavior, View view, int n2, int n3) {
        this.d = n3;
        this.c = view;
        this.a = n2;
        this.b = bottomSheetBehavior;
    }

    public /* synthetic */ mp(hpf hpf2, gzx gzx2, int n2, int n3) {
        this.d = n3;
        this.b = hpf2;
        this.c = gzx2;
        this.a = n2;
    }

    public /* synthetic */ mp(Object object, int n2, Object object2, int n3) {
        this.d = n3;
        this.b = object;
        this.a = n2;
        this.c = object2;
    }

    public /* synthetic */ mp(nq nq2, int n2, bzb bzb2, int n3) {
        this.d = n3;
        this.c = nq2;
        this.a = n2;
        this.b = bzb2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void run() {
        Object object;
        int n2 = this.d;
        Object object2 = null;
        switch (n2) {
            default: {
                object = this.c;
                n2 = this.a;
                object2 = this.b;
                break;
            }
            case 8: {
                object2 = (hpf)this.b;
                hpn[] hpnArray = ((hpf)object2).d;
                n2 = this.a;
                hpn hpn2 = Objects.requireNonNull(hpnArray[n2]);
                ((hpf)object2).d[n2] = null;
                n2 = ((hpf)object2).e;
                while (true) {
                    Object object3 = this.c;
                    int n3 = ((hct)object3).c;
                    if (n2 >= n3) {
                        ((hpf)object2).e = n3;
                        return;
                    }
                    n3 = n2 + 1;
                    if (((hnk)((gzx)object3).get(n2)).o(hpn2)) {
                        ((hpf)object2).a();
                        ((hpf)object2).e = n3;
                        return;
                    }
                    n2 = n3;
                }
            }
            case 7: {
                n2 = this.a;
                object2 = this.c;
                ((BottomSheetBehavior)this.b).N((View)object2, n2, false);
                return;
            }
            case 6: {
                Layout layout = ((TextView)((dp)this.b).findViewById(2131427710)).getLayout();
                if (layout == null) return;
                object2 = this.c;
                n2 = layout.getLineTop(layout.getLineForOffset(this.a));
                ((ScrollView)object2).scrollTo(0, n2);
                return;
            }
            case 5: {
                ((euu)this.b).c.N(this.a, ((ekj)this.c).b, ebv.r);
                return;
            }
            case 4: {
                Object object4 = this.c;
                object2 = ebg.I;
                n2 = ((ekh)object4).b;
                ((euu)this.b).c.L(this.a, n2, (ebg)object2);
                return;
            }
            case 3: {
                Iterator iterator = ((CopyOnWriteArraySet)this.b).iterator();
                while (iterator.hasNext()) {
                    aft aft2 = (aft)iterator.next();
                    if (aft2.d) continue;
                    n2 = this.a;
                    if (n2 != -1) {
                        aft2.b.b(n2);
                    }
                    object2 = this.c;
                    aft2.c = true;
                    object2.a(aft2.a);
                }
                return;
            }
            case 2: {
                Intent intent = new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (Serializable)this.c);
                object2 = this.b;
                n2 = this.a;
                ((nq)object2).e(n2, 0, intent);
                return;
            }
            case 1: {
                n2 = this.a;
                object2 = this.c;
                ie.f((TextView)this.b, (Typeface)object2, n2);
                return;
            }
            case 0: {
                nq nq2 = (nq)this.c;
                String string = (String)nq2.a.get(this.a);
                if (string == null) {
                    return;
                }
                bxt bxt2 = (bxt)nq2.e.get(string);
                if (bxt2 != null) {
                    object2 = bxt2.a;
                }
                Object object5 = ((bzb)this.b).a;
                if (object2 != null) {
                    object2 = bxt2.a;
                    jse.c(object2, "null cannot be cast to non-null type androidx.activity.result.ActivityResultCallback<O of androidx.activity.result.ActivityResultRegistry.dispatchResult>");
                    if (!nq2.d.remove(string)) return;
                    object2.a(object5);
                    return;
                }
                nq2.g.remove(string);
                nq2.f.put(string, object5);
                return;
            }
        }
        try {
            if (((jad)object2).c(n2, (Parcel)object)) return;
            jad.a.logp(Level.FINEST, "io.grpc.binder.internal.OneWayBinderProxy$InProcessImpl", "transact", "A oneway transaction was not understood - ignoring");
            return;
        }
        catch (Exception exception) {
            jad.a.logp(Level.FINEST, "io.grpc.binder.internal.OneWayBinderProxy$InProcessImpl", "transact", "A oneway transaction threw - ignoring", exception);
            return;
        }
    }
}

