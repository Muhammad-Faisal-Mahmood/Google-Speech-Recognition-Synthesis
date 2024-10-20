/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.text.Spanned
 *  android.text.style.ClickableSpan
 *  android.util.Log
 *  android.util.SparseArray
 *  android.view.View
 *  android.view.View$AccessibilityDelegate
 *  android.view.ViewGroup
 *  android.view.accessibility.AccessibilityEvent
 *  android.view.accessibility.AccessibilityNodeInfo
 */
import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

public class us {
    private static final View.AccessibilityDelegate a = new View.AccessibilityDelegate();
    private final View.AccessibilityDelegate b;
    public final View.AccessibilityDelegate c;

    public us() {
        this(a);
    }

    public us(View.AccessibilityDelegate accessibilityDelegate) {
        this.b = accessibilityDelegate;
        this.c = new ur(this);
    }

    static List l(View object) {
        List list = (List)object.getTag(2131427916);
        object = list;
        if (list == null) {
            object = Collections.emptyList();
        }
        return object;
    }

    public void a(View view, AccessibilityEvent accessibilityEvent) {
        this.b.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void b(View view, xv xv2) {
        xv2 = xv2.a;
        this.b.onInitializeAccessibilityNodeInfo(view, (AccessibilityNodeInfo)xv2);
    }

    public void c(View view, AccessibilityEvent accessibilityEvent) {
        this.b.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public void d(View view, int n2) {
        this.b.sendAccessibilityEvent(view, n2);
    }

    public void e(View view, AccessibilityEvent accessibilityEvent) {
        this.b.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public boolean f(View view, AccessibilityEvent accessibilityEvent) {
        return this.b.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean g(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.b.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean h(View view, int n2, Bundle object) {
        boolean bl2;
        Object object2;
        Object var10_8;
        boolean bl3;
        Object object3;
        block13: {
            object3 = us.l(view);
            bl3 = false;
            int n3 = 0;
            while (true) {
                int n4 = object3.size();
                var10_8 = null;
                if (n3 >= n4) break;
                object2 = (xu)object3.get(n3);
                if (((xu)object2).a() == n2) {
                    if (((xu)object2).m == null) break;
                    object3 = ((xu)object2).l;
                    if (object3 != null) {
                        try {
                            object3 = (wf)((Class)object3).getDeclaredConstructor(null).newInstance(null);
                        }
                        catch (Exception exception) {
                            object3 = ((xu)object2).l;
                            object3 = object3 == null ? "null" : ((Class)object3).getName();
                            Log.e((String)"A11yActionCompat", (String)"Failed to execute command with argument class ViewCommandArgument: ".concat(String.valueOf(object3)), (Throwable)exception);
                        }
                    }
                    bl2 = ((xu)object2).m.a(view);
                    break block13;
                }
                ++n3;
            }
            bl2 = false;
        }
        boolean bl4 = bl2;
        if (!bl2) {
            bl4 = this.b.performAccessibilityAction(view, n2, (Bundle)object);
        }
        if (!bl4 && n2 == 2131427353 && object != null) {
            n2 = object.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
            object = (SparseArray)view.getTag(2131427917);
            bl2 = bl3;
            if (object != null) {
                object = (WeakReference)object.get(n2);
                bl2 = bl3;
                if (object != null) {
                    object3 = (ClickableSpan)((Reference)object).get();
                    bl2 = bl3;
                    if (object3 != null) {
                        object2 = view.createAccessibilityNodeInfo().getText();
                        object = var10_8;
                        if (object2 instanceof Spanned) {
                            object = (ClickableSpan[])((Spanned)object2).getSpans(0, object2.length(), ClickableSpan.class);
                        }
                        n2 = 0;
                        while (true) {
                            bl2 = bl3;
                            if (object == null) break;
                            bl2 = bl3;
                            if (n2 >= ((Object)object).length) break;
                            if (object3.equals(object[n2])) {
                                object3.onClick(view);
                                bl2 = true;
                                break;
                            }
                            ++n2;
                        }
                    }
                }
            }
            return bl2;
        }
        return bl4;
    }

    public bzb i(View view) {
        if ((view = this.b.getAccessibilityNodeProvider(view)) != null) {
            return new bzb((Object)view, null);
        }
        return null;
    }
}

