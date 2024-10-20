/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.os.Bundle
 */
import android.net.Uri;
import android.os.Bundle;
import j$.util.Objects;

public final class aed {
    public static final aed a = new aed();
    public final Uri b = null;
    public final String c;
    public final Bundle d = null;

    static {
        agf.z(0);
        agf.z(1);
        agf.z(2);
    }

    private aed() {
        this.c = null;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof aed)) {
            return false;
        }
        object = (aed)object;
        Object object2 = ((aed)object).b;
        if (Objects.equals(null, null)) {
            object2 = ((aed)object).c;
            if (Objects.equals(null, null)) {
                object = ((aed)object).d;
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return 0;
    }
}

