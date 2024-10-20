/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Rect
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.text.SpannableString
 *  android.text.TextUtils
 *  android.view.accessibility.AccessibilityNodeInfo
 *  android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction
 *  android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo
 */
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.List;

public final class xv {
    public final AccessibilityNodeInfo a;

    public xv(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.a = accessibilityNodeInfo;
    }

    static String b(int n2) {
        if (n2 != 1) {
            if (n2 != 2) {
                switch (n2) {
                    default: {
                        switch (n2) {
                            default: {
                                switch (n2) {
                                    default: {
                                        switch (n2) {
                                            default: {
                                                return "ACTION_UNKNOWN";
                                            }
                                            case 16908375: {
                                                return "ACTION_DRAG_CANCEL";
                                            }
                                            case 16908374: {
                                                return "ACTION_DRAG_DROP";
                                            }
                                            case 16908373: {
                                                return "ACTION_DRAG_START";
                                            }
                                            case 16908372: 
                                        }
                                        return "ACTION_IME_ENTER";
                                    }
                                    case 16908362: {
                                        return "ACTION_PRESS_AND_HOLD";
                                    }
                                    case 16908361: {
                                        return "ACTION_PAGE_RIGHT";
                                    }
                                    case 16908360: {
                                        return "ACTION_PAGE_LEFT";
                                    }
                                    case 16908359: {
                                        return "ACTION_PAGE_DOWN";
                                    }
                                    case 16908358: {
                                        return "ACTION_PAGE_UP";
                                    }
                                    case 16908357: {
                                        return "ACTION_HIDE_TOOLTIP";
                                    }
                                    case 16908356: 
                                }
                                return "ACTION_SHOW_TOOLTIP";
                            }
                            case 16908349: {
                                return "ACTION_SET_PROGRESS";
                            }
                            case 16908348: {
                                return "ACTION_CONTEXT_CLICK";
                            }
                            case 16908347: {
                                return "ACTION_SCROLL_RIGHT";
                            }
                            case 16908346: {
                                return "ACTION_SCROLL_DOWN";
                            }
                            case 16908345: {
                                return "ACTION_SCROLL_LEFT";
                            }
                            case 16908344: {
                                return "ACTION_SCROLL_UP";
                            }
                            case 16908343: {
                                return "ACTION_SCROLL_TO_POSITION";
                            }
                            case 16908342: 
                        }
                        return "ACTION_SHOW_ON_SCREEN";
                    }
                    case 16908382: {
                        return "ACTION_SCROLL_IN_DIRECTION";
                    }
                    case 16908354: {
                        return "ACTION_MOVE_WINDOW";
                    }
                    case 0x200000: {
                        return "ACTION_SET_TEXT";
                    }
                    case 524288: {
                        return "ACTION_COLLAPSE";
                    }
                    case 262144: {
                        return "ACTION_EXPAND";
                    }
                    case 131072: {
                        return "ACTION_SET_SELECTION";
                    }
                    case 65536: {
                        return "ACTION_CUT";
                    }
                    case 32768: {
                        return "ACTION_PASTE";
                    }
                    case 16384: {
                        return "ACTION_COPY";
                    }
                    case 8192: {
                        return "ACTION_SCROLL_BACKWARD";
                    }
                    case 4096: {
                        return "ACTION_SCROLL_FORWARD";
                    }
                    case 2048: {
                        return "ACTION_PREVIOUS_HTML_ELEMENT";
                    }
                    case 1024: {
                        return "ACTION_NEXT_HTML_ELEMENT";
                    }
                    case 512: {
                        return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
                    }
                    case 256: {
                        return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
                    }
                    case 128: {
                        return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
                    }
                    case 64: {
                        return "ACTION_ACCESSIBILITY_FOCUS";
                    }
                    case 32: {
                        return "ACTION_LONG_CLICK";
                    }
                    case 16: {
                        return "ACTION_CLICK";
                    }
                    case 8: {
                        return "ACTION_CLEAR_SELECTION";
                    }
                    case 4: 
                }
                return "ACTION_SELECT";
            }
            return "ACTION_CLEAR_FOCUS";
        }
        return "ACTION_FOCUS";
    }

