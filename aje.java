/*
 * Decompiled with CFR 0.152.
 */
public final class aje
extends RuntimeException {
    public aje(int n2) {
        String string = n2 != 1 ? (n2 != 2 ? "Detaching surface timed out." : "Setting foreground mode timed out.") : "Player release timed out.";
        super(string);
    }
}

