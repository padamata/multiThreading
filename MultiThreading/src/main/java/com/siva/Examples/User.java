package com.siva.Examples;

import jakarta.persistence.Entity;

@Entity
class User {
  
  private String id;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }
}
