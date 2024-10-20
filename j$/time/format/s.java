/*
 * Decompiled with CFR 0.152.
 */
package j$.time.format;

import j$.time.chrono.u;
import j$.time.format.A;
import j$.time.format.B;
import j$.time.format.DateTimeFormatter;
import j$.time.format.a_0;
import j$.time.format.b_0;
import j$.time.format.d;
import j$.time.format.e;
import j$.time.format.f;
import j$.time.format.g;
import j$.time.format.i;
import j$.time.format.j;
import j$.time.format.k;
import j$.time.format.l;
import j$.time.format.n;
import j$.time.format.o;
import j$.time.format.q;
import j$.time.format.w;
import j$.time.format.x;
import j$.time.format.y;
import j$.time.format.z;
import j$.time.temporal.a;
import j$.time.temporal.h;
import j$.time.temporal.p;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;

public final class s {
    private static final a_0 h;
    private static final HashMap i;
    private s a = this;
    private final s b;
    private final ArrayList c = new ArrayList();
    private final boolean d;
    private int e;
    private char f;
    private int g = -1;

    static {
        HashMap<Character, p> hashMap;
        h = new Object();
        i = hashMap = new HashMap<Character, p>();
        hashMap.put(Character.valueOf('G'), j$.time.temporal.a.ERA);
        hashMap.put(Character.valueOf('y'), j$.time.temporal.a.YEAR_OF_ERA);
        hashMap.put(Character.valueOf('u'), j$.time.temporal.a.YEAR);
        p p2 = j$.time.temporal.h.a;
        hashMap.put(Character.valueOf('Q'), p2);
        hashMap.put(Character.valueOf('q'), p2);
        p2 = j$.time.temporal.a.MONTH_OF_YEAR;
        hashMap.put(Character.valueOf('M'), p2);
        hashMap.put(Character.valueOf('L'), p2);
        hashMap.put(Character.valueOf('D'), j$.time.temporal.a.DAY_OF_YEAR);
        hashMap.put(Character.valueOf('d'), j$.time.temporal.a.DAY_OF_MONTH);
        hashMap.put(Character.valueOf('F'), j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH);
        p2 = j$.time.temporal.a.DAY_OF_WEEK;
        hashMap.put(Character.valueOf('E'), p2);
        hashMap.put(Character.valueOf('c'), p2);
        hashMap.put(Character.valueOf('e'), p2);
        hashMap.put(Character.valueOf('a'), j$.time.temporal.a.AMPM_OF_DAY);
        hashMap.put(Character.valueOf('H'), j$.time.temporal.a.HOUR_OF_DAY);
        hashMap.put(Character.valueOf('k'), j$.time.temporal.a.CLOCK_HOUR_OF_DAY);
        hashMap.put(Character.valueOf('K'), j$.time.temporal.a.HOUR_OF_AMPM);
        hashMap.put(Character.valueOf('h'), j$.time.temporal.a.CLOCK_HOUR_OF_AMPM);
        hashMap.put(Character.valueOf('m'), j$.time.temporal.a.MINUTE_OF_HOUR);
        hashMap.put(Character.valueOf('s'), j$.time.temporal.a.SECOND_OF_MINUTE);
        p2 = j$.time.temporal.a.NANO_OF_SECOND;
        hashMap.put(Character.valueOf('S'), p2);
        hashMap.put(Character.valueOf('A'), j$.time.temporal.a.MILLI_OF_DAY);
        hashMap.put(Character.valueOf('n'), p2);
        hashMap.put(Character.valueOf('N'), j$.time.temporal.a.NANO_OF_DAY);
        hashMap.put(Character.valueOf('g'), j$.time.temporal.j.a);
    }

    public s() {
        this.b = null;
        this.d = false;
    }

    private s(s s2) {
        this.b = s2;
        this.d = true;
    }

    private int d(f object) {
        Objects.requireNonNull(object, "pp");
        s s2 = this.a;
        int n2 = s2.e;
        f f2 = object;
        if (n2 > 0) {
            f2 = object;
            if (object != null) {
                f2 = new l((f)object, n2, s2.f);
            }
            s2.e = 0;
            s2.f = '\u0000';
        }
        s2.c.add(f2);
        object = this.a;
        ((s)object).g = -1;
        return ((s)object).c.size() - 1;
    }

    private void m(j object) {
        Object object2 = this.a;
        int n2 = ((s)object2).g;
        if (n2 >= 0) {
            object2 = (j)((s)object2).c.get(n2);
            int n3 = ((j)object).b;
            int n4 = ((j)object).c;
            if (n3 == n4 && j.a((j)object) == A.NOT_NEGATIVE) {
                object2 = ((j)object2).d(n4);
                this.d(((j)object).c());
                this.a.g = n2;
                object = object2;
            } else {
                object2 = ((j)object2).c();
                this.a.g = this.d((f)object);
                object = object2;
            }
            this.a.c.set(n2, object);
        } else {
            ((s)object2).g = this.d((f)object);
        }
    }

    private DateTimeFormatter z(Locale locale, z z2, u u2) {
        Objects.requireNonNull(locale, "locale");
        while (this.a.b != null) {
            this.r();
        }
        e e2 = new e(this.c, false);
        y y2 = y.a;
        return new DateTimeFormatter(e2, locale, z2, u2);
    }

