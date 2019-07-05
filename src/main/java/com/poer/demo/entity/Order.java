package com.poer.demo.entity;

import lombok.Data;

@Data
public class Order {

  private String id;
  private String gid;
  private String pid;
  private java.sql.Date crtm;
  private java.sql.Date satm;
  private java.sql.Date entm;
  private String remark;
  private String aid;
  private long status;
  private double pay;

}
