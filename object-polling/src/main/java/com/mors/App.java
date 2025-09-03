package com.mors;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class App {
    public static void main(String[] args) {
        String checkedOut = "Checked out : ";
        var pool = new ConnectionPool();
        log.info(pool.toString());

        var connection = pool.checkOut();

        log.info(checkedOut + connection);
        log.info(pool.toString());

        var connection2 = pool.checkOut();
        log.info(checkedOut + connection2);

        var connection3 = pool.checkOut();
        log.info(checkedOut + connection3);
        log.info(pool.toString());
        log.info(checkedOut + connection);

        pool.checkIn(connection);
        log.info(checkedOut + connection2);

        pool.checkIn(connection2);
        log.info(pool.toString());

        var connection4 = pool.checkOut();
        log.info(checkedOut + connection4);

        var connection5 = pool.checkOut();
        log.info(checkedOut + connection5);
        log.info(pool.toString());
    }
}