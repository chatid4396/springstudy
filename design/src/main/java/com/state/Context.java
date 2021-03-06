package com.state;

import java.util.zip.ZipEntry;

public class Context {
    private State state;

    public Context(State state) {
        this.state = state;
    }

    public void handle() {
        this.state.handle(this);
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
