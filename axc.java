/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.database.sqlite.SQLiteProgram
 *  android.database.sqlite.SQLiteStatement
 */
import android.database.sqlite.SQLiteProgram;
import android.database.sqlite.SQLiteStatement;

public final class axc
extends axb
implements awq {
    public final SQLiteStatement a;

    public axc(SQLiteStatement sQLiteStatement) {
        jse.e(sQLiteStatement, "delegate");
        super((SQLiteProgram)sQLiteStatement);
        this.a = sQLiteStatement;
    }

    public final void a() {
        this.a.executeUpdateDelete();
    }
}

