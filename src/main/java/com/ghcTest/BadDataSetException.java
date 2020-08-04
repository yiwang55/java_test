package com.ghcTest;

import java.io.FileInputStream;
import java.io.IOException;

class BadDataSetException extends Exception{

Class MyUtilities() {
	return null;
}
	public double[] getDataSet(String setName)
		throws BadDataSetException
		{
		String file = setName + ".dset";
		FileInputStream in = null;
		try {
			in = new FileInputStream(file);
			return readDataset(in);
		}catch (IOException e) {
			throw new BadDataSetException();
		}finally {
			try {
				if (in != null)
					in.close();
			}catch (IOException e) {
				;
			}
		}
		}
	
	private double[] readDataset(FileInputStream in) {
		// TODO Auto-generated method stub
		return null;
	}
}