/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Canvas
 *  android.graphics.ColorFilter
 *  android.graphics.Outline
 *  android.graphics.drawable.Drawable
 */
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.ActionBarContainer;

public final class go
extends Drawable {
    final ActionBarContainer a;

    public go(ActionBarContainer actionBarContainer) {
        this.a = actionBarContainer;
    }

    public final void draw(Canvas object) {
        ActionBarContainer actionBarContainer = this.a;
        if (actionBarContainer.d) {
            actionBarContainer = actionBarContainer.c;
            if (actionBarContainer != null) {
                actionBarContainer.draw((Canvas)object);
                return;
            }
        } else {
            actionBarContainer = actionBarContainer.a;
            if (actionBarContainer != null) {
                actionBarContainer.draw((Canvas)object);
            }
            object = this.a;
            if (object.b != null) {
                boolean bl2 = object.e;
            }
        }
    }

    public final int getOpacity() {
        return 0;
    }

    public final void getOutline(Outline outline) {
        ActionBarContainer actionBarContainer = this.a;
        if (actionBarContainer.d) {
            if (actionBarContainer.c != null) {
                actionBarContainer.a.getOutline(outline);
                return;
            }
        } else {
            actionBarContainer = actionBarContainer.a;
            if (actionBarContainer != null) {
                actionBarContainer.getOutline(outline);
            }
        }
    }

    public final void setAlpha(int n2) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }
}

