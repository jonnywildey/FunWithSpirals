package spirals;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArchimedianSpiral {

	/**Generates an array of coordinates following an archmedian spiral */
	double angle; //how quickly spiral turns. a
	double distance; //how dense spiral is packed. b
	int length; //how many points we want
	
	/**poor polar to cartesian converter */
	public static double[] polarConv (double[] polar) {
		double[] cartesian = new double[3];
		
		cartesian[0] = polar[0] * Math.cos(polar[1]);
		cartesian[1] = polar[0] * Math.sin(polar[1]);
		return cartesian;
	}
	
	public double getR (double theta) {
		double r = this.angle + (this.distance * theta);
		return r;
	}
	
	public double getTheta(double angle, double r) {
		double theta = (r - angle) / this.distance;
		return theta;
	}
	
	public ArchimedianSpiral(double angle, double distance, int length) {
		this.angle = angle;
		this.distance = distance;
		this.length = length;
	}
	
	public double[][] makeSpiral() {
		double a = 0;
		double[][] sArray = new double[this.length][];
		
		for (int i = 0; i < this.length; ++i) {
			double[] tArray = new double[3];
			a += this.angle;
			tArray[0] = i;
			tArray[1] = getTheta(a, i);
			
			tArray = polarConv(tArray);
			tArray[2] = i;
			sArray[i] = tArray;
		}
		
		return sArray;
		
	}
	
	public static void main(String[] args) {
		
		ArchimedianSpiral testas = new ArchimedianSpiral(0.5, 3, 120);
		double[][] spiral = testas.makeSpiral();
		System.out.println(Arrays.deepToString(spiral));
		CSVWriter cr = new CSVWriter("test.csv");
		cr.writeArraytoFile(spiral);

	}

}
