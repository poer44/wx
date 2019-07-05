package com.poer.demo.entity;

import lombok.Data;

@Data
public class OrderStatus {

  private String id;
  private String oid;
  private java.sql.Timestamp crtm;
  private String word;

}
