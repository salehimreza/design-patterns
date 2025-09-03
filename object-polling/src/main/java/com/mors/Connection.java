package com.mors;

import lombok.Getter;

import java.util.concurrent.atomic.AtomicInteger;

@Getter
public class Connection {

    private static final AtomicInteger counter = new AtomicInteger(0);

    private final int id;

    public Connection() {
        id = counter.incrementAndGet();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public String toString() {
        return String.format("Connection id = %d", id);
    }
}
