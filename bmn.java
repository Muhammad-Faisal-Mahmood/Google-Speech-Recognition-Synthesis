/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.Switch
 *  android.widget.TextView
 */
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

public final class bmn
implements bmj {
    private static final int[] k = new int[]{2130969900};
    public boolean a;
    public final bml b;
    public final ViewGroup c;
    public View d;
    public View e;
    public ImageView f;
    public Switch g;
    public TextView h;
    public TextView i;
    public boolean j;
    private final int l;

    public bmn(bml bml2, ViewGroup viewGroup) {
        this.b = bml2;
        this.c = viewGroup;
        bml2.b(this);
        this.l = viewGroup.getContext().getResources().getDimensionPixelSize(2131165411);
    }

    private final void b(View view) {
        view.setEnabled(this.b.l);
        Object object = this.b.d() ? k : null;
        if (view instanceof ImageView) {
            ((ImageView)view).setImageState(object, true);
        } else if (view instanceof boj) {
            ((boj)view).a((int[])object, null);
        }
        if (view instanceof ViewGroup) {
            view = (ViewGroup)view;
            for (int i2 = 0; i2 < view.getChildCount(); ++i2) {
                this.b(view.getChildAt(i2));
            }
        }
    }

    public final void a() {
        block14: {
            Object object;
            block17: {
                block13: {
                    int n2;
                    boolean bl2;
                    boolean bl3;
                    int n3;
                    Object object2;
                    block16: {
                        int n4;
                        block15: {
                            object = this.d;
                            if (object == null) break block13;
                            object.setId(this.b.f);
                            object = this.b;
                            object2 = object.i;
                            n3 = 1;
                            bl3 = object2 != null;
                            n4 = TextUtils.isEmpty((CharSequence)object.h);
                            object = this.b;
                            bl2 = object.n;
                            n2 = 8;
                            if (!bl2 || object.c && this.a) break block14;
                            bl2 = object.a;
                            if (bl2 || bl3) break block15;
                            if (n4 != 0) break block14;
                            break block16;
                        }
                        n3 = n4 ^ 1;
                    }
                    this.d.setVisibility(0);
                    this.d.setContentDescription(this.b.h);
                    if (bl2) {
                        this.g.setChecked(this.b.m);
                        object = this.g;
                    } else if (n3 != 0 && bl3 && object.d) {
                        object = this.b;
                        n3 = this.l;
                        object.i.setBounds(0, 0, n3, n3);
                        this.i.setCompoundDrawables(this.b.i, null, null, null);
                        this.i.setText(this.b.h);
                        object = this.i;
                    } else if (bl3) {
                        this.f.setImageDrawable(this.b.i);
                        object = this.e;
                    } else {
                        this.h.setText(this.b.h);
                        object = this.h;
                    }
                    object2 = this.e;
                    n3 = object == object2 ? 0 : 8;
                    object2.setVisibility(n3);
                    object2 = this.h;
                    n3 = object == object2 ? 0 : 8;
                    object2.setVisibility(n3);
                    object2 = this.i;
                    n3 = object == object2 ? 0 : 8;
                    object2.setVisibility(n3);
                    object2 = this.g;
                    n3 = n2;
                    if (object == object2) {
                        n3 = 0;
                    }
                    object2.setVisibility(n3);
                    if (!this.j) {
                        object = this.d;
                    }
                    object2 = this.b;
                    if (!object2.e && bl3) {
                        object2.i.setTintList(null);
                    }
                    this.b(this.d);
                    this.d.setActivated(this.b.o);
                    object2 = this.b;
                    if (object2.j != null || object2.a || object2.b) break block17;
                    object2 = this.d;
                    if (object == object2) {
                        object2.setOnClickListener(null);
                        this.d.setClickable(false);
                    }
                }
                return;
            }
            object.setOnClickListener((View.OnClickListener)new gp(this, 16, null));
            return;
        }
        this.d.setVisibility(8);
    }

    @Override
    public final void onMenuItemChanged(bml bml2) {
        this.a();
    }
}

