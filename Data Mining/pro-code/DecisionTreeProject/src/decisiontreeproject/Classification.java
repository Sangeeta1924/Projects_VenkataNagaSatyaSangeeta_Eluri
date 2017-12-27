package decisiontreeproject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Classification {

    double entropy;

    public Classification() {
        try {
            ArrayList rainal = new ArrayList();
            ArrayList rain_thunderstormal = new ArrayList();
            ArrayList fogal = new ArrayList();
            ArrayList hazeal = new ArrayList();
            ArrayList haze_mistal = new ArrayList();
            ArrayList thcal = new ArrayList();
            ArrayList rcal = new ArrayList();
            ArrayList fcal = new ArrayList();
            ArrayList hcal = new ArrayList();
            ArrayList hmcal = new ArrayList();
            ArrayList dataset = new ArrayList();
            ArrayList datasetTokens = new ArrayList();
            

            BufferedReader br = new BufferedReader(new FileReader("c:\\wdata.txt"));
            String temp = "";

            while ((temp = br.readLine()) != null) {
                dataset.add(temp);
                StringTokenizer st = new StringTokenizer(temp, " ");
                while (st.hasMoreTokens()) {
                    datasetTokens.add(st.nextToken());
                }
                char c = temp.charAt(temp.length() - 1);
                if (c == 'm') {
                    thcal.add(temp);
                    StringTokenizer str = new StringTokenizer(temp, " ");
                    while (str.hasMoreTokens()) {
                        rain_thunderstormal.add(str.nextToken());
                    }
                } else if (c == 'n') {
                    rcal.add(temp);
                    StringTokenizer str = new StringTokenizer(temp, " ");
                    while (str.hasMoreTokens()) {
                        rainal.add(str.nextToken());
                    }
                } else if (c == 'g') {
                    fcal.add(temp);
                    StringTokenizer str = new StringTokenizer(temp, " ");
                    while (str.hasMoreTokens()) {
                        fogal.add(str.nextToken());
                    }
                } else if (c == 'e') {
                    hcal.add(temp);
                    StringTokenizer str = new StringTokenizer(temp, " ");
                    while (str.hasMoreTokens()) {
                        hazeal.add(str.nextToken());
                    }
                } else if (c == 't') {
                    hmcal.add(temp);
                    StringTokenizer str = new StringTokenizer(temp, " ");
                    while (str.hasMoreTokens()) {
                        haze_mistal.add(str.nextToken());
                    }
                }
            }




            int totc = dataset.size();
            int rc = rcal.size();
            int rtc = thcal.size();
            int fc = fcal.size();
            int hc = hcal.size();
            int hmc = hmcal.size();

            Entropy e = new Entropy();
            entropy = e.entropycalc(rc, rtc, fc, hc, hmc, totc);



            System.out.println("DAtaset:" + dataset);
            System.out.println("DatasetTokens:" + datasetTokens);

//            System.out.println("totc:" + totc);
//            System.out.println("rc:" + rc);
//            System.out.println("rtc:" + rtc);
//            System.out.println("fc:" + fc);
//            System.out.println("hc:" + hc);
//            System.out.println("hmc:" + hmc);
            System.out.println("entropy:" + entropy);
            Tempature t = new Tempature(entropy);
            t.Temp(datasetTokens);
            t.Wind(datasetTokens);
            t.Presure(datasetTokens);
            t.humidity(datasetTokens);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

  
    public static void main(String[] args) {
        Classification c = new Classification();
    }
}
