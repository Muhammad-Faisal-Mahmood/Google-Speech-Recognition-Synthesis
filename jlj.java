/*
 * Decompiled with CFR 0.152.
 */
import javax.security.auth.x500.X500Principal;

final class jlj {
    public final String a;
    public final int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public char[] g;

    public jlj(X500Principal object) {
        this.a = object = ((X500Principal)object).getName("RFC2253");
        this.b = ((String)object).length();
    }

    /*
     * Enabled aggressive block sorting
     */
    public final char a() {
        int n2;
        this.c = n2 = this.c + 1;
        if (n2 == this.b) throw new IllegalStateException("Unexpected end of DN: ".concat(String.valueOf(this.a)));
        char c2 = this.g[n2];
        if (c2 == ' ') return c2;
        if (c2 == '%') return c2;
        if (c2 == '\\') return c2;
        if (c2 == '_') return c2;
        if (c2 == '\"') return c2;
        if (c2 == '#') return c2;
        switch (c2) {
            default: {
                switch (c2) {
                    default: {
                        n2 = this.b(n2);
                        ++this.c;
                        if (n2 < 128) {
                            return (char)n2;
                        }
                        if (n2 >= 192 && n2 <= 247) {
                            int n3;
                            if (n2 <= 223) {
                                n2 &= 0x1F;
                                n3 = 1;
                            } else if (n2 <= 239) {
                                n2 &= 0xF;
                                n3 = 2;
                            } else {
                                n2 &= 7;
                                n3 = 3;
                            }
                            int n4 = 0;
                            while (true) {
                                int n5;
                                if (n4 >= n3) {
                                    n2 = (char)n2;
                                    return (char)n2;
                                }
                                int n6 = this.c;
                                this.c = n5 = n6 + 1;
                                if (n5 == this.b || this.g[n5] != '\\') break;
                                this.c = n5 = n6 + 2;
                                n5 = this.b(n5);
                                ++this.c;
                                if ((n5 & 0xC0) != 128) break;
                                n2 = (n2 << 6) + (n5 & 0x3F);
                                ++n4;
                            }
                        }
                        n2 = 63;
                        return (char)n2;
                    }
                    case ';': 
                    case '<': 
                    case '=': 
                    case '>': 
                }
                return c2;
            }
            case '*': 
            case '+': 
            case ',': 
        }
        return c2;
    }

    public final int b(int n2) {
        block2: {
            block6: {
                block10: {
                    int n3;
                    block8: {
                        block9: {
                            block7: {
                                char[] cArray;
                                block4: {
                                    block5: {
                                        block3: {
                                            n3 = n2 + 1;
                                            if (n3 >= this.b) break block2;
                                            cArray = this.g;
                                            if ((n2 = cArray[n2]) < 48 || n2 > 57) break block3;
                                            n2 -= 48;
                                            break block4;
                                        }
                                        if (n2 < 97 || n2 > 102) break block5;
                                        n2 -= 87;
                                        break block4;
                                    }
                                    if (n2 < 65 || n2 > 70) break block6;
                                    n2 -= 55;
                                }
                                n3 = cArray[n3];
                                if (n3 < 48 || n3 > 57) break block7;
                                n3 -= 48;
                                break block8;
                            }
                            if (n3 < 97 || n3 > 102) break block9;
                            n3 -= 87;
                            break block8;
                        }
                        if (n3 < 65 || n3 > 70) break block10;
                        n3 -= 55;
                    }
                    return (n2 << 4) + n3;
                }
                throw new IllegalStateException("Malformed DN: ".concat(String.valueOf(this.a)));
            }
            throw new IllegalStateException("Malformed DN: ".concat(String.valueOf(this.a)));
        }
        throw new IllegalStateException("Malformed DN: ".concat(String.valueOf(this.a)));
    }

    public final String c() {
        block10: {
            int n2;
            int n3;
            block11: {
                int n4;
                block14: {
                    char c2;
                    char[] cArray;
                    block13: {
                        block12: {
                            while ((n3 = this.c) < (n4 = this.b) && this.g[n3] == ' ') {
                                this.c = n3 + 1;
                            }
                            if (n3 == n4) {
                                return null;
                            }
                            this.d = n3;
                            this.c = n3 + 1;
                            while ((n4 = this.c) < (n2 = this.b) && (n3 = this.g[n4]) != 61 && n3 != 32) {
                                this.c = n4 + 1;
                            }
                            if (n4 >= n2) break block10;
                            this.e = n4;
                            n3 = n4;
                            if (this.g[n4] == ' ') {
                                while ((n3 = this.c) < (n2 = this.b) && (n4 = this.g[n3]) != 61 && n4 == 32) {
                                    this.c = n3 + 1;
                                }
                                if (this.g[n3] != '=' || n3 == n2) {
                                    throw new IllegalStateException("Unexpected end of DN: ".concat(String.valueOf(this.a)));
                                }
                            }
                            this.c = n3 + 1;
                            while ((n3 = this.c) < this.b && this.g[n3] == ' ') {
                                this.c = n3 + 1;
                            }
                            n2 = this.e;
                            n3 = n4 = this.d;
                            if (n2 - n4 <= 4) break block11;
                            cArray = this.g;
                            n3 = n4;
                            if (cArray[n4 + 3] != '.') break block11;
                            c2 = cArray[n4];
                            if (c2 == 'O') break block12;
                            n3 = n4;
                            if (c2 != 'o') break block11;
                        }
                        if ((c2 = cArray[n4 + 1]) == 'I') break block13;
                        n3 = n4;
                        if (c2 != 'i') break block11;
                    }
                    if ((c2 = cArray[n4 + 2]) == 'D') break block14;
                    n3 = n4;
                    if (c2 != 'd') break block11;
                }
                this.d = n3 = n4 + 4;
            }
            return new String(this.g, n3, n2 - n3);
        }
        throw new IllegalStateException("Unexpected end of DN: ".concat(String.valueOf(this.a)));
    }
}

