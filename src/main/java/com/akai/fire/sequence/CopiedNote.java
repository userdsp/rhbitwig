package com.akai.fire.sequence;

import com.bitwig.extension.controller.api.NoteStep;

public class CopiedNote {
    public final int x;
    public final int velocity;
    public final double duration;

    public CopiedNote(final NoteStep note) {
        this.x = note.x();
        this.velocity = (int) Math.round(note.velocity() * 127.0);
        this.duration = Math.max(note.duration(), 0.25);
    }
}
