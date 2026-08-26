package test.origin;
public record Payment(int cents) { public boolean valid() { return cents > 0; } }
