package spirals;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LogSpiral {

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
	
	/**not used but potentially useful */
	private double getR (double theta) {
		double r = this.angle + (this.distance * theta);
		return r;
	}
	
	
	private double getTheta(double angle, double r) {
		double theta = 0;
		//double b = Math.log(this.getGoldenRatio()) / (Math.PI / 2);
		double b = 0.1;
		theta = Math.pow(b, -1) * Math.log((r / angle));
		return theta;
	}
	
	
	/** gets golden ratio */
	public static double getGoldenRatio() {
		return (1 + Math.pow(5, 0.5))/2;
	}
	
	
	
	public LogSpiral(double angle, int length) {
		this.angle = angle;
		this.length = length;
	}
	
	public double[][] makeSpiral() {

		double[][] sArray = new double[this.length][];
		
		int start = 0;
		if (this.angle > 0) {
			start = (int) Math.ceil(this.angle);
		}
		
		for (int i = 0; i < this.length; ++i) {
			double[] tArray = new double[3];
			//a += this.angle;
			tArray[0] = i + start;
			tArray[1] = getTheta(this.angle, i + start);
			tArray = polarConv(tArray);
			tArray[2] = i;
			sArray[i] = tArray;
		}
		
		return sArray;
		
	}
	
	public static void main(String[] args) {
		
		/*set angle to golden ratio if you want golden spiral */
		//GoldenSpiral testas = new GoldenSpiral(getGoldenRatio(), 10);
		
		/* Or some other type of logarithmic spiral */
		LogSpiral testas = new LogSpiral(0.00000001, 10);
		
		double[][] spiral = testas.makeSpiral();
		System.out.println(Arrays.deepToString(spiral));
		//Output file
		CSVWriter cr = new CSVWriter("test2.csv");
		cr.writeArraytoFile(spiral);

	}

}
