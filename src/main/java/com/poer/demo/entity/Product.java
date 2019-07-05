package com.poer.demo.entity;

import lombok.Data;

@Data
public class Product {

  private long id;
  private String name;
  private String word;
  private double oMoney;
  private double fMoney;
  private long seqe;
  private java.sql.Timestamp crtm;


}
