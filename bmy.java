/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.Editable
 *  android.text.TextUtils
 *  android.text.TextWatcher
 */
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import java.util.Iterator;

final class bmy
implements TextWatcher {
    final bna a;

    public bmy(bna bna2) {
        this.a = bna2;
    }

    public final void afterTextChanged(Editable object) {
        int n2 = true != TextUtils.isEmpty((CharSequence)(object = object.toString())) ? 0 : 8;
        bna bna2 = this.a;
        bna2.n.setVisibility(n2);
        Iterator iterator = bna2.r.iterator();
        while (iterator.hasNext()) {
            ag$$ExternalSyntheticApiModelOutline1.m(ag$$ExternalSyntheticApiModelOutline1.m(iterator.next()), object);
        }
        object = bna2.t.iterator();
        while (object.hasNext()) {
            ((bnn)object.next()).a();
        }
    }

    public final void beforeTextChanged(CharSequence charSequence, int n2, int n3, int n4) {
    }

    public final void onTextChanged(CharSequence charSequence, int n2, int n3, int n4) {
    }
}

