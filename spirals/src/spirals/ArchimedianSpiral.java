package spirals;


public class ArchimedianSpiral {

	/**Generates an array of coordinates following an archmedian spiral */
	double angle; //how quickly spiral turns. a
	double distance; //how dense spiral is packed. b
	int length; //how many points we want
	
	
	public static double[] polarConv (double[] polar) {
		double[] cartesian = new double[3];
		
		cartesian[0] = polar[0] * Math.cos(polar[1]);
		cartesian[1] = polar[0] * Math.sin(polar[1]);
		return cartesian;
	}
	
	/**not currently used but potentially useful */
	private double getR (double theta) {
		double r = this.angle + (this.distance * theta);
		return r;
	}
	
	private double getTheta(double angle, double r) {
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
		
		/* currently set at 3 dimensions for use with GoogleSketch.
		 * You can make some pretty cool seashells etc. */
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
		//output file
		CSVWriter cr = new CSVWriter("test.csv");
		cr.writeArraytoFile(spiral);

	}

}
