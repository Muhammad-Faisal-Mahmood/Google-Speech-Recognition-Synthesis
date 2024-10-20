/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Notification
 */
import android.app.Notification;

final class sm {
    final String a;
    final int b;
    final Notification c;

    public sm(String string, int n2, Notification notification) {
        this.a = string;
        this.b = n2;
        this.c = notification;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("NotifyTask[packageName:");
        stringBuilder.append(this.a);
        stringBuilder.append(", id:");
        stringBuilder.append(this.b);
        stringBuilder.append(", tag:null]");
        return stringBuilder.toString();
    }
}

