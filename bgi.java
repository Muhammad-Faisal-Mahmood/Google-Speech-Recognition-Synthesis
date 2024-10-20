/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.database.Cursor
 */
import android.database.Cursor;

public final class bgi
implements bgg {
    private final aum a;
    private final atw b;

    public bgi(aum aum2) {
        this.a = aum2;
        this.b = new bgh(aum2);
    }

    @Override
    public final Long a(String object) {
        Cursor cursor;
        auo auo2;
        block5: {
            block6: {
                auo2 = auo.a("SELECT long_value FROM Preference where `key`=?", 1);
                auo2.g(1, (String)object);
                this.a.j();
                cursor = wf.i(this.a, auo2, false);
                boolean bl2 = cursor.moveToFirst();
                Object var3_6 = null;
                object = var3_6;
                if (!bl2) break block5;
                if (!cursor.isNull(0)) break block6;
                object = var3_6;
            }
            object = cursor.getLong(0);
        }
        return object;
        finally {
            cursor.close();
            auo2.j();
        }
    }

    @Override
    public final void b(bgf bgf2) {
        this.a.j();
        this.a.k();
        try {
            this.b.b(bgf2);
            this.a.n();
            return;
        }
        finally {
            this.a.l();
        }
    }
}

