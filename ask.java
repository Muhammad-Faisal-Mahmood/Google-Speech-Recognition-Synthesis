/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnMultiChoiceClickListener
 */
import android.content.DialogInterface;

final class ask
implements DialogInterface.OnMultiChoiceClickListener {
    final asl a;

    public ask(asl asl2) {
        this.a = asl2;
    }

    public final void onClick(DialogInterface object, int n2, boolean bl2) {
        object = this.a;
        if (bl2) {
            bl2 = object.ah;
            String string = object.aj[n2].toString();
            object.ah = object.ag.add(string) | bl2;
            return;
        }
        bl2 = object.ah;
        String string = object.aj[n2].toString();
        object.ah = object.ag.remove(string) | bl2;
    }
}

