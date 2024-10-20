/*
 * Decompiled with CFR 0.152.
 */
import j$.net.URLEncoder;
import java.io.UnsupportedEncodingException;

public final class fra {
    static {
        hyg hyg2 = ikl.a.l();
        hyg hyg3 = ikf.a;
        if (!((hwp)hyg2).b.B()) {
            ((hwp)hyg2).u();
        }
        hyg hyg4 = (ikl)((hwp)hyg2).b;
        hyg3.getClass();
        ((ikl)hyg4).c = hyg3;
        ((ikl)hyg4).b = 1;
        hyg4 = (ikl)((hwp)hyg2).o();
        hyg4 = ikl.a.l();
        hyg3 = ikj.a;
        if (!((hwp)hyg4).b.B()) {
            ((hwp)hyg4).u();
        }
        hyg2 = (ikl)((hwp)hyg4).b;
        hyg3.getClass();
        ((ikl)hyg2).c = hyg3;
        ((ikl)hyg2).b = 2;
        hyg4 = (ikl)((hwp)hyg4).o();
        hyg3 = ikl.a.l();
        hyg2 = ikk.a;
        if (!((hwp)hyg3).b.B()) {
            ((hwp)hyg3).u();
        }
        hyg4 = (ikl)((hwp)hyg3).b;
        hyg2.getClass();
        ((ikl)hyg4).c = hyg2;
        ((ikl)hyg4).b = 3;
        hyg4 = (ikl)((hwp)hyg3).o();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static String a(ikm object2) {
        gzs gzs2 = new gzs();
        for (Object object2 : ((ikm)object2).b) {
            int n2;
            int n3 = ((ikl)object2).b;
            boolean bl2 = false;
            switch (n3) {
                default: {
                    n2 = 0;
                    break;
                }
                case 6: {
                    n2 = 6;
                    break;
                }
                case 5: {
                    n2 = 5;
                    break;
                }
                case 4: {
                    n2 = 4;
                    break;
                }
                case 3: {
                    n2 = 3;
                    break;
                }
                case 2: {
                    n2 = 2;
                    break;
                }
                case 1: {
                    n2 = 1;
                    break;
                }
                case 0: {
                    n2 = 7;
                }
            }
            if (n2 == 0) throw null;
            if (--n2 != 0) {
                CharSequence charSequence;
                if (n2 != 1) {
                    if (n2 != 2) {
                        if (n2 != 3) {
                            if (n2 != 4) {
                                if (n2 != 5) throw new IllegalArgumentException("No transform specified");
                                object2 = "defrag";
                            } else {
                                object2 = n3 == 5 ? (ikh)((ikl)object2).c : ikh.a;
                                if (((ikh)object2).c.size() > 0) {
                                    gzs gzs3 = new gzs();
                                    for (Object object3 : ((ikh)object2).c) {
                                        bl2 = 1 == (((ikg)object3).b & 1);
                                        fxf.q(bl2);
                                        if ((((ikg)object3).b & 2) != 0) {
                                            charSequence = ((ikg)object3).c;
                                            String string = fra.b(((ikg)object3).d);
                                            object3 = new StringBuilder();
                                            ((StringBuilder)object3).append((String)charSequence);
                                            ((StringBuilder)object3).append("=");
                                            ((StringBuilder)object3).append(string);
                                            gzs3.h(((StringBuilder)object3).toString());
                                            continue;
                                        }
                                        gzs3.h(((ikg)object3).c);
                                    }
                                    String string = new gtk(",").d(gzs3.g());
                                    charSequence = new StringBuilder("(");
                                    ((StringBuilder)charSequence).append(string);
                                    ((StringBuilder)charSequence).append(")");
                                    charSequence = ((StringBuilder)charSequence).toString();
                                } else {
                                    charSequence = "";
                                }
                                object2 = String.valueOf(((ikh)object2).b).concat((String)charSequence);
                            }
                        } else {
                            object2 = n3 == 4 ? (ikn)((ikl)object2).c : ikn.a;
                            if (1 == (((ikn)object2).b & 1)) {
                                bl2 = true;
                            }
                            fxf.q(bl2);
                            object2 = fra.b(((ikn)object2).c);
                            charSequence = new StringBuilder("zip(target=");
                            ((StringBuilder)charSequence).append((String)object2);
                            ((StringBuilder)charSequence).append(")");
                            object2 = ((StringBuilder)charSequence).toString();
                        }
                    } else {
                        object2 = n3 == 3 ? (ikk)((ikl)object2).c : ikk.a;
                        if (((ikk)object2).b == 1) {
                            object2 = fra.b((String)((ikk)object2).c);
                            charSequence = new StringBuilder("integrity(sha256=");
                            ((StringBuilder)charSequence).append((String)object2);
                            ((StringBuilder)charSequence).append(")");
                            object2 = ((StringBuilder)charSequence).toString();
                        } else {
                            object2 = "integrity";
                        }
                    }
                } else {
                    object2 = n3 == 2 ? (ikj)((ikl)object2).c : ikj.a;
                    n2 = ((ikj)object2).b;
                    if (n2 == 1) {
                        charSequence = fra.b((String)((ikj)object2).c);
                        object2 = new StringBuilder("encrypt(aes_gcm_key=");
                        ((StringBuilder)object2).append((String)charSequence);
                        ((StringBuilder)object2).append(")");
                        object2 = ((StringBuilder)object2).toString();
                    } else if (n2 == 2) {
                        object2 = fra.b((String)((ikj)object2).c);
                        charSequence = new StringBuilder("encrypt(aes_gcm_hkdf_key=");
                        ((StringBuilder)charSequence).append((String)object2);
                        ((StringBuilder)charSequence).append(")");
                        object2 = ((StringBuilder)charSequence).toString();
                    } else {
                        object2 = "encrypt";
                    }
                }
            } else {
                object2 = "compress";
            }
            gzs2.h(object2);
        }
        return fqh.a(gzs2.g());
    }

    private static final String b(String string) {
        try {
            string = URLEncoder.encode(string, fqe.a.displayName());
            return string;
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            throw new IllegalStateException(unsupportedEncodingException);
        }
    }
}

