package classwork;

public class Data {
    private String group;
    private int math;
    private int write;
    private int read;

    
    public String getGroup() {
        return group;
    }
    public void setGroup(String group) {
        this.group = group;
    }
    public int getMath() {
        return math;
    }
    public void setMath(int math) {
        this.math = math;
    }
    public int getWrite() {
        return write;
    }
    public void setWrite(int write) {
        this.write = write;
    }
    public int getRead() {
        return read;
    }
    public void setRead(int read) {
        this.read = read;
    }
    @Override
    public String toString() {
        return "Data [group=" + group + ", math=" + math + ", read=" + read + ", write=" + write + "]";
    }



    
}
