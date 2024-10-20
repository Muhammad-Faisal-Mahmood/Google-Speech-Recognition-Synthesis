/*
 * Decompiled with CFR 0.152.
 */
public final class jvc
extends Enum {
    public static final /* enum */ jvc a;
    public static final /* enum */ jvc b;
    public static final /* enum */ jvc c;
    public static final /* enum */ jvc d;
    private static final jvc[] e;

    static {
        jvc jvc2;
        jvc jvc3;
        jvc jvc4;
        jvc jvc5;
        a = jvc5 = new jvc("DEFAULT", 0);
        b = jvc4 = new jvc("LAZY", 1);
        c = jvc3 = new jvc("ATOMIC", 2);
        d = jvc2 = new jvc("UNDISPATCHED", 3);
        Enum[] enumArray = new jvc[]{jvc5, jvc4, jvc3, jvc2};
        e = enumArray;
        jsd.h(enumArray);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private jvc() {
        void var2_-1;
        void var1_-1;
    }

    public static jvc[] values() {
        return (jvc[])e.clone();
    }

    /*
     * Loose catch block
     */
    public final void a(jro object, Object object2, jqb jqb2) {
        int n2 = this.ordinal();
        if (n2 != 0) {
            block13: {
                if (n2 != 1) {
                    if (n2 != 2) {
                        if (n2 == 3) {
                            Object object3;
                            jqf jqf2;
                            block12: {
                                jqf2 = jqb2.d();
                                object3 = kbv.b(jqf2, null);
                                {
                                    catch (Throwable throwable) {
                                        jqb2.bD(jns.aj(throwable));
                                        return;
                                    }
                                }
                                jsd.i(jqb2);
                                if (!(object instanceof jqm)) {
                                    object = jjj.l((jro)object, object2, jqb2);
                                    break block12;
                                }
                                jsl.c(object, 2);
                                object = object.b(object2, jqb2);
                            }
                            kbv.c(jqf2, object3);
                            if (object != jqh.a) {
                                jqb2.bD(object);
                                return;
                            }
                            break block13;
                            catch (Throwable throwable) {
                                kbv.c(jqf2, object3);
                                throw throwable;
                            }
                        }
                        throw new joa();
                    }
                    jjj.n(jjj.m((jro)object, object2, jqb2)).bD(jon.a);
                }
            }
            return;
        }
        jse.al((jro)object, object2, jqb2);
    }

    public final boolean b() {
        return this == b;
    }
}

