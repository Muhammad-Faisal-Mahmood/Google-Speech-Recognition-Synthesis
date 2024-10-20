/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 *  android.text.Editable
 *  android.text.SpanWatcher
 *  android.text.Spannable
 *  android.text.TextWatcher
 */
import android.os.Build;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.TextWatcher;
import java.util.concurrent.atomic.AtomicInteger;

final class zn
implements TextWatcher,
SpanWatcher {
    final Object a;
    public final AtomicInteger b = new AtomicInteger(0);

    public zn(Object object) {
        this.a = object;
    }

    public final void afterTextChanged(Editable editable) {
        ((TextWatcher)this.a).afterTextChanged(editable);
    }

    public final void beforeTextChanged(CharSequence charSequence, int n2, int n3, int n4) {
        ((TextWatcher)this.a).beforeTextChanged(charSequence, n2, n3, n4);
    }

    public final void onSpanAdded(Spannable spannable, Object object, int n2, int n3) {
        if (this.b.get() > 0 && object instanceof zm) {
            return;
        }
        ((SpanWatcher)this.a).onSpanAdded(spannable, object, n2, n3);
    }

    /*
     * Unable to fully structure code
     */
    public final void onSpanChanged(Spannable var1_1, Object var2_2, int var3_3, int var4_4, int var5_5, int var6_6) {
        if (this.b.get() > 0 && var2_2 instanceof zm) {
            return;
        }
        var8_7 = var3_3;
        if (Build.VERSION.SDK_INT >= 28) ** GOTO lbl-1000
        var7_8 = var3_3;
        if (var3_3 > var4_4) {
            var7_8 = 0;
        }
        var8_7 = var7_8;
        if (var5_5 > var6_6) {
            var3_3 = 0;
            var8_7 = var7_8;
        } else lbl-1000:
        // 2 sources

        {
            var3_3 = var5_5;
        }
        ((SpanWatcher)this.a).onSpanChanged(var1_1, var2_2, var8_7, var4_4, var3_3, var6_6);
    }

    public final void onSpanRemoved(Spannable spannable, Object object, int n2, int n3) {
        if (this.b.get() > 0 && object instanceof zm) {
            return;
        }
        ((SpanWatcher)this.a).onSpanRemoved(spannable, object, n2, n3);
    }

    public final void onTextChanged(CharSequence charSequence, int n2, int n3, int n4) {
        ((TextWatcher)this.a).onTextChanged(charSequence, n2, n3, n4);
    }
}

