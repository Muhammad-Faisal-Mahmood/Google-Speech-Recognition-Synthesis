/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.accessibility.AccessibilityEvent
 */
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.material.internal.CheckableImageButton;

public final class fwb
extends us {
    final CheckableImageButton a;

    public fwb(CheckableImageButton checkableImageButton) {
        this.a = checkableImageButton;
    }

    @Override
    public final void a(View view, AccessibilityEvent accessibilityEvent) {
        super.a(view, accessibilityEvent);
        accessibilityEvent.setChecked(this.a.a);
    }

    @Override
    public final void b(View object, xv xv2) {
        super.b((View)object, xv2);
        xv2.f(this.a.b);
        object = this.a;
        xv2.a.setChecked(object.a);
    }
}

