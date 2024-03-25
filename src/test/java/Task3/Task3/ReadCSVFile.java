package Task3.Task3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadCSVFile {
	
	    private List<String[]> data;

	    public ReadCSVFile(String csvFilePath) {
	        data = new ArrayList<>();
	        try (BufferedReader br = new BufferedReader(new FileReader(csvFilePath))) {
	            String line;
	            while ((line = br.readLine()) != null) {
	                String[] values = line.split(",");
	                data.add(values);
	            }
	        } catch (IOException e) {
	            System.out.println("Error reading CSV file: " + e.getMessage());
	        }
	    }

	    public String getData(int row, int column) {
	        if (row >= 0 && row < data.size()) {
	            String[] rowData = data.get(row);
	            if (column >= 0 && column < rowData.length) {
	                return rowData[column];
	            } else {
	                System.out.println("Invalid column index.");
	            }
	        } else {
	            System.out.println("Invalid row index.");
	        }
	        return null;
	    }

	    public int getRowCount() {
	        return data.size();
	    }
	


}
