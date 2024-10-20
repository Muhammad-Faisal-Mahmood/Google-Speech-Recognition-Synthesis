/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.database.Cursor
 *  android.database.sqlite.SQLiteDatabase
 *  android.database.sqlite.SQLiteDatabase$CursorFactory
 *  android.database.sqlite.SQLiteStatement
 */
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

public final class awu
implements awl {
    public static final String[] a = new String[]{"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};
    public static final jny b;
    public static final jny c;
    private static final String[] e;
    public final SQLiteDatabase d;

    static {
        e = new String[0];
        b = jns.a(jnz.c, aud.d);
        c = jns.a(jnz.c, aud.c);
    }

    public awu(SQLiteDatabase sQLiteDatabase) {
        jse.e(sQLiteDatabase, "delegate");
        this.d = sQLiteDatabase;
    }

    @Override
    public final Cursor a(awr cursor) {
        jse.e(cursor, "query");
        aws aws2 = new aws(new awt((awr)cursor));
        String string = cursor.b();
        cursor = e;
        cursor = this.d.rawQueryWithFactory((SQLiteDatabase.CursorFactory)aws2, string, (String[])cursor, null);
        jse.d(cursor, "delegate.rawQueryWithFac\u2026EMPTY_STRING_ARRAY, null)");
        return cursor;
    }

    @Override
    public final Cursor b(String string) {
        return this.a(new awk(string));
    }

    @Override
    public final String c() {
        return this.d.getPath();
    }

    @Override
    public final void close() {
        this.d.close();
    }

    @Override
    public final void d() {
        this.d.beginTransaction();
    }

    @Override
    public final void e() {
        this.d.beginTransactionNonExclusive();
    }

    @Override
    public final void f() {
        this.d.endTransaction();
    }

    @Override
    public final void g(String string) {
        this.d.execSQL(string);
    }

    @Override
    public final void h() {
        this.d.setTransactionSuccessful();
    }

    @Override
    public final boolean i() {
        return this.d.inTransaction();
    }

    @Override
    public final boolean j() {
        return this.d.isOpen();
    }

    @Override
    public final axc k(String string) {
        string = this.d.compileStatement(string);
        jse.d(string, "delegate.compileStatement(sql)");
        return new axc((SQLiteStatement)string);
    }

    @Override
    public final void l(Object[] objectArray) {
        this.d.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", objectArray);
    }
}

