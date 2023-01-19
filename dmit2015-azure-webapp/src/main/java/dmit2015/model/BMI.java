package dmit2015.model;
import lombok.Data;

@Data
public class BMI{
    private int weight;
    private int height;

    public double bmi(){
        return (703*weight)/ M
    }
        }