/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Notification
 */
import android.app.Notification;

public final class bay {
    public final int a;
    public final int b;
    public final Notification c;

    public bay(int n2, Notification notification, int n3) {
        this.a = n2;
        this.c = notification;
        this.b = n3;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            object = (bay)object;
            if (this.a != ((bay)object).a) {
                return false;
            }
            if (this.b != ((bay)object).b) {
                return false;
            }
            return this.c.equals(((bay)object).c);
        }
        return false;
    }

    public final int hashCode() {
        int n2 = this.a;
        Notification notification = this.c;
        return (n2 * 31 + this.b) * 31 + notification.hashCode();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ForegroundInfo{mNotificationId=");
        stringBuilder.append(this.a);
        stringBuilder.append(", mForegroundServiceType=");
        stringBuilder.append(this.b);
        stringBuilder.append(", mNotification=");
        stringBuilder.append(this.c);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

