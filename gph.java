/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 */
import android.content.DialogInterface;

public final class gph
implements DialogInterface.OnClickListener {
    public final gpm a;
    public final String b;
    public final DialogInterface.OnClickListener c;

    public /* synthetic */ gph(gpm gpm2, String string, DialogInterface.OnClickListener onClickListener) {
        this.a = gpm2;
        this.b = string;
        this.c = onClickListener;
    }

    public final void onClick(DialogInterface dialogInterface, int n2) {
        Object object = this.a;
        DialogInterface.OnClickListener onClickListener = this.c;
        object = ((gpm)object).d(this.b);
        try {
            onClickListener.onClick(dialogInterface, n2);
            return;
        }
        finally {
            object.close();
        }
    }
}

