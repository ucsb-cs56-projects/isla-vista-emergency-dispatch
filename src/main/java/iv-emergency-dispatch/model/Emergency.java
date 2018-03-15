package ivemergencydispatch.model;

import java.util.Date;
import javax.validation.constraints.Size;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="emergencies")
public class Emergency {
  
    @NotBlank
    @Indexed
    private Date time;
    
    @NotBlank
    private String description;

    @NotBlank
    private String address;


    public Emergency() {
    }

    public Emergency(Date time, String address, String description) {
        this.time = time;
        this.description = description;
        this.address = address;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return String.format(
                "Emergency[time='%s', address='%s', description='%s']",
                time, address, description);
    }
}
