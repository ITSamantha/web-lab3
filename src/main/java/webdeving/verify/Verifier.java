package webdeving.verify;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Verifier {
    private final List<Double> R_VALUES = Arrays.asList(1.0, 1.5, 2.0, 2.5, 3.0);

    public boolean verifyHit(double x, double y, double r) {
        return verifyFirstQuater(x, y, r) || verifySecondQuater(x, y, r) || verifyThirdQuater(x, y, r) || verifyFourthQuater(x, y, r);
    }

    private boolean verifyFirstQuater(final double x, final double y, final double r) {
        return (x >= 0 && y >= 0) && (x <= r && y <= r);
    }

    private boolean verifySecondQuater(final double x, final double y, final double r) {
        return (x <= 0 && y >= 0) && (x * x + y * y <= (r * r / 4d));
    }

    private boolean verifyThirdQuater(final double x, final double y, final double r) {
        return (x <= 0 && y <= 0) && (y >= -x - r / 2d);
    }

    private boolean verifyFourthQuater(final double x, final double y, final double r) {
        return false;
    }


    public boolean verifyR(double r) {
        return R_VALUES.contains(r);
    }

}
