package ru.ssau.tk.dasha.practice.Person;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class PersonSerialazable {
    public static void set(OutputStream out,Object obj) throws IOException {
        ((ObjectOutputStream) out).writeObject(obj);
    }
}
