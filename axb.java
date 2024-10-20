/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.database.sqlite.SQLiteProgram
 */
import android.database.sqlite.SQLiteProgram;

public class axb
implements awq {
    private final SQLiteProgram a;

    public axb(SQLiteProgram sQLiteProgram) {
        jse.e(sQLiteProgram, "delegate");
        this.a = sQLiteProgram;
    }

    @Override
    public final void c(int n2, byte[] byArray) {
        jse.e(byArray, "value");
        this.a.bindBlob(n2, byArray);
    }

    @Override
    public final void close() {
        this.a.close();
    }

    @Override
    public final void d(int n2, double d2) {
        this.a.bindDouble(n2, d2);
    }

    @Override
    public final void e(int n2, long l2) {
        this.a.bindLong(n2, l2);
    }

    @Override
    public final void f(int n2) {
        this.a.bindNull(n2);
    }

    @Override
    public final void g(int n2, String string) {
        jse.e(string, "value");
        this.a.bindString(n2, string);
    }
}

