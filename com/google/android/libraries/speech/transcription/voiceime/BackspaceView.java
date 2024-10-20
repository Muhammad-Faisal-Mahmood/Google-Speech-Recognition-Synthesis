/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.ContextWrapper
 *  android.util.AttributeSet
 *  android.view.View
 */
package com.google.android.libraries.speech.transcription.voiceime;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import android.view.View;

public final class BackspaceView
extends fle {
    private fkz a;
    private Context b;

    @Deprecated
    public BackspaceView(Context context) {
        super(context);
        this.c();
    }

    public BackspaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BackspaceView(Context context, AttributeSet attributeSet, int n2) {
        super(context, attributeSet, n2);
    }

    public BackspaceView(Context context, AttributeSet attributeSet, int n2, int n3) {
        super(context, attributeSet, n2, n3);
    }

    public BackspaceView(ghn ghn2) {
        super((Context)ghn2);
        this.c();
    }

    private final void c() {
        if (this.a == null) {
            Object object;
            try {
                object = (fla)this.bn();
            }
            catch (ClassCastException classCastException) {
                throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", classCastException);
            }
            this.a = object.a();
            object = this.getContext();
            while (object instanceof ContextWrapper && !(object instanceof ilw) && !(object instanceof ilr) && !(object instanceof gin)) {
                object = ((ContextWrapper)object).getBaseContext();
            }
            if (!(object instanceof ghv)) {
                object = this.getClass().toString();
                StringBuilder stringBuilder = new StringBuilder("TikTok View ");
                stringBuilder.append((String)object);
                stringBuilder.append(", cannot be attached to a non-TikTok Fragment");
                throw new IllegalStateException(stringBuilder.toString());
            }
        }
    }

    public final void onAttachedToWindow() {
        block4: {
            boolean bl2;
            block6: {
                block5: {
                    super.onAttachedToWindow();
                    Object object = ((gis)fvd.l(this.getContext(), gis.class)).t();
                    boolean bl3 = false;
                    if (((Boolean)((gto)object).e(false)).booleanValue()) break block4;
                    object = this.getParent() instanceof View ? fxf.p(((View)this.getParent()).getContext(), ilr.class, Activity.class) : null;
                    Context context = this.b;
                    if (context == null) {
                        this.b = object;
                        return;
                    }
                    if (context == object) break block5;
                    object = fxf.p(context, ilr.class);
                    bl2 = bl3;
                    if (!(object instanceof ilr)) break block6;
                    object = (ilr)((Object)object);
                    bl2 = bl3;
                    if (((ilr)((Object)object)).a == null) break block6;
                    bl2 = bl3;
                    if (!((ilr)((Object)object)).a().r) break block6;
                }
                bl2 = true;
            }
            fxf.B(bl2, "onAttach called multiple times with different parent Contexts");
        }
    }

    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.c();
    }

    public final boolean performClick() {
        super.performClick();
        this.c();
        fkz fkz2 = this.a;
        gof gof2 = fkz2.c.d("BackspaceViewPeer#performClick");
        try {
            fkz2.b.j();
            return true;
        }
        finally {
            gof2.close();
        }
    }
}

