/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.CheckBox
 *  android.widget.CompoundButton
 *  android.widget.CompoundButton$OnCheckedChangeListener
 *  android.widget.ImageView
 *  android.widget.RadioButton
 *  android.widget.Switch
 */
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Switch;

public final class blh
extends lg {
    public static final int q = 0;
    final View a;
    final View b;
    final View c;
    final bok d;
    final bok e;
    final ImageView f;
    final ImageView g;
    final ImageView h;
    final ViewGroup i;
    final ViewGroup j;
    final View k;
    final Switch l;
    final CheckBox m;
    final RadioButton n;
    final ImageView o;
    final boolean p;

    public blh(View view, boolean bl2) {
        super(view);
        if (bl2) {
            bnv.i(view, 2131427501).setVisibility(0);
        } else {
            bnv.i(view, 2131427495).setVisibility(0);
            bnv.i(view, 2131427485).setVisibility(0);
        }
        this.a = bnv.i(view, 2131427501);
        this.b = bnv.i(view, 2131427495);
        this.c = bnv.i(view, 2131427485);
        this.d = (bok)bnv.i(view, 2131427500);
        this.e = (bok)bnv.i(view, 2131427488);
        this.f = (ImageView)bnv.i(view, 2131427492);
        this.g = (ImageView)bnv.i(view, 2131427490);
        this.h = (ImageView)bnv.i(view, 2131427487);
        this.i = (ViewGroup)bnv.i(view, 2131427493);
        this.j = (ViewGroup)bnv.i(view, 2131427484);
        this.k = bnv.i(view, 2131427486);
        this.l = (Switch)bnv.i(view, 2131427498);
        this.m = (CheckBox)bnv.i(view, 2131427489);
        this.n = (RadioButton)bnv.i(view, 2131427494);
        this.o = (ImageView)bnv.i(view, 2131427497);
        this.p = bl2;
    }

    final void a(View view, boolean bl2) {
        view.setEnabled(bl2);
        if (view instanceof ViewGroup) {
            view = (ViewGroup)view;
            for (int i2 = 0; i2 < view.getChildCount(); ++i2) {
                this.a(view.getChildAt(i2), bl2);
            }
        }
    }

    final void b(bla object, CompoundButton compoundButton, eky eky2) {
        compoundButton.setVisibility(0);
        compoundButton.setOnCheckedChangeListener(null);
        compoundButton.setChecked(((bla)object).e);
        compoundButton.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener)new atr((bla)object, 3));
        this.a.setVisibility(0);
        object = new bup(compoundButton, eky2, 1);
        this.a.setOnClickListener((View.OnClickListener)object);
        this.a.setClickable(true);
        this.b.setVisibility(8);
        this.c.setVisibility(8);
        this.j.setVisibility(0);
        this.j.setClickable(false);
    }
}

