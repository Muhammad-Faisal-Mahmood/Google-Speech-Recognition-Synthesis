/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Process
 *  android.os.SystemClock
 *  android.util.Base64
 */
import android.content.Context;
import android.os.Process;
import android.os.SystemClock;
import android.util.Base64;
import j$.util.Objects;
import java.io.File;
import java.net.IDN;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;
import org.chromium.net.impl.ImplVersion;

public abstract class kqo
extends koq {
    static final int a;
    private static final Pattern r;
    protected final kqx b;
    public final Context c;
    public final List d = new LinkedList();
    public final List e = new LinkedList();
    public boolean f;
    public String g;
    public String h;
    public boolean i;
    public boolean j;
    public boolean k;
    public kqn l;
    public long m;
    public String n;
    public boolean o;
    public int p = 20;
    public final int q;

    static {
        r = Pattern.compile("^[0-9\\.]*$");
        int n2 = Integer.parseInt("129.0.6614.4".split("\\.")[0]) < 59 ? 3 : 33;
        a = n2;
    }

    public kqo(Context context, int n2) {
        long l2 = SystemClock.uptimeMillis();
        this.c = context = context.getApplicationContext();
        this.q = n2;
        this.b = kqy.a(context, n2);
        try {
            this.i = true;
            this.j = true;
            this.k = false;
            this.s(0, 0L);
            this.o = false;
            this.f = true;
            this.w(l2, true);
            return;
        }
        catch (Throwable throwable) {
            this.w(l2, false);
            throw throwable;
        }
    }

    private final void w(long l2, boolean bl2) {
        if (a >= 30) {
            return;
        }
        kqt kqt2 = new kqt();
        kqt2.c = false;
        try {
            kqw kqw2;
            kqt2.g = 2;
            kqt2.f = Process.myUid();
            kqt2.e = kqw2 = new kqw(ImplVersion.getCronetVersion());
            kqt2.h = this.q;
            kqt2.d = kqw2 = new kqw("129.0.6614.4");
            kqt2.a = this.a();
            kqt2.c = bl2;
            return;
        }
        finally {
            kqt2.b = (int)(SystemClock.uptimeMillis() - l2);
            this.b.b(kqt2);
        }
    }

    @Override
    public final String b() {
        return ksd.a(this.c);
    }

    public final int n() {
        return this.l.e;
    }

    public final int o(int n2) {
        int n3 = this.p;
        if (n3 == 20) {
            return n2;
        }
        return n3;
    }

    public final String p() {
        String string;
        if (this.i) {
            string = this.c;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string.getPackageName());
            ksd.b(stringBuilder);
            string = stringBuilder.toString();
        } else {
            string = "";
        }
        return string;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final kqs q() {
        int n2;
        boolean bl2 = this.f;
        boolean bl3 = this.i;
        boolean bl4 = this.j;
        boolean bl5 = this.k;
        kqn kqn2 = this.l;
        kqn kqn3 = kqn.a;
        int n3 = kqn2.ordinal();
        if (n3 != 0) {
            n2 = 3;
            if (n3 == 1) return new kqs(bl2, bl3, bl4, bl5, n2, this.n, this.o, this.o(10), this.a());
            if (n3 != 2) {
                if (n3 != 3) throw new IllegalArgumentException("Unknown internal builder cache mode");
                n2 = 1;
                return new kqs(bl2, bl3, bl4, bl5, n2, this.n, this.o, this.o(10), this.a());
            } else {
                n2 = 2;
            }
            return new kqs(bl2, bl3, bl4, bl5, n2, this.n, this.o, this.o(10), this.a());
        } else {
            n2 = 0;
        }
        return new kqs(bl2, bl3, bl4, bl5, n2, this.n, this.o, this.o(10), this.a());
    }

    public final void r(String object, Set object2, boolean bl2, Date date) {
        Objects.requireNonNull(object, "The hostname cannot be null.");
        Objects.requireNonNull(object2, "The set of SHA256 pins cannot be null.");
        Objects.requireNonNull(date, "The pin expiration date cannot be null.");
        if (!r.matcher((CharSequence)object).matches()) {
            if (((String)object).length() <= 255) {
                String string;
                try {
                    string = IDN.toASCII((String)object, 2);
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw new IllegalArgumentException(a.aj((String)object, "Hostname ", " is illegal. The name of the host does not comply with RFC 1122 and RFC 1123."));
                }
                object = new HashMap();
                Iterator iterator = object2.iterator();
                while (iterator.hasNext()) {
                    object2 = (byte[])iterator.next();
                    if (object2 != null && ((Object)object2).length == 32) {
                        object.put(Base64.encodeToString((byte[])object2, (int)0), object2);
                        continue;
                    }
                    throw new IllegalArgumentException("Public key pin is invalid");
                }
                this.e.add(new bng(string, (byte[][])object.values().toArray((T[])new byte[object.size()][]), bl2, date));
                return;
            }
            throw new IllegalArgumentException(a.aj((String)object, "Hostname ", " is too long. The name of the host does not comply with RFC 1122 and RFC 1123."));
        }
        throw new IllegalArgumentException(a.aj((String)object, "Hostname ", " is illegal. A hostname should not consist of digits and/or dots only."));
    }

    public final void s(int n2, long l2) {
        kqn kqn2 = n2 != 0 ? (n2 != 1 ? kqn.c : kqn.d) : kqn.a;
        if (kqn2.e == 1 && this.h == null) {
            throw new IllegalArgumentException("Storage path must be set");
        }
        this.l = kqn2;
        this.m = l2;
    }

    public final void t(String string) {
        if (new File(string).isDirectory()) {
            this.h = string;
            return;
        }
        throw new IllegalArgumentException("Storage path must be set to existing directory");
    }

    public final void u(String string) {
        if (!string.contains("/")) {
            this.d.add(new bjh(string));
            return;
        }
        throw new IllegalArgumentException("Illegal QUIC Hint Host: ".concat(string));
    }

    public void v() {
    }
}

