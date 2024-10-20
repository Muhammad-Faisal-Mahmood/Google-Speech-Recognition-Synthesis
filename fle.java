/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.view.View
 *  android.widget.ImageView
 */
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.google.android.libraries.speech.transcription.voiceime.BackspaceView;

public class fle
extends ImageView
implements ilw {
    private gil a;

    public fle(Context context) {
        super(context);
        this.a();
    }

    public fle(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a();
    }

    public fle(Context context, AttributeSet attributeSet, int n2) {
        super(context, attributeSet, n2);
        this.a();
    }

    public fle(Context context, AttributeSet attributeSet, int n2, int n3) {
        super(context, attributeSet, n2, n3);
        this.a();
    }

    protected final void a() {
        flb flb2 = (flb)this.bn();
        BackspaceView backspaceView = (BackspaceView)this;
        flb2.b();
    }

    @Override
    public final Object bn() {
        if (this.a == null) {
            this.a = new gil((View)this);
        }
        return this.a.bn();
    }
}