    private final List k(String string) {
        ArrayList arrayList;
        ArrayList arrayList2 = arrayList = this.a.getExtras().getIntegerArrayList(string);
        if (arrayList == null) {
            arrayList2 = new ArrayList();
            this.a.getExtras().putIntegerArrayList(string, arrayList2);
        }
        return arrayList2;
    }

    private final boolean l(int n2) {
        Bundle bundle = this.a();
        if (bundle == null) {
            return false;
        }
        return (bundle.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & n2) == n2;
    }

    public final Bundle a() {
        return this.a.getExtras();
    }

    public final void c(int n2) {
        this.a.addAction(n2);
    }

    public final void d(xu xu2) {
        xu2 = (AccessibilityNodeInfo.AccessibilityAction)xu2.j;
        this.a.addAction((AccessibilityNodeInfo.AccessibilityAction)xu2);
    }

    public final void e(int n2, boolean bl2) {
        Bundle bundle = this.a();
        if (bundle != null) {
            int n3 = bundle.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0);
            int n4 = n2;
            if (!bl2) {
                n4 = 0;
            }
            bundle.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", n4 | n3 & ~n2);
        }
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (!(object instanceof xv)) {
            return false;
        }
        xv xv2 = (xv)object;
        object = this.a;
        xv2 = xv2.a;
        return !(object == null ? xv2 != null : !object.equals((Object)xv2));
    }

    public final void f(boolean bl2) {
        this.a.setCheckable(bl2);
    }

    public final void g(CharSequence charSequence) {
        this.a.setClassName(charSequence);
    }

    public final void h(Object object) {
        object = ((bzb)object).a;
        this.a.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo)object);
    }

    public final int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public final void i(boolean bl2) {
        this.a.setScrollable(bl2);
    }

    public final void j() {
        this.e(0x4000000, true);
    }

    public final String toString() {
        int n2;
        ArrayList<xu> arrayList;
        Object object;
        Object object2;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        Object object3 = new Rect();
        this.a.getBoundsInParent((Rect)object3);
        object3.toString();
        stringBuilder.append("; boundsInParent: ".concat(object3.toString()));
        this.a.getBoundsInScreen((Rect)object3);
        object3.toString();
        stringBuilder.append("; boundsInScreen: ".concat(object3.toString()));
        if (Build.VERSION.SDK_INT >= 34) {
            mk$$ExternalSyntheticApiModelOutline0.m(this.a, (Rect)object3);
        } else {
            object2 = (Rect)this.a.getExtras().getParcelable("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY");
            if (object2 != null) {
                object3.set(((Rect)object2).left, ((Rect)object2).top, ((Rect)object2).right, ((Rect)object2).bottom);
            }
        }
        object3.toString();
        stringBuilder.append("; boundsInWindow: ".concat(object3.toString()));
        stringBuilder.append("; packageName: ");
        stringBuilder.append(this.a.getPackageName());
        stringBuilder.append("; className: ");
        stringBuilder.append(this.a.getClassName());
        stringBuilder.append("; text: ");
        boolean bl2 = this.k("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
        int n3 = 0;
        if (!bl2) {
            List list = this.k("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            List list2 = this.k("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            object = this.k("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            arrayList = this.k("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            object2 = this.a;
            object3 = new SpannableString((CharSequence)TextUtils.substring((CharSequence)object2.getText(), (int)0, (int)object2.getText().length()));
            n2 = 0;
            while (true) {
                object2 = object3;
                if (n2 < list.size()) {
                    object3.setSpan((Object)new xt((Integer)arrayList.get(n2), this, this.a().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((Integer)list.get(n2)).intValue(), ((Integer)list2.get(n2)).intValue(), ((Integer)object.get(n2)).intValue());
                    ++n2;
                    continue;
                }
                break;
            }
        } else {
            object2 = this.a.getText();
        }
        stringBuilder.append((CharSequence)object2);
        stringBuilder.append("; error: ");
        stringBuilder.append(this.a.getError());
        stringBuilder.append("; maxTextLength: ");
        stringBuilder.append(this.a.getMaxTextLength());
        stringBuilder.append("; stateDescription: ");
        object2 = Build.VERSION.SDK_INT >= 30 ? sk$$ExternalSyntheticApiModelOutline1.m(this.a) : this.a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY");
        stringBuilder.append((CharSequence)object2);
        stringBuilder.append("; contentDescription: ");
        stringBuilder.append(this.a.getContentDescription());
        stringBuilder.append("; tooltipText: ");
        object2 = Build.VERSION.SDK_INT >= 28 ? fs$$ExternalSyntheticApiModelOutline0.m(this.a) : this.a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY");
        stringBuilder.append((CharSequence)object2);
        stringBuilder.append("; viewIdResName: ");
        stringBuilder.append(this.a.getViewIdResourceName());
        stringBuilder.append("; uniqueId: ");
        object2 = Build.VERSION.SDK_INT >= 33 ? a$$ExternalSyntheticApiModelOutline0.m(this.a) : this.a.getExtras().getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY");
        stringBuilder.append((String)object2);
        stringBuilder.append("; checkable: ");
        stringBuilder.append(this.a.isCheckable());
        stringBuilder.append("; checked: ");
        stringBuilder.append(this.a.isChecked());
        stringBuilder.append("; focusable: ");
        stringBuilder.append(this.a.isFocusable());
        stringBuilder.append("; focused: ");
        stringBuilder.append(this.a.isFocused());
        stringBuilder.append("; selected: ");
        stringBuilder.append(this.a.isSelected());
        stringBuilder.append("; clickable: ");
        stringBuilder.append(this.a.isClickable());
        stringBuilder.append("; longClickable: ");
        stringBuilder.append(this.a.isLongClickable());
        stringBuilder.append("; contextClickable: ");
        stringBuilder.append(this.a.isContextClickable());
        stringBuilder.append("; enabled: ");
        stringBuilder.append(this.a.isEnabled());
        stringBuilder.append("; password: ");
        stringBuilder.append(this.a.isPassword());
        object2 = new StringBuilder("; scrollable: ");
        ((StringBuilder)object2).append(this.a.isScrollable());
        stringBuilder.append(((StringBuilder)object2).toString());
        stringBuilder.append("; containerTitle: ");
        object2 = Build.VERSION.SDK_INT >= 34 ? mk$$ExternalSyntheticApiModelOutline0.m(this.a) : this.a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY");
        stringBuilder.append((CharSequence)object2);
        stringBuilder.append("; granularScrollingSupported: ");
        stringBuilder.append(this.l(0x4000000));
        stringBuilder.append("; importantForAccessibility: ");
        stringBuilder.append(ag$$ExternalSyntheticApiModelOutline1.m(this.a));
        stringBuilder.append("; visible: ");
        stringBuilder.append(this.a.isVisibleToUser());
        stringBuilder.append("; isTextSelectable: ");
        bl2 = Build.VERSION.SDK_INT >= 33 ? a$$ExternalSyntheticApiModelOutline0.m(this.a) : this.l(0x800000);
        stringBuilder.append(bl2);
        stringBuilder.append("; accessibilityDataSensitive: ");
        bl2 = Build.VERSION.SDK_INT >= 34 ? mk$$ExternalSyntheticApiModelOutline0.m(this.a) : this.l(64);
        stringBuilder.append(bl2);
        stringBuilder.append("; [");
        object2 = this.a.getActionList();
        arrayList = new ArrayList<xu>();
        int n4 = object2.size();
        n2 = 0;
        while (true) {
            if (n2 >= n4) break;
            arrayList.add(new xu(object2.get(n2), 0, null, null, null));
            ++n2;
        }
        for (int i2 = n3; i2 < arrayList.size(); ++i2) {
            object = (xu)arrayList.get(i2);
            object2 = object3 = xv.b(((xu)object).a());
            if (((String)object3).equals("ACTION_UNKNOWN")) {
                object2 = object3;
                if (((xu)object).b() != null) {
                    object2 = ((xu)object).b().toString();
                }
            }
            stringBuilder.append((String)object2);
            if (i2 == arrayList.size() - 1) continue;
            stringBuilder.append(", ");
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

