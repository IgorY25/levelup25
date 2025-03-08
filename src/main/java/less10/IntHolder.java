package less10;

public class IntHolder {
    private Long value;
    private int counter = 0;
    private Long min;
    private Long max;
    private Long uneven;

    public IntHolder() {

        this.value = new Long(0);
        this.min = new Long(0);
        this.max = new Long(0);
        this.uneven = new Long(0);
    }

    public Long getValue() {
        this.value = (this.counter == 0) ? 0 : this.value / this.counter;

        return this.value;
    }

    public void setValue(Long value) {
        this.value = this.value + value;
        this.counter++;
        if (this.counter == 1) {
            this.min = value;
        }
        this.max = value;
        if (value % 2 > 0) {
            this.uneven = this.uneven + value;
        }
    }

    public Long getMin() {
        return min;
    }

    public Long getMax() {
        return max;
    }

    public Long getUneven() {
        return uneven;
    }
}
