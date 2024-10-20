/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;

public final class dcg
implements dau {
    public final Object a;
    public final Object b;
    public final Object c;
    private final int d;

    public /* synthetic */ dcg(ded ded2, String string, dbo dbo2, int n2) {
        this.d = n2;
        this.a = ded2;
        this.b = string;
        this.c = dbo2;
    }

    public /* synthetic */ dcg(ded ded2, String string, Throwable throwable, int n2) {
        this.d = n2;
        this.c = ded2;
        this.a = string;
        this.b = throwable;
    }

    public /* synthetic */ dcg(dfu dfu2, ddn ddn2, dhu dhu2, int n2) {
        this.d = n2;
        this.a = dfu2;
        this.c = ddn2;
        this.b = dhu2;
    }

    @Override
    public final void a(Object object) {
        int n2 = this.d;
        if (n2 != 0) {
            if (n2 != 1) {
                bzq bzq2 = (bzq)object;
                Object object2 = this.c;
                Object object3 = this.a;
                try {
                    object = ((dfu)object3).c((ddn)object2);
                }
                catch (IOException iOException) {
                    ((hfk)((hfk)((hfk)ddd.a.h()).i(iOException)).j("com/google/android/libraries/micore/superpacks/gc/FileManager", "getSuperpackNameOrLog", 1092, "FileManager.java")).u("Failed to get superpack name for '%s'", object2);
                    object = null;
                }
                Object object4 = this.b;
                object3 = (dfu)object3;
                object2 = (ddn)object2;
                bzq2.l((ddn)object2, (ded)object, ((dfu)object3).i((ddn)object2), (dhu)object4);
                return;
            }
            bzq bzq3 = (bzq)object;
            object = this.b;
            Object object5 = this.a;
            bzq3.n((ded)this.c, (String)object5, (Throwable)object);
            return;
        }
        object = (bzq)object;
        Object object6 = this.c;
        Object object7 = this.b;
        ((bzq)object).n((ded)this.a, (String)object7, (Throwable)object6);
    }
}

