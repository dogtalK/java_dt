package kh.model.vo.Food;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class FileSave {

	List<Food> foodList = new ArrayList<>();
	
	public void run() {
		String fileName = "src/Food.txt";
		fileSave(fileName);
	}
	
	public void fileSave(String fileName) {
	
		
		loadFood(fileName);
		
		String name = "apple";
		int kcal = 20;
		Food food = new Food(name, kcal);
		foodList.add(food);
		
		saveFood(fileName);
	}
	
	void loadFood(String fileName) {
		try(ObjectInputStream ois
				= new ObjectInputStream(new FileInputStream(fileName))){
			while(true) {
				Food tmp = (Food)ois.readObject();
				System.out.println(tmp);
			}
		} catch (FileNotFoundException e) {
			System.out.println("don't find File");
		} catch (EOFException e) {
			System.out.println("Finished reading the File");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("don't find Book class");
		}
	}
	
	void saveFood(String fileName) {
		try(FileOutputStream fos = new FileOutputStream(fileName);
				ObjectOutputStream oos = new ObjectOutputStream(fos)){
					for(Food tmp : foodList) {
						oos.writeObject(tmp);
					}
			} catch (IOException e) {
				e.printStackTrace();
			}
	}
	
	

}
