package decisiontreeproject;

public class WeightedSum {

    public double weighted(double low_Entropy, double medium_Entropy, double high_Entropy, double l_count, double m_count, double h_count, double totc) {
        double gain = ((l_count / totc) * low_Entropy) + ((m_count / totc) * medium_Entropy) + ((h_count / totc) * high_Entropy);

        return gain;
    }
}
