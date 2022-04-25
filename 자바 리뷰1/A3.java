package reviews;

import java.util.Arrays;
import java.util.Scanner;

public class A3 {

	public static void main(String[] args) {
		double m = 190;
		double km = 780;
		double ms = 0.19;

		double m_km = m * 3.6;
		double ms_km = ms * 3600;

		double score;
		if (m_km > km) {
			if (m_km > ms * ms_km) {
				score = m_km;
			} else {
				score = ms_km;
			}
		} else {
			if (km > ms_km) {
				score = km;
			} else {
				score = ms_km;
			}
		}
		System.out.println(score + "km/h");

	}

}
