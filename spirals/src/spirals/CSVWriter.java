package spirals;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CSVWriter {
	/** Writes a CSV file. Hopefully **/

	private String filename;
	private BufferedWriter writer;
	private char separate = ',';
    private char except = '\"';
	
    
    /*file prompt constructor */
    public CSVWriter() { 
    	//this(libraryclasses.HTML.fileChooser());
    }
    
    
	public CSVWriter(final String name) {
	    filename = name ;
	    try {
	      writer = new BufferedWriter (new FileWriter (filename)) ;
	    }
	    catch (IOException e) {
	      error("Can't open file: " + filename) ;
	    }
	  }
	
	public <T> void writeArraytoFile(T[][] arr) {
		/*takes any 2d array and writes it to the file */
		
		for (int i = 0; i < arr.length; ++i) {
			for (int j = 0; j < arr[i].length; ++j) {
				//write array value
				try {
					writer.append(parseValue(arr[i][j]));
					//Write separator, not needed at end of line
					if (j != arr[i].length - 1) {
						writer.append(separate);
						}
					} 
					catch (IOException e) { 
					error("Couldn't write " + arr[i][j] + "to file");
				}
			}
			//new line
			try {
			writer.newLine();
			} catch (IOException e) {error("Couldn't write new line");}
		}
		this.close();
		System.out.print("file written successfully");
	}
	
	public <T> void writeArraytoFile(T[] arr) {
		/*takes any 1d array and writes it to the file. Works on the toString method of the object */
		
		for (int i = 0; i < arr.length; ++i) {
			
				//write array value
				try {
					writer.append(parseValue(arr[i]));
					//Write separator, not needed at end of line
					if (i != arr.length - 1) {
						writer.append(separate);
						}
					} 
					catch (IOException e) { 
					error("Couldn't write " + arr[i] + "to file");
				}
			
		}
		this.close();
		System.out.print("file written successfully");
	}
	
	public void writeArraytoFile(int[] arr) {
		/*takes an int 1d array and writes it to the file. */
		
		for (int i = 0; i < arr.length; ++i) {
			
				//write array value
				try {
					writer.append(parseValue(arr[i]));
					//Write separator, not needed at end of line
					if (i != arr.length - 1) {
						writer.append(separate);
						}
					} 
					catch (IOException e) { 
					error("Couldn't write " + arr[i] + "to file");
				}
			
		}
		this.close();
		System.out.print("file written successfully");
	}
	
	public void writeArraytoFile(float[] arr) {
		/*takes a float 1d array and writes it to the file.  */
		
		for (int i = 0; i < arr.length; ++i) {
			
				//write array value
				try {
					writer.append(parseValue(arr[i]));
					//Write separator, not needed at end of line
					if (i != arr.length - 1) {
						writer.append(separate);
						}
					} 
					catch (IOException e) { 
					error("Couldn't write " + arr[i] + "to file");
				}
			
		}
		this.close();
		System.out.print("file written successfully");
	}
	
	public void writeArraytoFile(double[] arr) {
		/*takes a double 1d array and writes it to the file.  */
		
		for (int i = 0; i < arr.length; ++i) {
			
				//write array value
				try {
					writer.append(parseValue(arr[i]));
					//Write separator, not needed at end of line
					if (i != arr.length - 1) {
						writer.append(separate);
						}
					} 
					catch (IOException e) { 
					error("Couldn't write " + arr[i] + "to file");
				}
			
		}
		this.close();
		System.out.print("file written successfully");
	}
	
	public void writeArraytoFile(char[] arr) {
		/*takes a char 1d array and writes it to the file.  */
		
		for (int i = 0; i < arr.length; ++i) {
			
				//write array value
				try {
					writer.append(parseValue(arr[i]));
					//Write separator, not needed at end of line
					if (i != arr.length - 1) {
						writer.append(separate);
						}
					} 
					catch (IOException e) { 
					error("Couldn't write " + arr[i] + "to file");
				}
			
		}
		this.close();
		System.out.print("file written successfully");
	}
	
	public void writeArraytoFile(boolean[] arr) {
		/*takes a boolean 1d array and writes it to the file.  */
		
		for (int i = 0; i < arr.length; ++i) {
			
				//write array value
				try {
					writer.append(parseValue(arr[i]));
					//Write separator, not needed at end of line
					if (i != arr.length - 1) {
						writer.append(separate);
						}
					} 
					catch (IOException e) { 
					error("Couldn't write " + arr[i] + "to file");
				}
			
		}
		this.close();
		System.out.print("file written successfully");
	}
	
	
		
		public void writeArraytoFile(int[][] arr) {
			/*takes an int 2d array and writes it to the file */
			
			for (int i = 0; i < arr.length; ++i) {
				for (int j = 0; j < arr[i].length; ++j) {
					//write array value
					try {
						writer.append(parseValue(arr[i][j]));
						//Write separator, not needed at end of line
						if (j != arr[i].length - 1) {
							writer.append(separate);
							}
						} 
						catch (IOException e) { 
						error("Couldn't write " + arr[i][j] + "to file");
					}
				}
				//new line
				try {
				writer.newLine();
				} catch (IOException e) {error("Couldn't write new line");}
			}
		
		
		this.close();
		System.out.print("file written successfully");
	}
		
		public void writeArraytoFile(float[][] arr) {
			/*takes a float array and writes it to the file */
			
			for (int i = 0; i < arr.length; ++i) {
				for (int j = 0; j < arr[i].length; ++j) {
					//write array value
					try {
						writer.append(parseValue(arr[i][j]));
						//Write separator, not needed at end of line
						if (j != arr[i].length - 1) {
							writer.append(separate);
							}
						} 
						catch (IOException e) { 
						error("Couldn't write " + arr[i][j] + "to file");
					}
				}
				//new line
				try {
				writer.newLine();
				} catch (IOException e) {error("Couldn't write new line");}
			}
		
		
		this.close();
		System.out.print("file written successfully");
	}	
		
		public void writeArraytoFile(boolean[][] arr) {
			/*takes a boolean array and writes it to the file */
			
			for (int i = 0; i < arr.length; ++i) {
				for (int j = 0; j < arr[i].length; ++j) {
					//write array value
					try {
						writer.append(parseValue(arr[i][j]));
						//Write separator, not needed at end of line
						if (j != arr[i].length - 1) {
							writer.append(separate);
							}
						} 
						catch (IOException e) { 
						error("Couldn't write " + arr[i][j] + "to file");
					}
				}
				//new line
				try {
				writer.newLine();
				} catch (IOException e) {error("Couldn't write new line");}
			}
		
		
		this.close();
		System.out.print("file written successfully");
	}	
		
		public void writeArraytoFile(double[][] arr) {
			/*takes a double 2d array and writes it to the file */
			
			for (int i = 0; i < arr.length; ++i) {
				for (int j = 0; j < arr[i].length; ++j) {
					//write array value
					try {
						writer.append(parseValue(arr[i][j]));
						//Write separator, not needed at end of line
						if (j != arr[i].length - 1) {
							writer.append(separate);
							}
						} 
						catch (IOException e) { 
						error("Couldn't write " + arr[i][j] + "to file");
					}
				}
				//new line
				try {
				writer.newLine();
				} catch (IOException e) {error("Couldn't write new line");}
			}
		
		
		this.close();
		System.out.print("file written successfully");
	}	
		
		public void writeArraytoFile(char[][] arr) {
			/*takes a char 2d array and writes it to the file */
			
			for (int i = 0; i < arr.length; ++i) {
				for (int j = 0; j < arr[i].length; ++j) {
					//write array value
					try {
						writer.append(parseValue(arr[i][j]));
						//Write separator, not needed at end of line
						if (j != arr[i].length - 1) {
							writer.append(separate);
							}
						} 
						catch (IOException e) { 
						error("Couldn't write " + arr[i][j] + "to file");
					}
				}
				//new line
				try {
				writer.newLine();
				} catch (IOException e) {error("Couldn't write new line");}
			}
		
		
		this.close();
		System.out.print("file written successfully");
	}	
	
	private String addExcepts(String str) {
		/*adds excepts. so foo would become "foo" */
		return (except + str + except);
	}
	
	private String doubleExcepts(String str) {
		String s = String.valueOf(except);
		str.replace(s, (s + s));
		return str;
	}
	
	private boolean separateExists(String str) {
		if (str.contains(String.valueOf(separate))) {
			return true;
		}
		return false;
	}
	
	private boolean exceptExists(String str) {
		if (str.contains(String.valueOf(except))) {
			return true;
		}
		return false;
	}
	
	
	private <T> String parseValue(T val) {
		/* Should convert any value into a CSV value*/
		String csval = val.toString();
		//contains any excepts?
		if (exceptExists(csval)) {
			csval = doubleExcepts(csval);
			csval = addExcepts(csval);
		} 
		//any separates
			else if (separateExists(csval)) {
			csval = addExcepts(csval);
		} else {}
		return csval;
		
		
	}
	
	public void close()
    {
      try
      {
        writer.close() ;
      } 
      catch (IOException e)
      {
        error("Can't close file: " + filename) ;
      }
    }

    private void error(String msg)
    {
      System.out.println(msg) ;
      System.out.println("Unable to continue executing program.") ;
      System.exit(0) ;
    }
	
}
