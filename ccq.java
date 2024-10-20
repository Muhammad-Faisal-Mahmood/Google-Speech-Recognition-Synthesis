/*
 * Decompiled with CFR 0.152.
 */
import com.google.android.gms.common.api.Status;

public class ccq
extends Exception {
    @Deprecated
    public final Status a;

    public ccq(Status status) {
        int n2 = status.e;
        CharSequence charSequence = status.f;
        String string = charSequence;
        if (charSequence == null) {
            string = "";
        }
        charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append(n2);
        ((StringBuilder)charSequence).append(": ");
        ((StringBuilder)charSequence).append(string);
        super(((StringBuilder)charSequence).toString());
        this.a = status;
    }

    public final int a() {
        return this.a.e;
    }
}

