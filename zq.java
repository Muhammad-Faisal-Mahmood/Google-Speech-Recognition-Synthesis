/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.Editable
 *  android.view.inputmethod.InputConnection
 *  android.view.inputmethod.InputConnectionWrapper
 *  android.widget.TextView
 */
import android.text.Editable;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;

public final class zq
extends InputConnectionWrapper {
    private final TextView a;

    public zq(TextView object, InputConnection inputConnection) {
        super(inputConnection, false);
        this.a = object;
        object = zl.a;
    }

    private final Editable a() {
        return this.a.getEditableText();
    }

    public final boolean deleteSurroundingText(int n2, int n3) {
        return wb.e((InputConnection)this, this.a(), n2, n3, false) || super.deleteSurroundingText(n2, n3);
        {
        }
    }

    public final boolean deleteSurroundingTextInCodePoints(int n2, int n3) {
        return wb.e((InputConnection)this, this.a(), n2, n3, true) || super.deleteSurroundingTextInCodePoints(n2, n3);
        {
        }
    }
}

