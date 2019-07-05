package com.poer.demo.entity;

import lombok.Data;

@Data
public class Guest {

  private String id;
  private String wxId;
  private String wxImage;
  private String mobile;
  private long status;

}
