package decisiontreeproject;

import java.util.ArrayList;

public class Dividing {

    ArrayList temp = new ArrayList();
    ArrayList wind = new ArrayList();
    ArrayList presure = new ArrayList();
    ArrayList humidity = new ArrayList();
    ArrayList name = new ArrayList();

    public ArrayList tempdiv(ArrayList datasetTokens) {


        ArrayList temp_low = new ArrayList();
        ArrayList temp_medium = new ArrayList();
        ArrayList temp_high = new ArrayList();


        for (int i = 0; i < datasetTokens.size(); i = i + 5) {
            temp.add((String) datasetTokens.get(i));
            wind.add((String) datasetTokens.get(i + 1));
            presure.add((String) datasetTokens.get(i + 2));
            humidity.add((String) datasetTokens.get(i + 3));
            name.add((String) datasetTokens.get(i + 4));
        }

        for (int i = 0; i < temp.size(); i++) {
            float a = Float.parseFloat((String) temp.get(i));
            if (a >= 55 && a <= 70) {
                temp_low.add(a + "");
                temp_low.add((String) wind.get(i));
                temp_low.add((String) presure.get(i));
                temp_low.add((String) humidity.get(i));
                temp_low.add((String) name.get(i));
            } else if (a >= 71 && a <= 85) {
                temp_medium.add(a + "");
                temp_medium.add((String) wind.get(i));
                temp_medium.add((String) presure.get(i));
                temp_medium.add((String) humidity.get(i));
                temp_medium.add((String) name.get(i));
            } else if (a >= 86 && a <= 100) {
                temp_high.add(a + "");
                temp_high.add((String) wind.get(i));
                temp_high.add((String) presure.get(i));
                temp_high.add((String) humidity.get(i));
                temp_high.add((String) name.get(i));
            }
        }
        ArrayList final_temp = new ArrayList();
        final_temp.add(temp_low);
        final_temp.add(temp_medium);
        final_temp.add(temp_high);

        return final_temp;
    }


     public ArrayList winddiv(ArrayList datasetTokens) {


        ArrayList wind_low = new ArrayList();
        ArrayList wind_medium = new ArrayList();
        ArrayList wind_high = new ArrayList();


        for (int i = 0; i < datasetTokens.size(); i = i + 5) {
            temp.add((String) datasetTokens.get(i));
            wind.add((String) datasetTokens.get(i + 1));
            presure.add((String) datasetTokens.get(i + 2));
            humidity.add((String) datasetTokens.get(i + 3));
            name.add((String) datasetTokens.get(i + 4));
        }

       for(int i=1;i<wind.size();i++){
                float b = Float.parseFloat((String)wind.get(i));

                if (b >= 0 && b <= 5) {
                   wind_low.add((String)temp.get(i));
                 wind_low.add(b+"");
                  wind_low.add((String)presure.get(i));
                  wind_low.add((String)humidity.get(i));
                  wind_low.add((String) name.get(i));
                } else if (b >= 6 && b <= 10) {
                   wind_medium.add((String)temp.get(i));
                    wind_medium.add(b+"");
                   wind_medium.add((String)presure.get(i));
                   wind_medium.add((String)humidity.get(i));
                   wind_medium.add((String) name.get(i));
                } else if (b >= 11 && b<=15) {
                   wind_high.add((String)temp.get(i));
                    wind_high.add(b+"");
                    wind_high.add((String)presure.get(i));
                    wind_high.add((String)humidity.get(i));
                    wind_high.add((String) name.get(i));
                }
            }
       
        ArrayList final_wind = new ArrayList();
        final_wind.add(wind_low);
        final_wind.add(wind_medium);
        final_wind.add(wind_high);

        return final_wind;
    }

 public ArrayList presurediv(ArrayList datasetTokens) {


        ArrayList presure_low = new ArrayList();
        ArrayList presure_medium = new ArrayList();
        ArrayList presure_high = new ArrayList();


        for (int i = 0; i < datasetTokens.size(); i = i + 5) {
            temp.add((String) datasetTokens.get(i));
            wind.add((String) datasetTokens.get(i + 1));
            presure.add((String) datasetTokens.get(i + 2));
            humidity.add((String) datasetTokens.get(i + 3));
            name.add((String) datasetTokens.get(i + 4));
        }

       for(int i=0;i<presure.size();i++){
            float c = Float.parseFloat((String) presure.get(i));
                if (c >= 29.50 && c <= 29.70) {
                 presure_low.add((String)temp.get(i));
                    presure_low.add((String)wind.get(i));
                  presure_low.add(c+"");
                   presure_low.add((String)humidity.get(i));
                   presure_low.add((String) name.get(i));
                } else if (c >= 29.71 && c <= 29.90) {
                   presure_low.add((String)temp.get(i));
                   presure_low.add((String)wind.get(i));
                   presure_low.add(c+"");
                    presure_low.add((String)humidity.get(i));
                   presure_low.add((String) name.get(i));
                } else if (c >= 29.91 ) {
                   presure_low.add((String)temp.get(i));
                   presure_low.add((String)wind.get(i));
                   presure_low.add(c+"");
                   presure_low.add((String)humidity.get(i));
                   presure_low.add((String) name.get(i));
                }
     }

        ArrayList final_presure = new ArrayList();
        final_presure.add(presure_low);
        final_presure.add(presure_medium);
        final_presure.add(presure_high);

        return final_presure;
    }


public ArrayList humiditydiv(ArrayList datasetTokens) {


        ArrayList humidity_low = new ArrayList();
        ArrayList humidity_medium = new ArrayList();
        ArrayList humidity_high = new ArrayList();


        for (int i = 0; i < datasetTokens.size(); i = i + 5) {
            temp.add((String) datasetTokens.get(i));
            wind.add((String) datasetTokens.get(i + 1));
            presure.add((String) datasetTokens.get(i + 2));
            humidity.add((String) datasetTokens.get(i + 3));
            name.add((String) datasetTokens.get(i + 4));
        }

       for(int i=0;i<humidity.size();i++){

                 float d = Float.parseFloat((String) humidity.get(i));
                if (d >= 50 && d <= 65) {
                    humidity_low.add((String)temp.get(i));
                   humidity_low.add((String)wind.get(i));
                   humidity_low.add((String)presure.get(i));
                   humidity_low.add(d+"");
                   humidity_low.add((String) name.get(i));
                } else if (d >= 66 && d <= 80) {
                   humidity_low.add((String)temp.get(i));
                   humidity_low.add((String)wind.get(i));
                   humidity_low.add((String)presure.get(i));
                    humidity_low.add(d+"");
                    humidity_low.add((String) name.get(i));
                } else if (d >= 81 && d<=95 ) {
                   humidity_low.add((String)temp.get(i));
                    humidity_low.add((String)wind.get(i));
                  humidity_low.add((String)presure.get(i));
                   humidity_low.add(d+"");
                    humidity_low.add((String) name.get(i));
                }
     }

        ArrayList final_humidity = new ArrayList();
        final_humidity.add(humidity_low);
        final_humidity.add(humidity_medium);
        final_humidity.add(humidity_high);

        return final_humidity;
    }

 
}
