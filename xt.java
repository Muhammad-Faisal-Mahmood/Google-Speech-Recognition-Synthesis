/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.text.style.ClickableSpan
 *  android.view.View
 */
import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

public final class xt
extends ClickableSpan {
    private final int a;
    private final xv b;
    private final int c;

    public xt(int n2, xv xv2, int n3) {
        this.a = n2;
        this.b = xv2;
        this.c = n3;
    }

    public final void onClick(View view) {
        view = new Bundle();
        view.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.a);
        this.b.a.performAction(this.c, (Bundle)view);
    }
}