    public final void a(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        this.d(dateTimeFormatter.e());
    }

    public final void b(a a2, int n2, int n3, boolean bl2) {
        if (n2 == n3 && !bl2) {
            this.m(new g(a2, n2, n3, bl2));
        } else {
            this.d(new g(a2, n2, n3, bl2));
        }
    }

    public final void c() {
        this.d((f)new Object());
    }

    public final void e(char c2) {
        this.d(new d(c2));
    }

    public final void f(String string) {
        Objects.requireNonNull(string, "literal");
        if (!string.isEmpty()) {
            if (string.length() == 1) {
                this.d(new d(string.charAt(0)));
            } else {
                this.d(new i(1, string));
            }
        }
    }

    public final void g(B b2) {
        Objects.requireNonNull(b2, "style");
        if (b2 != B.FULL && b2 != B.SHORT) {
            throw new IllegalArgumentException("Style must be either full or short");
        }
        this.d(new i(0, (Object)b2));
    }

    public final void h(String string, String string2) {
        this.d(new k(string, string2));
    }

    public final void i() {
        this.d(k.e);
    }

    /*
     * Exception decompiling
     */
    public final void j(String var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * java.lang.IllegalStateException: Backjump on non jumping statement @NONE, blocks:[0, 7] lbl177 : CaseStatement: case 69:
         * 
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.Cleaner$1.call(Cleaner.java:44)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.Cleaner$1.call(Cleaner.java:22)
         *     at org.benf.cfr.reader.util.graph.GraphVisitorDFS.process(GraphVisitorDFS.java:68)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.Cleaner.removeUnreachableCode(Cleaner.java:54)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:550)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public final void k(a a2, HashMap object) {
        Objects.requireNonNull(a2, "field");
        Objects.requireNonNull(object, "textLookup");
        LinkedHashMap linkedHashMap = new LinkedHashMap(object);
        object = B.FULL;
        this.d(new o(a2, (B)((Object)object), new b_0(new w(Collections.singletonMap(object, linkedHashMap)))));
    }

    public final void l(p p2, B b2) {
        Objects.requireNonNull(p2, "field");
        Objects.requireNonNull(b2, "textStyle");
        this.d(new o(p2, b2, x.c()));
    }

    public final void n(p p2) {
        Objects.requireNonNull(p2, "field");
        this.m(new j(p2, 1, 19, A.NORMAL));
    }

    public final void o(p object, int n2) {
        Objects.requireNonNull(object, "field");
        if (n2 >= 1 && n2 <= 19) {
            this.m(new j((p)object, n2, n2, A.NOT_NEGATIVE));
            return;
        }
        object = new StringBuilder("The width must be from 1 to 19 inclusive but was ");
        ((StringBuilder)object).append(n2);
        throw new IllegalArgumentException(((StringBuilder)object).toString());
    }

    public final void p(p object, int n2, int n3, A a2) {
        if (n2 == n3 && a2 == A.NOT_NEGATIVE) {
            this.o((p)object, n3);
            return;
        }
        Objects.requireNonNull(object, "field");
        Objects.requireNonNull(a2, "signStyle");
        if (n2 >= 1 && n2 <= 19) {
            if (n3 >= 1 && n3 <= 19) {
                if (n3 >= n2) {
                    this.m(new j((p)object, n2, n3, a2));
                    return;
                }
                object = new StringBuilder("The maximum width must exceed or equal the minimum width but ");
                ((StringBuilder)object).append(n3);
                ((StringBuilder)object).append(" < ");
                ((StringBuilder)object).append(n2);
                throw new IllegalArgumentException(((StringBuilder)object).toString());
            }
            object = new StringBuilder("The maximum width must be from 1 to 19 inclusive but was ");
            ((StringBuilder)object).append(n3);
            throw new IllegalArgumentException(((StringBuilder)object).toString());
        }
        object = new StringBuilder("The minimum width must be from 1 to 19 inclusive but was ");
        ((StringBuilder)object).append(n2);
        throw new IllegalArgumentException(((StringBuilder)object).toString());
    }

    public final void q() {
        this.d(new q(h, "ZoneRegionId()"));
    }

    public final void r() {
        Object object = this.a;
        if (((s)object).b != null) {
            if (((s)object).c.size() > 0) {
                object = this.a;
                object = new e(((s)object).c, ((s)object).d);
                this.a = this.a.b;
                this.d((f)object);
            } else {
                this.a = this.a.b;
            }
            return;
        }
        throw new IllegalStateException("Cannot call optionalEnd() as there was no previous call to optionalStart()");
    }

    public final void s() {
        s s2 = this.a;
        s2.g = -1;
        this.a = new s(s2);
    }

    public final void t() {
        this.d(n.INSENSITIVE);
    }

    public final void u() {
        this.d(n.SENSITIVE);
    }

    public final void v() {
        this.d(n.LENIENT);
    }

    public final void w() {
        this.d(n.STRICT);
    }

    public final DateTimeFormatter x() {
        return this.z(Locale.getDefault(), z.SMART, null);
    }

    final DateTimeFormatter y(z z2, u u2) {
        return this.z(Locale.getDefault(), z2, u2);
    }
}

