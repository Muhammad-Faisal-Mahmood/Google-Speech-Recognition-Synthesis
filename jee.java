/*
 * Decompiled with CFR 0.152.
 */
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.logging.Level;

public abstract class jee
extends jbi {
    private static final ivo a;
    private static final iws b;
    private iyh c;
    private iwx d;
    private Charset e = StandardCharsets.UTF_8;
    private boolean f;

    static {
        jed jed2 = new jed(0);
        a = jed2;
        b = ivp.a(":status", jed2);
    }

    protected jee(int n2, jjo jjo2, jjv jjv2) {
        super(n2, jjo2, jjv2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static Charset f(iwx object) {
        String string = (String)((iwx)object).b(jeb.h);
        if (string == null) return StandardCharsets.UTF_8;
        String[] stringArray = string.split("charset=", 2);
        try {
            return Charset.forName(stringArray[stringArray.length - 1].trim());
        }
        catch (Exception exception) {
            return StandardCharsets.UTF_8;
        }
    }

    private static void q(iwx iwx2) {
        iwx2.e(b);
        iwx2.e(ivr.b);
        iwx2.e(ivr.a);
    }

    private static final iyh r(iwx object) {
        char c2;
        Integer n2 = (Integer)((iwx)object).b(b);
        if (n2 == null) {
            return iyh.j.e("Missing HTTP status code");
        }
        String string = (String)((iwx)object).b(jeb.h);
        if (string != null && string.length() >= 16 && ((String)(object = string.toLowerCase(Locale.US))).startsWith("application/grpc") && (((String)object).length() == 16 || (c2 = ((String)object).charAt(16)) == '+' || c2 == ';')) {
            return null;
        }
        return jeb.a(n2).a("invalid content-type: ".concat(String.valueOf(string)));
    }

    protected abstract void c(iyh var1, boolean var2, iwx var3);

    /*
     * Loose catch block
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected final void n(jhg object, boolean bl2) {
        void var6_9;
        boolean bl3;
        block18: {
            int n2;
            boolean bl4;
            block15: {
                Object object2;
                block17: {
                    block16: {
                        block14: {
                            object2 = this.c;
                            bl4 = false;
                            if (object2 != null) {
                                Charset charset = this.e;
                                a.s(charset, "charset");
                                int n3 = object.f();
                                byte[] byArray = new byte[n3];
                                object.k(byArray, 0, n3);
                                this.c = ((iyh)object2).a("DATA-----------------------------\n".concat(new String(byArray, charset)));
                                object.close();
                                if (this.c.o.length() <= 1000 && !bl2) return;
                                this.c(this.c, false, this.d);
                                return;
                            }
                            if (!this.f) {
                                this.c(iyh.j.e("headers not received before payload"), false, new iwx());
                                return;
                            }
                            n2 = object.f();
                            bl3 = true;
                            if (!this.t) break block14;
                            jbg.q.logp(Level.INFO, "io.grpc.internal.AbstractClientStream$TransportState", "inboundDataReceived", "Received data on closed stream");
                            object.close();
                            break block15;
                        }
                        object2 = this.j;
                        if (((jgj)object2).b() || ((jgj)object2).f) break block16;
                        ((jgj)object2).d.h((jhg)object);
                        try {
                            ((jgj)object2).a();
                            break block15;
                        }
                        catch (Throwable throwable) {
                            bl3 = false;
                            break block17;
                        }
                    }
                    object.close();
                    catch (Throwable throwable) {
                        // empty catch block
                    }
                }
                if (!bl3) throw object2;
                try {
                    object.close();
                    throw object2;
                }
                catch (Throwable throwable) {
                    this.b(throwable);
                }
            }
            if (!bl2) return;
            this.c = n2 > 0 ? iyh.j.e("Received unexpected EOS on non-empty DATA frame from server") : iyh.j.e("Received unexpected EOS on empty DATA frame from server");
            this.d = object = new iwx();
            this.l(this.c, false, (iwx)object);
            return;
            {
                catch (Throwable throwable) {
                    bl3 = bl4;
                    break block18;
                }
            }
            catch (Throwable throwable) {
                bl3 = true;
            }
        }
        if (!bl3) throw var6_9;
        object.close();
        throw var6_9;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void o(iwx iwx2) {
        Object object;
        block9: {
            block10: {
                object = this.c;
                if (object != null) {
                    this.c = ((iyh)object).a("headers: ".concat(((Object)iwx2).toString()));
                    return;
                }
                try {
                    if (this.f) {
                        this.c = iyh.j.e("Received headers twice");
                        break block9;
                    }
                    object = (Integer)iwx2.b(b);
                    if (object != null && (Integer)object >= 100 && (Integer)object < 200) break block9;
                    this.f = true;
                    this.c = object = jee.r(iwx2);
                    if (object == null) break block10;
                    this.c = ((iyh)object).a("headers: ".concat(((Object)iwx2).toString()));
                    this.d = iwx2;
                }
                catch (Throwable throwable) {
                    iyh iyh2 = this.c;
                    if (iyh2 == null) {
                        throw throwable;
                    }
                    this.c = iyh2.a("headers: ".concat(((Object)iwx2).toString()));
                    this.d = iwx2;
                    this.e = jee.f(iwx2);
                    throw throwable;
                }
                this.e = jee.f(iwx2);
                return;
            }
            jee.q(iwx2);
            fxf.B(this.t ^ true, "Received headers on closed stream");
            this.p.d();
            object = (String)iwx2.b(jeb.e);
            Object object2 = (String)iwx2.b(jeb.c);
            if (object2 != null) {
                object = this.r.a((String)object2);
                if (object == null) {
                    object2 = iyh.j.e(String.format("Can't find decompressor for %s", object2));
                    object = new iyj((iyh)object2);
                    this.b((Throwable)object);
                    break block9;
                }
                if (object != iud.a) {
                    object2 = this.j;
                    fxf.B(true, "Already set full stream decompressor");
                    ((jgj)object2).c = object;
                }
            }
            this.q.c(iwx2);
        }
        object = this.c;
        if (object == null) return;
        this.c = ((iyh)object).a("headers: ".concat(((Object)iwx2).toString()));
        this.d = iwx2;
        this.e = jee.f(iwx2);
    }

    public final void p(iwx object) {
        iyh iyh2 = this.c;
        Object object2 = iyh2;
        if (iyh2 == null) {
            object2 = iyh2;
            if (!this.f) {
                this.c = iyh2 = jee.r((iwx)object);
                object2 = iyh2;
                if (iyh2 != null) {
                    this.d = object;
                    object2 = iyh2;
                }
            }
        }
        if (object2 == null) {
            object2 = (iyh)((iwx)object).b(ivr.b);
            if (object2 != null) {
                object2 = ((iyh)object2).e((String)((iwx)object).b(ivr.a));
            } else if (this.f) {
                object2 = iyh.d.e("missing GRPC status in response");
            } else {
                object2 = (Integer)((iwx)object).b(b);
                object2 = object2 != null ? jeb.a((Integer)object2) : iyh.j.e("missing HTTP status code");
                object2 = ((iyh)object2).a("missing GRPC status, inferred error from HTTP status code");
            }
            jee.q((iwx)object);
            if (this.t) {
                jbg.q.logp(Level.INFO, "io.grpc.internal.AbstractClientStream$TransportState", "inboundTrailersReceived", "Received trailers on closed stream:\n {1}\n {2}", new Object[]{object2, object});
                return;
            }
            this.p.e();
            this.l((iyh)object2, false, (iwx)object);
            return;
        }
        this.c = object = ((iyh)object2).a("trailers: ".concat(object.toString()));
        this.c((iyh)object, false, this.d);
    }
}

