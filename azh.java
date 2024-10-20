/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator$AnimatorListener
 *  android.animation.AnimatorInflater
 *  android.animation.AnimatorSet
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.content.res.Resources
 *  android.content.res.Resources$Theme
 *  android.graphics.Canvas
 *  android.graphics.ColorFilter
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.Rect
 *  android.graphics.drawable.Animatable
 *  android.graphics.drawable.AnimatedVectorDrawable
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.Drawable$Callback
 *  android.graphics.drawable.Drawable$ConstantState
 *  android.util.AttributeSet
 *  org.xmlpull.v1.XmlPullParser
 */
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.util.Collection;
import org.xmlpull.v1.XmlPullParser;

public final class azh
extends azi
implements Animatable {
    public final azf a;
    public Animator.AnimatorListener b = null;
    public ArrayList c = null;
    public final Drawable.Callback d = new bad((Object)this, 1);
    private final Context f;

    public azh() {
        this(null);
    }

    public azh(Context context) {
        this.f = context;
        this.a = new azf();
    }

    @Override
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.applyTheme(theme);
        }
    }

    public final boolean canApplyTheme() {
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.canApplyTheme();
        }
        return false;
    }

    public final void draw(Canvas canvas) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.a.b.draw(canvas);
        if (this.a.c.isStarted()) {
            this.invalidateSelf();
        }
    }

    public final int getAlpha() {
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.getAlpha();
        }
        return this.a.b.getAlpha();
    }

    public final int getChangingConfigurations() {
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int n2 = super.getChangingConfigurations();
        int n3 = this.a.a;
        return n2;
    }

    public final ColorFilter getColorFilter() {
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.getColorFilter();
        }
        return this.a.b.getColorFilter();
    }

    public final Drawable.ConstantState getConstantState() {
        Drawable drawable = this.e;
        if (drawable != null) {
            return new azg(drawable.getConstantState());
        }
        return null;
    }

    public final int getIntrinsicHeight() {
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return this.a.b.getIntrinsicHeight();
    }

    public final int getIntrinsicWidth() {
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return this.a.b.getIntrinsicWidth();
    }

    public final int getOpacity() {
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return this.a.b.getOpacity();
    }

    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        this.inflate(resources, xmlPullParser, attributeSet, null);
    }

    public final void inflate(Resources object, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        Object object2 = this.e;
        if (object2 != null) {
            object2.inflate(object, xmlPullParser, attributeSet, theme);
            return;
        }
        int n2 = xmlPullParser.getEventType();
        int n3 = xmlPullParser.getDepth();
        while (n2 != 1 && (xmlPullParser.getDepth() >= n3 + 1 || n2 != 3)) {
            if (n2 == 2) {
                Object object3;
                Object object4;
                object2 = xmlPullParser.getName();
                if ("animated-vector".equals(object2)) {
                    object2 = kt.p(object, theme, attributeSet, azb.e);
                    n2 = object2.getResourceId(0, 0);
                    if (n2 != 0) {
                        object4 = new azq();
                        object3 = td.a;
                        ((azq)((Object)object4)).e = object.getDrawable(n2, theme);
                        ((azq)((Object)object4)).c = false;
                        object4.setCallback(this.d);
                        object3 = this.a.b;
                        if (object3 != null) {
                            object3.setCallback(null);
                        }
                        this.a.b = object4;
                    }
                    object2.recycle();
                } else if ("target".equals(object2)) {
                    object2 = object.obtainAttributes(attributeSet, azb.f);
                    object4 = object2.getString(0);
                    n2 = object2.getResourceId(1, 0);
                    if (n2 != 0) {
                        object3 = this.f;
                        if (object3 != null) {
                            object3 = AnimatorInflater.loadAnimator((Context)object3, (int)n2);
                            object3.setTarget(this.a.b.b.b.l.get(object4));
                            azf azf2 = this.a;
                            if (azf2.d == null) {
                                azf2.d = new ArrayList();
                                this.a.e = new ot();
                            }
                            this.a.d.add(object3);
                            this.a.e.put(object3, object4);
                        } else {
                            object2.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                    }
                    object2.recycle();
                }
            }
            n2 = xmlPullParser.next();
        }
        object = this.a;
        if (object.c == null) {
            object.c = new AnimatorSet();
        }
        object.c.playTogether((Collection)object.d);
    }

    public final boolean isAutoMirrored() {
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.isAutoMirrored();
        }
        return this.a.b.isAutoMirrored();
    }

    public final boolean isRunning() {
        Drawable drawable = this.e;
        if (drawable != null) {
            return ((AnimatedVectorDrawable)drawable).isRunning();
        }
        return this.a.c.isRunning();
    }

    public final boolean isStateful() {
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return this.a.b.isStateful();
    }

    public final Drawable mutate() {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override
    protected final void onBoundsChange(Rect rect) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setBounds(rect);
            return;
        }
        this.a.b.setBounds(rect);
    }

    @Override
    protected final boolean onLevelChange(int n2) {
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.setLevel(n2);
        }
        return this.a.b.setLevel(n2);
    }

    protected final boolean onStateChange(int[] nArray) {
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.setState(nArray);
        }
        return this.a.b.setState(nArray);
    }

    public final void setAlpha(int n2) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setAlpha(n2);
            return;
        }
        this.a.b.setAlpha(n2);
    }

    public final void setAutoMirrored(boolean bl2) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setAutoMirrored(bl2);
            return;
        }
        this.a.b.setAutoMirrored(bl2);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.a.b.setColorFilter(colorFilter);
    }

    public final void setTint(int n2) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setTint(n2);
            return;
        }
        this.a.b.setTint(n2);
    }

    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
            return;
        }
        this.a.b.setTintList(colorStateList);
    }

    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setTintMode(mode);
            return;
        }
        this.a.b.setTintMode(mode);
    }

    public final boolean setVisible(boolean bl2, boolean bl3) {
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.setVisible(bl2, bl3);
        }
        this.a.b.setVisible(bl2, bl3);
        return super.setVisible(bl2, bl3);
    }

    public final void start() {
        Drawable drawable = this.e;
        if (drawable != null) {
            ((AnimatedVectorDrawable)drawable).start();
            return;
        }
        if (this.a.c.isStarted()) {
            return;
        }
        this.a.c.start();
        this.invalidateSelf();
    }

    public final void stop() {
        Drawable drawable = this.e;
        if (drawable != null) {
            ((AnimatedVectorDrawable)drawable).stop();
            return;
        }
        this.a.c.end();
    }
}

