/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;

final class bcx
extends jqs
implements jro {
    boolean a;
    final Context b;

    public bcx(Context context, jqb jqb2) {
        this.b = context;
        super(2, jqb2);
    }

    @Override
    public final Object a(Object object) {
        jns.ak(object);
        bie.a(this.b, RescheduleReceiver.class, this.a);
        return jon.a;
    }

    @Override
    public final jqb c(Object object, jqb jqb2) {
        jqb2 = new bcx(this.b, jqb2);
        ((bcx)jqb2).a = (Boolean)object;
        return jqb2;
    }
}

