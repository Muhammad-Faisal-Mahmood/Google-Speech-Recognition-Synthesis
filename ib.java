/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.TypedArray
 *  android.graphics.Rect
 *  android.graphics.drawable.Drawable
 *  android.os.Parcelable
 *  android.util.AttributeSet
 *  android.util.Log
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 *  android.widget.ArrayAdapter
 *  android.widget.Spinner
 *  android.widget.SpinnerAdapter
 */
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import androidx.wear.ambient.AmbientDelegate;

public final class ib
extends Spinner {
    private static final int[] e = new int[]{16843505};
    public final Context a;
    public ia b;
    int c;
    final Rect d;
    private final hf f;
    private jg g;
    private SpinnerAdapter h;
    private final boolean i;

    /*
     * Loose catch block
     * WARNING - void declaration
     */
    public ib(Context context, AttributeSet attributeSet) {
        void var1_4;
        block18: {
            Object object;
            AmbientDelegate ambientDelegate;
            block19: {
                Object object2;
                block17: {
                    int n2;
                    block16: {
                        block15: {
                            super(context, attributeSet, 2130969862);
                            this.d = new Rect();
                            lt.d((View)this, this.getContext());
                            ambientDelegate = AmbientDelegate.A(context, attributeSet, er.u, 2130969862, 0);
                            this.f = new hf((View)this);
                            n2 = ambientDelegate.p(4, 0);
                            this.a = n2 != 0 ? new nx(context, n2) : context;
                            object = null;
                            object = object2 = context.obtainStyledAttributes(attributeSet, e, 2130969862, 0);
                            if (!object2.hasValue(0)) break block15;
                            object = object2;
                            try {
                                n2 = object2.getInt(0, 0);
                                break block16;
                            }
                            catch (Exception exception) {
                                break block17;
                            }
                        }
                        n2 = -1;
                    }
                    if (object2 != null) {
                        object2.recycle();
                    }
                    if (n2 != 0) {
                        if (n2 == 1) {
                            object2 = new hy(this, this.a, attributeSet);
                            object = AmbientDelegate.A(this.a, attributeSet, er.u, 2130969862, 0);
                            this.c = ((AmbientDelegate)object).o(3, -2);
                            ((jw)object2).f(((AmbientDelegate)object).r(1));
                            ((hy)object2).a = ambientDelegate.u(2);
                            ((AmbientDelegate)object).v();
                            this.b = object2;
                            this.g = new hu(this, (View)this, (hy)object2);
                        }
                    } else {
                        object = new hv(this);
                        this.b = object;
                        object.i(ambientDelegate.u(2));
                    }
                    break block19;
                    catch (Throwable throwable) {
                        attributeSet = object;
                        break block18;
                    }
                    catch (Exception exception) {
                        object2 = null;
                    }
                }
                object = object2;
                try {
                    void var6_12;
                    Log.i((String)"AppCompatSpinner", (String)"Could not read android:spinnerMode", (Throwable)var6_12);
                    if (object2 == null) break block19;
                }
                catch (Throwable throwable) {
                    attributeSet = object;
                }
                object2.recycle();
            }
            object = ((TypedArray)ambientDelegate.b).getTextArray(0);
            if (object != null) {
                context = new ArrayAdapter(context, 17367048, (Object[])object);
                context.setDropDownViewResource(2131624120);
                this.setAdapter((SpinnerAdapter)context);
            }
            ambientDelegate.v();
            this.i = true;
            context = this.h;
            if (context != null) {
                this.setAdapter((SpinnerAdapter)context);
                this.h = null;
            }
            this.f.b(attributeSet, 2130969862);
            return;
        }
        if (attributeSet != null) {
            attributeSet.recycle();
        }
        throw var1_4;
    }

    final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int n2 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int n3 = View.MeasureSpec.makeMeasureSpec((int)this.getMeasuredWidth(), (int)0);
        int n4 = View.MeasureSpec.makeMeasureSpec((int)this.getMeasuredHeight(), (int)0);
        int n5 = Math.max(0, this.getSelectedItemPosition());
        int n6 = Math.min(spinnerAdapter.getCount(), n5 + 15);
        int n7 = Math.max(0, n5 - (15 - (n6 - n5)));
        View view = null;
        n5 = 0;
        while (n7 < n6) {
            int n8 = spinnerAdapter.getItemViewType(n7);
            int n9 = n8 != n2 ? n8 : n2;
            if (n8 != n2) {
                view = null;
            }
            if ((view = spinnerAdapter.getView(n7, view, (ViewGroup)this)).getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(n3, n4);
            n5 = Math.max(n5, view.getMeasuredWidth());
            ++n7;
            n2 = n9;
        }
        n2 = n5;
        if (drawable != null) {
            drawable.getPadding(this.d);
            spinnerAdapter = this.d;
            n2 = n5 + (spinnerAdapter.left + spinnerAdapter.right);
        }
        return n2;
    }

    public final void b() {
        this.b.l(this.getTextDirection(), this.getTextAlignment());
    }

    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        hf hf2 = this.f;
        if (hf2 != null) {
            hf2.a();
        }
    }

    public final int getDropDownHorizontalOffset() {
        ia ia2 = this.b;
        if (ia2 != null) {
            return ia2.a();
        }
        return super.getDropDownHorizontalOffset();
    }

    public final int getDropDownVerticalOffset() {
        ia ia2 = this.b;
        if (ia2 != null) {
            return ia2.b();
        }
        return super.getDropDownVerticalOffset();
    }

    public final int getDropDownWidth() {
        if (this.b != null) {
            return this.c;
        }
        return super.getDropDownWidth();
    }

    public final Drawable getPopupBackground() {
        ia ia2 = this.b;
        if (ia2 != null) {
            return ia2.c();
        }
        return super.getPopupBackground();
    }

    public final Context getPopupContext() {
        return this.a;
    }

    public final CharSequence getPrompt() {
        Object object = this.b;
        object = object != null ? object.d() : super.getPrompt();
        return object;
    }

    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ia ia2 = this.b;
        if (ia2 != null && ia2.u()) {
            this.b.k();
        }
    }

    protected final void onMeasure(int n2, int n3) {
        super.onMeasure(n2, n3);
        if (this.b != null && View.MeasureSpec.getMode((int)n2) == Integer.MIN_VALUE) {
            this.setMeasuredDimension(Math.min(Math.max(this.getMeasuredWidth(), this.a(this.getAdapter(), this.getBackground())), View.MeasureSpec.getSize((int)n2)), this.getMeasuredHeight());
        }
    }

    public final void onRestoreInstanceState(Parcelable object) {
        object = (hz)((Object)object);
        super.onRestoreInstanceState(object.getSuperState());
        if (object.a && (object = this.getViewTreeObserver()) != null) {
            object.addOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)new gj((Object)this, 2));
        }
    }

    public final Parcelable onSaveInstanceState() {
        boolean bl2;
        hz hz2 = new hz(super.onSaveInstanceState());
        ia ia2 = this.b;
        boolean bl3 = bl2 = false;
        if (ia2 != null) {
            bl3 = bl2;
            if (ia2.u()) {
                bl3 = true;
            }
        }
        hz2.a = bl3;
        return hz2;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        jg jg2 = this.g;
        if (jg2 != null && jg2.onTouch((View)this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final boolean performClick() {
        ia ia2 = this.b;
        if (ia2 != null) {
            if (!ia2.u()) {
                this.b();
            }
            return true;
        }
        return super.performClick();
    }

    public final void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.i) {
            this.h = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.b != null) {
            Context context;
            Context context2 = context = this.a;
            if (context == null) {
                context2 = this.getContext();
            }
            this.b.e(new hw(spinnerAdapter, context2.getTheme()));
        }
    }

    public final void setBackgroundDrawable(Drawable object) {
        super.setBackgroundDrawable((Drawable)object);
        object = this.f;
        if (object != null) {
            ((hf)object).e();
        }
    }

    public final void setBackgroundResource(int n2) {
        super.setBackgroundResource(n2);
        hf hf2 = this.f;
        if (hf2 != null) {
            hf2.c(n2);
        }
    }

    public final void setDropDownHorizontalOffset(int n2) {
        ia ia2 = this.b;
        if (ia2 != null) {
            ia2.h(n2);
            this.b.g(n2);
            return;
        }
        super.setDropDownHorizontalOffset(n2);
    }

    public final void setDropDownVerticalOffset(int n2) {
        ia ia2 = this.b;
        if (ia2 != null) {
            ia2.j(n2);
            return;
        }
        super.setDropDownVerticalOffset(n2);
    }

    public final void setDropDownWidth(int n2) {
        if (this.b != null) {
            this.c = n2;
            return;
        }
        super.setDropDownWidth(n2);
    }

    public final void setPopupBackgroundDrawable(Drawable drawable) {
        ia ia2 = this.b;
        if (ia2 != null) {
            ia2.f(drawable);
            return;
        }
        super.setPopupBackgroundDrawable(drawable);
    }

    public final void setPopupBackgroundResource(int n2) {
        this.setPopupBackgroundDrawable(kh.g(this.a, n2));
    }

    public final void setPrompt(CharSequence charSequence) {
        ia ia2 = this.b;
        if (ia2 != null) {
            ia2.i(charSequence);
            return;
        }
        super.setPrompt(charSequence);
    }
}

