/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.database.sqlite.SQLiteException
 */
import android.database.sqlite.SQLiteException;

public final class fse
extends SQLiteException {
    public fse(String string, Throwable throwable) {
        super(string);
        this.initCause(throwable);
    }
}

