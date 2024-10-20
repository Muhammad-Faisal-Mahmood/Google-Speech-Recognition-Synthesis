/*
 * Decompiled with CFR 0.152.
 */
final class pz {
    qb a;
    final qa b;

    public pz(qa qa2) {
        this.b = qa2;
    }

    public final String toString() {
        CharSequence charSequence;
        qb qb2 = this.a;
        CharSequence charSequence2 = charSequence = "[ ";
        if (qb2 != null) {
            int n2 = 0;
            while (true) {
                charSequence2 = charSequence;
                if (n2 >= 9) break;
                charSequence2 = new StringBuilder();
                ((StringBuilder)charSequence2).append((String)charSequence);
                ((StringBuilder)charSequence2).append(this.a.i[n2]);
                ((StringBuilder)charSequence2).append(" ");
                charSequence = ((StringBuilder)charSequence2).toString();
                ++n2;
            }
        }
        charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append((String)charSequence2);
        ((StringBuilder)charSequence).append("] ");
        ((StringBuilder)charSequence).append(this.a);
        return ((StringBuilder)charSequence).toString();
    }
}

