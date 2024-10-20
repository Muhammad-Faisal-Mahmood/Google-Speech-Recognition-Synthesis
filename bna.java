/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextWatcher
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.View$OnFocusChangeListener
 *  android.view.ViewGroup
 *  android.view.inputmethod.InputMethodManager
 *  android.widget.EditText
 *  android.widget.ImageView
 *  android.widget.TextView$OnEditorActionListener
 */
import android.content.Context;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.android.car.ui.toolbar.CarUiEditText;
import j$.util.Objects;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

public final class bna
extends ConstraintLayout {
    public final InputMethodManager h;
    public final bne i;
    public final ImageView j;
    public final EditText k;
    public CharSequence l;
    public boolean m;
    public final View n;
    public final int o;
    public final int p;
    public final int q;
    public Set r;
    public Set s;
    public Set t;
    public Set u;
    public boolean v;
    private final bny w = new bmz(this);
    private final TextWatcher x;
    private boolean y;

    public bna(Context object) {
        super((Context)object, null, 0);
        int n2;
        int n3;
        View view;
        EditText editText;
        this.r = Collections.emptySet();
        this.s = Collections.emptySet();
        this.t = Collections.emptySet();
        this.u = Collections.emptySet();
        bmy bmy2 = new bmy(this);
        this.x = bmy2;
        this.v = false;
        this.y = false;
        this.h = (InputMethodManager)this.getContext().getSystemService(InputMethodManager.class);
        LayoutInflater.from((Context)object).inflate(2131624022, (ViewGroup)this, true);
        this.k = editText = (EditText)bnv.i((View)this, 2131427532);
        this.j = (ImageView)bnv.i((View)this, 2131427534);
        this.n = view = bnv.i((View)this, 2131427533);
        view.setOnClickListener((View.OnClickListener)new gp((Object)this, 17, null));
        view.setVisibility(8);
        this.o = editText.getPaddingStart();
        this.p = n3 = object.getResources().getDimensionPixelSize(2131165418);
        this.q = n2 = object.getResources().getDimensionPixelSize(2131165415);
        editText.setSaveEnabled(false);
        editText.setPaddingRelative(n3, 0, n2, 0);
        editText.setOnClickListener((View.OnClickListener)new gp((Object)this, 18, null));
        editText.setOnFocusChangeListener((View.OnFocusChangeListener)new bmw(this, 0));
        editText.addTextChangedListener((TextWatcher)bmy2);
        editText.setOnEditorActionListener((TextView.OnEditorActionListener)new bmx(this));
        object = new bne((Context)object);
        this.i = object;
        Objects.requireNonNull(object);
        ag$$ExternalSyntheticApiModelOutline1.m(new bme(object, 2), (Object)editText);
        object = new bnb((bne)object);
        if (editText instanceof CarUiEditText) {
            ((CarUiEditText)editText).a = object;
        }
    }

    public final void d() {
        this.k.clearFocus();
        Iterator iterator = this.s.iterator();
        while (iterator.hasNext()) {
            ((Runnable)iterator.next()).run();
        }
        iterator = this.u.iterator();
        while (iterator.hasNext()) {
            ((bnm)iterator.next()).a();
        }
    }

    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        bnz.b(this.getContext()).c(this.w);
    }

    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        bnz.b(this.getContext()).e(this.w);
    }

    public final void onVisibilityChanged(View view, int n2) {
        super.onVisibilityChanged(view, n2);
        boolean bl2 = this.isShown();
        if (bl2 && !this.y) {
            n2 = this.k.getText().length();
            view = this.n;
            n2 = n2 > 0 ? 0 : 8;
            view.setVisibility(n2);
            this.k.requestFocus();
            this.h.showSoftInput((View)this.k, 0);
        } else if (!bl2 && this.y) {
            this.h.hideSoftInputFromWindow(this.k.getWindowToken(), 0);
        }
        this.y = bl2;
    }
}

