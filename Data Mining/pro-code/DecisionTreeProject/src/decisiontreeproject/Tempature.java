package decisiontreeproject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Tempature {

    double totEnt;
    public Tempature(double totalentropy){
        totEnt=totalentropy;
    }

Gain g=new Gain();
    HashMap result_gain=new HashMap();

    public void Temp(ArrayList datasetTokens) {

        Dividing d = new Dividing();
        ArrayList final_temp = d.tempdiv(datasetTokens);
        int totc=(datasetTokens.size()/5);
        System.out.println("Final_Temp is:" + final_temp);

        ArrayList temp_low = (ArrayList) final_temp.get(0);
        ArrayList temp_medium = (ArrayList) final_temp.get(1);
        ArrayList temp_high = (ArrayList) final_temp.get(2);

        int r_occr = 0;
        int rt_occr = 0;
        int f_occr = 0;
        int h_occr = 0;
        int hm_occr = 0;
        int l_count = (temp_low.size() / 5);
        int m_count = (temp_medium.size() / 5);
        int h_count = (temp_high.size() / 5);

        for (int i = 0; i < temp_low.size(); i++) {
            if (((String) temp_low.get(i)).equals("rain,thunderstorm")) {
                rt_occr++;
            } else if (((String) temp_low.get(i)).equals("rain")) {
                r_occr++;
            } else if (((String) temp_low.get(i)).equals("haze")) {
                h_occr++;
            } else if (((String) temp_low.get(i)).equals("fog")) {
                f_occr++;
            } else if (((String) temp_low.get(i)).equals("haze,mist")) {
                hm_occr++;
            }
        }
        Entropy e = new Entropy();
        double low_Entropy = e.entropycalc(r_occr, rt_occr, f_occr, h_occr, hm_occr, l_count);
        System.out.println("low_Entropy is :" + low_Entropy);

        for (int i = 0; i < temp_medium.size(); i++) {
            if (((String) temp_medium.get(i)).equals("rain,thunderstorm")) {
                rt_occr++;
            } else if (((String) temp_medium.get(i)).equals("rain")) {
                r_occr++;
            } else if (((String) temp_medium.get(i)).equals("haze")) {
                h_occr++;
            } else if (((String) temp_medium.get(i)).equals("fog")) {
                f_occr++;
            } else if (((String) temp_medium.get(i)).equals("haze,mist")) {
                hm_occr++;
            }
        }

        double medium_Entropy = e.entropycalc(r_occr, rt_occr, f_occr, h_occr, hm_occr, m_count);
        System.out.println("medium_Entropy is :" + medium_Entropy);
        for (int i = 0; i < temp_high.size(); i++) {
            if (((String) temp_high.get(i)).equals("rain,thunderstorm")) {
                rt_occr++;
            } else if (((String) temp_high.get(i)).equals("rain")) {
                r_occr++;
            } else if (((String) temp_high.get(i)).equals("haze")) {
                h_occr++;
            } else if (((String) temp_high.get(i)).equals("fog")) {
                f_occr++;
            } else if (((String) temp_high.get(i)).equals("haze,mist")) {
                hm_occr++;
            }
        }

        double high_Entropy = e.entropycalc(r_occr, rt_occr, f_occr, h_occr, hm_occr, h_count);
        System.out.println("high_Entropy is :" + high_Entropy);


        WeightedSum w=new WeightedSum();
        double temp_weighted_sum=w.weighted(low_Entropy, medium_Entropy, high_Entropy,l_count, m_count, h_count, totc);
        System.out.println("temp_weighted_sum :"+temp_weighted_sum);
Double temp_gain=g.gain(temp_weighted_sum, totEnt);
result_gain.put("temp",temp_gain);
//        System.out.println("temp_low size is:" + l_count);
//        System.out.println("temp_medium size is:" + m_count);
//        System.out.println("temp_high size is:" + h_count);
//        System.out.println("r_occr:" + r_occr);
//        System.out.println("rt_occr:" + rt_occr);
//        System.out.println("f_occr:" + f_occr);
//        System.out.println("h_occr:" + h_occr);
//        System.out.println("hm_occr:" + hm_occr);
    }


     public void Wind(ArrayList datasetTokens) {

        Dividing d = new Dividing();
        ArrayList final_temp = d.winddiv(datasetTokens);
        int totc=(datasetTokens.size()/5);
        System.out.println("Final_Wind is:" + final_temp);

        ArrayList temp_low = (ArrayList) final_temp.get(0);
        ArrayList temp_medium = (ArrayList) final_temp.get(1);
        ArrayList temp_high = (ArrayList) final_temp.get(2);

        int r_occr = 0;
        int rt_occr = 0;
        int f_occr = 0;
        int h_occr = 0;
        int hm_occr = 0;
        int l_count = (temp_low.size() / 5);
        int m_count = (temp_medium.size() / 5);
        int h_count = (temp_high.size() / 5);

        for (int i = 0; i < temp_low.size(); i++) {
            if (((String) temp_low.get(i)).equals("rain,thunderstorm")) {
                rt_occr++;
            } else if (((String) temp_low.get(i)).equals("rain")) {
                r_occr++;
            } else if (((String) temp_low.get(i)).equals("haze")) {
                h_occr++;
            } else if (((String) temp_low.get(i)).equals("fog")) {
                f_occr++;
            } else if (((String) temp_low.get(i)).equals("haze,mist")) {
                hm_occr++;
            }
        }
        Entropy e = new Entropy();
        double low_Entropy = e.entropycalc(r_occr, rt_occr, f_occr, h_occr, hm_occr, l_count);
        System.out.println("low_Entropy is :" + low_Entropy);

        for (int i = 0; i < temp_medium.size(); i++) {
            if (((String) temp_medium.get(i)).equals("rain,thunderstorm")) {
                rt_occr++;
            } else if (((String) temp_medium.get(i)).equals("rain")) {
                r_occr++;
            } else if (((String) temp_medium.get(i)).equals("haze")) {
                h_occr++;
            } else if (((String) temp_medium.get(i)).equals("fog")) {
                f_occr++;
            } else if (((String) temp_medium.get(i)).equals("haze,mist")) {
                hm_occr++;
            }
        }

        double medium_Entropy = e.entropycalc(r_occr, rt_occr, f_occr, h_occr, hm_occr, m_count);
        System.out.println("medium_Entropy is :" + medium_Entropy);
        for (int i = 0; i < temp_high.size(); i++) {
            if (((String) temp_high.get(i)).equals("rain,thunderstorm")) {
                rt_occr++;
            } else if (((String) temp_high.get(i)).equals("rain")) {
                r_occr++;
            } else if (((String) temp_high.get(i)).equals("haze")) {
                h_occr++;
            } else if (((String) temp_high.get(i)).equals("fog")) {
                f_occr++;
            } else if (((String) temp_high.get(i)).equals("haze,mist")) {
                hm_occr++;
            }
        }

        double high_Entropy = e.entropycalc(r_occr, rt_occr, f_occr, h_occr, hm_occr, h_count);
        System.out.println("high_Entropy is :" + high_Entropy);


        WeightedSum w=new WeightedSum();
        double wind_weighted_sum=w.weighted(low_Entropy, medium_Entropy, high_Entropy,l_count, m_count, h_count, totc);
        System.out.println("Wind_weighted_sum :"+wind_weighted_sum);
        Double wind_gain=g.gain(wind_weighted_sum, totEnt);
        result_gain.put("Wind",wind_gain);
//        System.out.println("temp_low size is:" + l_count);
//        System.out.println("temp_medium size is:" + m_count);
//        System.out.println("temp_high size is:" + h_count);
//        System.out.println("r_occr:" + r_occr);
//        System.out.println("rt_occr:" + rt_occr);
//        System.out.println("f_occr:" + f_occr);
//        System.out.println("h_occr:" + h_occr);
//        System.out.println("hm_occr:" + hm_occr);
    }


     public void Presure(ArrayList datasetTokens) {

        Dividing d = new Dividing();
        ArrayList final_presure = d.presurediv(datasetTokens);
        int totc=(datasetTokens.size()/5);
        System.out.println("Final_presure is:" + final_presure);

        ArrayList temp_low = (ArrayList) final_presure.get(0);
        ArrayList temp_medium = (ArrayList) final_presure.get(1);
         System.out.println("Temp_Medium: "+temp_medium.size());

        ArrayList temp_high = (ArrayList) final_presure.get(2);
                  System.out.println("Temp_High: "+temp_high.size());
        int r_occr = 0;
        int rt_occr = 0;
        int f_occr = 0;
        int h_occr = 0;
        int hm_occr = 0;
        int l_count = (temp_low.size() / 5);
        int m_count = (temp_medium.size() / 5);
        int h_count = (temp_high.size() / 5);

        for (int i = 0; i < temp_low.size(); i++) {
            if (((String) temp_low.get(i)).equals("rain,thunderstorm")) {
                rt_occr++;
            } else if (((String) temp_low.get(i)).equals("rain")) {
                r_occr++;
            } else if (((String) temp_low.get(i)).equals("haze")) {
                h_occr++;
            } else if (((String) temp_low.get(i)).equals("fog")) {
                f_occr++;
            } else if (((String) temp_low.get(i)).equals("haze,mist")) {
                hm_occr++;
            }
        }
        Entropy e = new Entropy();
        double low_Entropy = e.entropycalc(r_occr, rt_occr, f_occr, h_occr, hm_occr, l_count);
        System.out.println("low_Entropy is :" + low_Entropy);

        for (int i = 0; i < temp_medium.size(); i++) {
            if (((String) temp_medium.get(i)).equals("rain,thunderstorm")) {
                rt_occr++;
            } else if (((String) temp_medium.get(i)).equals("rain")) {
                r_occr++;
            } else if (((String) temp_medium.get(i)).equals("haze")) {
                h_occr++;
            } else if (((String) temp_medium.get(i)).equals("fog")) {
                f_occr++;
            } else if (((String) temp_medium.get(i)).equals("haze,mist")) {
                hm_occr++;
            }
        }

        double medium_Entropy = e.entropycalc(r_occr, rt_occr, f_occr, h_occr, hm_occr, m_count);
        System.out.println("medium_Entropy is :" + medium_Entropy);
        for (int i = 0; i < temp_high.size(); i++) {
            if (((String) temp_high.get(i)).equals("rain,thunderstorm")) {
                rt_occr++;
            } else if (((String) temp_high.get(i)).equals("rain")) {
                r_occr++;
            } else if (((String) temp_high.get(i)).equals("haze")) {
                h_occr++;
            } else if (((String) temp_high.get(i)).equals("fog")) {
                f_occr++;
            } else if (((String) temp_high.get(i)).equals("haze,mist")) {
                hm_occr++;
            }
        }

        double high_Entropy = e.entropycalc(r_occr, rt_occr, f_occr, h_occr, hm_occr, h_count);
        System.out.println("high_Entropy is :" + high_Entropy);


        WeightedSum w=new WeightedSum();
        double presure_weighted_sum=w.weighted(low_Entropy, medium_Entropy, high_Entropy,l_count, m_count, h_count, totc);
        System.out.println("Wind_weighted_sum :"+presure_weighted_sum);
        Double presure_gain=g.gain(presure_weighted_sum, totEnt);
        result_gain.put("Presure",presure_gain);
//        System.out.println("temp_low size is:" + l_count);
//        System.out.println("temp_medium size is:" + m_count);
//        System.out.println("temp_high size is:" + h_count);
//        System.out.println("r_occr:" + r_occr);
//        System.out.println("rt_occr:" + rt_occr);
//        System.out.println("f_occr:" + f_occr);
//        System.out.println("h_occr:" + h_occr);
//        System.out.println("hm_occr:" + hm_occr);
    }


       public void humidity(ArrayList datasetTokens) {

        Dividing d = new Dividing();
        ArrayList final_humidity = d.humiditydiv(datasetTokens);
        int totc=(datasetTokens.size()/5);
        System.out.println("Final_presure is:" + final_humidity);

        ArrayList temp_low = (ArrayList) final_humidity.get(0);
        ArrayList temp_medium = (ArrayList) final_humidity.get(1);
        ArrayList temp_high = (ArrayList) final_humidity.get(2);

        int r_occr = 0;
        int rt_occr = 0;
        int f_occr = 0;
        int h_occr = 0;
        int hm_occr = 0;
        int l_count = (temp_low.size() / 5);
        int m_count = (temp_medium.size() / 5);
        int h_count = (temp_high.size() / 5);

        for (int i = 0; i < temp_low.size(); i++) {
            if (((String) temp_low.get(i)).equals("rain,thunderstorm")) {
                rt_occr++;
            } else if (((String) temp_low.get(i)).equals("rain")) {
                r_occr++;
            } else if (((String) temp_low.get(i)).equals("haze")) {
                h_occr++;
            } else if (((String) temp_low.get(i)).equals("fog")) {
                f_occr++;
            } else if (((String) temp_low.get(i)).equals("haze,mist")) {
                hm_occr++;
            }
        }
        Entropy e = new Entropy();
        double low_Entropy = e.entropycalc(r_occr, rt_occr, f_occr, h_occr, hm_occr, l_count);
        System.out.println("low_Entropy is :" + low_Entropy);

        for (int i = 0; i < temp_medium.size(); i++) {
            if (((String) temp_medium.get(i)).equals("rain,thunderstorm")) {
                rt_occr++;
            } else if (((String) temp_medium.get(i)).equals("rain")) {
                r_occr++;
            } else if (((String) temp_medium.get(i)).equals("haze")) {
                h_occr++;
            } else if (((String) temp_medium.get(i)).equals("fog")) {
                f_occr++;
            } else if (((String) temp_medium.get(i)).equals("haze,mist")) {
                hm_occr++;
            }
        }

        double medium_Entropy = e.entropycalc(r_occr, rt_occr, f_occr, h_occr, hm_occr, m_count);
        System.out.println("medium_Entropy is :" + medium_Entropy);
        for (int i = 0; i < temp_high.size(); i++) {
            if (((String) temp_high.get(i)).equals("rain,thunderstorm")) {
                rt_occr++;
            } else if (((String) temp_high.get(i)).equals("rain")) {
                r_occr++;
            } else if (((String) temp_high.get(i)).equals("haze")) {
                h_occr++;
            } else if (((String) temp_high.get(i)).equals("fog")) {
                f_occr++;
            } else if (((String) temp_high.get(i)).equals("haze,mist")) {
                hm_occr++;
            }
        }

        double high_Entropy = e.entropycalc(r_occr, rt_occr, f_occr, h_occr, hm_occr, h_count);
        System.out.println("high_Entropy is :" + high_Entropy);


        WeightedSum w=new WeightedSum();
        double humidity_weighted_sum=w.weighted(low_Entropy, medium_Entropy, high_Entropy,l_count, m_count, h_count, totc);
        System.out.println("Humidity_weighted_sum :"+humidity_weighted_sum);
        Double humidity_gain=g.gain(humidity_weighted_sum, totEnt);
        result_gain.put("Humidity",humidity_gain);
//        System.out.println("temp_low size is:" + l_count);
//        System.out.println("temp_medium size is:" + m_count);
//        System.out.println("temp_high size is:" + h_count);
//        System.out.println("r_occr:" + r_occr);
//        System.out.println("rt_occr:" + rt_occr);
//        System.out.println("f_occr:" + f_occr);
//        System.out.println("h_occr:" + h_occr);
//        System.out.println("hm_occr:" + hm_occr);
        System.out.println(result_gain);
    }


}
