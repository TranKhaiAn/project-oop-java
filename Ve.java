import java.util.Scanner;

public class Ve {
    private String makh;
    private String mave;
    private String matour;
    private String loaive;
    private int giave;

    public Ve() {

    }

    public Ve(String makh, String mave, String matour) {
        this.makh = makh;
        this.mave = mave;
        this.matour = matour;
    }

    public Ve(Ve v1) {
        makh = v1.makh;
        mave = v1.mave;
        matour = v1.matour;
    }

}