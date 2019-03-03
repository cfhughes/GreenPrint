package edu.cnm.deepdive.green_print.entity;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;
import java.util.Date;

@Entity(
    foreignKeys = @ForeignKey(entity = Consumption.class, parentColumns = "activity_id", childColumns = "activity_id",
        onDelete = ForeignKey.CASCADE))
 public class Activity {


  @ColumnInfo(name = "activity_id")
  @PrimaryKey(autoGenerate = true)

  private long id;

  @ColumnInfo(name = "consumption_id", index = true)
  private long consumptionId;


  private Date timestamp = new Date();

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getConsumptionIdId() {
    return consumptionId;
  }

  public void setConsumptionIdId(long consumptionId) {
    this.consumptionId = consumptionId;
  }

  public Date getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Date timestamp) {
    this.timestamp = timestamp;
  }
}