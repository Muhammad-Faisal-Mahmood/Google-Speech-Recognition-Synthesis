/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.TypedArray
 *  android.util.AttributeSet
 *  android.view.LayoutInflater$Factory2
 *  android.view.View
 *  android.view.View$OnAttachStateChangeListener
 *  android.view.ViewGroup
 */
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Objects;

public final class bn
implements LayoutInflater.Factory2 {
    public final by a;

    public bn(by by2) {
        this.a = by2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final View onCreateView(View object, String object2, Context object3, AttributeSet object4) {
        block22: {
            int n2;
            int n3;
            String string;
            String string2;
            block26: {
                Object object5;
                block25: {
                    block24: {
                        int n4;
                        int n5;
                        block23: {
                            if (bk.class.getName().equals(object2)) {
                                return new bk((Context)object3, (AttributeSet)object4, this.a);
                            }
                            boolean bl2 = "fragment".equals(object2);
                            object2 = null;
                            if (!bl2) break block22;
                            object5 = object4.getAttributeValue(null, "class");
                            TypedArray typedArray = object3.obtainStyledAttributes((AttributeSet)object4, s.a);
                            n5 = 0;
                            string2 = object5;
                            if (object5 == null) {
                                string2 = typedArray.getString(0);
                            }
                            n4 = typedArray.getResourceId(1, -1);
                            string = typedArray.getString(2);
                            typedArray.recycle();
                            if (string2 == null) break block22;
                            object5 = object3.getClassLoader();
                            n3 = bl.a;
                            try {
                                bl2 = be.class.isAssignableFrom(bl.a((ClassLoader)object5, string2));
                                if (!bl2) break block22;
                                if (object == null) break block23;
                            }
                            catch (ClassNotFoundException classNotFoundException) {
                                return null;
                            }
                            n5 = object.getId();
                        }
                        n3 = n5;
                        n2 = n4;
                        if (n5 == -1) {
                            if (n4 == -1) {
                                if (string == null) throw new IllegalArgumentException(a.al(string2, (AttributeSet)object4, ": Must specify unique android:id, android:tag, or have a parent with an id for "));
                                n3 = -1;
                                n2 = -1;
                            } else {
                                n3 = -1;
                                n2 = n4;
                            }
                        }
                        if (n2 != -1) {
                            object2 = this.a.d(n2);
                        }
                        object5 = object2;
                        if (object2 == null) {
                            object5 = object2;
                            if (string != null) {
                                object5 = this.a.e(string);
                            }
                        }
                        object2 = object5;
                        if (object5 == null) {
                            object2 = object5;
                            if (n3 != -1) {
                                object2 = this.a.d(n3);
                            }
                        }
                        if (object2 != null) break block24;
                        object2 = this.a.g();
                        object3.getClassLoader();
                        object2 = ((bl)object2).b(string2);
                        ((be)object2).u = true;
                        n5 = n2 != 0 ? n2 : n3;
                        ((be)object2).E = n5;
                        ((be)object2).F = n3;
                        ((be)object2).G = string;
                        ((be)object2).v = true;
                        ((be)object2).A = this.a;
                        object3 = this.a;
                        ((be)object2).B = ((by)object3).l;
                        ((be)object2).onInflate(((by)object3).l.c, (AttributeSet)object4, ((be)object2).g);
                        object5 = this.a.ag((be)object2);
                        object4 = object2;
                        object3 = object5;
                        if (by.S(2)) {
                            Objects.toString(object2);
                            Integer.toHexString(n2);
                            object4 = object2;
                            object3 = object5;
                        }
                        break block25;
                    }
                    if (((be)object2).v) break block26;
                    ((be)object2).v = true;
                    ((be)object2).A = this.a;
                    object3 = this.a;
                    ((be)object2).B = ((by)object3).l;
                    ((be)object2).onInflate(((by)object3).l.c, (AttributeSet)object4, ((be)object2).g);
                    object5 = this.a.ah((be)object2);
                    object4 = object2;
                    object3 = object5;
                    if (by.S(2)) {
                        Objects.toString(object2);
                        Integer.toHexString(n2);
                        object3 = object5;
                        object4 = object2;
                    }
                }
                object2 = (ViewGroup)object;
                jse.e(object4, "fragment");
                object5 = new zz((be)object4, (ViewGroup)object2);
                zy.d((aai)object5);
                object = zy.b((be)object4);
                if (((zx)object).b.contains((Object)zw.d) && zy.e((zx)object, object4.getClass(), object5.getClass())) {
                    zy.c((zx)object, (aai)object5);
                }
                ((be)object4).O = object2;
                ((gbb)object3).e();
                ((gbb)object3).d();
                object = ((be)object4).P;
                if (object == null) throw new IllegalStateException(a.aj(string2, "Fragment ", " did not create a view."));
                if (n2 != 0) {
                    object.setId(n2);
                }
                if (((be)object4).P.getTag() == null) {
                    ((be)object4).P.setTag((Object)string);
                }
                ((be)object4).P.addOnAttachStateChangeListener((View.OnAttachStateChangeListener)new bnd(this, (gbb)object3, 1));
                return ((be)object4).P;
            }
            object = new StringBuilder();
            ((StringBuilder)object).append(object4.getPositionDescription());
            ((StringBuilder)object).append(": Duplicate id 0x");
            ((StringBuilder)object).append(Integer.toHexString(n2));
            ((StringBuilder)object).append(", tag ");
            ((StringBuilder)object).append(string);
            ((StringBuilder)object).append(", or parent id 0x");
            ((StringBuilder)object).append(Integer.toHexString(n3));
            ((StringBuilder)object).append(" with another fragment for ");
            ((StringBuilder)object).append(string2);
            throw new IllegalArgumentException(((StringBuilder)object).toString());
        }
        return null;
    }

    public final View onCreateView(String string, Context context, AttributeSet attributeSet) {
        return this.onCreateView(null, string, context, attributeSet);
    }
}

