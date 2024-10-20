/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.database.Cursor
 */
import android.database.Cursor;

public final class avm
extends avo {
    public int[] a = new int[0];
    public long[] b = new long[0];
    public double[] c = new double[0];
    public String[] d = new String[0];
    public byte[][] e = new byte[0][];
    private Cursor i;

    public avm(awl awl2, String string) {
        super(awl2, string);
    }

    private final Cursor l() {
        Cursor cursor = this.i;
        if (cursor != null) {
            return cursor;
        }
        yi.j(21, "no row");
        throw new jnx();
    }

    private final void m() {
        if (this.i == null) {
            this.i = this.f.a(new avl(this));
        }
    }

    private static final void n(Cursor cursor, int n2) {
        if (n2 >= 0 && n2 < cursor.getColumnCount()) {
            return;
        }
        yi.j(25, "column index out of range");
        throw new jnx();
    }

    @Override
    public final int a() {
        this.i();
        this.m();
        Cursor cursor = this.i;
        if (cursor != null) {
            return cursor.getColumnCount();
        }
        return 0;
    }

    @Override
    public final long b(int n2) {
        this.i();
        Cursor cursor = this.l();
        avm.n(cursor, n2);
        return cursor.getLong(n2);
    }

    @Override
    public final String c(int n2) {
        this.i();
        this.m();
        Object object = this.i;
        if (object != null) {
            avm.n(object, n2);
            object = object.getColumnName(n2);
            jse.d(object, "c.getColumnName(index)");
            return object;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override
    public final String d(int n2) {
        this.i();
        Object object = this.l();
        avm.n(object, n2);
        object = object.getString(n2);
        jse.d(object, "c.getString(index)");
        return object;
    }

    @Override
    public final void e() {
        if (!this.h) {
            this.i();
            this.a = new int[0];
            this.b = new long[0];
            this.c = new double[0];
            this.d = new String[0];
            this.e = new byte[0][];
            this.f();
        }
        this.k();
    }

    @Override
    public final void f() {
        this.i();
        Cursor cursor = this.i;
        if (cursor != null) {
            cursor.close();
        }
        this.i = null;
    }

    @Override
    public final boolean g(int n2) {
        this.i();
        Cursor cursor = this.l();
        avm.n(cursor, n2);
        return cursor.isNull(n2);
    }

    @Override
    public final boolean h() {
        this.i();
        this.m();
        Cursor cursor = this.i;
        if (cursor != null) {
            return cursor.moveToNext();
        }
        throw new IllegalStateException("Required value was null.");
    }
}

