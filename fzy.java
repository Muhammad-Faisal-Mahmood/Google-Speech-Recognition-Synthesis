/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gda
 *  hom
 */
import j$.util.Objects;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.Executor;

public final class fzy
extends frb {
    private static final hei b = hei.m("com/google/apps/tiktok/account/data/manager/AccountDataStoreIOExceptionHandler");
    public final hth a;
    private final gto c;
    private final jnu d;
    private final Executor e;

    public fzy(hth hth2, gto gto2, jnu jnu2, Executor executor) {
        this.a = hth2;
        this.c = gto2;
        this.d = jnu2;
        this.e = executor;
    }

    @Override
    public final hpn a(IOException iOException, bzq bzq2) {
        if (this.c.g() && ((Boolean)this.c.c()).booleanValue()) {
            if (!(iOException instanceof FileNotFoundException || iOException.getCause() instanceof FileNotFoundException || iOException instanceof hxn || iOException.getCause() instanceof hxn)) {
                return hhk.J(iOException);
            }
            a.as(b.g(), "AccountDataStore read failed. Trying to recover by resetting the store and wiping out all the account data.", "com/google/apps/tiktok/account/data/manager/AccountDataStoreIOExceptionHandler", "handleReadException", '\u007f', "AccountDataStoreIOExceptionHandler.java", iOException);
            ArrayList<hpn> arrayList = this.a;
            fxf.K(gda.a);
            arrayList = ((hth)((Object)arrayList)).c(false);
            int n2 = ((hct)((Object)arrayList)).c;
            int n3 = -1;
            for (int i2 = 0; i2 < n2; ++i2) {
                int n4 = Integer.parseInt(((File)arrayList.get(i2)).getName());
                int n5 = n3;
                if (n4 > n3) {
                    n5 = n4;
                }
                n3 = n5;
            }
            Object object = (Set)((imc)this.d).a;
            arrayList = new ArrayList<hpn>(object.size());
            object = object.iterator();
            while (object.hasNext()) {
                fzx fzx2 = (fzx)object.next();
                Objects.requireNonNull(fzx2);
                arrayList.add(hhk.P(gqk.c(new frn(fzx2, 5)), (Executor)hom.a));
            }
            return hmv.g(hno.g(hno.g(hph.q(hhk.Y(arrayList).a(new dwp(12), this.e)), gqk.d(new frm(this, 9)), this.e), gqk.d(new fbc(bzq2, n3, 2)), this.e), IOException.class, gqk.d(new frm(iOException, 10)), (Executor)hom.a);
        }
        return hhk.J(iOException);
    }
}

