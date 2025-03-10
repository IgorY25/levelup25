package less10;

import lombok.Getter;

public class IntHolder {
    private Long value;
    private int counter = 0;
    @Getter
    private Long min;
    @Getter
    private Long max;
    @Getter
    private Long uneven;

    public IntHolder() {

        this.value = 0L;
        this.min = 0L;
        this.max = 0L;
        this.uneven = 0L;
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
}
