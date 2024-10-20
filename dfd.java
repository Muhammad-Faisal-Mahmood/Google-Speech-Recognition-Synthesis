/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentValues
 *  android.database.Cursor
 */
import android.content.ContentValues;
import android.database.Cursor;
import java.io.File;
import java.util.Collections;
import java.util.List;

public final class dfd {
    public static final String[] a = new String[]{"download_id", "priority", "urls", "start_timestamp_millis", "requires_unmetered_network", "requires_charging", "file_path", "completed", "failure", "next_retry_time_millis", "retry_count", "superpack_name", "superpack_version", "ttl_millis", "scheduling_flags", "requires_idle", "requires_battery_not_low"};
    public final dff b;
    public final boolean c;
    public String d;
    public long e;
    public long f;

    public dfd(dff dff2, boolean bl2, String string, long l2, long l3) {
        this.b = dff2;
        this.c = bl2;
        this.d = string;
        this.e = l2;
        this.f = l3;
    }

    public static dfd f(Cursor cursor) {
        int n2;
        long l2;
        block5: {
            l2 = cursor.getLong(3);
            n2 = cursor.getInt(14);
            int n3 = dec.a;
            if ((n2 & 0xFFFFFFFC) == 0) break block5;
            try {
                StringBuilder stringBuilder = new StringBuilder("Invalid scheduling flags value: ");
                stringBuilder.append(n2);
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException(stringBuilder.toString());
                throw illegalArgumentException;
            }
            catch (IllegalArgumentException illegalArgumentException) {
                ((hfk)((hfk)ddd.a.h()).i(illegalArgumentException)).r("Invalid scheduling flags value found in the table, ignoring value...");
                n2 = 0;
            }
        }
        Object object = dff.n();
        ((dfe)object).c(cursor.getString(0));
        ((dfe)object).d(cursor.getInt(1));
        List<Object> list = cursor.getString(2);
        list = list == null ? Collections.emptyList() : guf.b('|').d().a().g((CharSequence)((Object)list));
        ((dfe)object).l(gzx.o(list));
        long l3 = l2;
        if (l2 == 0L) {
            l3 = System.currentTimeMillis();
        }
        ((dfe)object).j(l3);
        boolean bl2 = cursor.getInt(4) != 0;
        ((dfe)object).h(bl2);
        bl2 = cursor.getInt(5) != 0;
        ((dfe)object).f(bl2);
        bl2 = cursor.getInt(15) != 0;
        ((dfe)object).g(bl2);
        bl2 = cursor.getInt(16) != 0;
        ((dfe)object).e(bl2);
        ((dfe)object).b(cursor.getString(6));
        ((dfe)object).k(cursor.getLong(13));
        ((dfe)object).i(n2);
        list = cursor.getString(11);
        if (list != null) {
            ((dfe)object).a = ded.c((String)((Object)list), cursor.getInt(12));
        }
        list = ((dfe)object).a();
        bl2 = cursor.getInt(7) != 0;
        object = cursor.getString(8);
        l2 = cursor.getLong(9);
        l3 = cursor.getLong(10);
        dec.o("nextRetryTimeMillis", l2);
        dec.o("retryCount", l3);
        return new dfd((dff)((Object)list), bl2, (String)object, l2, l3);
    }

    public final int a() {
        return ((deu)this.b).c;
    }

    public final int b() {
        return ((deu)this.b).j;
    }

    public final ContentValues c() {
        ContentValues contentValues = new ContentValues(12);
        contentValues.put("download_id", ((deu)this.b).a);
        Object object = ((deu)this.b).b;
        if (object != null) {
            contentValues.put("superpack_name", ((ded)object).b());
            contentValues.put("superpack_version", Integer.valueOf(((ded)object).a()));
        } else {
            contentValues.putNull("superpack_name");
            contentValues.put("superpack_version", Integer.valueOf(0));
        }
        contentValues.put("priority", Integer.valueOf(((deu)this.b).c));
        dff dff2 = this.b;
        object = gtk.c('|');
        contentValues.put("urls", new gti((gtk)object, (gtk)object).d(((deu)dff2).d));
        contentValues.put("start_timestamp_millis", Long.valueOf(((deu)this.b).e));
        contentValues.put("requires_unmetered_network", Integer.valueOf(((deu)this.b).f ? 1 : 0));
        contentValues.put("requires_charging", Integer.valueOf(((deu)this.b).g ? 1 : 0));
        contentValues.put("requires_idle", Integer.valueOf(((deu)this.b).h ? 1 : 0));
        contentValues.put("requires_battery_not_low", Integer.valueOf(((deu)this.b).i ? 1 : 0));
        contentValues.put("file_path", ((deu)this.b).k);
        contentValues.put("completed", Integer.valueOf(this.c ? 1 : 0));
        object = this.d;
        if (object != null) {
            contentValues.put("failure", (String)object);
        } else {
            contentValues.putNull("failure");
        }
        contentValues.put("next_retry_time_millis", Long.valueOf(this.e));
        contentValues.put("retry_count", Long.valueOf(this.f));
        contentValues.put("ttl_millis", Long.valueOf(((deu)this.b).l));
        contentValues.put("scheduling_flags", Integer.valueOf(((deu)this.b).j));
        return contentValues;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final ddn d() {
        dff dff2 = this.b;
        deu deu2 = (deu)dff2;
        if (deu2.m != null) return deu2.m;
        synchronized (dff2) {
            if (((deu)dff2).m != null) return deu2.m;
            Object object = ddn.d(((deu)dff2).a);
            ((deu)dff2).m = object;
            if (((deu)dff2).m != null) {
                return deu2.m;
            }
            object = new NullPointerException("qualifiedName() cannot return null");
            throw object;
        }
    }

    public final ded e() {
        return ((deu)this.b).b;
    }

    public final gzx g() {
        return ((deu)this.b).d;
    }

    public final File h() {
        return new File(((deu)this.b).k);
    }

    public final String i() {
        return ((deu)this.b).a;
    }

    public final void j(long l2) {
        boolean bl2 = l2 > 0L;
        fxf.q(bl2);
        this.e = l2;
    }

    public final boolean k() {
        return ((deu)this.b).i;
    }

    public final boolean l() {
        return ((deu)this.b).g;
    }

    public final boolean m() {
        return ((deu)this.b).h;
    }

    public final boolean n() {
        return ((deu)this.b).f;
    }

    public final String toString() {
        dff dff2 = this.b;
        String string = dff2.m();
        dff2 = (deu)dff2;
        String string2 = dec.i(((deu)dff2).j);
        int n2 = this.a();
        StringBuilder stringBuilder = new StringBuilder("{");
        stringBuilder.append(((deu)dff2).a);
        stringBuilder.append(", ");
        stringBuilder.append(string);
        stringBuilder.append(", ");
        stringBuilder.append(string2);
        stringBuilder.append(", p");
        stringBuilder.append(n2);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

