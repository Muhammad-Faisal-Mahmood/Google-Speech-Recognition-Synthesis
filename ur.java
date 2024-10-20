/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.view.View
 *  android.view.View$AccessibilityDelegate
 *  android.view.ViewGroup
 *  android.view.accessibility.AccessibilityEvent
 *  android.view.accessibility.AccessibilityNodeInfo
 *  android.view.accessibility.AccessibilityNodeProvider
 */
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;

final class ur
extends View.AccessibilityDelegate {
    final us a;

    public ur(us us2) {
        this.a = us2;
    }

    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.a.f(view, accessibilityEvent);
    }

    public final AccessibilityNodeProvider getAccessibilityNodeProvider(View object) {
        if ((object = this.a.i((View)object)) != null) {
            return (AccessibilityNodeProvider)object.a;
        }
        return null;
    }

    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.a.a(view, accessibilityEvent);
    }

    public final void onInitializeAccessibilityNodeInfo(View object, AccessibilityNodeInfo accessibilityNodeInfo) {
        xv xv2 = new xv(accessibilityNodeInfo);
        Object object2 = (Boolean)new vs(Boolean.class).d((View)object);
        boolean bl2 = true;
        int n2 = 0;
        boolean bl3 = object2 != null && ((Boolean)object2).booleanValue();
        if (Build.VERSION.SDK_INT >= 28) {
            fs$$ExternalSyntheticApiModelOutline0.m(xv2.a, bl3);
        } else {
            xv2.e(1, bl3);
        }
        object2 = (Boolean)new vv(Boolean.class).d((View)object);
        bl3 = object2 != null && ((Boolean)object2).booleanValue() ? bl2 : false;
        if (Build.VERSION.SDK_INT >= 28) {
            fs$$ExternalSyntheticApiModelOutline0.m$1(xv2.a, bl3);
        } else {
            xv2.e(2, bl3);
        }
        object2 = wj.f((View)object);
        if (Build.VERSION.SDK_INT >= 28) {
            fs$$ExternalSyntheticApiModelOutline0.m(xv2.a, (CharSequence)object2);
        } else {
            xv2.a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", (CharSequence)object2);
        }
        object2 = (CharSequence)new vu(CharSequence.class).d((View)object);
        if (Build.VERSION.SDK_INT >= 30) {
            sk$$ExternalSyntheticApiModelOutline1.m(xv2.a, (CharSequence)object2);
        } else {
            xv2.a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", (CharSequence)object2);
        }
        this.a.b((View)object, xv2);
        accessibilityNodeInfo.getText();
        object = us.l((View)object);
        while (n2 < object.size()) {
            xv2.d((xu)object.get(n2));
            ++n2;
        }
    }

    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.a.c(view, accessibilityEvent);
    }

    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.a.g(viewGroup, view, accessibilityEvent);
    }

    public final boolean performAccessibilityAction(View view, int n2, Bundle bundle) {
        return this.a.h(view, n2, bundle);
    }

    public final void sendAccessibilityEvent(View view, int n2) {
        this.a.d(view, n2);
    }

    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.a.e(view, accessibilityEvent);
    }
}

