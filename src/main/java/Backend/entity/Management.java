package Backend.entity;

import javax.persistence.Column;
import javax.persistence.Table;
import java.util.Date;
@Table(name = "management")
public class Management extends Account {
    @Column(name = "start_time")
    private Date start_time;
    @Column(name = "end_time")
    private Date end_time;


    public Date getStart_time() {
        return start_time;
    }

    public void setStart_time(Date start_time) {
        this.start_time = start_time;
    }

    public Date getEnd_time() {
        return end_time;
    }

    public void setEnd_time(Date end_time) {
        this.end_time = end_time;
    }


}
