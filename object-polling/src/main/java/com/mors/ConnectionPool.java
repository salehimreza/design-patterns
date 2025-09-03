
package com.mors;


public class ConnectionPool extends ObjectPool<Connection> {

  @Override
  protected Connection create() {
    return new Connection();
  }
}
