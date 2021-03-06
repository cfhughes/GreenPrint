package edu.cnm.deepdive.green_print.model.entity;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;
import com.google.gson.annotations.Expose;



  @Entity()


 public class Consumption {


  @ColumnInfo(name = "consumption_id")
  @PrimaryKey(autoGenerate = true)
  private long id;

  @NonNull



  @Expose
  private String category;

  @Expose
  private String description;



    @Expose
  private String type;

 @Expose
  private String url;

  @Expose
  private Long amount;

  public long getId(){
    return id;
  }

  public void setId(long id) {
    this.id=id;
  }
    public String getType() {
      return type;
    }

    public void setType(String type) {
      this.type = type;
    }


  public Long getAmount() {
    return amount;
  }

  public void setAmount(Long amount){
    this.amount = amount;
    }

  public String getCategory(){
    return category;
  }

  public void setCategory(String category){
    this.category=category;
  }


  public String getDescription(){
    return description;
  }

  public void setDescription(String description){
    this.description=description;
  }



  public String getUrl(){
    return url;
  }

  public void setUrl(String url){
    this.url=url;
  }


}
