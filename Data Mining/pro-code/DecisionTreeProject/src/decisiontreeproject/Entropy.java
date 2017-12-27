package decisiontreeproject;

class Entropy {

    public double entropycalc(double rc, double rtc, double fc, double hc, double hmc, double totc) {

        if (rc == 0 || rtc == 0 || fc == 0 || hc == 0 || hmc == 0 || totc == 0) {
            return 0.0;
        } else {
            double enc = ((rc / totc) * (Math.log(totc / rc)))
                    + ((rtc / totc) * (Math.log(totc / rtc)))
                    + ((fc / totc) * (Math.log(totc / fc)))
                    + ((hc / totc) * (Math.log(totc / hc)))
                    + ((hmc / totc) * (Math.log(totc / hmc)));
            return enc;

        }
    }
}
